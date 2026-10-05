package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "--{";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = Character.valueOf((char)1);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.cli.Options)v5).addOption(((org.apache.commons.cli.Option)v7));
    Object v9 = new java.lang.String[]{"\"","--","--"};
    Object v10 = new java.util.Properties();
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"arg","--"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "B-";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"?","--"," "};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" 8","-"," "};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "--";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"y--","]"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = new org.apache.commons.cli.PosixParser();
    Object v7 = new org.apache.commons.cli.Options();
    Object v8 = new java.lang.String[]{"y--","]"};
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.PosixParser)v6).flatten(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.util.Properties)v3).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v10));
    Object v12 = false;
    Object v13 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-","-f"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "r-";
    Object v6 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"true","-<"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"arg"," "};
    Object v3 = new java.util.Properties();
    Object v4 = "arg";
    Object v5 = java.nio.charset.Charset.defaultCharset();
    Object v6 = new java.io.PrintStream(((java.lang.String)v4),((java.nio.charset.Charset)v5));
    ((java.util.Properties)v3).list(((java.io.PrintStream)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","NO_ARGS_ALLOWED"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","Unable to find"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = " ";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "--";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "-";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-J","c]mdLineSyntax not provided","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"-","",""};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = ((org.apache.commons.cli.Options)v5).toString();
    Object v7 = new java.lang.String[]{"--",""};
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","Z","&--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"","-"};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"}-","["};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "";
    Object v3 = true;
    Object v4 = "il";
    Object v5 = ((org.apache.commons.cli.Options)v1).addOption(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.String)v4));
    Object v6 = new java.lang.String[]{};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"--","-"};
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"-"};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "[ option: ";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = ((java.util.Properties)v3).hashCode();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "-o";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--"," "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--",""};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "-H";
    Object v6 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "t-";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = null;
    ((org.apache.commons.cli.Parser)v0).processArgs(((org.apache.commons.cli.Option)v2),((java.util.ListIterator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"," "};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{};
    Object v6 = new java.util.Properties();
    Object v7 = new org.apache.commons.cli.Options();
    Object v8 = new org.apache.commons.cli.PosixParser();
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = new java.lang.String[]{};
    Object v11 = new java.util.Properties();
    Object v12 = ((org.apache.commons.cli.Parser)v8).parse(((org.apache.commons.cli.Options)v9),((java.lang.String[])v10),((java.util.Properties)v11));
    Object v13 = ((java.util.Properties)v6).putIfAbsent(((java.lang.Object)v7),((java.lang.Object)v12));
    Object v14 = true;
    Object v15 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "arg";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","g","$"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = " ] [ Vlong ";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-."};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = new java.lang.String[]{"-","line.separator","-I"};
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"w-"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"T","--"};
    Object v7 = new java.util.Properties();
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-`"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = ((org.apache.commons.cli.Options)v5).getOptions();
    Object v7 = new java.lang.String[]{"yes"};
    Object v8 = new java.util.Properties();
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"-","-","-"};
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"-"};
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Unrecognized oNtion: ","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"arg","--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"-","-"};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"[ optJion: ","ar ","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "-";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = new java.lang.String[]{};
    Object v8 = new java.util.Properties();
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"arg","","`--"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"arg",""};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-Y-","-"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"{","--","--"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--"," <"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"y","--."};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"-@",""};
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"7-","--","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-#","--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = "#-";
    Object v6 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" ]{"," ","\""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-p","b"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = " ";
    Object v7 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"[ option: "};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"'"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"R-"};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{" ","--?","Unable to find: "};
    Object v5 = new java.util.Properties();
    Object v6 = ((java.util.Properties)v5).toString();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "b-";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","[ Options: [ short "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"","-T"};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"--"};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","(","[D"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"","cmdLineSyntax not provided"};
    Object v7 = new java.util.Properties();
    Object v8 = new org.apache.commons.cli.PosixParser();
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = new java.lang.String[]{"}-","["};
    Object v11 = ((org.apache.commons.cli.Parser)v8).parse(((org.apache.commons.cli.Options)v9),((java.lang.String[])v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = ((java.util.Properties)v7).remove(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = false;
    Object v16 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = new java.lang.String[]{"a"};
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "Unrecognized option: ";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = new java.lang.String[]{"","+A)G"};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "--";
    Object v6 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-y-","'^"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","arpg"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "ar";
    Object v3 = "'n";
    Object v4 = true;
    Object v5 = " ";
    Object v6 = ((org.apache.commons.cli.Options)v1).addOption(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{"-b-",""};
    Object v8 = new java.util.Properties();
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","$","-q"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = " ";
    Object v5 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = new java.lang.String[]{" "};
    Object v5 = new java.util.Properties();
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" ]",""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","/-","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"--"};
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "[ Options: [ short ";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "linq.separator";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
