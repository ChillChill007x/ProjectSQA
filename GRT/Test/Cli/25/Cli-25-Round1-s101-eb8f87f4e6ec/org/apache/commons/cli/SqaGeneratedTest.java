package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.lang.StringBuffer(((java.lang.String)v1));
    Object v3 = 2;
    Object v4 = 1;
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.HelpFormatter)v0).renderWrappedText(((java.lang.StringBuffer)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    ((org.apache.commons.cli.HelpFormatter)v0).setSyntaxPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = -6;
    Object v4 = "";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = "Missing argument for option: ";
    Object v10 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = java.util.function.Function.identity();
    Object v2 = java.util.Comparator.comparing(((java.util.function.Function)v1));
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = Character.valueOf((char)0);
    ((java.io.PrintWriter)v2).print((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = "'";
    Object v7 = "";
    Object v8 = new org.apache.commons.cli.Options();
    Object v9 = 1;
    Object v10 = -28;
    Object v11 = "--";
    Object v12 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6),((java.lang.String)v7),((org.apache.commons.cli.Options)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "--";
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).rtrim(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("--"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = java.util.function.Function.identity();
    Object v2 = java.util.Comparator.comparing(((java.util.function.Function)v1));
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v2));
    Object v3 = null;
    Object v4 = "";
    Object v5 = 2;
    Object v6 = -14;
    Object v7 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }
}
