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
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).compute(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.Operation)v4).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
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
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
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
  public void test13() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).compute(((org.apache.commons.jxpath.ri.EvalContext)v26));
    Object v28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).computeContextDependent();
    Object v3 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).compute(((org.apache.commons.jxpath.ri.EvalContext)v26));
    Object v28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v7));
    Object v29 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationEqual)v28).getSymbol();
    org.junit.Assert.assertEquals((Object)("="), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).compute(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v3);
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
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v20));
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).toString();
    org.junit.Assert.assertEquals((Object)(" != "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    org.junit.Assert.assertNotNull(v7);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v26));
    org.junit.Assert.assertNotNull(v27);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iterate(((org.apache.commons.jxpath.ri.EvalContext)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v7).toString();
    org.junit.Assert.assertEquals((Object)(" !=  = "), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
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
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Operation)v4).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Operation)v7).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.Operation)v4).computeContextDependent();
    Object v6 = ((org.apache.commons.jxpath.ri.compiler.Operation)v4).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v6);
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
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Operation)v4).getArguments();
    org.junit.Assert.assertNotNull(v25);
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
    Object v21 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).compute(((org.apache.commons.jxpath.ri.EvalContext)v20));
    org.junit.Assert.assertEquals((Object)(0.0D), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.EvalContext)v26).toString();
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v7).toString();
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
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v7).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    Object v3 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v1).toString();
    org.junit.Assert.assertEquals((Object)(""), v3);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Operation)v7).getArguments();
    org.junit.Assert.assertNotNull(v8);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v7).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.EvalContext)v26).getContextNodePointer();
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v26));
    org.junit.Assert.assertNotNull(v28);
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
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getRootContext();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertNotNull(v25);
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
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Operation)v7).computeContextDependent();
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.Operation)v7).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v9);
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
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getCurrentNodePointer();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
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
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationEqual)v7).getSymbol();
    org.junit.Assert.assertEquals((Object)("="), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v23));
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getRootContext();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v4).compute(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.EvalContext)v26).getJXPathContext();
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
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
  public void test48() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).isChildOrderingRequired();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
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
    ((org.apache.commons.jxpath.ri.EvalContext)v23).reset();
    Object v24 = null;
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iterate(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).isContextDependent();
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
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertNotNull(v28);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v7).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v7).toString();
    org.junit.Assert.assertEquals((Object)(" !=  = "), v28);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v7).getSymbol();
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
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v7).compute(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
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
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
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
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.compiler.Operation)v16).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v17);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).isContextDependent();
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
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v7).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = ((org.apache.commons.jxpath.ri.compiler.Expression)v1).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v17 = ((org.apache.commons.jxpath.ri.compiler.Expression)v16).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v17);
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
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = ((org.apache.commons.jxpath.ri.compiler.Expression)v17).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v18);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = ((org.apache.commons.jxpath.ri.compiler.Expression)v17).computeContextDependent();
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v24));
    Object v26 = "')";
    Object v27 = java.util.Locale.forLanguageTag(((java.lang.String)v26));
    Object v28 = "*";
    Object v29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v25),((java.util.Locale)v27),((java.lang.String)v28));
    Object v30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v21),((java.lang.Object)v23),((org.apache.commons.jxpath.Pointer)v29));
    Object v31 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v31));
    Object v33 = "')";
    Object v34 = java.util.Locale.forLanguageTag(((java.lang.String)v33));
    Object v35 = "*";
    Object v36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v32),((java.util.Locale)v34),((java.lang.String)v35));
    Object v37 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v30),((org.apache.commons.jxpath.ri.model.NodePointer)v36));
    Object v38 = ((org.apache.commons.jxpath.ri.compiler.Expression)v17).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
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
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).getDocumentOrder();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v4).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertEquals((Object)(false), v25);
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
    Object v24 = ((org.apache.commons.jxpath.ri.EvalContext)v23).toString();
    Object v25 = ((org.apache.commons.jxpath.ri.compiler.Expression)v4).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = "')";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = "*";
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v24),((java.util.Locale)v26),((java.lang.String)v27));
    Object v29 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v20),((java.lang.Object)v22),((org.apache.commons.jxpath.Pointer)v28));
    Object v30 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v30));
    Object v32 = "')";
    Object v33 = java.util.Locale.forLanguageTag(((java.lang.String)v32));
    Object v34 = "*";
    Object v35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v31),((java.util.Locale)v33),((java.lang.String)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v29),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.compiler.Expression)v17).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v17),((org.apache.commons.jxpath.ri.compiler.Expression)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v20),((org.apache.commons.jxpath.ri.compiler.Expression)v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v15),((org.apache.commons.jxpath.ri.compiler.Expression)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v17),((org.apache.commons.jxpath.ri.compiler.Expression)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v20),((org.apache.commons.jxpath.ri.compiler.Expression)v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v15),((org.apache.commons.jxpath.ri.compiler.Expression)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v25).toString();
    org.junit.Assert.assertEquals((Object)(" !=  =  =  !=  =  =  !=  = "), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = ((org.apache.commons.jxpath.ri.compiler.Operation)v17).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
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
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = "')";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = "*";
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v24),((java.util.Locale)v26),((java.lang.String)v27));
    Object v29 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v20),((java.lang.Object)v22),((org.apache.commons.jxpath.Pointer)v28));
    Object v30 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v30));
    Object v32 = "')";
    Object v33 = java.util.Locale.forLanguageTag(((java.lang.String)v32));
    Object v34 = "*";
    Object v35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v31),((java.util.Locale)v33),((java.lang.String)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v29),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.compiler.Expression)v17).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v36));
    Object v38 = ((org.apache.commons.jxpath.ri.compiler.Operation)v17).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v17),((org.apache.commons.jxpath.ri.compiler.Expression)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v20),((org.apache.commons.jxpath.ri.compiler.Expression)v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v15),((org.apache.commons.jxpath.ri.compiler.Expression)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v26);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v17),((org.apache.commons.jxpath.ri.compiler.Expression)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v20),((org.apache.commons.jxpath.ri.compiler.Expression)v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v15),((org.apache.commons.jxpath.ri.compiler.Expression)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Operation)v25).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v26);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = "')";
    Object v22 = java.util.Locale.forLanguageTag(((java.lang.String)v21));
    Object v23 = "*";
    Object v24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v20),((java.util.Locale)v22),((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v16),((java.lang.Object)v18),((org.apache.commons.jxpath.Pointer)v24));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = "')";
    Object v29 = java.util.Locale.forLanguageTag(((java.lang.String)v28));
    Object v30 = "*";
    Object v31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v27),((java.util.Locale)v29),((java.lang.String)v30));
    Object v32 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v25),((org.apache.commons.jxpath.ri.model.NodePointer)v31));
    Object v33 = ((org.apache.commons.jxpath.ri.compiler.Expression)v13).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).compute(((org.apache.commons.jxpath.ri.EvalContext)v26));
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Operation)v7).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v28);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v17),((org.apache.commons.jxpath.ri.compiler.Expression)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v20),((org.apache.commons.jxpath.ri.compiler.Expression)v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v15),((org.apache.commons.jxpath.ri.compiler.Expression)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).isContextDependent();
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Operation)v25).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.EvalContext)v26).getValue();
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v26));
    org.junit.Assert.assertNotNull(v28);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v17),((org.apache.commons.jxpath.ri.compiler.Expression)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v20),((org.apache.commons.jxpath.ri.compiler.Expression)v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v15),((org.apache.commons.jxpath.ri.compiler.Expression)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).isContextDependent();
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v17).toString();
    org.junit.Assert.assertEquals((Object)(" !=  =  =  !=  = "), v18);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v17),((org.apache.commons.jxpath.ri.compiler.Expression)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v20),((org.apache.commons.jxpath.ri.compiler.Expression)v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v15),((org.apache.commons.jxpath.ri.compiler.Expression)v23));
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v24));
    Object v26 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).computeContextDependent();
    Object v27 = ((org.apache.commons.jxpath.ri.compiler.Expression)v25).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v27);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = "')";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = "*";
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v24),((java.util.Locale)v26),((java.lang.String)v27));
    Object v29 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v20),((java.lang.Object)v22),((org.apache.commons.jxpath.Pointer)v28));
    Object v30 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v30));
    Object v32 = "')";
    Object v33 = java.util.Locale.forLanguageTag(((java.lang.String)v32));
    Object v34 = "*";
    Object v35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v31),((java.util.Locale)v33),((java.lang.String)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v29),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v17).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertEquals((Object)(true), v37);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = "')";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = "*";
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v24),((java.util.Locale)v26),((java.lang.String)v27));
    Object v29 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v20),((java.lang.Object)v22),((org.apache.commons.jxpath.Pointer)v28));
    Object v30 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v30));
    Object v32 = "')";
    Object v33 = java.util.Locale.forLanguageTag(((java.lang.String)v32));
    Object v34 = "*";
    Object v35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v31),((java.util.Locale)v33),((java.lang.String)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v29),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.compiler.Expression)v17).iteratePointers(((org.apache.commons.jxpath.ri.EvalContext)v36));
    Object v38 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationEqual)v17).getSymbol();
    org.junit.Assert.assertEquals((Object)("="), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v15));
    Object v17 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v17));
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = "')";
    Object v22 = java.util.Locale.forLanguageTag(((java.lang.String)v21));
    Object v23 = "*";
    Object v24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v20),((java.util.Locale)v22),((java.lang.String)v23));
    Object v25 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v16),((java.lang.Object)v18),((org.apache.commons.jxpath.Pointer)v24));
    Object v26 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v26));
    Object v28 = "')";
    Object v29 = java.util.Locale.forLanguageTag(((java.lang.String)v28));
    Object v30 = "*";
    Object v31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v27),((java.util.Locale)v29),((java.lang.String)v30));
    Object v32 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v25),((org.apache.commons.jxpath.ri.model.NodePointer)v31));
    Object v33 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v13).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
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
    Object v22 = ((org.apache.commons.jxpath.ri.compiler.Operation)v1).computeContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
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
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = ((org.apache.commons.jxpath.ri.compiler.Operation)v4).getArguments();
    org.junit.Assert.assertNotNull(v5);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = ((org.apache.commons.jxpath.ri.compiler.Operation)v7).computeContextDependent();
    Object v9 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v7).toString();
    org.junit.Assert.assertEquals((Object)(" !=  = "), v9);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = ((org.apache.commons.jxpath.ri.compiler.Operation)v17).computeContextDependent();
    Object v19 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v17).toString();
    org.junit.Assert.assertEquals((Object)(" !=  =  =  !=  = "), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = "')";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = "*";
    Object v18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v14),((java.util.Locale)v16),((java.lang.String)v17));
    Object v19 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v10),((java.lang.Object)v12),((org.apache.commons.jxpath.Pointer)v18));
    Object v20 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v20));
    Object v22 = "')";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = "*";
    Object v25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v21),((java.util.Locale)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v19),((org.apache.commons.jxpath.ri.model.NodePointer)v25));
    Object v27 = ((org.apache.commons.jxpath.ri.EvalContext)v26).getJXPathContext();
    Object v28 = ((org.apache.commons.jxpath.ri.compiler.Expression)v7).iterate(((org.apache.commons.jxpath.ri.EvalContext)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.compiler.Expression)v13).isContextDependent();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v12));
    Object v14 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v13).toString();
    org.junit.Assert.assertEquals((Object)(" !=  =  =  != "), v14);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = ((org.apache.commons.jxpath.ri.compiler.CoreOperation)v17).getSymbol();
    Object v19 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v19));
    Object v21 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v20));
    Object v22 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v22));
    Object v24 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v25 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v24));
    Object v26 = "')";
    Object v27 = java.util.Locale.forLanguageTag(((java.lang.String)v26));
    Object v28 = "*";
    Object v29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v25),((java.util.Locale)v27),((java.lang.String)v28));
    Object v30 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v21),((java.lang.Object)v23),((org.apache.commons.jxpath.Pointer)v29));
    Object v31 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v32 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v31));
    Object v33 = "')";
    Object v34 = java.util.Locale.forLanguageTag(((java.lang.String)v33));
    Object v35 = "*";
    Object v36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v32),((java.util.Locale)v34),((java.lang.String)v35));
    Object v37 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v30),((org.apache.commons.jxpath.ri.model.NodePointer)v36));
    Object v38 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v17).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v37));
    org.junit.Assert.assertEquals((Object)(true), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = "')";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = "*";
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v24),((java.util.Locale)v26),((java.lang.String)v27));
    Object v29 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v20),((java.lang.Object)v22),((org.apache.commons.jxpath.Pointer)v28));
    Object v30 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v30));
    Object v32 = "')";
    Object v33 = java.util.Locale.forLanguageTag(((java.lang.String)v32));
    Object v34 = "*";
    Object v35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v31),((java.util.Locale)v33),((java.lang.String)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v29),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.EvalContext)v36).getJXPathContext();
    Object v38 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v17).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertEquals((Object)(true), v38);
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
    Object v7 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v7));
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v6),((org.apache.commons.jxpath.ri.compiler.Expression)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    org.junit.Assert.assertNotNull(v10);
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
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v6),((org.apache.commons.jxpath.ri.compiler.Expression)v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v9));
    Object v11 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v11));
    Object v13 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v14));
    Object v16 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v16));
    Object v18 = "')";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = "*";
    Object v21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v17),((java.util.Locale)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v13),((java.lang.Object)v15),((org.apache.commons.jxpath.Pointer)v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = "')";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = "*";
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v24),((java.util.Locale)v26),((java.lang.String)v27));
    Object v29 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v22),((org.apache.commons.jxpath.ri.model.NodePointer)v28));
    Object v30 = ((org.apache.commons.jxpath.ri.EvalContext)v29).getJXPathContext();
    Object v31 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v10).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v29));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v1 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v0));
    Object v2 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v2));
    Object v4 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v1),((org.apache.commons.jxpath.ri.compiler.Expression)v3));
    Object v5 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v5));
    Object v7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v4),((org.apache.commons.jxpath.ri.compiler.Expression)v6));
    Object v8 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v8));
    Object v10 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v10));
    Object v12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v9),((org.apache.commons.jxpath.ri.compiler.Expression)v11));
    Object v13 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v13));
    Object v15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v12),((org.apache.commons.jxpath.ri.compiler.Expression)v14));
    Object v16 = ((org.apache.commons.jxpath.ri.compiler.Expression)v15).computeContextDependent();
    Object v17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(((org.apache.commons.jxpath.ri.compiler.Expression)v7),((org.apache.commons.jxpath.ri.compiler.Expression)v15));
    Object v18 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v18));
    Object v20 = org.apache.commons.jxpath.JXPathContext.newContext(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v21));
    Object v23 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v23));
    Object v25 = "')";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = "*";
    Object v28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v24),((java.util.Locale)v26),((java.lang.String)v27));
    Object v29 = new org.apache.commons.jxpath.ri.JXPathContextReferenceImpl(((org.apache.commons.jxpath.JXPathContext)v20),((java.lang.Object)v22),((org.apache.commons.jxpath.Pointer)v28));
    Object v30 = new org.apache.commons.jxpath.ri.compiler.Expression[]{};
    Object v31 = new org.apache.commons.jxpath.ri.compiler.CoreOperationAdd(((org.apache.commons.jxpath.ri.compiler.Expression[])v30));
    Object v32 = "')";
    Object v33 = java.util.Locale.forLanguageTag(((java.lang.String)v32));
    Object v34 = "*";
    Object v35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(((java.lang.Object)v31),((java.util.Locale)v33),((java.lang.String)v34));
    Object v36 = new org.apache.commons.jxpath.ri.axes.RootContext(((org.apache.commons.jxpath.ri.JXPathContextReferenceImpl)v29),((org.apache.commons.jxpath.ri.model.NodePointer)v35));
    Object v37 = ((org.apache.commons.jxpath.ri.EvalContext)v36).getValue();
    Object v38 = ((org.apache.commons.jxpath.ri.compiler.CoreOperationCompare)v17).computeValue(((org.apache.commons.jxpath.ri.EvalContext)v36));
    org.junit.Assert.assertEquals((Object)(true), v38);
  }
}
