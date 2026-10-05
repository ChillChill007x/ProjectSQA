package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "\"";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "arguments";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = -17;
    Object v5 = 16;
    Object v6 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -17;
    Object v8 = 16;
    Object v9 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v6),((com.google.javascript.jscomp.Position)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    ((com.google.javascript.jscomp.SourceMap)v0).reset();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 1;
    Object v2 = 0;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "7";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 0;
    Object v2 = 0;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "Expected children to be strings";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "\n";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "\"";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ",";
    Object v6 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v3).addChildToBack(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = -17;
    Object v9 = 16;
    Object v10 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -17;
    Object v12 = 16;
    Object v13 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v10),((com.google.javascript.jscomp.Position)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "undefined";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "E";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "undefi'ned";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "J";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "prototype";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = " : ";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "null";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "1";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "pro";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = ")Q";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((java.lang.Appendable)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = "Arra";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "N";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = ":";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "JSC_GETCSSNAM";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "[";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = ".";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "]C";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "typeof";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = false;
    ((com.google.javascript.rhino.Node)v3).setOptionalArg((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = -17;
    Object v7 = 16;
    Object v8 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -17;
    Object v10 = 16;
    Object v11 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v8),((com.google.javascript.jscomp.Position)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "verbose";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "prototype";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = ((com.google.javascript.rhino.Node)v3).getAncestor((((java.lang.Integer)v4).intValue()));
    Object v6 = -17;
    Object v7 = 16;
    Object v8 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -17;
    Object v10 = 16;
    Object v11 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v8),((com.google.javascript.jscomp.Position)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "X";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "(";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = " to module ";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.google.javascript.rhino.Node)v3).removeChildren();
    Object v5 = -17;
    Object v6 = 16;
    Object v7 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -17;
    Object v9 = 16;
    Object v10 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v7),((com.google.javascript.jscomp.Position)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "1";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = " ";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "8";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "$";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "e";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ",";
    Object v6 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v3).checkTreeTypeAwareEqualsSilent(((com.google.javascript.rhino.Node)v6));
    Object v8 = -17;
    Object v9 = 16;
    Object v10 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -17;
    Object v12 = 16;
    Object v13 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v10),((com.google.javascript.jscomp.Position)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = " ";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = ".prototypfe";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "msg.jsdoc.define";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = ":(";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "b ";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v3));
    Object v5 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v4));
    Object v6 = "Ar";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ",";
    Object v6 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.google.javascript.rhino.Node)v3).copyInformationFrom(((com.google.javascript.rhino.Node)v6));
    Object v8 = -17;
    Object v9 = 16;
    Object v10 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -17;
    Object v12 = 16;
    Object v13 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v10),((com.google.javascript.jscomp.Position)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "msg.und0f.label";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "W";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "<bject";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "this";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 39;
    Object v2 = -67;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v3));
    Object v5 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v4));
    Object v6 = "Tracer should not be null at the vnd of a pass.";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "Y";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v3));
    Object v5 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v4));
    Object v6 = "Na";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "{";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 11;
    Object v2 = 55;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "nll";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "p";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = ">";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = ".";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "(";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "4";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "-";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(((java.lang.String)v3));
    Object v5 = ((java.lang.Appendable)v2).append(((java.lang.CharSequence)v4));
    Object v6 = "c";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "number";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "Expected node type ";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((java.lang.Appendable)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = "prototype";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "?";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "M";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "Y";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "msg.jsdoc.missing.rc";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "e";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "  ";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "swit";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 1;
    Object v2 = -6;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "msg.no.brace.body";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "b";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "n";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "E";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((java.lang.Appendable)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = ";";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "evaj";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = " [^testcode] ";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = ")";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "]";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "}";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ",";
    Object v6 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v3).addChildToFront(((com.google.javascript.rhino.Node)v6));
    Object v7 = null;
    Object v8 = -17;
    Object v9 = 16;
    Object v10 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -17;
    Object v12 = 16;
    Object v13 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v10),((com.google.javascript.jscomp.Position)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "assiQgn_lsh";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "";
    Object v2 = ",";
    Object v3 = com.google.javascript.rhino.Parser.parseWithJSDoc(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = false;
    ((com.google.javascript.rhino.Node)v3).putBooleanProp((((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = -17;
    Object v8 = 16;
    Object v9 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -17;
    Object v11 = 16;
    Object v12 = new com.google.javascript.jscomp.Position((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.javascript.jscomp.SourceMap)v0).addMapping(((com.google.javascript.rhino.Node)v3),((com.google.javascript.jscomp.Position)v9),((com.google.javascript.jscomp.Position)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "nosi";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = "P";
    ((com.google.javascript.jscomp.SourceMap)v0).setWrapperPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "x";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 1;
    Object v2 = 1;
    ((com.google.javascript.jscomp.SourceMap)v0).setStartingPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.SourceMap();
    Object v1 = 40;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = "ty";
    ((com.google.javascript.jscomp.SourceMap)v0).appendTo(((java.lang.Appendable)v2),((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
