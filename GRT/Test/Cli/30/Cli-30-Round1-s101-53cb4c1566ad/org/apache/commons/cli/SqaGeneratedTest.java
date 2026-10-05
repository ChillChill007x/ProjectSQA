package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = "'";
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
    Object v2 = new java.lang.String[]{"-","-","'"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).toString();
    Object v3 = new java.lang.String[]{" "};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"d","--"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"A CloneNotSupportedException was throFn: "};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{" to desired type: ","-","-"};
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"-"};
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "z";
    Object v3 = true;
    Object v4 = "tru";
    Object v5 = ((org.apache.commons.cli.Options)v1).addOption(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.String)v4));
    Object v6 = new java.lang.String[]{};
    Object v7 = new java.util.Properties();
    Object v8 = "-k";
    Object v9 = "s";
    Object v10 = ((java.util.Properties)v7).setProperty(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = ((org.apache.commons.cli.Parser)v0).getOptions();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v1).getMatchingOptions(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"-"};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = new java.util.Properties();
    ((java.util.Properties)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = Character.valueOf((char)1);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.cli.Options)v5).getOptionGroup(((org.apache.commons.cli.Option)v7));
    Object v9 = new java.lang.String[]{"$"};
    Object v10 = new java.util.Properties();
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    ((org.apache.commons.cli.Parser)v0).setOptions(((org.apache.commons.cli.Options)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"+ :: "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = ((org.apache.commons.cli.Parser)v0).getRequiredOptions();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = new java.util.Properties();
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = ((java.util.Properties)v3).remove(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = ((java.util.Properties)v1).keySet();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"]N","-"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" "," [ARG]"};
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
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"must spicify longopt"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = ((org.apache.commons.cli.Parser)v0).getRequiredOptions();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = new java.util.Properties();
    ((java.util.Properties)v3).clear();
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = false;
    Object v4 = new java.io.PrintStream(((java.io.OutputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "trXe";
    ((java.util.Properties)v1).store(((java.io.OutputStream)v4),((java.lang.String)v5));
    Object v6 = null;
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Brg","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((org.apache.commons.cli.Parser)v0).checkRequiredOptions();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"; Unable to create an instance of: "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = "-";
    Object v7 = ((org.apache.commons.cli.Options)v5).hasLongOption(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{};
    Object v9 = new java.util.Properties();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = new org.apache.commons.cli.BasicParser();
    Object v3 = new org.apache.commons.cli.Options();
    Object v4 = new java.lang.String[]{"A CloneNotSupportedException was throFn: "};
    Object v5 = new java.util.Properties();
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v2).parse(((org.apache.commons.cli.Options)v3),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new org.apache.commons.cli.Options();
    Object v9 = new java.lang.String[]{" to desired type: ","-","-"};
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.Parser)v2).flatten(((org.apache.commons.cli.Options)v8),((java.lang.String[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.nio.charset.Charset.defaultCharset();
    Object v13 = ((java.util.Properties)v1).putIfAbsent(((java.lang.Object)v11),((java.lang.Object)v12));
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "--";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasLongOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{""," [ARGV]"};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"-","Default option wasn't defined"};
    Object v7 = new java.util.Properties();
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-{-";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"--"};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = ((java.util.Properties)v1).clone();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = ((org.apache.commons.cli.Options)v6).getOptions();
    Object v8 = new java.lang.String[]{};
    Object v9 = new java.util.Properties();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v8),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = new java.lang.String[]{"-"};
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"-","-"};
    Object v4 = new java.util.Properties();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = ((org.apache.commons.cli.Parser)v0).getOptions();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "--";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasLongOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"q"};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = ",:";
    Object v7 = ((org.apache.commons.cli.Options)v5).getOption(((java.lang.String)v6));
    Object v8 = new java.lang.String[]{"-"};
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{};
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"{","The option '","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--",""};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new java.util.Properties();
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = "cmdLineSyntax not provided";
    ((java.util.Properties)v4).store(((java.io.Writer)v5),((java.lang.String)v6));
    Object v7 = null;
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","arg","]"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","]"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"-","["};
    Object v7 = new java.util.Properties();
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--","arg"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"",""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"2-","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = new java.lang.String[]{"-i-"};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = new java.lang.String[]{"-","Default opt"};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = ((org.apache.commons.cli.Parser)v0).getRequiredOptions();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","Unrecog.ized option: "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "";
    Object v3 = ((org.apache.commons.cli.Options)v1).getMatchingOptions(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new java.util.Properties();
    Object v2 = "";
    Object v3 = "[";
    Object v4 = ((java.util.Properties)v1).setProperty(((java.lang.String)v2),((java.lang.String)v3));
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v1));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-C"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = "M";
    ((java.util.Properties)v3).store(((java.io.Writer)v4),((java.lang.String)v5));
    Object v6 = null;
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = new java.lang.String[]{"--","usage: ","The optio"};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = new java.lang.String[]{"h"};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = new java.lang.String[]{"-4"," "};
    Object v11 = new java.util.Properties();
    Object v12 = false;
    Object v13 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v9),((java.lang.String[])v10),((java.util.Properties)v11),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = "-";
    Object v2 = null;
    ((org.apache.commons.cli.Parser)v0).processOption(((java.lang.String)v1),((java.util.ListIterator)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"'","'","' contains an illegal charac"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"[","","arg"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
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
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasLongOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"'","<-"};
    Object v5 = new java.util.Properties();
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"tru","\"","--"};
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"," s"};
    Object v3 = new java.util.Properties();
    Object v4 = java.nio.charset.Charset.defaultCharset();
    Object v5 = new org.apache.commons.cli.BasicParser();
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"--","--","arg"};
    Object v8 = new java.util.Properties();
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v5).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.util.Properties)v3).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v10));
    Object v12 = true;
    Object v13 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Unrecogni","The option '"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"--"};
    Object v8 = new java.util.Properties();
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","",""};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{};
    Object v8 = new java.util.Properties();
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = "Default optio wasn't defined";
    ((java.util.Properties)v8).store(((java.io.Writer)v9),((java.lang.String)v10));
    Object v11 = null;
    Object v12 = true;
    Object v13 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasShortOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"-0"};
    Object v5 = new java.util.Properties();
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Ambiguous option: "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Unrecognized option: ","ag"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"",""};
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-",""};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-G","","-"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = new java.lang.String[]{"s",")--"};
    Object v7 = new java.util.Properties();
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7));
    Object v9 = ((org.apache.commons.cli.Parser)v0).getRequiredOptions();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"'"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = new java.util.Properties();
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"tru","-"," "};
    Object v4 = new java.util.Properties();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{".-","~",""};
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"i-","-l-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
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
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ", ";
    Object v3 = ((org.apache.commons.cli.Options)v1).getMatchingOptions(((java.lang.String)v2));
    ((org.apache.commons.cli.Parser)v0).setOptions(((org.apache.commons.cli.Options)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new java.util.Properties();
    ((org.apache.commons.cli.Parser)v0).processProperties(((java.util.Properties)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","/","-"};
    Object v3 = new java.util.Properties();
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = false;
    Object v6 = new java.io.PrintStream(((java.io.OutputStream)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "9";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    ((java.util.Properties)v3).storeToXML(((java.io.OutputStream)v6),((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.BasicParser();
    Object v7 = new org.apache.commons.cli.Options();
    Object v8 = new java.lang.String[]{"-","--"};
    Object v9 = ((org.apache.commons.cli.Parser)v6).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8));
    Object v10 = ((org.apache.commons.cli.Parser)v6).getOptions();
    Object v11 = new java.lang.String[]{};
    Object v12 = new java.util.Properties();
    Object v13 = new org.apache.commons.cli.BasicParser();
    Object v14 = new org.apache.commons.cli.Options();
    Object v15 = new java.lang.String[]{"-"};
    Object v16 = false;
    Object v17 = ((org.apache.commons.cli.Parser)v13).flatten(((org.apache.commons.cli.Options)v14),((java.lang.String[])v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new org.apache.commons.cli.BasicParser();
    Object v19 = new org.apache.commons.cli.Options();
    Object v20 = new java.lang.String[]{"-"};
    Object v21 = new java.util.Properties();
    Object v22 = false;
    Object v23 = ((org.apache.commons.cli.Parser)v18).parse(((org.apache.commons.cli.Options)v19),((java.lang.String[])v20),((java.util.Properties)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((java.util.Properties)v12).put(((java.lang.Object)v17),((java.lang.Object)v23));
    Object v25 = true;
    Object v26 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v10),((java.lang.String[])v11),((java.util.Properties)v12),(((java.lang.Boolean)v25).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","yes"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"--"," -"};
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v0).flatten(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"",""};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--Y","--"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"-","-"};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"," ","'"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"-","-","--"};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = new java.lang.String[]{};
    Object v7 = new java.util.Properties();
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.BasicParser();
    Object v2 = new org.apache.commons.cli.Options();
    Object v3 = new java.lang.String[]{"-","--"};
    Object v4 = ((org.apache.commons.cli.Parser)v1).parse(((org.apache.commons.cli.Options)v2),((java.lang.String[])v3));
    Object v5 = ((org.apache.commons.cli.Parser)v1).getOptions();
    Object v6 = new java.lang.String[]{"-`-"};
    Object v7 = new java.util.Properties();
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }
}
