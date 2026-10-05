package org.apache.commons.jxpath.ri.compiler;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).getValue();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
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
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v21);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v22);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).getCurrentNodePointer();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).compute(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v4));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = "')";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = "*";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = "')";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = "*";
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v14),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.EvalContext)v21).getDocumentOrder();
    Object v23 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual)v4).getSymbol();
    org.junit.Assert.assertEquals((Object)("!="), v5);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertEquals((Object)(0.0D), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    org.junit.Assert.assertNotNull(v4);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v3);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).getArguments();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).toString();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.Operation)v4).getArguments();
    org.junit.Assert.assertNotNull(v5);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).getContextNodePointer();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).getRootContext();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).compute(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v4));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Operation)v25).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v26);
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
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getJXPathContext();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertEquals((Object)(false), v25);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).compute(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v4));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual)v25).getSymbol();
    org.junit.Assert.assertEquals((Object)("!="), v26);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).getRootContext();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertEquals((Object)(0.0D), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
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
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getJXPathContext();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
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
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).isChildOrderingRequired();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    ((org.apache.commons.jxpath.ri.EvalContext)v20).reset();
    Object v21 = null;
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = "')";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = "*";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = "')";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = "*";
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v14),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).getSymbol();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = "')";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = "*";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = "')";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = "*";
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v14),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v21));
    org.junit.Assert.assertEquals((Object)(0.0D), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = "')";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = "*";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = "')";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = "*";
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v14),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.EvalContext)v21).getValue();
    Object v23 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
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
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).getDocumentOrder();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v5).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).iterate(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = "')";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = "*";
    Object v17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v13),((java.util.Locale)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v9),((java.lang.Object)v11),((org.apache.commons.jxpath.Pointer)v17));
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = "')";
    Object v22 = java.util.Locale.forLanguageTag(((java.lang.String)v21));
    Object v23 = "*";
    Object v24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v20),((java.util.Locale)v22),((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v18),((org.apache.commons.jxpath.ri.model.NodePointer)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.EvalContext)v24).getDocumentOrder();
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v5).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v5).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).computeContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    org.junit.Assert.assertNotNull(v12);
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
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Operation)v5).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    ((org.apache.commons.jxpath.ri.EvalContext)v24).reset();
    Object v25 = null;
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).iterate(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = "')";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = "*";
    Object v12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v8),((java.util.Locale)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v4),((java.lang.Object)v6),((org.apache.commons.jxpath.Pointer)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v13),((org.apache.commons.jxpath.ri.model.NodePointer)v19));
    Object v21 = ((org.apache.commons.jxpath.ri.EvalContext)v20).isChildOrderingRequired();
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iterate(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Operation)v5).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Operation)v8).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = "')";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = "*";
    Object v15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v11),((java.util.Locale)v13),((java.lang.String)v14));
    Object v16 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v7),((java.lang.Object)v9),((org.apache.commons.jxpath.Pointer)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = "')";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = "*";
    Object v22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v18),((java.util.Locale)v20),((java.lang.String)v21));
    Object v23 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v16),((org.apache.commons.jxpath.ri.model.NodePointer)v22));
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).compute(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v4));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v25).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).compute(((org.apache.commons.jxpath.ri.EvalContext)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Operation)v5).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Operation)v8).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v8).toString();
    org.junit.Assert.assertEquals((Object)(" !=  != "), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v5).compute(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v8).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).computeContextDependent();
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).isContextDependent();
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = "')";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = "*";
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.Object)v14),((org.apache.commons.jxpath.Pointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = "')";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = "*";
    Object v27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v23),((java.util.Locale)v25),((java.lang.String)v26));
    Object v28 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v21),((org.apache.commons.jxpath.ri.model.NodePointer)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).iterate(((org.apache.commons.jxpath.ri.EvalContext)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).computeContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.Operation)v12).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v3),((org.apache.commons.jxpath.ri.compiler.Expression)v5));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = "')";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = "*";
    Object v13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v9),((java.util.Locale)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v5),((java.lang.Object)v7),((org.apache.commons.jxpath.Pointer)v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = "')";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = "*";
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v14),((org.apache.commons.jxpath.ri.model.NodePointer)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual)v8).getSymbol();
    org.junit.Assert.assertEquals((Object)("!="), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).computeContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v12).toString();
    org.junit.Assert.assertEquals((Object)(" !=  !=  != "), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v3),((org.apache.commons.jxpath.ri.compiler.Expression)v5));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v8).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v3),((org.apache.commons.jxpath.ri.compiler.Expression)v5));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).iterate(((org.apache.commons.jxpath.ri.EvalContext)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.Operation)v8).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.EvalContext)v27).isChildOrderingRequired();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v8).compute(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Operation)v5).getArguments();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v3),((org.apache.commons.jxpath.ri.compiler.Expression)v5));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Operation)v8).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v3),((org.apache.commons.jxpath.ri.compiler.Expression)v5));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v8).toString();
    org.junit.Assert.assertEquals((Object)(" !=  != "), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Operation)v5).computeContextDependent();
    Object v7 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v5).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Operation)v8).computeContextDependent();
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v8).toString();
    org.junit.Assert.assertEquals((Object)(" !=  != "), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.EvalContext)v24).getJXPathContext();
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).iterate(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v3),((org.apache.commons.jxpath.ri.compiler.Expression)v5));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v3),((org.apache.commons.jxpath.ri.compiler.Expression)v5));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v8).getSymbol();
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v15));
    Object v17 = "')";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = "*";
    Object v20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v16),((java.util.Locale)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v12),((java.lang.Object)v14),((org.apache.commons.jxpath.Pointer)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = "')";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = "*";
    Object v27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v23),((java.util.Locale)v25),((java.lang.String)v26));
    Object v28 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v21),((org.apache.commons.jxpath.ri.model.NodePointer)v27));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v8).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.EvalContext)v27).getJXPathContext();
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v8).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual)v5).getSymbol();
    org.junit.Assert.assertEquals((Object)("!="), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.EvalContext)v24).getValue();
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v5).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).computeContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.Expression)v12).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v8).compute(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).computeContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v15),((java.lang.Object)v17),((org.apache.commons.jxpath.Pointer)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = "')";
    Object v28 = java.util.Locale.forLanguageTag(((java.lang.String)v27));
    Object v29 = "*";
    Object v30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v26),((java.util.Locale)v28),((java.lang.String)v29));
    Object v31 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v24),((org.apache.commons.jxpath.ri.model.NodePointer)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.compiler.Expression)v12).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.EvalContext)v24).getCurrentNodePointer();
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v5).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.EvalContext)v24).getDocumentOrder();
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).iterate(((org.apache.commons.jxpath.ri.EvalContext)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = "')";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = "*";
    Object v16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v12),((java.util.Locale)v14),((java.lang.String)v15));
    Object v17 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v8),((java.lang.Object)v10),((org.apache.commons.jxpath.Pointer)v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v17),((org.apache.commons.jxpath.ri.model.NodePointer)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).iterate(((org.apache.commons.jxpath.ri.EvalContext)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).computeContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = ((org.apache.commons.jxpath.ri.compiler.Expression)v12).isContextDependent();
    Object v14 = ((org.apache.commons.jxpath.ri.compiler.Expression)v12).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).computeContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v15),((java.lang.Object)v17),((org.apache.commons.jxpath.Pointer)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = "')";
    Object v28 = java.util.Locale.forLanguageTag(((java.lang.String)v27));
    Object v29 = "*";
    Object v30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v26),((java.util.Locale)v28),((java.lang.String)v29));
    Object v31 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v24),((org.apache.commons.jxpath.ri.model.NodePointer)v30));
    Object v32 = ((org.apache.commons.jxpath.ri.compiler.Expression)v12).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v31));
    Object v33 = ((org.apache.commons.jxpath.ri.compiler.Operation)v12).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v4));
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Expression)v5).computeContextDependent();
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v3),((org.apache.commons.jxpath.ri.compiler.Expression)v5));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v9));
    Object v11 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = "')";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = "*";
    Object v19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v15),((java.util.Locale)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v11),((java.lang.Object)v13),((org.apache.commons.jxpath.Pointer)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = "')";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = "*";
    Object v26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v22),((java.util.Locale)v24),((java.lang.String)v25));
    Object v27 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v20),((org.apache.commons.jxpath.ri.model.NodePointer)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v8).iterate(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = ((org.apache.commons.jxpath.ri.compiler.Expression)v3).computeContextDependent();
    Object v5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v6 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = ((org.apache.commons.jxpath.ri.compiler.Expression)v9).computeContextDependent();
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v5),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = "')";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = "*";
    Object v23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v19),((java.util.Locale)v21),((java.lang.String)v22));
    Object v24 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v15),((java.lang.Object)v17),((org.apache.commons.jxpath.Pointer)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v25));
    Object v27 = "')";
    Object v28 = java.util.Locale.forLanguageTag(((java.lang.String)v27));
    Object v29 = "*";
    Object v30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v26),((java.util.Locale)v28),((java.lang.String)v29));
    Object v31 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v24),((org.apache.commons.jxpath.ri.model.NodePointer)v30));
    ((org.apache.commons.jxpath.ri.EvalContext)v31).reset();
    Object v32 = null;
    Object v33 = ((org.apache.commons.jxpath.ri.compiler.Expression)v12).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v31));
    org.junit.Assert.assertNotNull(v33);
  }
}
