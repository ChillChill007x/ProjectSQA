package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"V-"," "};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = " ";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "2";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"_-"};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{""};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"-","   ","--"};
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"true","--","tru"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = new org.apache.commons.cli.OptionGroup();
    Object v8 = ((org.apache.commons.cli.Options)v6).addOptionGroup(((org.apache.commons.cli.OptionGroup)v7));
    Object v9 = new java.lang.String[]{"\\"};
    Object v10 = new java.util.Properties();
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "true";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "|-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--0","-","-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = new java.io.PrintWriter(((java.io.OutputStream)v5));
    Object v7 = new java.io.PrintWriter(((java.io.Writer)v6));
    ((java.util.Properties)v4).list(((java.io.PrintWriter)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "-<";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasOption(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = new java.lang.String[]{"--","--","--U"};
    Object v8 = new java.util.Properties();
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{" todesired type: ","",""};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    Object v6 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{" "};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{" ARG]"};
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-",""};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"","--","'"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{" |"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = "--";
    Object v8 = ((org.apache.commons.cli.Options)v6).hasShortOption(((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"Unable to find the class: "," ","["};
    Object v10 = new java.util.Properties();
    Object v11 = "W";
    Object v12 = "--";
    Object v13 = ((java.util.Properties)v10).getProperty(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = true;
    Object v15 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--","; UnabKe to create an instance of: "};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--(","<","-"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "--";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Exceptio";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","Z-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "v-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"-","-G",""};
    Object v9 = new java.util.Properties();
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "--";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "]";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-",",","B-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "G-";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasShortOption(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"arg"};
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = ", ";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Default option Ywasn't defined","-0","-"};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"4","true"};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-1-","","-/"};
    Object v4 = new java.util.Properties();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = new java.io.PrintWriter(((java.io.OutputStream)v5));
    Object v7 = new java.io.PrintWriter(((java.io.Writer)v6));
    ((java.util.Properties)v4).list(((java.io.PrintWriter)v7));
    Object v8 = null;
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v9).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "G-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "-a";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "--";
    Object v4 = ((org.apache.commons.cli.Options)v2).getMatchingOptions(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"   Q","-"};
    Object v6 = new java.util.Properties();
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.apache.commons.cli.Options)v6).getOption(((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"   "," ("};
    Object v10 = new java.util.Properties();
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = "-";
    ((java.util.Properties)v10).store(((java.io.OutputStream)v11),((java.lang.String)v12));
    Object v13 = null;
    Object v14 = false;
    Object v15 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"]","-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"","","-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "3";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"'","--",")"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-B","-p-"};
    Object v4 = new java.util.Properties();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.util.Properties)v4).containsKey(((java.lang.Object)v5));
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v4));
    Object v6 = new java.lang.String[]{"-","-",""};
    Object v7 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-_","-","-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.Options)v2).getMatchingOptions(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"-","-T","\""};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "m";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--","-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "yes";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"\\","--","-"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v8).charValue()));
    Object v10 = ((org.apache.commons.cli.Options)v7).addOption(((org.apache.commons.cli.Option)v9));
    Object v11 = new java.lang.String[]{""};
    Object v12 = new java.util.Properties();
    Object v13 = true;
    Object v14 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v11),((java.util.Properties)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","<","!-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "--L";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","--","-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = new java.lang.String[]{"--"};
    Object v8 = new java.util.Properties();
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"v","--","\""};
    Object v4 = new java.util.Properties();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = new java.io.PrintWriter(((java.io.OutputStream)v5));
    Object v7 = new java.io.PrintWriter(((java.io.Writer)v6));
    Object v8 = "";
    ((java.util.Properties)v4).store(((java.io.Writer)v7),((java.lang.String)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Q ";
    Object v8 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.cli.Options)v8).toString();
    Object v10 = new java.lang.String[]{"&-","","S"};
    Object v11 = new java.util.Properties();
    Object v12 = true;
    Object v13 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v8),((java.lang.String[])v10),((java.util.Properties)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{""};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"-"};
    Object v9 = new java.util.Properties();
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "\"";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Unable to find `he class: ";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"[-","]","-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"yes",",7","#-"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "[<";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"\"","--","1"};
    Object v9 = new java.util.Properties();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "a";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-r","(1","-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = "The";
    Object v6 = "--";
    Object v7 = ((java.util.Properties)v4).setProperty(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"t","n","--"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"-"};
    Object v9 = new java.util.Properties();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Options)v2).getRequiredOptions();
    Object v4 = new java.lang.String[]{"--"};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Options)v6).getOptions();
    Object v8 = new java.lang.String[]{"--","-M"};
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "A CloneNotSupportedException was thrown: ";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = new java.util.Properties();
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "w-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.cli.Options)v2).getOptionGroup(((org.apache.commons.cli.Option)v4));
    Object v6 = new java.lang.String[]{"--H","'4"};
    Object v7 = new java.util.Properties();
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)0);
    Object v11 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v10).charValue()));
    Object v12 = ((java.util.Properties)v7).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = true;
    Object v14 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Default option wasn't defined"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"u",""};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "--";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"|",", ","g"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"'"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasLongOption(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"--","-"};
    Object v6 = new java.util.Properties();
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new java.io.PrintWriter(((java.io.OutputStream)v7));
    Object v9 = "M";
    ((java.util.Properties)v6).store(((java.io.Writer)v8),((java.lang.String)v9));
    Object v10 = null;
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = " |V";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Default option wasn't defined";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{""};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Default option wasn't defined"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ".";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{""};
    Object v4 = new java.util.Properties();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = "' contains an illegal charac";
    ((java.util.Properties)v4).save(((java.io.OutputStream)v5),((java.lang.String)v6));
    Object v7 = null;
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"V","yes"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "[";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"must specdify longopt"," :: ","-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{""," ]"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-","tgrue"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Th option '","^","Illegal option name '"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "' was specified but an option from this group has already been selected: '";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Options)v2).getOptions();
    Object v4 = new java.lang.String[]{"Default option wasn't defined","-"," "};
    Object v5 = new java.util.Properties();
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasOption(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{};
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-g","--"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }
}
