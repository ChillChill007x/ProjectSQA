package org.jsoup;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = new org.jsoup.UncheckedIOException(((java.io.IOException)v1));
    Object v3 = new java.lang.StackTraceElement[]{null,null};
    ((java.lang.Throwable)v2).setStackTrace(((java.lang.StackTraceElement[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = "4";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintWriter(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    ((java.lang.Throwable)v1).printStackTrace(((java.io.PrintWriter)v4));
    Object v5 = null;
    Object v6 = ((java.lang.Throwable)v1).fillInStackTrace();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getStackTrace();
    Object v3 = ((java.lang.Throwable)v1).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: title{"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = "title{";
    Object v3 = new java.io.IOException(((java.lang.String)v2));
    ((java.lang.Throwable)v1).addSuppressed(((java.lang.Throwable)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = new java.lang.StackTraceElement[]{null,null};
    ((java.lang.Throwable)v1).setStackTrace(((java.lang.StackTraceElement[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "|";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getCause();
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    ((java.lang.Throwable)v2).addSuppressed(((java.lang.Throwable)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = ((java.lang.Throwable)v2).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: |"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getLocalizedMessage();
    org.junit.Assert.assertEquals((Object)("|"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = "|";
    Object v3 = new org.jsoup.UncheckedIOException(((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).getCause();
    Object v5 = ((java.lang.Throwable)v1).initCause(((java.lang.Throwable)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getStackTrace();
    Object v7 = ((java.lang.Throwable)v5).getSuppressed();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: |"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = "4";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintWriter(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    ((java.lang.Throwable)v1).printStackTrace(((java.io.PrintWriter)v4));
    Object v5 = null;
    Object v6 = ((java.lang.Throwable)v1).toString();
    org.junit.Assert.assertEquals((Object)("org.jsoup.UncheckedIOException: java.io.IOException: |"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getSuppressed();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = "|";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getCause();
    Object v6 = "title{";
    Object v7 = new java.io.IOException(((java.lang.String)v6));
    Object v8 = ((java.lang.Throwable)v5).initCause(((java.lang.Throwable)v7));
    Object v9 = ((java.lang.Throwable)v8).getCause();
    ((java.lang.Throwable)v2).addSuppressed(((java.lang.Throwable)v9));
    Object v10 = null;
    Object v11 = ((java.lang.Throwable)v2).getMessage();
    org.junit.Assert.assertEquals((Object)("|"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = new java.lang.StackTraceElement[]{null,null};
    ((java.lang.Throwable)v1).setStackTrace(((java.lang.StackTraceElement[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "|";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "meta";
    Object v4 = new java.io.PrintStream(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = new java.io.PrintStream(((java.io.OutputStream)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((java.lang.Throwable)v2).printStackTrace(((java.io.PrintStream)v6));
    Object v7 = null;
    Object v8 = ((java.lang.Throwable)v2).getCause();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    Object v7 = ((java.lang.Throwable)v6).getStackTrace();
    Object v8 = "title{";
    Object v9 = new java.io.IOException(((java.lang.String)v8));
    Object v10 = "4";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintWriter(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    ((java.lang.Throwable)v9).printStackTrace(((java.io.PrintWriter)v12));
    Object v13 = null;
    Object v14 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v15 = "|";
    Object v16 = new org.jsoup.UncheckedIOException(((java.lang.String)v15));
    Object v17 = ((java.lang.Throwable)v14).initCause(((java.lang.Throwable)v16));
    Object v18 = ((java.lang.Throwable)v6).initCause(((java.lang.Throwable)v14));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = "meta";
    Object v4 = new java.io.PrintStream(((java.lang.String)v3));
    Object v5 = true;
    Object v6 = new java.io.PrintStream(((java.io.OutputStream)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((java.lang.Throwable)v2).printStackTrace(((java.io.PrintStream)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).toString();
    Object v5 = "4";
    Object v6 = java.nio.charset.Charset.defaultCharset();
    Object v7 = new java.io.PrintWriter(((java.lang.String)v5),((java.nio.charset.Charset)v6));
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintWriter)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: |"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    Object v7 = "|";
    Object v8 = new org.jsoup.UncheckedIOException(((java.lang.String)v7));
    Object v9 = ((org.jsoup.UncheckedIOException)v8).ioException();
    Object v10 = "4";
    Object v11 = java.nio.charset.Charset.defaultCharset();
    Object v12 = new java.io.PrintWriter(((java.lang.String)v10),((java.nio.charset.Charset)v11));
    ((java.lang.Throwable)v9).printStackTrace(((java.io.PrintWriter)v12));
    Object v13 = null;
    Object v14 = ((java.lang.Throwable)v6).initCause(((java.lang.Throwable)v9));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    Object v7 = "|";
    Object v8 = new org.jsoup.UncheckedIOException(((java.lang.String)v7));
    Object v9 = ((java.lang.Throwable)v8).getCause();
    Object v10 = "|";
    Object v11 = new org.jsoup.UncheckedIOException(((java.lang.String)v10));
    Object v12 = ((java.lang.Throwable)v9).initCause(((java.lang.Throwable)v11));
    ((java.lang.Throwable)v6).addSuppressed(((java.lang.Throwable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = "|";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    ((java.lang.Throwable)v2).addSuppressed(((java.lang.Throwable)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = ((java.lang.Throwable)v2).getCause();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = "meta";
    Object v3 = new java.io.PrintStream(((java.lang.String)v2));
    ((java.lang.Throwable)v1).printStackTrace(((java.io.PrintStream)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.UncheckedIOException(((java.lang.String)v2));
    Object v4 = "4";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintWriter(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintWriter)v6));
    Object v7 = null;
    Object v8 = ((java.lang.Throwable)v1).initCause(((java.lang.Throwable)v3));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = "4";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintWriter(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    ((java.lang.Throwable)v1).printStackTrace(((java.io.PrintWriter)v4));
    Object v5 = null;
    Object v6 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v7 = new org.jsoup.UncheckedIOException(((java.io.IOException)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).toString();
    org.junit.Assert.assertEquals((Object)("org.jsoup.UncheckedIOException: java.io.IOException: "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    ((java.lang.Throwable)v2).printStackTrace();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    Object v7 = "";
    Object v8 = new org.jsoup.UncheckedIOException(((java.lang.String)v7));
    ((java.lang.Throwable)v6).addSuppressed(((java.lang.Throwable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = "|";
    Object v3 = new org.jsoup.UncheckedIOException(((java.lang.String)v2));
    Object v4 = ((org.jsoup.UncheckedIOException)v3).ioException();
    ((java.lang.Throwable)v1).addSuppressed(((java.lang.Throwable)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: title{"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).getSuppressed();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    Object v7 = ((java.lang.Throwable)v6).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: title{"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = "|";
    Object v5 = new org.jsoup.UncheckedIOException(((java.lang.String)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    Object v7 = "title{";
    Object v8 = new java.io.IOException(((java.lang.String)v7));
    Object v9 = ((java.lang.Throwable)v6).initCause(((java.lang.Throwable)v8));
    ((java.lang.Throwable)v3).addSuppressed(((java.lang.Throwable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = new java.lang.StackTraceElement[]{null,null,null};
    ((java.lang.Throwable)v1).setStackTrace(((java.lang.StackTraceElement[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = "4";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new java.io.PrintWriter(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    ((java.lang.Throwable)v2).printStackTrace(((java.io.PrintWriter)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = new java.lang.StackTraceElement[]{null,null,null};
    ((java.lang.Throwable)v1).setStackTrace(((java.lang.StackTraceElement[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = new java.lang.StackTraceElement[]{};
    ((java.lang.Throwable)v3).setStackTrace(((java.lang.StackTraceElement[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).toString();
    org.junit.Assert.assertEquals((Object)("org.jsoup.UncheckedIOException: java.io.IOException: |"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getSuppressed();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getSuppressed();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getSuppressed();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "title{";
    Object v1 = new java.io.IOException(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new org.jsoup.UncheckedIOException(((java.lang.String)v2));
    Object v4 = "4";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintWriter(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintWriter)v6));
    Object v7 = null;
    Object v8 = ((java.lang.Throwable)v1).initCause(((java.lang.Throwable)v3));
    Object v9 = ((java.lang.Throwable)v8).getCause();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = new org.jsoup.UncheckedIOException(((java.io.IOException)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = ((java.lang.Throwable)v2).getCause();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = new org.jsoup.UncheckedIOException(((java.io.IOException)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = new org.jsoup.UncheckedIOException(((java.io.IOException)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = ((org.jsoup.UncheckedIOException)v7).ioException();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "textarea";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = "|";
    Object v3 = new org.jsoup.UncheckedIOException(((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).getCause();
    Object v5 = "";
    Object v6 = new org.jsoup.UncheckedIOException(((java.lang.String)v5));
    Object v7 = ((java.lang.Throwable)v4).initCause(((java.lang.Throwable)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.UncheckedIOException(((java.lang.String)v8));
    Object v10 = ((java.lang.Throwable)v9).getCause();
    ((java.lang.Throwable)v7).addSuppressed(((java.lang.Throwable)v10));
    Object v11 = null;
    ((java.lang.Throwable)v1).addSuppressed(((java.lang.Throwable)v7));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    ((java.lang.Throwable)v2).printStackTrace();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).toString();
    ((java.lang.Throwable)v1).printStackTrace();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "h";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = new org.jsoup.UncheckedIOException(((java.io.IOException)v5));
    Object v7 = ((java.lang.Throwable)v6).fillInStackTrace();
    Object v8 = ((org.jsoup.UncheckedIOException)v7).ioException();
    Object v9 = "|";
    Object v10 = new org.jsoup.UncheckedIOException(((java.lang.String)v9));
    Object v11 = ((org.jsoup.UncheckedIOException)v10).ioException();
    ((java.lang.Throwable)v8).addSuppressed(((java.lang.Throwable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "4";
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new java.io.PrintWriter(((java.lang.String)v3),((java.nio.charset.Charset)v4));
    ((java.lang.Throwable)v2).printStackTrace(((java.io.PrintWriter)v5));
    Object v6 = null;
    Object v7 = ((java.lang.Throwable)v2).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: |"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "h";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getStackTrace();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = "4";
    Object v3 = java.nio.charset.Charset.defaultCharset();
    Object v4 = new java.io.PrintWriter(((java.lang.String)v2),((java.nio.charset.Charset)v3));
    ((java.lang.Throwable)v1).printStackTrace(((java.io.PrintWriter)v4));
    Object v5 = null;
    Object v6 = ((java.lang.Throwable)v1).getCause();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "h";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).toString();
    org.junit.Assert.assertEquals((Object)("org.jsoup.UncheckedIOException: java.io.IOException: h"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "textarea";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "h";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "textarea";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = new java.lang.StackTraceElement[]{null,null,null};
    ((java.lang.Throwable)v2).setStackTrace(((java.lang.StackTraceElement[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "title{";
    Object v4 = new java.io.IOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    Object v7 = "";
    Object v8 = new org.jsoup.UncheckedIOException(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = new org.jsoup.UncheckedIOException(((java.lang.String)v9));
    ((java.lang.Throwable)v8).addSuppressed(((java.lang.Throwable)v10));
    Object v11 = null;
    Object v12 = ((java.lang.Throwable)v6).initCause(((java.lang.Throwable)v8));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "h";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = ((java.lang.Throwable)v2).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: h"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "textarea";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ((java.lang.Throwable)v2).toString();
    org.junit.Assert.assertEquals((Object)("org.jsoup.UncheckedIOException: java.io.IOException: textarea"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "h";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getSuppressed();
    Object v3 = ((java.lang.Throwable)v1).fillInStackTrace();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "textarea";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ((java.lang.Throwable)v2).getStackTrace();
    Object v4 = ((java.lang.Throwable)v2).getSuppressed();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = "|";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((org.jsoup.UncheckedIOException)v4).ioException();
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    ((java.lang.Throwable)v2).addSuppressed(((java.lang.Throwable)v6));
    Object v7 = null;
    Object v8 = ((java.lang.Throwable)v2).getCause();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).getStackTrace();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "textarea";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    ((java.lang.Throwable)v2).printStackTrace();
    Object v3 = null;
    Object v4 = new java.lang.StackTraceElement[]{};
    ((java.lang.Throwable)v2).setStackTrace(((java.lang.StackTraceElement[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "textarea";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    ((java.lang.Throwable)v5).printStackTrace();
    Object v6 = null;
    Object v7 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = "h";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).getCause();
    Object v6 = ((java.lang.Throwable)v5).getSuppressed();
    Object v7 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "h";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = ((java.lang.Throwable)v2).getCause();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = ((java.lang.Throwable)v2).getSuppressed();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).getLocalizedMessage();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    Object v7 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = new org.jsoup.UncheckedIOException(((java.io.IOException)v5));
    Object v7 = "";
    Object v8 = new org.jsoup.UncheckedIOException(((java.lang.String)v7));
    Object v9 = ((java.lang.Throwable)v8).getCause();
    Object v10 = ((java.lang.Throwable)v6).initCause(((java.lang.Throwable)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "h";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = new org.jsoup.UncheckedIOException(((java.io.IOException)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = "meta";
    Object v3 = new java.io.PrintStream(((java.lang.String)v2));
    Object v4 = true;
    Object v5 = new java.io.PrintStream(((java.io.OutputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((java.lang.Throwable)v1).printStackTrace(((java.io.PrintStream)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = "h";
    Object v7 = new org.jsoup.UncheckedIOException(((java.lang.String)v6));
    ((java.lang.Throwable)v5).addSuppressed(((java.lang.Throwable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).getCause();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = ((java.lang.Throwable)v5).fillInStackTrace();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = ((java.lang.Throwable)v2).fillInStackTrace();
    Object v4 = ((java.lang.Throwable)v3).toString();
    org.junit.Assert.assertEquals((Object)("java.io.IOException: |"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ((java.lang.Throwable)v2).getCause();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "|";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((java.lang.Throwable)v1).fillInStackTrace();
    Object v3 = ((java.lang.Throwable)v2).getCause();
    Object v4 = "";
    Object v5 = new org.jsoup.UncheckedIOException(((java.lang.String)v4));
    Object v6 = ((java.lang.Throwable)v5).getCause();
    Object v7 = "";
    Object v8 = new org.jsoup.UncheckedIOException(((java.lang.String)v7));
    Object v9 = ((java.lang.Throwable)v8).fillInStackTrace();
    Object v10 = ((java.lang.Throwable)v9).fillInStackTrace();
    Object v11 = ((java.lang.Throwable)v6).initCause(((java.lang.Throwable)v10));
    ((java.lang.Throwable)v3).addSuppressed(((java.lang.Throwable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.UncheckedIOException(((java.lang.String)v0));
    Object v2 = ((org.jsoup.UncheckedIOException)v1).ioException();
    Object v3 = "";
    Object v4 = new org.jsoup.UncheckedIOException(((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v2).initCause(((java.lang.Throwable)v4));
    Object v6 = new java.lang.StackTraceElement[]{};
    ((java.lang.Throwable)v5).setStackTrace(((java.lang.StackTraceElement[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }
}
