package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.lang.StringBuffer(((java.lang.String)v1));
    Object v3 = 2;
    Object v4 = 1;
    Object v5 = "--";
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
    Object v9 = " ";
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
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " ";
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((org.apache.commons.cli.Options)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = 31;
    Object v7 = 0;
    Object v8 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "-D";
    Object v5 = "--";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = -2;
    Object v8 = 0;
    Object v9 = "-";
    Object v10 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "(true";
    ((org.apache.commons.cli.HelpFormatter)v0).setLongOptSeparator(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = "-";
    Object v4 = new java.io.PrintWriter(((java.lang.String)v3));
    Object v5 = -14;
    Object v6 = "a-";
    Object v7 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v4),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6),((org.apache.commons.cli.Options)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.Options)v4).hasShortOption(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 0;
    ((org.apache.commons.cli.HelpFormatter)v0).printOptions(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((org.apache.commons.cli.Options)v4),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getOptPrefix();
    org.junit.Assert.assertEquals((Object)("-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getLongOptSeparator();
    org.junit.Assert.assertEquals((Object)(" "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getLeftPadding();
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = ", ";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = "--U";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((java.lang.String)v2),((org.apache.commons.cli.Options)v3),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getWidth();
    org.junit.Assert.assertEquals((Object)(74), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 26;
    Object v4 = "--";
    Object v5 = "'";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 0;
    Object v8 = -24;
    Object v9 = "u-";
    Object v10 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " ";
    ((org.apache.commons.cli.HelpFormatter)v0).setLongOptSeparator(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.lang.StringBuffer(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.cli.HelpFormatter)v0).renderOptions(((java.lang.StringBuffer)v2),(((java.lang.Integer)v3).intValue()),((org.apache.commons.cli.Options)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "--";
    Object v2 = "$";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = "-";
    Object v5 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((java.lang.String)v2),((org.apache.commons.cli.Options)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "; Unable to create Sn instance of: ";
    Object v8 = ((org.apache.commons.cli.HelpFormatter)v0).rtrim(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)("; Unable to create Sn instance of:"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 32;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("                                "), v2);
  }
}
