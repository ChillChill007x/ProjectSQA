package org.apache.commons.jxpath.ri.compiler;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((org.apache.commons.jxpath.ri.EvalContext)v21),((org.apache.commons.jxpath.ri.compiler.Expression)v23),((org.apache.commons.jxpath.ri.compiler.Expression)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).getSymbol();
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v7),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).getSymbol();
    org.junit.Assert.assertEquals((Object)("+"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).getSymbol();
    org.junit.Assert.assertEquals((Object)("+"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v6),((org.apache.commons.jxpath.ri.compiler.Expression)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v9).getSymbol();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v9).equal(((java.lang.Object)v12),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v20).isContextDependent();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v18),((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertEquals((Object)(0.0D), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).getSymbol();
    org.junit.Assert.assertEquals((Object)("+"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v7),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).getSymbol();
    org.junit.Assert.assertEquals((Object)("+"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v23).getSymbol();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v21),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getJXPathContext();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertEquals((Object)(0.0D), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v24));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v23),((org.apache.commons.jxpath.ri.compiler.Expression)v25));
    Object v27 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Operation)v28).computeContextDependent();
    Object v30 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v30));
    Object v32 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v26).equal(((java.lang.Object)v29),((java.lang.Object)v31));
    Object v33 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v21),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = null;
    Object v28 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v28));
    Object v30 = null;
    Object v31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v27),((java.lang.Object)v29),((java.util.Locale)v30));
    Object v32 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v24),((java.lang.Object)v26),((org.apache.commons.jxpath.Pointer)v31));
    Object v33 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v21),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = null;
    Object v28 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v28));
    Object v30 = null;
    Object v31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v27),((java.lang.Object)v29),((java.util.Locale)v30));
    Object v32 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v24),((java.lang.Object)v26),((org.apache.commons.jxpath.Pointer)v31));
    Object v33 = null;
    Object v34 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v34));
    Object v36 = null;
    Object v37 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v33),((java.lang.Object)v35),((java.util.Locale)v36));
    Object v38 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v32),((org.apache.commons.jxpath.ri.model.NodePointer)v37));
    Object v39 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).findMatch(((java.util.Iterator)v21),((java.util.Iterator)v38));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = null;
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = null;
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v25),((java.lang.Object)v27),((java.util.Locale)v28));
    Object v30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v22),((java.lang.Object)v24),((org.apache.commons.jxpath.Pointer)v29));
    Object v31 = null;
    Object v32 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v32));
    Object v34 = null;
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v31),((java.lang.Object)v33),((java.util.Locale)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v30),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertEquals((Object)(0.0D), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).toString();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.EvalContext)v21).getRootContext();
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((org.apache.commons.jxpath.ri.EvalContext)v21),((org.apache.commons.jxpath.ri.compiler.Expression)v24),((org.apache.commons.jxpath.ri.compiler.Expression)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Operation)v26).computeContextDependent();
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v26).getSymbol();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v24),((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getValue();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertEquals((Object)(0.0D), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getValue();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).getArguments();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getContextNodePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertEquals((Object)(0.0D), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getJXPathContext();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertEquals((Object)(0.0D), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = null;
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = null;
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v17));
    Object v19 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.EvalContext)v19).getContextNodePointer();
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v6).getSymbol();
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.compiler.Operation)v10).computeContextDependent();
    Object v12 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v8),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getJXPathContext();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    ((org.apache.commons.jxpath.ri.EvalContext)v18).reset();
    Object v19 = null;
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getValue();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).computeContextDependent();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v27).getSymbol();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v25),((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).isChildOrderingRequired();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.EvalContext)v21).getCurrentNodePointer();
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((org.apache.commons.jxpath.ri.EvalContext)v21),((org.apache.commons.jxpath.ri.compiler.Expression)v24),((org.apache.commons.jxpath.ri.compiler.Expression)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getValue();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = null;
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = null;
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v25),((java.lang.Object)v27),((java.util.Locale)v28));
    Object v30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v22),((java.lang.Object)v24),((org.apache.commons.jxpath.Pointer)v29));
    Object v31 = null;
    Object v32 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v32));
    Object v34 = null;
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v31),((java.lang.Object)v33),((java.util.Locale)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v30),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.EvalContext)v36).getRootContext();
    Object v38 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v6).toString();
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v6).toString();
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v10),((org.apache.commons.jxpath.ri.compiler.Expression)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Operation)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v13).equal(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v8),((java.lang.Object)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).getSymbol();
    org.junit.Assert.assertEquals((Object)("+"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = null;
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = null;
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v17));
    Object v19 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.EvalContext)v19).isChildOrderingRequired();
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v19));
    org.junit.Assert.assertEquals((Object)(0.0D), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = null;
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = null;
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v25),((java.lang.Object)v27),((java.util.Locale)v28));
    Object v30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v22),((java.lang.Object)v24),((org.apache.commons.jxpath.Pointer)v29));
    Object v31 = null;
    Object v32 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v32));
    Object v34 = null;
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v31),((java.lang.Object)v33),((java.util.Locale)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v30),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.EvalContext)v21).getJXPathContext();
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((org.apache.commons.jxpath.ri.EvalContext)v21),((org.apache.commons.jxpath.ri.compiler.Expression)v24),((org.apache.commons.jxpath.ri.compiler.Expression)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = null;
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = null;
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v25),((java.lang.Object)v27),((java.util.Locale)v28));
    Object v30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v22),((java.lang.Object)v24),((org.apache.commons.jxpath.Pointer)v29));
    Object v31 = null;
    Object v32 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v32));
    Object v34 = null;
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v31),((java.lang.Object)v33),((java.util.Locale)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v30),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertEquals((Object)(0.0D), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.compiler.Operation)v10).computeContextDependent();
    Object v12 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v8),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).isChildOrderingRequired();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).computeContextDependent();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).computeContextDependent();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v25),((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = null;
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = null;
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v17));
    Object v19 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.EvalContext)v19).getValue();
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).getSymbol();
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Operation)v7).computeContextDependent();
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v7).getSymbol();
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = null;
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = null;
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v14),((java.lang.Object)v16),((org.apache.commons.jxpath.Pointer)v21));
    Object v23 = null;
    Object v24 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v24));
    Object v26 = null;
    Object v27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v23),((java.lang.Object)v25),((java.util.Locale)v26));
    Object v28 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v22),((org.apache.commons.jxpath.ri.model.NodePointer)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.EvalContext)v28).isChildOrderingRequired();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.Expression)v11).iterate(((org.apache.commons.jxpath.ri.EvalContext)v28));
    Object v31 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v9),((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Operation)v23).computeContextDependent();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v21),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v6),((org.apache.commons.jxpath.ri.compiler.Expression)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = null;
    Object v19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v15),((java.lang.Object)v17),((java.util.Locale)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.Object)v14),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = null;
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = null;
    Object v25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v21),((java.lang.Object)v23),((java.util.Locale)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v26));
    Object v28 = ((java.util.Iterator)v27).next();
    Object v29 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v30 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v29));
    Object v31 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v30).toString();
    Object v32 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v30).toString();
    Object v33 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v27),((java.lang.Object)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = ((java.util.Iterator)v24).hasNext();
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).computeContextDependent();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).computeContextDependent();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v24),((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).computeContextDependent();
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v17));
    Object v19 = null;
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = null;
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v19),((java.lang.Object)v21),((java.util.Locale)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v18),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.EvalContext)v24).getValue();
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v24));
    Object v27 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Operation)v28).computeContextDependent();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.Operation)v28).computeContextDependent();
    Object v31 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v26),((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getDocumentOrder();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = null;
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = null;
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v17));
    Object v19 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.EvalContext)v19).getDocumentOrder();
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v19));
    org.junit.Assert.assertEquals((Object)(0.0D), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getContextNodePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).getArguments();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getDocumentOrder();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).computeContextDependent();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v25),((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.Object)v15),((org.apache.commons.jxpath.Pointer)v20));
    Object v22 = null;
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = null;
    Object v26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v24),((java.util.Locale)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v21),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.EvalContext)v27).getDocumentOrder();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Expression)v10).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v27));
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v8),((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = null;
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = null;
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v17));
    Object v19 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v19));
    org.junit.Assert.assertEquals((Object)(0.0D), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Operation)v23).getArguments();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v21),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    ((org.apache.commons.jxpath.ri.EvalContext)v18).reset();
    Object v19 = null;
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getRootContext();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertEquals((Object)(0.0D), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).getSymbol();
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = null;
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v11),((java.lang.Object)v13),((java.util.Locale)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = null;
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = null;
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v21));
    ((org.apache.commons.jxpath.ri.EvalContext)v22).reset();
    Object v23 = null;
    Object v24 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).computeContextDependent();
    Object v27 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((org.apache.commons.jxpath.ri.EvalContext)v22),((org.apache.commons.jxpath.ri.compiler.Expression)v25),((org.apache.commons.jxpath.ri.compiler.Expression)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).computeContextDependent();
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).isContextDependent();
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.compiler.Operation)v11).getArguments();
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v9),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.compiler.Operation)v10).computeContextDependent();
    Object v12 = ((org.apache.commons.jxpath.ri.compiler.Operation)v10).computeContextDependent();
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v8),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).toString();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v27).computeContextDependent();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Expression)v27).isContextDependent();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v25),((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).isContextDependent();
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = null;
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v11),((java.lang.Object)v13),((java.util.Locale)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = null;
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = null;
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((org.apache.commons.jxpath.ri.EvalContext)v22),((org.apache.commons.jxpath.ri.compiler.Expression)v24),((org.apache.commons.jxpath.ri.compiler.Expression)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).computeContextDependent();
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v17));
    Object v19 = null;
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = null;
    Object v23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v19),((java.lang.Object)v21),((java.util.Locale)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v18),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.EvalContext)v24).getValue();
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v24));
    Object v27 = ((java.util.Iterator)v26).next();
    Object v28 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v28));
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.Operation)v29).getArguments();
    Object v31 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v26),((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v6).getSymbol();
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = ((org.apache.commons.jxpath.ri.compiler.Expression)v10).computeContextDependent();
    Object v12 = ((org.apache.commons.jxpath.ri.compiler.Expression)v10).isContextDependent();
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v8),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.EvalContext)v18).getCurrentNodePointer();
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    org.junit.Assert.assertEquals((Object)(0.0D), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Operation)v6).computeContextDependent();
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Operation)v9).computeContextDependent();
    Object v11 = ((org.apache.commons.jxpath.ri.compiler.Operation)v9).computeContextDependent();
    Object v12 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v7),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iterate(((org.apache.commons.jxpath.ri.EvalContext)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Operation)v24).computeContextDependent();
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Operation)v24).computeContextDependent();
    Object v27 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Operation)v28).computeContextDependent();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.Operation)v28).computeContextDependent();
    Object v31 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v26),((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v6),((org.apache.commons.jxpath.ri.compiler.Expression)v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).isContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.Operation)v12).getArguments();
    Object v14 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v10),((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).getArguments();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v6),((org.apache.commons.jxpath.ri.compiler.Expression)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = ((org.apache.commons.jxpath.ri.compiler.Operation)v11).computeContextDependent();
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = ((org.apache.commons.jxpath.ri.compiler.Operation)v14).computeContextDependent();
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Operation)v14).computeContextDependent();
    Object v17 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v9).equal(((java.lang.Object)v12),((java.lang.Object)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v19),((org.apache.commons.jxpath.ri.compiler.Expression)v21));
    Object v23 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v22).toString();
    Object v24 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).computeContextDependent();
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).isContextDependent();
    Object v28 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v28));
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.Operation)v29).getArguments();
    Object v31 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v22).equal(((java.lang.Object)v27),((java.lang.Object)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v17),((java.lang.Object)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = null;
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v7),((java.lang.Object)v9),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v11));
    Object v13 = null;
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v13),((java.lang.Object)v15),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v12),((org.apache.commons.jxpath.ri.model.NodePointer)v17));
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = null;
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = null;
    Object v29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v25),((java.lang.Object)v27),((java.util.Locale)v28));
    Object v30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v22),((java.lang.Object)v24),((org.apache.commons.jxpath.Pointer)v29));
    Object v31 = null;
    Object v32 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v32));
    Object v34 = null;
    Object v35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v31),((java.lang.Object)v33),((java.util.Locale)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v30),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).isChildOrderingRequired();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).getArguments();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v25),((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).computeContextDependent();
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).isContextDependent();
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.Object)v15),((org.apache.commons.jxpath.Pointer)v20));
    Object v22 = null;
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = null;
    Object v26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v24),((java.util.Locale)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v21),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.EvalContext)v27).getDocumentOrder();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Expression)v10).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v27));
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v8),((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).computeContextDependent();
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).isContextDependent();
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.Object)v15),((org.apache.commons.jxpath.Pointer)v20));
    Object v22 = null;
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = null;
    Object v26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v22),((java.lang.Object)v24),((java.util.Locale)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v21),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v10).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Expression)v10).isContextDependent();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v8),((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = null;
    Object v15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v11),((java.lang.Object)v13),((java.util.Locale)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = null;
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = null;
    Object v21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v17),((java.lang.Object)v19),((java.util.Locale)v20));
    Object v22 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((org.apache.commons.jxpath.ri.EvalContext)v22),((org.apache.commons.jxpath.ri.compiler.Expression)v24),((org.apache.commons.jxpath.ri.compiler.Expression)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = null;
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = null;
    Object v12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v8),((java.lang.Object)v10),((java.util.Locale)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = null;
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = null;
    Object v18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v14),((java.lang.Object)v16),((java.util.Locale)v17));
    Object v19 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v18));
    Object v20 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getDocumentOrder();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).getArguments();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).contains(((java.util.Iterator)v25),((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = null;
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = null;
    Object v14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v10),((java.lang.Object)v12),((java.util.Locale)v13));
    Object v15 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v14));
    Object v16 = null;
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = null;
    Object v20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v16),((java.lang.Object)v18),((java.util.Locale)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v15),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.EvalContext)v21).getDocumentOrder();
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((org.apache.commons.jxpath.ri.EvalContext)v21),((org.apache.commons.jxpath.ri.compiler.Expression)v24),((org.apache.commons.jxpath.ri.compiler.Expression)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = null;
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = null;
    Object v16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v12),((java.lang.Object)v14),((java.util.Locale)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = null;
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = null;
    Object v22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(((org.apache.commons.jxpath.ri.QName)v18),((java.lang.Object)v20),((java.util.Locale)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    ((org.apache.commons.jxpath.ri.EvalContext)v23).reset();
    Object v24 = null;
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v6).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).computeContextDependent();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Operation)v27).computeContextDependent();
    Object v30 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).equal(((java.lang.Object)v25),((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }
}
