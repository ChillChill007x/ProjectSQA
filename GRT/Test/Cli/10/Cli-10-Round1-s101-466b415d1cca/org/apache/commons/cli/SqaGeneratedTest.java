package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = "--";
    Object v2 = null;
    ((org.apache.commons.cli.Parser)v0).processOption(((java.lang.String)v1),((java.util.ListIterator)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"a-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"," ","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)74);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{};
    Object v6 = new java.util.Properties();
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"-/-"};
    Object v8 = new java.util.Properties();
    Object v9 = new org.apache.commons.cli.BasicParser();
    Object v10 = new org.apache.commons.cli.Options();
    Object v11 = ((java.util.Properties)v8).replace(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = ((org.apache.commons.cli.Parser)v0).getOptions();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-k"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.Parser)v0).setOptions(((org.apache.commons.cli.Options)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","'arg"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.cli.Parser)v0).getOptions();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","'"," "};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.BasicParser();
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"","'arg"};
    Object v7 = new java.util.Properties();
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.Parser)v4).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.cli.Parser)v4).getOptions();
    Object v11 = new java.lang.String[]{""};
    Object v12 = false;
    Object v13 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v10),((java.lang.String[])v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = Character.valueOf((char)74);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = null;
    ((org.apache.commons.cli.Parser)v0).processArgs(((org.apache.commons.cli.Option)v2),((java.util.ListIterator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"A--","--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.Parser)v0).setOptions(((org.apache.commons.cli.Options)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)74);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"-",""};
    Object v6 = new java.util.Properties();
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","IllegalAccessException; Unable to create: "};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"--"};
    Object v8 = new java.util.Properties();
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = ((java.util.Properties)v1).remove(((java.lang.Object)v2));
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"InstantiationException; Unable to create: ","s"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = ((java.util.Properties)v1).keySet();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"N, "," "};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"]","Missing required option"};
    Object v3 = new java.util.Properties();
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = false;
    Object v6 = new java.io.PrintStream(((java.io.OutputStream)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((java.util.Properties)v3).list(((java.io.PrintStream)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" ~","","p"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"InstantiationException; Una&le to create: "};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "-J";
    ((java.util.Properties)v1).save(((java.io.OutputStream)v4),((java.lang.String)v5));
    Object v6 = null;
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"ar"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"mBst specify longopt","line.separator"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Not yet implemented"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = " ";
    Object v7 = ((org.apache.commons.cli.Options)v5).getOption(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = new java.util.Properties();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"8-","-"};
    Object v3 = new java.util.Properties();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = ((java.util.Properties)v3).containsValue(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"'4","-"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new java.util.Properties();
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = false;
    Object v8 = new java.io.PrintStream(((java.io.OutputStream)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new org.apache.commons.cli.BasicParser();
    Object v11 = new org.apache.commons.cli.Options();
    Object v12 = new java.lang.String[]{};
    Object v13 = ((org.apache.commons.cli.Parser)v10).parse(((org.apache.commons.cli.Options)v11),((java.lang.String[])v12));
    Object v14 = ((java.util.Properties)v5).replace(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v13));
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v5));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)74);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{};
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"arg","--","Z"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.cli.Parser)v0).getRequiredOptions();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"0-","","]"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = ((org.apache.commons.cli.Parser)v0).getRequiredOptions();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" ","","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = new java.util.Properties();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.util.Properties)v1).put(((java.lang.Object)v2),((java.lang.Object)v3));
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = ((org.apache.commons.cli.Parser)v0).getRequiredOptions();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"","'arg"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v8 = new java.lang.String[]{""};
    Object v9 = new java.util.Properties();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"","'arg"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v8 = "--";
    Object v9 = ((org.apache.commons.cli.Options)v7).hasOption(((java.lang.String)v8));
    ((org.apache.commons.cli.Parser)v0).setOptions(((org.apache.commons.cli.Options)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" ","--","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--",""};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new java.util.Properties();
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = "an option from this group has already been selected: '";
    ((java.util.Properties)v4).store(((java.io.Writer)v5),((java.lang.String)v6));
    Object v7 = null;
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"","'arg"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v8 = new java.lang.String[]{""};
    Object v9 = new java.util.Properties();
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new org.apache.commons.cli.Options();
    Object v13 = new java.lang.String[]{};
    Object v14 = false;
    Object v15 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v12),((java.lang.String[])v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" "};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-H","-",""};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"\"","--",""};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-4","-","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new java.util.Properties();
    Object v6 = new org.apache.commons.cli.BasicParser();
    Object v7 = new org.apache.commons.cli.Options();
    Object v8 = new java.lang.String[]{"","'arg"};
    Object v9 = new java.util.Properties();
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.Parser)v6).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.cli.Parser)v6).getOptions();
    Object v13 = new org.apache.commons.cli.BasicParser();
    Object v14 = new org.apache.commons.cli.Options();
    Object v15 = new java.lang.String[]{" "};
    Object v16 = true;
    Object v17 = ((org.apache.commons.cli.Parser)v13).flatten(((org.apache.commons.cli.Options)v14),((java.lang.String[])v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new org.apache.commons.cli.BasicParser();
    Object v19 = new org.apache.commons.cli.Options();
    Object v20 = new java.lang.String[]{" "};
    Object v21 = true;
    Object v22 = ((org.apache.commons.cli.Parser)v18).flatten(((org.apache.commons.cli.Options)v19),((java.lang.String[])v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((java.util.Properties)v5).replace(((java.lang.Object)v12),((java.lang.Object)v17),((java.lang.Object)v22));
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v5));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-"," ]"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"",""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"2 ","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","-","opt contains illegal charater value '"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"[","","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = Character.valueOf((char)74);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = null;
    ((org.apache.commons.cli.Parser)v0).processArgs(((org.apache.commons.cli.Option)v2),((java.util.ListIterator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"line.separator","i-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = new java.util.Properties();
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = "arM";
    ((java.util.Properties)v7).store(((java.io.Writer)v8),((java.lang.String)v9));
    Object v10 = null;
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"","'arg"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v8 = new java.lang.String[]{"--","[","--"};
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"","'arg"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v8 = new java.lang.String[]{"arh"};
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new org.apache.commons.cli.Options();
    Object v12 = new java.lang.String[]{"-4"," :: "};
    Object v13 = new java.util.Properties();
    Object v14 = false;
    Object v15 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v11),((java.lang.String[])v12),((java.util.Properties)v13),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = "cmdLineSyntax not provided";
    Object v2 = null;
    ((org.apache.commons.cli.Parser)v0).processOption(((java.lang.String)v1),((java.util.ListIterator)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--","U"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"'","","The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. "};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{};
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","M","4"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = new java.util.Properties();
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"","'arg"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v8 = new java.lang.String[]{};
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8));
    Object v10 = new org.apache.commons.cli.Options();
    Object v11 = new java.lang.String[]{"-","-"};
    Object v12 = new java.util.Properties();
    Object v13 = true;
    Object v14 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v10),((java.lang.String[])v11),((java.util.Properties)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = new byte[]{};
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v2));
    ((java.util.Properties)v1).load(((java.io.InputStream)v3));
    Object v4 = null;
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"E-","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = new org.apache.commons.cli.BasicParser();
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = new java.lang.String[]{"--"};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v2).flatten(((org.apache.commons.cli.Options)v3),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = false;
    Object v9 = new java.io.PrintStream(((java.io.OutputStream)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new org.apache.commons.cli.BasicParser();
    Object v11 = new org.apache.commons.cli.Options();
    Object v12 = new java.lang.String[]{" "};
    Object v13 = true;
    Object v14 = ((org.apache.commons.cli.Parser)v10).flatten(((org.apache.commons.cli.Options)v11),((java.lang.String[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((java.util.Properties)v1).replace(((java.lang.Object)v6),((java.lang.Object)v9),((java.lang.Object)v14));
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    ((java.util.Properties)v1).clear();
    Object v2 = null;
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"","'arg"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v8 = new java.lang.String[]{"","f"};
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8));
    Object v10 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"arg",""};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = "";
    Object v6 = "-";
    Object v7 = false;
    Object v8 = " ";
    Object v9 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{"-q"};
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v4),((java.lang.String[])v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new java.util.Properties();
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = "--";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    ((java.util.Properties)v5).storeToXML(((java.io.OutputStream)v6),((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v9 = null;
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v5));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{","};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"i-","-l-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"cmdLineSyntax not provided","--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    ((org.apache.commons.cli.Parser)v0).setOptions(((org.apache.commons.cli.Options)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--"," "};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new java.util.Properties();
    Object v5 = new org.apache.commons.cli.BasicParser();
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{" ~","","p"};
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v5).flatten(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Properties)v4).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v10));
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v4));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = "arg";
    Object v8 = true;
    Object v9 = "Not";
    Object v10 = ((org.apache.commons.cli.Options)v6).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    Object v12 = new java.util.Properties();
    Object v13 = false;
    Object v14 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v11),((java.util.Properties)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"[ Op","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }
}
