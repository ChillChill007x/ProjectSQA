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
    Object v3 = new java.lang.String[]{"_Unrecognized option: "};
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
    Object v8 = new java.lang.String[]{"Unrecognized option: ",">","--"};
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
    Object v7 = "--";
    Object v8 = ((org.apache.commons.cli.Options)v6).getOption(((java.lang.String)v7));
    Object v9 = new java.lang.String[]{};
    Object v10 = new java.util.Properties();
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "B";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasShortOption(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"?","--","-"};
    Object v6 = new java.util.Properties();
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "--0";
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
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Unable to find the clss: ","}"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{" "};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Q ";
    Object v8 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"--","--","-"};
    Object v10 = new java.util.Properties();
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v8),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "'\"";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"2["};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "-k";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{""};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"'-","Default option wasn't defined"};
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
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "--";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "--";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasShortOption(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"z",""};
    Object v6 = new java.util.Properties();
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
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
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-",""};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"","--","'"};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"U ","Cannot add value, list full.",""};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "+ :: ";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = Character.valueOf((char)1);
    Object v4 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v4));
    Object v6 = new java.lang.String[]{"","-"};
    Object v7 = new java.util.Properties();
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"'","'"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","--","--"};
    Object v4 = new java.util.Properties();
    Object v5 = new java.io.ByteArrayOutputStream();
    Object v6 = "U--";
    ((java.util.Properties)v4).save(((java.io.OutputStream)v5),((java.lang.String)v6));
    Object v7 = null;
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = new java.lang.String[]{"v-","-","--&"};
    Object v8 = new java.util.Properties();
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Q-","B"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"[-","--"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"[ARG...]","The option '"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = new java.lang.String[]{};
    Object v8 = new java.util.Properties();
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = "-";
    ((java.util.Properties)v8).store(((java.io.OutputStream)v9),((java.lang.String)v10));
    Object v11 = null;
    Object v12 = true;
    Object v13 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = Character.valueOf((char)1);
    Object v8 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v7).charValue()));
    Object v9 = ((org.apache.commons.cli.Options)v6).getOptionGroup(((org.apache.commons.cli.Option)v8));
    Object v10 = new java.lang.String[]{"--","","X"};
    Object v11 = new java.util.Properties();
    Object v12 = new java.util.Properties();
    Object v13 = new org.apache.commons.cli.DefaultParser();
    Object v14 = "Q ";
    Object v15 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v14));
    Object v16 = Character.valueOf((char)1);
    Object v17 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v16).charValue()));
    Object v18 = ((org.apache.commons.cli.Options)v15).addOption(((org.apache.commons.cli.Option)v17));
    Object v19 = new java.lang.String[]{"","-"};
    Object v20 = new java.util.Properties();
    Object v21 = true;
    Object v22 = ((org.apache.commons.cli.DefaultParser)v13).parse(((org.apache.commons.cli.Options)v15),((java.lang.String[])v19),((java.util.Properties)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((java.util.Properties)v11).replace(((java.lang.Object)v12),((java.lang.Object)v22));
    Object v24 = false;
    Object v25 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v10),((java.util.Properties)v11),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Oarg";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","--"," :: "};
    Object v4 = new java.util.Properties();
    Object v5 = "-";
    Object v6 = new java.io.PrintWriter(((java.lang.String)v5));
    ((java.util.Properties)v4).list(((java.io.PrintWriter)v6));
    Object v7 = null;
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Unr","--","2--"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "v";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "--";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"+"};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    Object v6 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"j-","-p"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","",""};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Q ";
    Object v8 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"-",""};
    Object v10 = new java.util.Properties();
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v8),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "The option '";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"'","--","Exception found converting "};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-B","-p-"};
    Object v4 = new java.util.Properties();
    Object v5 = new java.io.ByteArrayOutputStream();
    Object v6 = ((java.util.Properties)v4).containsKey(((java.lang.Object)v5));
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = Character.valueOf((char)1);
    Object v4 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v4));
    Object v6 = new java.lang.String[]{"Unrecognized gption: ","-"};
    Object v7 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = new java.util.Properties();
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasOption(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"true","-"};
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","_-","--"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = new java.lang.String[]{"7-",", "};
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{};
    Object v4 = new java.util.Properties();
    Object v5 = new org.apache.commons.cli.DefaultParser();
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"Unable to find the clss: ","}"};
    Object v9 = new java.util.Properties();
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v5).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.io.ByteArrayOutputStream();
    Object v13 = Character.valueOf((char)1);
    Object v14 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v13).charValue()));
    Object v15 = ((java.util.Properties)v4).replace(((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = true;
    Object v17 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = " .";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Q ";
    Object v8 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v7));
    Object v9 = "Jarg";
    Object v10 = ((org.apache.commons.cli.Options)v8).getOption(((java.lang.String)v9));
    Object v11 = new java.lang.String[]{};
    Object v12 = true;
    Object v13 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v8),((java.lang.String[])v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"u-","The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ","-"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "Q ";
    Object v6 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v5));
    Object v7 = Character.valueOf((char)1);
    Object v8 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v7).charValue()));
    Object v9 = ((org.apache.commons.cli.Options)v6).getOptionGroup(((org.apache.commons.cli.Option)v8));
    Object v10 = new java.lang.String[]{};
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Unable to parsethe URL: ";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"l"};
    Object v9 = new java.util.Properties();
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "Unrecognized option: ";
    Object v4 = ((org.apache.commons.cli.Options)v2).getMatchingOptions(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"D7fault option wasn't defined"};
    Object v6 = new java.util.Properties();
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-","   "};
    Object v4 = new java.util.Properties();
    Object v5 = ((java.util.Properties)v4).toString();
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","--","-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "--";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--","   ","-"};
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
    Object v3 = new java.lang.String[]{"-","\\]"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--","-",""};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = "\"";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{" "};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"--","-#","--"};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = new java.util.Properties();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "[ARG...]";
    Object v4 = ((org.apache.commons.cli.Options)v2).getMatchingOptions(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{"   ","G-","1"};
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-"};
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Q ";
    Object v7 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"-r","(1","-"};
    Object v9 = new java.util.Properties();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
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
  public void test75() throws Throwable {
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
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = Character.valueOf((char)1);
    Object v4 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v4));
    Object v6 = new java.lang.String[]{};
    Object v7 = new java.util.Properties();
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"","b ","--"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Q ";
    Object v8 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v7));
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v8).getMatchingOptions(((java.lang.String)v9));
    Object v11 = new java.lang.String[]{"","-Y-",""};
    Object v12 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v8),((java.lang.String[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
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
    Object v3 = ((org.apache.commons.cli.Options)v2).getOptions();
    Object v4 = new java.lang.String[]{" D"," "};
    Object v5 = new java.util.Properties();
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = ((java.util.Properties)v5).containsValue(((java.lang.Object)v6));
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-"};
    Object v4 = new java.util.Properties();
    Object v5 = new java.io.ByteArrayOutputStream();
    Object v6 = Character.valueOf((char)1);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v8).charValue()));
    Object v10 = ((java.util.Properties)v4).replace(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"'","usage: ",""};
    Object v4 = new java.util.Properties();
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4));
    Object v6 = "-";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "-I";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"|","-4-","-9-"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "tru";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-","}"};
    Object v4 = new java.util.Properties();
    Object v5 = "-";
    Object v6 = new java.io.PrintWriter(((java.lang.String)v5));
    ((java.util.Properties)v4).list(((java.io.PrintWriter)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"must specify longopt"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
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
    Object v3 = ((org.apache.commons.cli.Options)v2).toString();
    Object v4 = new java.lang.String[]{};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Options)v2).toString();
    Object v4 = new java.lang.String[]{""};
    Object v5 = new java.util.Properties();
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = "' contains an illegal charac";
    ((java.util.Properties)v5).save(((java.io.OutputStream)v6),((java.lang.String)v7));
    Object v8 = null;
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Missing argument or option: ","yes"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "[";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"must specdify longopt"," [ARG]","-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{""," :: "};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-","-","tgrue"};
    Object v4 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"Th option '","^","must specify longopt"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "' was specified but an option from this group has already been selected: '";
    ((org.apache.commons.cli.DefaultParser)v0).handleConcatenatedOptions(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = "true";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasLongOption(((java.lang.String)v3));
    Object v5 = new java.lang.String[]{};
    Object v6 = new java.util.Properties();
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"8"," [ARG]","[-"};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Q ";
    Object v8 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v7));
    Object v9 = new java.lang.String[]{};
    Object v10 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v8),((java.lang.String[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"-h","`","-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.DefaultParser();
    Object v1 = "Q ";
    Object v2 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v1));
    Object v3 = new java.lang.String[]{"","]"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.DefaultParser)v0).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }
}
