package com.google.javascript.rhino;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isString();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.rhino.Node)v1).setSourceFileForTesting(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((com.google.javascript.rhino.Node)v1).isSetterDef();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isFunction();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.rhino.Node)v1).setString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = com.google.javascript.rhino.Node.newString(((java.lang.String)v2));
    ((com.google.javascript.rhino.Node)v1).addChildToFront(((com.google.javascript.rhino.Node)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isOptionalArg();
    Object v3 = ((com.google.javascript.rhino.Node)v1).isDefaultCase();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getInputId();
    Object v3 = ((com.google.javascript.rhino.Node)v1).isInstanceOf();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).getSourceOffset();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = -33;
    Object v3 = false;
    ((com.google.javascript.rhino.Node)v1).putBooleanProp((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isBreak();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = "";
    ((com.google.javascript.rhino.Node)v1).addSuppression(((java.lang.String)v2));
    Object v3 = null;
    ((com.google.javascript.rhino.Node)v1).detachChildren();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = 0;
    ((com.google.javascript.rhino.Node)v1).setLineno((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isAssign();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 0;
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    Object v13 = 17;
    ((com.google.javascript.rhino.Node)v12).setCharno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = ((com.google.javascript.rhino.Node)v7).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isRegExp();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 0;
    ((com.google.javascript.rhino.Node)v7).setLineno((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 0;
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    Object v13 = 17;
    ((com.google.javascript.rhino.Node)v12).setCharno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = ((com.google.javascript.rhino.Node)v7).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isHook();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isSetterDef();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isVar();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isReturn();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 0;
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    Object v13 = 17;
    ((com.google.javascript.rhino.Node)v12).setCharno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = ((com.google.javascript.rhino.Node)v7).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).detachFromParent();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 0;
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    Object v13 = 17;
    ((com.google.javascript.rhino.Node)v12).setCharno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = 0;
    Object v17 = "";
    Object v18 = com.google.javascript.rhino.Node.newString(((java.lang.String)v17));
    Object v19 = "";
    Object v20 = com.google.javascript.rhino.Node.newString(((java.lang.String)v19));
    Object v21 = 17;
    ((com.google.javascript.rhino.Node)v20).setCharno((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v16).intValue()),((com.google.javascript.rhino.Node)v18),((com.google.javascript.rhino.Node)v20));
    Object v24 = ((com.google.javascript.rhino.Node)v15).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v23));
    Object v25 = 0;
    Object v26 = ((com.google.javascript.rhino.Node)v24).getBooleanProp((((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildrenToBack(((com.google.javascript.rhino.Node)v24));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 0;
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    Object v13 = 17;
    ((com.google.javascript.rhino.Node)v12).setCharno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = ((com.google.javascript.rhino.Node)v7).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v15));
    Object v17 = ((com.google.javascript.rhino.Node)v16).isLabel();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isIf();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 0;
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.Node.newString(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = com.google.javascript.rhino.Node.newString(((java.lang.String)v11));
    Object v13 = 17;
    ((com.google.javascript.rhino.Node)v12).setCharno((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = new com.google.javascript.rhino.Node((((java.lang.Integer)v8).intValue()),((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.Node)v12));
    Object v16 = ((com.google.javascript.rhino.Node)v7).checkTreeTypeAwareEqualsImpl(((com.google.javascript.rhino.Node)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -46;
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isLabel();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 2;
    Object v9 = ")";
    Object v10 = 46;
    Object v11 = -25;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v7).isEquivalentToTyped(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v7).isWhile();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isName();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.Node.newString(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString(((java.lang.String)v8));
    Object v10 = 17;
    ((com.google.javascript.rhino.Node)v9).setCharno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.Node.newString(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString(((java.lang.String)v8));
    Object v10 = 17;
    ((com.google.javascript.rhino.Node)v9).setCharno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = "N";
    ((com.google.javascript.rhino.Node)v13).addSuppression(((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isFor();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -28;
    Object v6 = ((com.google.javascript.rhino.Node)v4).getExistingIntProp((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    ((com.google.javascript.rhino.Node)v4).setDouble((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = true;
    ((com.google.javascript.rhino.Node)v4).putBooleanProp((((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ((com.google.javascript.rhino.Node)v4).isDec();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).detachFromParent();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = "`";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    ((com.google.javascript.rhino.Node)v4).addChildToFront(((com.google.javascript.rhino.Node)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getSourcePosition();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isComma();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).mayMutateGlobalStateOrThrow();
    Object v10 = 2;
    Object v11 = ")";
    Object v12 = 46;
    Object v13 = -25;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.javascript.rhino.Node)v8).removeChild(((com.google.javascript.rhino.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getCharno();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = 2;
    Object v9 = ")";
    Object v10 = 46;
    Object v11 = -25;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.rhino.Node)v7).addChildrenToFront(((com.google.javascript.rhino.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = 2;
    Object v4 = ")";
    Object v5 = 46;
    Object v6 = -25;
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v3).intValue()),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.javascript.rhino.Node)v2).isEquivalentToShallow(((com.google.javascript.rhino.Node)v7));
    Object v9 = ((com.google.javascript.rhino.Node)v2).isGetProp();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getInputId();
    Object v10 = ((com.google.javascript.rhino.Node)v8).isArrayLit();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isWhile();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = com.google.javascript.rhino.Node.newString(((java.lang.String)v0));
    Object v2 = ((com.google.javascript.rhino.Node)v1).isGetterDef();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = 2;
    Object v9 = ")";
    Object v10 = 46;
    Object v11 = -25;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = -40;
    Object v2 = com.google.javascript.rhino.Node.mergeLineCharNo((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNull();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = new com.google.javascript.rhino.Node.SideEffectFlags();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.Node.newString(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getInputId();
    Object v7 = ((com.google.javascript.rhino.Node)v5).isInstanceOf();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v7));
    ((com.google.javascript.rhino.Node)v2).setDirectives(((java.util.Set)v8));
    Object v9 = null;
    Object v10 = ((com.google.javascript.rhino.Node)v2).isFromExterns();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isDefaultCase();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getSourceFileName();
    Object v4 = ((com.google.javascript.rhino.Node)v2).removeFirstChild();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isBreak();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = 0;
    Object v13 = "`";
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    Object v15 = ((com.google.javascript.rhino.Node)v11).getChildBefore(((com.google.javascript.rhino.Node)v14));
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = 1;
    ((com.google.javascript.rhino.Node)v2).setSourceEncodedPosition((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 2;
    Object v6 = ")";
    Object v7 = 46;
    Object v8 = -25;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = ")";
    Object v12 = 46;
    Object v13 = -25;
    Object v14 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 2;
    Object v16 = ")";
    Object v17 = 46;
    Object v18 = -25;
    Object v19 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v15).intValue()),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.google.javascript.rhino.Node)v14).isEquivalentToShallow(((com.google.javascript.rhino.Node)v19));
    ((com.google.javascript.rhino.Node)v2).addChildAfter(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.Node)v14));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isQualifiedName();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).children();
    Object v4 = ((com.google.javascript.rhino.Node)v2).isWhile();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.Node.newString(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.Node.newString(((java.lang.String)v8));
    Object v10 = 17;
    ((com.google.javascript.rhino.Node)v9).setCharno((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = new com.google.javascript.rhino.Node((((java.lang.Integer)v5).intValue()),((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.Node)v9));
    Object v13 = ((com.google.javascript.rhino.Node)v4).copyInformationFromForTree(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).getDouble();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isDebugger();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isDec();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).isName();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = "`";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = false;
    Object v13 = true;
    Object v14 = true;
    Object v15 = ((com.google.javascript.rhino.Node)v8).isEquivalentTo(((com.google.javascript.rhino.Node)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNumber();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getString();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).isLocalResultCall();
    Object v13 = ((com.google.javascript.rhino.Node)v11).isParamList();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getSideEffectFlags();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 12;
    ((com.google.javascript.rhino.Node)v4).setLength((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((com.google.javascript.rhino.Node)v4).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getSourceFileName();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getInputId();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).getSourceOffset();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = "`";
    Object v7 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v7));
    Object v9 = 1;
    ((com.google.javascript.rhino.Node)v4).setSideEffectFlags((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = 1;
    Object v13 = 2;
    Object v14 = ")";
    Object v15 = 46;
    Object v16 = -25;
    Object v17 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v13).intValue()),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 2;
    Object v19 = ")";
    Object v20 = 46;
    Object v21 = -25;
    Object v22 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new com.google.javascript.rhino.Node((((java.lang.Integer)v12).intValue()),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v22));
    Object v24 = ((com.google.javascript.rhino.Node)v11).getIndexOfChild(((com.google.javascript.rhino.Node)v23));
    org.junit.Assert.assertEquals((Object)(-1), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = ")";
    Object v7 = 46;
    Object v8 = -25;
    Object v9 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v5).intValue()),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.javascript.rhino.Node)v4).checkTreeEquals(((com.google.javascript.rhino.Node)v9));
    Object v11 = 1;
    Object v12 = ((com.google.javascript.rhino.Node)v4).getChildAtIndex((((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = new com.google.javascript.rhino.Node.SideEffectFlags();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.Node.newString(((java.lang.String)v4));
    Object v6 = ((com.google.javascript.rhino.Node)v5).getInputId();
    Object v7 = ((com.google.javascript.rhino.Node)v5).isInstanceOf();
    Object v8 = java.util.Set.of(((java.lang.Object)v3),((java.lang.Object)v7));
    ((com.google.javascript.rhino.Node)v2).setDirectives(((java.util.Set)v8));
    Object v9 = null;
    Object v10 = 1;
    ((com.google.javascript.rhino.Node)v2).removeProp((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = "";
    ((com.google.javascript.rhino.Node)v2).setString(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((com.google.javascript.rhino.Node)v2).isDebugger();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).hasMoreThanOneChild();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.Node)v10));
    Object v12 = ((com.google.javascript.rhino.Node)v11).getStaticSourceFile();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = 2;
    Object v9 = ")";
    Object v10 = 46;
    Object v11 = -25;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isCatch();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = "`";
    Object v11 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = 2;
    Object v13 = ")";
    Object v14 = 46;
    Object v15 = -25;
    Object v16 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v12).intValue()),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.google.javascript.rhino.Node)v11).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v16));
    Object v18 = ((com.google.javascript.rhino.Node)v8).checkTreeEqualsImpl(((com.google.javascript.rhino.Node)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).toStringTree();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.google.javascript.rhino.Node)v4).isNoSideEffectsCall();
    Object v6 = 2;
    Object v7 = ")";
    Object v8 = 46;
    Object v9 = -25;
    Object v10 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v6).intValue()),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.javascript.rhino.Node)v4).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).children();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 4;
    Object v1 = 1;
    Object v2 = com.google.javascript.rhino.Node.mergeLineCharNo((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(16385), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isStringKey();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isAdd();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((com.google.javascript.rhino.Node)v4).detachChildren();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = 2;
    Object v9 = ")";
    Object v10 = 46;
    Object v11 = -25;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = 1;
    ((com.google.javascript.rhino.Node)v13).setSourceEncodedPositionForTree((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = 2;
    Object v9 = ")";
    Object v10 = 46;
    Object v11 = -25;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isThrow();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.Node.newString(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.Node.newString(((java.lang.String)v3));
    Object v5 = 17;
    ((com.google.javascript.rhino.Node)v4).setCharno((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v2),((com.google.javascript.rhino.Node)v4));
    Object v8 = ((com.google.javascript.rhino.Node)v7).isCase();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 2;
    Object v1 = ")";
    Object v2 = 46;
    Object v3 = -25;
    Object v4 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.Node.newString(((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFromForTree(((com.google.javascript.rhino.Node)v6));
    Object v8 = 2;
    Object v9 = ")";
    Object v10 = 46;
    Object v11 = -25;
    Object v12 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.google.javascript.rhino.Node)v4).useSourceInfoIfMissingFrom(((com.google.javascript.rhino.Node)v12));
    Object v14 = ((com.google.javascript.rhino.Node)v13).isFalse();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0;
    Object v1 = "`";
    Object v2 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v0).intValue()),((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isUnscopedQualifiedName();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new com.google.javascript.rhino.Node[]{null,null};
    Object v2 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = ")";
    Object v3 = 46;
    Object v4 = -25;
    Object v5 = com.google.javascript.rhino.Node.newString((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = -67;
    Object v8 = new com.google.javascript.rhino.Node((((java.lang.Integer)v0).intValue()),((com.google.javascript.rhino.Node)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.google.javascript.rhino.Node)v8).getLastSibling();
    org.junit.Assert.assertNotNull(v9);
  }
}
