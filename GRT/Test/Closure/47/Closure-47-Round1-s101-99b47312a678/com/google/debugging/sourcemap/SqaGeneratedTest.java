package com.google.debugging.sourcemap;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -15;
    Object v2 = 44;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = 28;
    Object v6 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -21;
    Object v2 = 0;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = " prope~ties.";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "R";
    Object v2 = 7;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 1;
    Object v2 = -56;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -39;
    Object v2 = 0;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = ((org.json.JSONObject)v2).length();
    Object v4 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = "k";
    Object v4 = ((org.json.JSONObject)v2).remove(((java.lang.String)v3));
    Object v5 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    Object v6 = "numbe";
    Object v7 = ((com.google.debugging.sourcemap.SourceMapSupplier)v5).getSourceMap(((java.lang.String)v6));
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    Object v4 = "";
    Object v5 = ((com.google.debugging.sourcemap.SourceMapSupplier)v3).getSourceMap(((java.lang.String)v4));
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = ", ";
    Object v2 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1),((com.google.debugging.sourcemap.SourceMapSupplier)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -1;
    Object v2 = 1;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.util.TreeMap();
    Object v5 = new org.json.JSONObject(((java.util.Map)v4));
    Object v6 = "q";
    Object v7 = new java.util.TreeMap();
    Object v8 = new org.json.JSONObject(((java.util.Map)v7));
    Object v9 = ((org.json.JSONObject)v5).putOnce(((java.lang.String)v6),((java.lang.Object)v8));
    Object v10 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    Object v11 = "";
    Object v12 = ((com.google.debugging.sourcemap.SourceMapSupplier)v10).getSourceMap(((java.lang.String)v11));
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v5),((com.google.debugging.sourcemap.SourceMapSupplier)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "1";
    Object v2 = 14;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 0;
    Object v2 = 27;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.util.TreeMap();
    Object v5 = new org.json.JSONObject(((java.util.Map)v4));
    Object v6 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v5),((com.google.debugging.sourcemap.SourceMapSupplier)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "$";
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "M";
    Object v2 = -40;
    Object v3 = -2;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = "]Q";
    Object v4 = ((org.json.JSONObject)v2).optBoolean(((java.lang.String)v3));
    Object v5 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    Object v4 = "<=";
    Object v5 = ((com.google.debugging.sourcemap.SourceMapSupplier)v3).getSourceMap(((java.lang.String)v4));
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 14;
    Object v2 = 1;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -3;
    Object v2 = 1;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = ">";
    Object v2 = 3;
    Object v3 = -12;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = ((org.json.JSONObject)v2).toString();
    Object v4 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "[";
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "ZDEFAULT";
    Object v2 = -38;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 1;
    Object v2 = -11;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = -27;
    Object v3 = -32;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "<";
    Object v2 = -8;
    Object v3 = 0;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "{";
    Object v2 = 0;
    Object v3 = 3;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = ".protot\\pe";
    Object v2 = -29;
    Object v3 = 4;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -20;
    Object v2 = 0;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getOriginalSources();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 0;
    Object v2 = 9;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 41;
    Object v2 = 19;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "prototypie";
    Object v2 = 1;
    Object v3 = 9;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = -16;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 39;
    Object v2 = 3;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 46;
    Object v2 = -19;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = "";
    Object v4 = 36;
    Object v5 = ((org.json.JSONObject)v2).put(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 1;
    Object v2 = -14;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "e";
    Object v2 = 54;
    Object v3 = 0;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "v";
    Object v2 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1),((com.google.debugging.sourcemap.SourceMapSupplier)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 22;
    Object v2 = 1;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "implements";
    Object v2 = 20;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = "Q";
    Object v4 = ((org.json.JSONObject)v2).opt(((java.lang.String)v3));
    Object v5 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "private";
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 1;
    Object v2 = 28;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 41;
    Object v2 = 1;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 0;
    Object v2 = 24;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "H";
    Object v2 = 30;
    Object v3 = 0;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 1;
    Object v2 = -38;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 29;
    Object v2 = 25;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -29;
    Object v2 = 0;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "v";
    Object v2 = 7;
    Object v3 = 71;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -5;
    Object v2 = -17;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 11;
    Object v6 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = ".";
    Object v2 = -3;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "Expected STRING, gRot ";
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "1";
    Object v2 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1),((com.google.debugging.sourcemap.SourceMapSupplier)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "t";
    Object v2 = -21;
    Object v3 = 25;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = -68;
    Object v3 = -39;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "$$";
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 35;
    Object v3 = 2;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 7;
    Object v3 = 0;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -67;
    Object v2 = 0;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 6;
    Object v2 = -27;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 17;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 30;
    Object v2 = 23;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 26;
    Object v3 = 5;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = "arguents";
    Object v4 = ((org.json.JSONObject)v2).isNull(((java.lang.String)v3));
    Object v5 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    Object v6 = "^";
    Object v7 = ((com.google.debugging.sourcemap.SourceMapSupplier)v5).getSourceMap(((java.lang.String)v6));
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = -38;
    Object v3 = 4;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "2arguments";
    Object v2 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1),((com.google.debugging.sourcemap.SourceMapSupplier)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = -8;
    Object v2 = 8;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.util.TreeMap();
    Object v5 = new org.json.JSONObject(((java.util.Map)v4));
    Object v6 = ((org.json.JSONObject)v5).keys();
    Object v7 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v5),((com.google.debugging.sourcemap.SourceMapSupplier)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "3";
    Object v2 = 27;
    Object v3 = 36;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = "I";
    Object v4 = true;
    Object v5 = ((org.json.JSONObject)v2).optBoolean(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 14;
    Object v3 = -17;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 35;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "arg";
    Object v2 = -10;
    Object v3 = 0;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "w";
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "$";
    Object v2 = 25;
    Object v3 = 7;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "X";
    Object v2 = 1;
    Object v3 = -11;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "line";
    Object v2 = 1;
    Object v3 = -7;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "m";
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 0;
    Object v2 = -2;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.util.TreeMap();
    Object v5 = new org.json.JSONObject(((java.util.Map)v4));
    Object v6 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v5),((com.google.debugging.sourcemap.SourceMapSupplier)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 29;
    Object v2 = 0;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "\\";
    Object v2 = 53;
    Object v3 = 0;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "'";
    Object v2 = 1;
    Object v3 = 4;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 2;
    Object v2 = -15;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -20;
    Object v5 = 1;
    Object v6 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getMappingForLine((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 51;
    Object v3 = 1;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "msg.extra.trailing.comma";
    Object v2 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((java.lang.String)v1),((com.google.debugging.sourcemap.SourceMapSupplier)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = "";
    Object v2 = 1;
    Object v3 = 18;
    Object v4 = ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).getReverseMapping(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.google.debugging.sourcemap.SourceMapConsumerV3();
    Object v1 = new java.util.TreeMap();
    Object v2 = new org.json.JSONObject(((java.util.Map)v1));
    Object v3 = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
    Object v4 = "\n";
    Object v5 = ((com.google.debugging.sourcemap.SourceMapSupplier)v3).getSourceMap(((java.lang.String)v4));
    ((com.google.debugging.sourcemap.SourceMapConsumerV3)v0).parse(((org.json.JSONObject)v2),((com.google.debugging.sourcemap.SourceMapSupplier)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected com.google.debugging.sourcemap.SourceMapParseException");
    } catch (com.google.debugging.sourcemap.SourceMapParseException expected) { }
  }
}
