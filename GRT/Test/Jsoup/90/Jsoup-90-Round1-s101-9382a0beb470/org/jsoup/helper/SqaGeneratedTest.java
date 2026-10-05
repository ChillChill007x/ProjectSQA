package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = "u:";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = ((org.jsoup.helper.HttpConnection)v3).execute();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = "script";
    Object v5 = 0;
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).proxy(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).request();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Map)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.lang.String[]{"t8h","script","th"};
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "html";
    Object v8 = "pg";
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8),((java.io.InputStream)v9));
    Object v11 = ((org.jsoup.helper.HttpConnection)v6).request();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).cookies(((java.util.Map)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "";
    Object v8 = "html";
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).header(((java.lang.String)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Map)v8));
    Object v10 = org.jsoup.parser.Parser.htmlParser();
    Object v11 = ((org.jsoup.helper.HttpConnection)v9).parser(((org.jsoup.parser.Parser)v10));
    Object v12 = new java.util.Map.Entry[]{};
    Object v13 = java.util.Map.ofEntries(((java.util.Map.Entry[])v12));
    Object v14 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Map)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookies(((java.util.Map)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookies(((java.util.Map)v8));
    Object v10 = 1;
    Object v11 = new org.jsoup.select.Elements((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Map)v8));
    Object v10 = org.jsoup.parser.Parser.htmlParser();
    Object v11 = ((org.jsoup.helper.HttpConnection)v9).parser(((org.jsoup.parser.Parser)v10));
    Object v12 = new java.util.Map.Entry[]{};
    Object v13 = java.util.Map.ofEntries(((java.util.Map.Entry[])v12));
    Object v14 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Map)v13));
    Object v15 = "tra";
    Object v16 = ((org.jsoup.helper.HttpConnection)v14).postDataCharset(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).cookies(((java.util.Map)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).timeout((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "html";
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = ((org.jsoup.helper.HttpConnection)v3).get();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).cookies(((java.util.Map)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).timeout((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v5).ignoreHttpErrors((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "html";
    Object v9 = ((org.jsoup.helper.HttpConnection)v5).url(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    Object v10 = "</";
    Object v11 = 1;
    Object v12 = ((org.jsoup.helper.HttpConnection)v6).proxy(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = "b-ody";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).requestBody(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    Object v9 = 1;
    Object v10 = new org.jsoup.select.Elements((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jsoup.helper.HttpConnection)v8).data(((java.util.Collection)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "mailto";
    Object v5 = "source";
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5),((java.io.InputStream)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).cookies(((java.util.Map)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).timeout((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v5).cookies(((java.util.Map)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = "b-ody";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).requestBody(((java.lang.String)v4));
    Object v6 = org.jsoup.Connection.Method.GET;
    Object v7 = ((org.jsoup.helper.HttpConnection)v5).method(((org.jsoup.Connection.Method)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Map)v8));
    Object v10 = "html";
    Object v11 = ((org.jsoup.helper.HttpConnection)v9).userAgent(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = "b-ody";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).requestBody(((java.lang.String)v4));
    Object v6 = org.jsoup.Connection.Method.GET;
    Object v7 = ((org.jsoup.helper.HttpConnection)v5).method(((org.jsoup.Connection.Method)v6));
    Object v8 = false;
    Object v9 = ((org.jsoup.helper.HttpConnection)v7).followRedirects((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    Object v9 = new java.util.Map.Entry[]{};
    Object v10 = java.util.Map.ofEntries(((java.util.Map.Entry[])v9));
    Object v11 = new org.jsoup.helper.HttpConnection();
    Object v12 = 1;
    Object v13 = new org.jsoup.select.Elements((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.jsoup.helper.HttpConnection)v11).data(((java.util.Collection)v13));
    Object v15 = ((java.util.Map)v10).get(((java.lang.Object)v14));
    Object v16 = ((org.jsoup.helper.HttpConnection)v8).data(((java.util.Map)v10));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Map)v8));
    Object v10 = org.jsoup.parser.Parser.htmlParser();
    Object v11 = ((org.jsoup.helper.HttpConnection)v9).parser(((org.jsoup.parser.Parser)v10));
    Object v12 = new java.util.Map.Entry[]{};
    Object v13 = java.util.Map.ofEntries(((java.util.Map.Entry[])v12));
    Object v14 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Map)v13));
    Object v15 = 300;
    Object v16 = ((org.jsoup.helper.HttpConnection)v14).timeout((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).cookies(((java.util.Map)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = ((org.jsoup.helper.HttpConnection)v6).execute();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    Object v9 = 1;
    Object v10 = new org.jsoup.select.Elements((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jsoup.helper.HttpConnection)v8).data(((java.util.Collection)v10));
    Object v12 = "tbody";
    Object v13 = ((org.jsoup.helper.HttpConnection)v11).url(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    Object v10 = "</";
    Object v11 = 1;
    Object v12 = ((org.jsoup.helper.HttpConnection)v6).proxy(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new org.jsoup.select.Elements((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Collection)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    Object v10 = "</";
    Object v11 = 1;
    Object v12 = ((org.jsoup.helper.HttpConnection)v6).proxy(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new org.jsoup.select.Elements((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Collection)v14));
    Object v16 = true;
    Object v17 = ((org.jsoup.helper.HttpConnection)v15).ignoreContentType((((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    Object v9 = new java.util.Map.Entry[]{};
    Object v10 = java.util.Map.ofEntries(((java.util.Map.Entry[])v9));
    Object v11 = ((org.jsoup.helper.HttpConnection)v8).headers(((java.util.Map)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookies(((java.util.Map)v8));
    Object v10 = 1;
    Object v11 = new org.jsoup.select.Elements((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Collection)v11));
    Object v13 = "tr";
    Object v14 = "!";
    Object v15 = java.io.InputStream.nullInputStream();
    Object v16 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)-49),Byte.valueOf((byte)0)};
    Object v17 = ((java.io.InputStream)v15).read(((byte[])v16));
    Object v18 = "basefnt";
    Object v19 = ((org.jsoup.helper.HttpConnection)v12).data(((java.lang.String)v13),((java.lang.String)v14),((java.io.InputStream)v15),((java.lang.String)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.Collection)v8).isEmpty();
    Object v10 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = "b-ody";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).requestBody(((java.lang.String)v4));
    Object v6 = org.jsoup.Connection.Method.GET;
    Object v7 = ((org.jsoup.helper.HttpConnection)v5).method(((org.jsoup.Connection.Method)v6));
    Object v8 = false;
    Object v9 = ((org.jsoup.helper.HttpConnection)v7).followRedirects((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "9";
    Object v11 = "caption";
    Object v12 = java.io.InputStream.nullInputStream();
    Object v13 = "tab4e";
    Object v14 = ((org.jsoup.helper.HttpConnection)v9).data(((java.lang.String)v10),((java.lang.String)v11),((java.io.InputStream)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "caption";
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    Object v10 = "</";
    Object v11 = 1;
    Object v12 = ((org.jsoup.helper.HttpConnection)v6).proxy(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "thLead";
    Object v14 = ((org.jsoup.helper.HttpConnection)v12).data(((java.lang.String)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    Object v9 = 1;
    Object v10 = new org.jsoup.select.Elements((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jsoup.helper.HttpConnection)v8).data(((java.util.Collection)v10));
    Object v12 = "s";
    Object v13 = ((org.jsoup.helper.HttpConnection)v11).userAgent(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    Object v10 = "</";
    Object v11 = 1;
    Object v12 = ((org.jsoup.helper.HttpConnection)v6).proxy(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new org.jsoup.select.Elements((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Collection)v14));
    Object v16 = new java.util.Map.Entry[]{};
    Object v17 = java.util.Map.ofEntries(((java.util.Map.Entry[])v16));
    Object v18 = ((java.util.Map)v17).hashCode();
    Object v19 = ((org.jsoup.helper.HttpConnection)v15).data(((java.util.Map)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.String[]{"thea"};
    Object v9 = ((org.jsoup.helper.HttpConnection)v7).data(((java.lang.String[])v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "title";
    Object v9 = -7;
    Object v10 = ((org.jsoup.helper.HttpConnection)v7).proxy(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = new java.lang.String[]{"","align"};
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).cookies(((java.util.Map)v2));
    Object v4 = ((org.jsoup.helper.HttpConnection)v3).post();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookies(((java.util.Map)v8));
    Object v10 = "svlect";
    Object v11 = ((org.jsoup.helper.HttpConnection)v9).data(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "blo";
    Object v5 = "hLtml";
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).maxBodySize((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "thead";
    Object v9 = ((org.jsoup.helper.HttpConnection)v7).referrer(((java.lang.String)v8));
    Object v10 = new java.lang.String[]{};
    Object v11 = ((org.jsoup.helper.HttpConnection)v7).data(((java.lang.String[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "bodl";
    Object v1 = org.jsoup.helper.HttpConnection.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    Object v10 = "</";
    Object v11 = 1;
    Object v12 = ((org.jsoup.helper.HttpConnection)v6).proxy(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new org.jsoup.select.Elements((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Collection)v14));
    Object v16 = "jtable";
    Object v17 = "tp";
    Object v18 = ((org.jsoup.helper.HttpConnection)v15).header(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.util.Map.Entry[]{};
    Object v20 = java.util.Map.ofEntries(((java.util.Map.Entry[])v19));
    Object v21 = ((org.jsoup.helper.HttpConnection)v15).headers(((java.util.Map)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).followRedirects((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new org.jsoup.helper.HttpConnection();
    Object v9 = new java.util.Map.Entry[]{};
    Object v10 = java.util.Map.ofEntries(((java.util.Map.Entry[])v9));
    Object v11 = ((org.jsoup.helper.HttpConnection)v8).headers(((java.util.Map)v10));
    Object v12 = "script";
    Object v13 = 0;
    Object v14 = ((org.jsoup.helper.HttpConnection)v11).proxy(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.HttpConnection)v11).request();
    Object v16 = ((org.jsoup.helper.HttpConnection)v7).request(((org.jsoup.Connection.Request)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = new org.jsoup.helper.HttpConnection.Response();
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).response(((org.jsoup.Connection.Response)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookies(((java.util.Map)v8));
    Object v10 = org.jsoup.parser.Parser.htmlParser();
    Object v11 = false;
    Object v12 = true;
    Object v13 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.jsoup.parser.Parser)v10).settings(((org.jsoup.parser.ParseSettings)v13));
    Object v15 = ((org.jsoup.helper.HttpConnection)v9).parser(((org.jsoup.parser.Parser)v10));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "D";
    Object v1 = org.jsoup.helper.HttpConnection.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    Object v9 = 1;
    Object v10 = new org.jsoup.select.Elements((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jsoup.helper.HttpConnection)v8).data(((java.util.Collection)v10));
    Object v12 = "s";
    Object v13 = ((org.jsoup.helper.HttpConnection)v11).userAgent(((java.lang.String)v12));
    Object v14 = new java.util.Map.Entry[]{};
    Object v15 = java.util.Map.ofEntries(((java.util.Map.Entry[])v14));
    Object v16 = ((org.jsoup.helper.HttpConnection)v13).data(((java.util.Map)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "hr";
    Object v8 = "noscript";
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    Object v9 = 1;
    Object v10 = new org.jsoup.select.Elements((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jsoup.helper.HttpConnection)v8).data(((java.util.Collection)v10));
    Object v12 = "s";
    Object v13 = ((org.jsoup.helper.HttpConnection)v11).userAgent(((java.lang.String)v12));
    Object v14 = new java.util.Map.Entry[]{};
    Object v15 = java.util.Map.ofEntries(((java.util.Map.Entry[])v14));
    Object v16 = ((org.jsoup.helper.HttpConnection)v13).data(((java.util.Map)v15));
    Object v17 = 0;
    Object v18 = ((org.jsoup.helper.HttpConnection)v16).maxBodySize((((java.lang.Integer)v17).intValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "caption";
    Object v8 = "ht.ml";
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8),((java.io.InputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    Object v10 = "</";
    Object v11 = 1;
    Object v12 = ((org.jsoup.helper.HttpConnection)v6).proxy(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new org.jsoup.select.Elements((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Collection)v14));
    Object v16 = "jtable";
    Object v17 = "tp";
    Object v18 = ((org.jsoup.helper.HttpConnection)v15).header(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = new java.util.Map.Entry[]{};
    Object v20 = java.util.Map.ofEntries(((java.util.Map.Entry[])v19));
    Object v21 = ((org.jsoup.helper.HttpConnection)v15).headers(((java.util.Map)v20));
    Object v22 = new java.util.Map.Entry[]{};
    Object v23 = java.util.Map.ofEntries(((java.util.Map.Entry[])v22));
    Object v24 = ((org.jsoup.helper.HttpConnection)v21).headers(((java.util.Map)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).cookies(((java.util.Map)v2));
    Object v4 = null;
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).url(((java.net.URL)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "thead";
    Object v9 = ((org.jsoup.helper.HttpConnection)v7).referrer(((java.lang.String)v8));
    Object v10 = new java.lang.String[]{};
    Object v11 = ((org.jsoup.helper.HttpConnection)v7).data(((java.lang.String[])v10));
    Object v12 = "td";
    Object v13 = ((org.jsoup.helper.HttpConnection)v11).url(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "hr";
    Object v8 = "noscript";
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "rt";
    Object v11 = "htmZl";
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "%20";
    Object v1 = org.jsoup.helper.HttpConnection.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "hr";
    Object v8 = "noscript";
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "rt";
    Object v11 = "htmZl";
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.util.Map.Entry[]{};
    Object v14 = java.util.Map.ofEntries(((java.util.Map.Entry[])v13));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Map)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "hr";
    Object v8 = "noscript";
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = new org.jsoup.select.Elements((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = 1;
    Object v8 = new org.jsoup.select.Elements((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v8));
    Object v10 = "</";
    Object v11 = 1;
    Object v12 = ((org.jsoup.helper.HttpConnection)v6).proxy(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new org.jsoup.select.Elements((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Collection)v14));
    Object v16 = "html";
    Object v17 = ((org.jsoup.helper.HttpConnection)v15).referrer(((java.lang.String)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).followRedirects((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "clas";
    Object v10 = ((org.jsoup.helper.HttpConnection)v8).data(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = ":first-of-type";
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.Map.Entry[]{};
    Object v9 = java.util.Map.ofEntries(((java.util.Map.Entry[])v8));
    Object v10 = ((java.util.Map)v9).isEmpty();
    Object v11 = ((org.jsoup.helper.HttpConnection)v7).data(((java.util.Map)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "th";
    Object v5 = "";
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5),((java.io.InputStream)v6));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = "nam";
    Object v8 = " ";
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = "table";
    Object v11 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8),((java.io.InputStream)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookies(((java.util.Map)v8));
    Object v10 = new java.lang.String[]{"","i"};
    Object v11 = ((org.jsoup.helper.HttpConnection)v9).data(((java.lang.String[])v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "caption";
    Object v8 = "ht.ml";
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8),((java.io.InputStream)v9));
    Object v11 = org.jsoup.Connection.Method.POST;
    Object v12 = ((org.jsoup.helper.HttpConnection)v10).method(((org.jsoup.Connection.Method)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = new java.lang.String[]{"html"};
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "hr";
    Object v8 = "noscript";
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "rt";
    Object v11 = "htmZl";
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.util.Map.Entry[]{};
    Object v14 = java.util.Map.ofEntries(((java.util.Map.Entry[])v13));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Map)v14));
    Object v16 = ":matchesOwn(%s)";
    Object v17 = "body";
    Object v18 = ((org.jsoup.helper.HttpConnection)v15).header(((java.lang.String)v16),((java.lang.String)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookies(((java.util.Map)v8));
    Object v10 = new java.util.Map.Entry[]{};
    Object v11 = java.util.Map.ofEntries(((java.util.Map.Entry[])v10));
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).cookies(((java.util.Map)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "thead";
    Object v9 = ((org.jsoup.helper.HttpConnection)v7).referrer(((java.lang.String)v8));
    Object v10 = new java.lang.String[]{};
    Object v11 = ((org.jsoup.helper.HttpConnection)v7).data(((java.lang.String[])v10));
    Object v12 = "t";
    Object v13 = "novalidate";
    Object v14 = ((org.jsoup.helper.HttpConnection)v11).cookie(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "thead";
    Object v9 = ((org.jsoup.helper.HttpConnection)v7).referrer(((java.lang.String)v8));
    Object v10 = new java.lang.String[]{};
    Object v11 = ((org.jsoup.helper.HttpConnection)v7).data(((java.lang.String[])v10));
    Object v12 = "r";
    Object v13 = "";
    Object v14 = ((org.jsoup.helper.HttpConnection)v11).data(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "th";
    Object v5 = "";
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5),((java.io.InputStream)v6));
    Object v10 = 1;
    Object v11 = new org.jsoup.select.Elements((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).followRedirects((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = ((org.jsoup.helper.HttpConnection)v8).ignoreHttpErrors((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).ignoreHttpErrors((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = new java.util.Map.Entry[]{};
    Object v8 = java.util.Map.ofEntries(((java.util.Map.Entry[])v7));
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookies(((java.util.Map)v8));
    Object v10 = org.jsoup.parser.Parser.htmlParser();
    Object v11 = false;
    Object v12 = true;
    Object v13 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.jsoup.parser.Parser)v10).settings(((org.jsoup.parser.ParseSettings)v13));
    Object v15 = ((org.jsoup.helper.HttpConnection)v9).parser(((org.jsoup.parser.Parser)v10));
    Object v16 = "t";
    Object v17 = ((org.jsoup.helper.HttpConnection)v15).userAgent(((java.lang.String)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "textarea";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4));
    Object v6 = new java.util.Map.Entry[]{};
    Object v7 = java.util.Map.ofEntries(((java.util.Map.Entry[])v6));
    Object v8 = ((org.jsoup.helper.HttpConnection)v3).headers(((java.util.Map)v7));
    Object v9 = "POST";
    Object v10 = "encoding";
    Object v11 = ((org.jsoup.helper.HttpConnection)v8).cookie(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = new org.jsoup.select.Elements((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.jsoup.helper.HttpConnection)v8).data(((java.util.Collection)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = "select";
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "th";
    Object v5 = "";
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5),((java.io.InputStream)v6));
    Object v10 = 1;
    Object v11 = new org.jsoup.select.Elements((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Collection)v11));
    Object v13 = 0;
    Object v14 = ((org.jsoup.helper.HttpConnection)v12).timeout((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).followRedirects((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v8).response();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "caption";
    Object v8 = "*";
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).cookie(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = new org.jsoup.select.Elements((((java.lang.Integer)v10).intValue()));
    Object v12 = new org.jsoup.helper.HttpConnection();
    Object v13 = 1;
    Object v14 = new org.jsoup.select.Elements((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.HttpConnection)v12).data(((java.util.Collection)v14));
    Object v16 = "textarea";
    Object v17 = ((org.jsoup.helper.HttpConnection)v15).data(((java.lang.String)v16));
    Object v18 = new java.util.Map.Entry[]{};
    Object v19 = java.util.Map.ofEntries(((java.util.Map.Entry[])v18));
    Object v20 = ((org.jsoup.helper.HttpConnection)v15).headers(((java.util.Map)v19));
    Object v21 = 1;
    Object v22 = new org.jsoup.select.Elements((((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.jsoup.helper.HttpConnection)v20).data(((java.util.Collection)v22));
    Object v24 = "s";
    Object v25 = ((org.jsoup.helper.HttpConnection)v23).userAgent(((java.lang.String)v24));
    Object v26 = new java.util.Map.Entry[]{};
    Object v27 = java.util.Map.ofEntries(((java.util.Map.Entry[])v26));
    Object v28 = ((org.jsoup.helper.HttpConnection)v25).data(((java.util.Map)v27));
    Object v29 = 0;
    Object v30 = ((org.jsoup.helper.HttpConnection)v28).maxBodySize((((java.lang.Integer)v29).intValue()));
    Object v31 = ((java.util.Collection)v11).remove(((java.lang.Object)v30));
    Object v32 = ((org.jsoup.helper.HttpConnection)v6).data(((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "th";
    Object v5 = "";
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5),((java.io.InputStream)v6));
    Object v10 = 1;
    Object v11 = new org.jsoup.select.Elements((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jsoup.helper.HttpConnection)v9).data(((java.util.Collection)v11));
    Object v13 = false;
    Object v14 = ((org.jsoup.helper.HttpConnection)v12).ignoreContentType((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.lang.String[]{"toot"};
    Object v16 = ((org.jsoup.helper.HttpConnection)v12).data(((java.lang.String[])v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = new org.jsoup.helper.HttpConnection.Response();
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).response(((org.jsoup.Connection.Response)v7));
    Object v9 = new java.lang.String[]{"html"};
    Object v10 = ((org.jsoup.helper.HttpConnection)v8).data(((java.lang.String[])v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "basefon";
    Object v5 = ((org.jsoup.helper.HttpConnection)v3).referrer(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.jsoup.helper.HttpConnection)v3).ignoreContentType((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "thead";
    Object v9 = ((org.jsoup.helper.HttpConnection)v7).referrer(((java.lang.String)v8));
    Object v10 = new java.lang.String[]{};
    Object v11 = ((org.jsoup.helper.HttpConnection)v7).data(((java.lang.String[])v10));
    Object v12 = ((org.jsoup.helper.HttpConnection)v11).response();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = "th";
    Object v5 = "";
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jsoup.helper.HttpConnection)v3).data(((java.lang.String)v4),((java.lang.String)v5),((java.io.InputStream)v6));
    Object v10 = ((org.jsoup.helper.HttpConnection)v9).get();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = 1;
    Object v2 = new org.jsoup.select.Elements((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).data(((java.util.Collection)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).data(((java.util.Map)v5));
    Object v7 = "hr";
    Object v8 = "noscript";
    Object v9 = ((org.jsoup.helper.HttpConnection)v6).data(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "noframes";
    Object v11 = ((org.jsoup.helper.HttpConnection)v9).data(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.helper.HttpConnection();
    Object v1 = new java.util.Map.Entry[]{};
    Object v2 = java.util.Map.ofEntries(((java.util.Map.Entry[])v1));
    Object v3 = ((org.jsoup.helper.HttpConnection)v0).headers(((java.util.Map)v2));
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    Object v6 = ((org.jsoup.helper.HttpConnection)v3).cookies(((java.util.Map)v5));
    Object v7 = true;
    Object v8 = ((org.jsoup.helper.HttpConnection)v6).followRedirects((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = ((org.jsoup.helper.HttpConnection)v8).ignoreHttpErrors((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 1;
    Object v12 = new org.jsoup.select.Elements((((java.lang.Integer)v11).intValue()));
    Object v13 = org.jsoup.parser.Parser.htmlParser();
    Object v14 = ((java.util.Collection)v12).equals(((java.lang.Object)v13));
    Object v15 = ((org.jsoup.helper.HttpConnection)v10).data(((java.util.Collection)v12));
    org.junit.Assert.assertNotNull(v15);
  }
}
