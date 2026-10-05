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
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
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
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "-";
    Object v5 = " ";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 31;
    Object v8 = 0;
    Object v9 = "-";
    Object v10 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = "--";
    Object v13 = -13;
    Object v14 = 2;
    Object v15 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = ">";
    Object v5 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((org.apache.commons.cli.Options)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = "-";
    Object v3 = new java.lang.StringBuffer(((java.lang.String)v2));
    Object v4 = 2;
    Object v5 = 1;
    Object v6 = "-";
    Object v7 = ((org.apache.commons.cli.HelpFormatter)v1).renderWrappedText(((java.lang.StringBuffer)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    ((java.lang.StringBuffer)v7).trimToSize();
    Object v8 = null;
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli.Options();
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v11).charValue()));
    Object v13 = ((org.apache.commons.cli.Options)v10).getOptionGroup(((org.apache.commons.cli.Option)v12));
    Object v14 = 12;
    Object v15 = 1;
    Object v16 = ((org.apache.commons.cli.HelpFormatter)v0).renderOptions(((java.lang.StringBuffer)v7),(((java.lang.Integer)v9).intValue()),((org.apache.commons.cli.Options)v10),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((org.apache.commons.cli.Options)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.lang.StringBuffer(((java.lang.String)v1));
    Object v3 = 58;
    Object v4 = 26;
    Object v5 = "O";
    Object v6 = ((org.apache.commons.cli.HelpFormatter)v0).renderWrappedText(((java.lang.StringBuffer)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    ((java.io.PrintWriter)v2).println();
    Object v3 = null;
    Object v4 = 0;
    Object v5 = "-";
    Object v6 = "--";
    Object v7 = new org.apache.commons.cli.Options();
    Object v8 = 27;
    Object v9 = -2;
    Object v10 = "-";
    Object v11 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5),((java.lang.String)v6),((org.apache.commons.cli.Options)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " ";
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((org.apache.commons.cli.Options)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = 41;
    ((org.apache.commons.cli.HelpFormatter)v0).setLeftPadding((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = java.util.function.Function.identity();
    Object v2 = java.util.Comparator.comparing(((java.util.function.Function)v1));
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v2));
    Object v3 = null;
    Object v4 = "]";
    ((org.apache.commons.cli.HelpFormatter)v0).setOptPrefix(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "";
    ((org.apache.commons.cli.HelpFormatter)v0).setNewLine(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = "-";
    Object v4 = new java.io.PrintWriter(((java.lang.String)v3));
    Object v5 = -2;
    Object v6 = 15;
    Object v7 = "The addValue method is notZ intended for client use. Subclasses should use the addValueForProcessing method instead. ";
    ((org.apache.commons.cli.HelpFormatter)v0).printWrapped(((java.io.PrintWriter)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).rtrim(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("-"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 9;
    ((org.apache.commons.cli.HelpFormatter)v0).setLeftPadding((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ">";
    ((org.apache.commons.cli.HelpFormatter)v0).setLongOptPrefix(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " ] [ lo+ng ";
    Object v2 = "(";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = "Un";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((java.lang.String)v2),((org.apache.commons.cli.Options)v3),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = new org.apache.commons.cli.HelpFormatter();
    Object v7 = "-";
    Object v8 = new java.lang.StringBuffer(((java.lang.String)v7));
    Object v9 = 58;
    Object v10 = 26;
    Object v11 = "O";
    Object v12 = ((org.apache.commons.cli.HelpFormatter)v6).renderWrappedText(((java.lang.StringBuffer)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((java.lang.String)v11));
    Object v13 = -30.35760441798952D;
    Object v14 = ((java.lang.StringBuffer)v12).append((((java.lang.Double)v13).doubleValue()));
    Object v15 = 1;
    Object v16 = new org.apache.commons.cli.Options();
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = ((org.apache.commons.cli.HelpFormatter)v0).renderOptions(((java.lang.StringBuffer)v12),(((java.lang.Integer)v15).intValue()),((org.apache.commons.cli.Options)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "-";
    ((org.apache.commons.cli.HelpFormatter)v0).printWrapped(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = -5;
    Object v7 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = -13;
    Object v2 = "--";
    Object v3 = "--";
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = ((org.apache.commons.cli.Options)v4).getOptions();
    Object v6 = "-";
    Object v7 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),((java.lang.String)v3),((org.apache.commons.cli.Options)v4),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.lang.StringBuffer(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 63;
    Object v5 = "--";
    Object v6 = ((org.apache.commons.cli.HelpFormatter)v0).renderWrappedText(((java.lang.StringBuffer)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 70;
    Object v2 = "a@g";
    Object v3 = "'";
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = "-B";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),((java.lang.String)v3),((org.apache.commons.cli.Options)v4),((java.lang.String)v5));
    Object v6 = null;
    Object v7 = "Not yetS implemented";
    Object v8 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v7),((org.apache.commons.cli.Options)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    ((org.apache.commons.cli.HelpFormatter)v0).setSyntaxPrefix(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = "[";
    Object v4 = "--<";
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = "--";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v3),((java.lang.String)v4),((org.apache.commons.cli.Options)v5),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "";
    Object v2 = 4;
    Object v3 = 8;
    Object v4 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = "-";
    Object v3 = new java.lang.StringBuffer(((java.lang.String)v2));
    Object v4 = 58;
    Object v5 = 26;
    Object v6 = "O";
    Object v7 = ((org.apache.commons.cli.HelpFormatter)v1).renderWrappedText(((java.lang.StringBuffer)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    ((java.lang.StringBuffer)v7).trimToSize();
    Object v8 = null;
    Object v9 = 9;
    Object v10 = new org.apache.commons.cli.Options();
    Object v11 = ((org.apache.commons.cli.Options)v10).toString();
    Object v12 = -23;
    Object v13 = 46;
    Object v14 = ((org.apache.commons.cli.HelpFormatter)v0).renderOptions(((java.lang.StringBuffer)v7),(((java.lang.Integer)v9).intValue()),((org.apache.commons.cli.Options)v10),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = "";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = "-";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((java.lang.String)v2),((org.apache.commons.cli.Options)v3),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = 1;
    ((org.apache.commons.cli.HelpFormatter)v0).setDescPadding((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getNewLine();
    org.junit.Assert.assertEquals((Object)("\n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    ((java.io.PrintWriter)v2).close();
    Object v3 = null;
    Object v4 = 1;
    Object v5 = "mut specify longopt";
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v2),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    ((org.apache.commons.cli.HelpFormatter)v0).setArgName(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = -9;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = -92;
    ((org.apache.commons.cli.HelpFormatter)v0).setWidth((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 1;
    ((org.apache.commons.cli.HelpFormatter)v0).setWidth((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "arg";
    Object v2 = 0;
    Object v3 = 9;
    Object v4 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "Unrecognized option: ";
    Object v2 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((org.apache.commons.cli.Options)v2));
    Object v3 = null;
    Object v4 = "-";
    Object v5 = new java.io.PrintWriter(((java.lang.String)v4));
    Object v6 = -21;
    Object v7 = "--";
    Object v8 = "-";
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = 0;
    Object v11 = 3;
    Object v12 = "usage: ";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v5),(((java.lang.Integer)v6).intValue()),((java.lang.String)v7),((java.lang.String)v8),((org.apache.commons.cli.Options)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 15;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("               "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((org.apache.commons.cli.Options)v2));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(" "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 66;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("                                                                  "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getArgName();
    org.junit.Assert.assertEquals((Object)("arg"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "[";
    Object v2 = 1;
    Object v3 = 90;
    Object v4 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 22;
    ((org.apache.commons.cli.HelpFormatter)v0).setDescPadding((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.cli.HelpFormatter)v0).getLongOptPrefix();
    org.junit.Assert.assertEquals((Object)("--"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = -2;
    ((org.apache.commons.cli.HelpFormatter)v0).setWidth((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "usage: ";
    Object v4 = 0;
    Object v5 = 36;
    Object v6 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getOptPrefix();
    org.junit.Assert.assertEquals((Object)("-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "g-";
    Object v5 = "--";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 1;
    Object v8 = -24;
    Object v9 = "-";
    Object v10 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 33;
    Object v4 = "-";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = "traue";
    Object v10 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = -61;
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = 1;
    Object v6 = 2;
    ((org.apache.commons.cli.HelpFormatter)v0).printOptions(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((org.apache.commons.cli.Options)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = "opt conrtains illegal character value '";
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v8),((org.apache.commons.cli.Options)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "9";
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).rtrim(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("9"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getOptionComparator();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = "r";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = -3;
    Object v8 = 1;
    Object v9 = "";
    Object v10 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v1).getOptionComparator();
    Object v3 = java.util.function.Function.identity();
    Object v4 = new org.apache.commons.cli.HelpFormatter();
    Object v5 = ((org.apache.commons.cli.HelpFormatter)v4).getOptionComparator();
    Object v6 = ((java.util.Comparator)v2).thenComparing(((java.util.function.Function)v3),((java.util.Comparator)v5));
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v2));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getDescPadding();
    org.junit.Assert.assertEquals((Object)(3), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = 35;
    Object v3 = -26;
    Object v4 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v1).getOptionComparator();
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "[";
    ((org.apache.commons.cli.HelpFormatter)v0).setSyntaxPrefix(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 21;
    Object v4 = "f";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 82;
    Object v8 = -1;
    Object v9 = "-";
    Object v10 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getLongOptPrefix();
    org.junit.Assert.assertEquals((Object)("--"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 1;
    Object v2 = "--";
    Object v3 = "-";
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = "]";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),((java.lang.String)v3),((org.apache.commons.cli.Options)v4),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = "arg";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = " ";
    Object v5 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((java.lang.String)v2),((org.apache.commons.cli.Options)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "-";
    Object v8 = new java.io.PrintWriter(((java.lang.String)v7));
    Object v9 = 27;
    Object v10 = "-<-";
    Object v11 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v8),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10),((org.apache.commons.cli.Options)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 62;
    Object v4 = 10;
    Object v5 = "'";
    ((org.apache.commons.cli.HelpFormatter)v0).printWrapped(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = -45;
    Object v4 = "\"";
    Object v5 = "";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = "arg";
    Object v10 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getLeftPadding();
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "arg0";
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((org.apache.commons.cli.Options)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.HelpFormatter)v0).getOptionComparator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = "[";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = "(-";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((java.lang.String)v2),((org.apache.commons.cli.Options)v3),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = "-";
    ((org.apache.commons.cli.HelpFormatter)v0).setOptPrefix(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = "--";
    Object v5 = "line.separator";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 1;
    Object v8 = 25;
    Object v9 = "s";
    Object v10 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 53;
    Object v4 = "3-";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 0;
    Object v8 = 31;
    Object v9 = "--";
    Object v10 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 45;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("                                             "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "";
    Object v2 = " :: ";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = "Unrecognized option:";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((java.lang.String)v2),((org.apache.commons.cli.Options)v3),((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "";
    ((org.apache.commons.cli.HelpFormatter)v0).setArgName(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = -77;
    ((org.apache.commons.cli.HelpFormatter)v0).setLeftPadding((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 33;
    Object v4 = -25;
    Object v5 = "ar";
    ((org.apache.commons.cli.HelpFormatter)v0).printWrapped(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = -18;
    Object v4 = "arg";
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = ((org.apache.commons.cli.Options)v5).getOptions();
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((org.apache.commons.cli.Options)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " ";
    ((org.apache.commons.cli.HelpFormatter)v0).setOptPrefix(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = ((org.apache.commons.cli.HelpFormatter)v0).getWidth();
    org.junit.Assert.assertEquals((Object)(74), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 18;
    Object v4 = "Unable to f";
    Object v5 = "";
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = 33;
    Object v8 = 1;
    Object v9 = "--";
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((java.lang.String)v5),((org.apache.commons.cli.Options)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    Object v10 = null;
    Object v11 = "-";
    Object v12 = new java.io.PrintWriter(((java.lang.String)v11));
    Object v13 = 2;
    Object v14 = "Unable to find the class: ";
    Object v15 = "--";
    Object v16 = new org.apache.commons.cli.Options();
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = "arg";
    Object v20 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v12),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14),((java.lang.String)v15),((org.apache.commons.cli.Options)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = -16;
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((org.apache.commons.cli.Options)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 1;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(" "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = "-";
    Object v3 = new java.lang.StringBuffer(((java.lang.String)v2));
    Object v4 = 2;
    Object v5 = 1;
    Object v6 = "-";
    Object v7 = ((org.apache.commons.cli.HelpFormatter)v1).renderWrappedText(((java.lang.StringBuffer)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = 14;
    Object v11 = 0;
    Object v12 = ((org.apache.commons.cli.HelpFormatter)v0).renderOptions(((java.lang.StringBuffer)v7),(((java.lang.Integer)v8).intValue()),((org.apache.commons.cli.Options)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " ]";
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = false;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((org.apache.commons.cli.Options)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.Comparator.comparing(((java.util.function.Function)v5));
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = -10;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 28;
    ((org.apache.commons.cli.HelpFormatter)v0).setDescPadding((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "[";
    Object v4 = 1;
    Object v5 = -13;
    Object v6 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = "-";
    Object v3 = new java.lang.StringBuffer(((java.lang.String)v2));
    Object v4 = 2;
    Object v5 = 1;
    Object v6 = "-";
    Object v7 = ((org.apache.commons.cli.HelpFormatter)v1).renderWrappedText(((java.lang.StringBuffer)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = ((org.apache.commons.cli.HelpFormatter)v0).renderOptions(((java.lang.StringBuffer)v7),(((java.lang.Integer)v8).intValue()),((org.apache.commons.cli.Options)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = "";
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " ";
    Object v2 = -12;
    Object v3 = -47;
    Object v4 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = 2;
    Object v3 = 4;
    Object v4 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "--";
    ((org.apache.commons.cli.HelpFormatter)v0).setOptPrefix(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = " ";
    Object v4 = ((org.apache.commons.cli.HelpFormatter)v0).rtrim(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((org.apache.commons.cli.Options)v2));
    Object v3 = null;
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.Comparator.comparing(((java.util.function.Function)v4));
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = "arg0";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = false;
    ((org.apache.commons.cli.HelpFormatter)v1).printHelp(((java.lang.String)v2),((org.apache.commons.cli.Options)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.cli.HelpFormatter)v1).getOptionComparator();
    ((org.apache.commons.cli.HelpFormatter)v0).setOptionComparator(((java.util.Comparator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = 54;
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).createPadding((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("                                                      "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = "-";
    Object v3 = new java.lang.StringBuffer(((java.lang.String)v2));
    Object v4 = 2;
    Object v5 = 1;
    Object v6 = "-";
    Object v7 = ((org.apache.commons.cli.HelpFormatter)v1).renderWrappedText(((java.lang.StringBuffer)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = "-";
    Object v9 = new java.lang.StringBuffer(((java.lang.String)v8));
    Object v10 = ((java.lang.StringBuffer)v7).append(((java.lang.StringBuffer)v9));
    Object v11 = 30;
    Object v12 = 36;
    Object v13 = "n :: ";
    Object v14 = ((org.apache.commons.cli.HelpFormatter)v0).renderWrappedText(((java.lang.StringBuffer)v7),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = new org.apache.commons.cli.HelpFormatter();
    Object v2 = new org.apache.commons.cli.HelpFormatter();
    Object v3 = "-";
    Object v4 = new java.lang.StringBuffer(((java.lang.String)v3));
    Object v5 = 2;
    Object v6 = 1;
    Object v7 = "-";
    Object v8 = ((org.apache.commons.cli.HelpFormatter)v2).renderWrappedText(((java.lang.StringBuffer)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = new java.lang.StringBuffer(((java.lang.String)v9));
    Object v11 = ((java.lang.StringBuffer)v8).append(((java.lang.StringBuffer)v10));
    Object v12 = 30;
    Object v13 = 36;
    Object v14 = "n :: ";
    Object v15 = ((org.apache.commons.cli.HelpFormatter)v1).renderWrappedText(((java.lang.StringBuffer)v8),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((java.lang.String)v14));
    Object v16 = 1;
    Object v17 = new org.apache.commons.cli.Options();
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = ((org.apache.commons.cli.HelpFormatter)v0).renderOptions(((java.lang.StringBuffer)v15),(((java.lang.Integer)v16).intValue()),((org.apache.commons.cli.Options)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = -42;
    Object v2 = "  ";
    Object v3 = "!";
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = "tr8e";
    Object v6 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp((((java.lang.Integer)v1).intValue()),((java.lang.String)v2),((java.lang.String)v3),((org.apache.commons.cli.Options)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "\\-";
    Object v2 = ((org.apache.commons.cli.HelpFormatter)v0).rtrim(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("\\-"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = new char[]{Character.valueOf((char)65535),Character.valueOf((char)1),Character.valueOf((char)0)};
    ((java.io.PrintWriter)v2).write(((char[])v3));
    Object v4 = null;
    Object v5 = -36;
    Object v6 = "-";
    Object v7 = "-x";
    Object v8 = new org.apache.commons.cli.Options();
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = "";
    Object v12 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.io.PrintWriter)v2),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6),((java.lang.String)v7),((org.apache.commons.cli.Options)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " <";
    Object v2 = -86;
    Object v3 = 3;
    Object v4 = ((org.apache.commons.cli.HelpFormatter)v0).findWrapPos(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printUsage(((java.io.PrintWriter)v2),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4),((org.apache.commons.cli.Options)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = " <";
    Object v2 = "-";
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.Options)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = "--";
    Object v8 = true;
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((java.lang.String)v2),((org.apache.commons.cli.Options)v3),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "-";
    Object v2 = new java.io.PrintWriter(((java.lang.String)v1));
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)32),Character.valueOf((char)1)};
    ((java.io.PrintWriter)v2).write(((char[])v3));
    Object v4 = null;
    Object v5 = -7;
    Object v6 = "-";
    ((org.apache.commons.cli.HelpFormatter)v0).printWrapped(((java.io.PrintWriter)v2),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = "";
    Object v2 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.HelpFormatter)v0).printHelp(((java.lang.String)v1),((org.apache.commons.cli.Options)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.HelpFormatter();
    Object v1 = -8;
    ((org.apache.commons.cli.HelpFormatter)v0).setWidth((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = 24;
    ((org.apache.commons.cli.HelpFormatter)v0).setWidth((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }
}
