package com.fasterxml.jackson.core.filter;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v0)._nextToken2();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).hasToken(((com.fasterxml.jackson.core.JsonToken)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).nextValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).hasTokenId((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ", expeting field name";
    Object v8 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v4).skipChildren();
    Object v6 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v4).isClosed();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getValueAsInt();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getFloatValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).hasToken(((com.fasterxml.jackson.core.JsonToken)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getCurrentName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = 72L;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextLongValue((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = "?";
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).overrideCurrentName(((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).isExpectedStartObjectToken();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).getBinaryValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getCurrentToken();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v6).getObjectId();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = -52L;
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getValueAsLong((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = -24;
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getValueAsInt((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).clearCurrentToken();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getFormatFeatures();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v4).readBinaryValue(((java.io.OutputStream)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4)._filterContext();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = 23;
    Object v8 = 1;
    Object v9 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getDecimalValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = 0;
    Object v8 = 29;
    Object v9 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v6).overrideFormatFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getCurrentLocation();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).nextFieldName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getValueAsString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).clearCurrentToken();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getParsingContext();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getTextLength();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = -19;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextIntValue((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getCurrentToken();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getCurrentName();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).getTextOffset();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = 0L;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextLongValue((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).clearCurrentToken();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getIntValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = 8L;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextLongValue((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).clearCurrentToken();
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getDoubleValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = "Expected space separating root-level values";
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getValueAsString(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getValueAsDouble();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = -10;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8)._nextToken2();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).readValueAsTree();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).readValuesAs(((com.fasterxml.jackson.core.type.TypeReference)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).clearCurrentToken();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8)._filterContext();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).getCurrentName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = ", expeting field name";
    Object v10 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v8).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = 1L;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).nextLongValue((((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).skipChildren();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v12 = false;
    Object v13 = false;
    Object v14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.core.filter.TokenFilter)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v14)._filterContext();
    Object v16 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8)._nextTokenWithBuffering(((com.fasterxml.jackson.core.filter.TokenFilterContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = -40;
    Object v10 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).hasTokenId((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getMatchCount();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).getValueAsBoolean();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.core.filter.TokenFilter)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v4).setFeatureMask((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v10 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).hasToken(((com.fasterxml.jackson.core.JsonToken)v9));
    Object v11 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).getTypeId();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v11 = false;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.core.filter.TokenFilter)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v13)._filterContext();
    Object v15 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v16 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v15),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 1;
    Object v20 = null;
    Object v21 = java.io.OutputStream.nullOutputStream();
    Object v22 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-31)};
    Object v23 = 0;
    Object v24 = false;
    Object v25 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v18),(((java.lang.Integer)v19).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v20),((java.io.OutputStream)v21),((byte[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Boolean)v24).booleanValue()));
    ((com.fasterxml.jackson.core.filter.TokenFilterContext)v14).writePath(((com.fasterxml.jackson.core.JsonGenerator)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8)._nextTokenWithBuffering(((com.fasterxml.jackson.core.filter.TokenFilterContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7)._nextToken2();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).getCurrentName();
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).hasTokenId((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).clearCurrentToken();
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getTextCharacters();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = ", expeting field name";
    Object v10 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.core.SerializableString)v10).asQuotedChars();
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v8).nextFieldName(((com.fasterxml.jackson.core.SerializableString)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).getTextCharacters();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.core.filter.TokenFilter)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 48;
    Object v14 = 0;
    Object v15 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v12).overrideStdFeatures((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.core.filter.TokenFilter)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v12).skipChildren();
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v12).getLongValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).version();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = 42L;
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getValueAsLong((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).getCurrentName();
    Object v10 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).hasTextCharacters();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).clearCurrentToken();
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getBooleanValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).getCurrentName();
    Object v10 = -1;
    Object v11 = -31;
    Object v12 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).overrideStdFeatures((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getLastClearedToken();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.core.filter.TokenFilter)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v12).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = 1;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).getLastClearedToken();
    Object v10 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).getCurrentValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).clearCurrentToken();
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).getMatchCount();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.core.filter.TokenFilter)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v12).clearCurrentToken();
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v12).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;
    Object v10 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).hasToken(((com.fasterxml.jackson.core.JsonToken)v9));
    Object v11 = ((com.fasterxml.jackson.core.util.JsonParserDelegate)v8).getSchema();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v8).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).getBinaryValue(((com.fasterxml.jackson.core.Base64Variant)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v7).skipChildren();
    Object v9 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v10 = true;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.core.filter.TokenFilter)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v12).clearCurrentToken();
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v12).nextToken();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = false;
    Object v8 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v5),((java.lang.Object)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new java.io.ByteArrayInputStream(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new byte[]{};
    Object v14 = 10;
    Object v15 = 1;
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.core.io.UTF32Reader(((com.fasterxml.jackson.core.io.IOContext)v8),((java.io.InputStream)v12),((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Boolean)v16).booleanValue()));
    ((com.fasterxml.jackson.core.util.JsonParserDelegate)v4).setCurrentValue(((java.lang.Object)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.core.filter.TokenFilter();
    Object v2 = false;
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(((com.fasterxml.jackson.core.JsonParser)v0),((com.fasterxml.jackson.core.filter.TokenFilter)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).clearCurrentToken();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v4).skipChildren();
    Object v7 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).skipChildren();
    Object v10 = ((com.fasterxml.jackson.core.filter.FilteringParserDelegate)v8).getByteValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
