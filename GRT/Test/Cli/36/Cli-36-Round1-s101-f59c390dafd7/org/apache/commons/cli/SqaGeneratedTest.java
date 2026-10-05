package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v1).getMatchingOptions(((java.lang.String)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = "/[ option: ";
    Object v3 = ((org.apache.commons.cli.Options)v1).getMatchingOptions(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = ((org.apache.commons.cli.Options)v4).helpOptions();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = " | ";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "cmdLineSyntax not provided";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "--";
    Object v8 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = "-";
    Object v12 = ((org.apache.commons.cli.Options)v10).getOption(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = "--";
    Object v5 = ((org.apache.commons.cli.Options)v3).hasOption(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.cli.Options)v1).getMatchingOptions(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "Y-";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = "y";
    Object v5 = ((org.apache.commons.cli.Options)v3).getOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.Options)v4).getMatchingOptions(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = "-";
    Object v5 = ((org.apache.commons.cli.Options)v3).hasOption(((java.lang.String)v4));
    Object v6 = "--";
    Object v7 = ((org.apache.commons.cli.Options)v3).hasOption(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v7 = ((org.apache.commons.cli.Options)v6).getRequiredOptions();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = "Unrecognized option: ";
    Object v5 = ((org.apache.commons.cli.Options)v3).hasOption(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = ((org.apache.commons.cli.Options)v0).toString();
    Object v2 = "--";
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.Options)v4).getMatchingOptions(((java.lang.String)v5));
    Object v7 = "-";
    Object v8 = ((org.apache.commons.cli.Options)v4).hasOption(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = ((org.apache.commons.cli.Options)v0).getRequiredOptions();
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v0).hasLongOption(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v7 = "T";
    Object v8 = ((org.apache.commons.cli.Options)v6).hasOption(((java.lang.String)v7));
    Object v9 = "--";
    Object v10 = ((org.apache.commons.cli.Options)v6).hasOption(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "--";
    Object v2 = ((org.apache.commons.cli.Options)v0).getMatchingOptions(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.Options)v0).getOption(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = ((org.apache.commons.cli.Options)v0).getRequiredOptions();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = "'-";
    Object v12 = ((org.apache.commons.cli.Options)v10).hasLongOption(((java.lang.String)v11));
    Object v13 = "Default option wasn't defined";
    Object v14 = ((org.apache.commons.cli.Options)v10).getMatchingOptions(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v9 = ((org.apache.commons.cli.Options)v8).getOptionGroups();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v9 = ((org.apache.commons.cli.Options)v8).getRequiredOptions();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = "]";
    Object v12 = ((org.apache.commons.cli.Options)v10).hasLongOption(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.Options)v2).getMatchingOptions(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = " ";
    Object v5 = ((org.apache.commons.cli.Options)v3).getOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = ((org.apache.commons.cli.Options)v0).hasShortOption(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.cli.Options)v4).getMatchingOptions(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.cli.Options)v1).toString();
    org.junit.Assert.assertEquals((Object)("[ Options: [ short {e=[ option: e  :: null ]} ] [ long {} ]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "'";
    Object v6 = ((org.apache.commons.cli.Options)v4).getMatchingOptions(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v9 = "-K";
    Object v10 = ((org.apache.commons.cli.Options)v8).hasOption(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = ((org.apache.commons.cli.Options)v0).getOptions();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = "-i-";
    Object v5 = ((org.apache.commons.cli.Options)v3).getMatchingOptions(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = "'";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasLongOption(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Options)v2).toString();
    org.junit.Assert.assertEquals((Object)("[ Options: [ short {} ] [ long {} ]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "-J";
    Object v2 = "]-";
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = ", ";
    Object v2 = ((org.apache.commons.cli.Options)v0).hasOption(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Options)v0).helpOptions();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = "--";
    Object v5 = ((org.apache.commons.cli.Options)v3).getMatchingOptions(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v9 = ((org.apache.commons.cli.Options)v8).getOptions();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = " 8";
    Object v6 = ((org.apache.commons.cli.Options)v4).getMatchingOptions(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Options)v4).toString();
    org.junit.Assert.assertEquals((Object)("[ Options: [ short {=[ option:   :: ? :: class java.lang.String ]} ] [ long {} ]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.Options)v4).getMatchingOptions(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.OptionGroup)v5).getNames();
    Object v7 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = "-";
    Object v12 = ((org.apache.commons.cli.Options)v10).getMatchingOptions(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Options)v4).toString();
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    ((org.apache.commons.cli.Option)v7).setOptionalArg((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((org.apache.commons.cli.Option)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = new org.apache.commons.cli.OptionGroup();
    Object v12 = ((org.apache.commons.cli.Options)v10).addOptionGroup(((org.apache.commons.cli.OptionGroup)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v9 = "";
    Object v10 = "Z-";
    Object v11 = false;
    Object v12 = ")";
    Object v13 = ((org.apache.commons.cli.Options)v8).addOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.OptionGroup)v5).getNames();
    Object v7 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v8 = new org.apache.commons.cli.OptionGroup();
    Object v9 = ((org.apache.commons.cli.Options)v7).addOptionGroup(((org.apache.commons.cli.OptionGroup)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v9 = "--";
    Object v10 = ((org.apache.commons.cli.Options)v8).hasOption(((java.lang.String)v9));
    Object v11 = "e";
    Object v12 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v11));
    Object v13 = Character.valueOf((char)0);
    Object v14 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v13).charValue()));
    Object v15 = ((org.apache.commons.cli.Options)v12).addOption(((org.apache.commons.cli.Option)v14));
    Object v16 = "C";
    Object v17 = ((org.apache.commons.cli.Options)v15).getOption(((java.lang.String)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = "-";
    Object v21 = ((org.apache.commons.cli.Options)v15).addOption(((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.String)v20));
    Object v22 = "-";
    Object v23 = ((org.apache.commons.cli.Options)v21).getOption(((java.lang.String)v22));
    Object v24 = ((org.apache.commons.cli.Options)v8).addOption(((org.apache.commons.cli.Option)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.Options)v3).addOption(((org.apache.commons.cli.Option)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = ((org.apache.commons.cli.Options)v4).getOptionGroups();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "[i";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v9 = Character.valueOf((char)0);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = Character.valueOf((char)0);
    ((org.apache.commons.cli.Option)v10).setValueSeparator((((java.lang.Character)v11).charValue()));
    Object v12 = null;
    Object v13 = ((org.apache.commons.cli.Options)v8).getOptionGroup(((org.apache.commons.cli.Option)v10));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = "yes";
    Object v5 = ((org.apache.commons.cli.Options)v3).hasOption(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "-u-";
    Object v2 = ((org.apache.commons.cli.Options)v0).hasOption(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = new org.apache.commons.cli.OptionGroup();
    Object v12 = ((org.apache.commons.cli.Options)v10).addOptionGroup(((org.apache.commons.cli.OptionGroup)v11));
    Object v13 = "-\"";
    Object v14 = ((org.apache.commons.cli.Options)v12).hasShortOption(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = "S-";
    Object v4 = ((org.apache.commons.cli.Options)v2).getOption(((java.lang.String)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.OptionGroup)v5).getNames();
    Object v7 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v8 = new org.apache.commons.cli.OptionGroup();
    Object v9 = ((org.apache.commons.cli.Options)v7).addOptionGroup(((org.apache.commons.cli.OptionGroup)v8));
    Object v10 = "-o-";
    Object v11 = ((org.apache.commons.cli.Options)v9).hasLongOption(((java.lang.String)v10));
    Object v12 = "--Z";
    Object v13 = ((org.apache.commons.cli.Options)v9).getOption(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.Options)v4).hasOption(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v7 = "-";
    Object v8 = ((org.apache.commons.cli.Options)v6).getMatchingOptions(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.Options)v2).hasOption(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = new org.apache.commons.cli.OptionGroup();
    Object v5 = ((org.apache.commons.cli.Options)v3).addOptionGroup(((org.apache.commons.cli.OptionGroup)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = ((org.apache.commons.cli.Options)v0).hasOption(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = new org.apache.commons.cli.OptionGroup();
    Object v12 = ((org.apache.commons.cli.Options)v10).addOptionGroup(((org.apache.commons.cli.OptionGroup)v11));
    Object v13 = "=";
    Object v14 = ((org.apache.commons.cli.Options)v12).hasOption(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = "p";
    Object v5 = ((org.apache.commons.cli.Options)v3).getMatchingOptions(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.Options)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = "-o";
    Object v8 = ((org.apache.commons.cli.Options)v6).getOption(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.cli.Options)v10).getOptionGroups();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v7).charValue()));
    Object v9 = ((org.apache.commons.cli.Options)v6).addOption(((org.apache.commons.cli.Option)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = "--";
    Object v4 = "-/";
    Object v5 = false;
    Object v6 = ", ";
    Object v7 = ((org.apache.commons.cli.Options)v2).addOption(((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Options)v4).toString();
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    ((org.apache.commons.cli.Option)v7).setOptionalArg((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((org.apache.commons.cli.Option)v7));
    Object v11 = new org.apache.commons.cli.OptionGroup();
    Object v12 = ((org.apache.commons.cli.Options)v10).addOptionGroup(((org.apache.commons.cli.OptionGroup)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Options)v4).addOption(((org.apache.commons.cli.Option)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = "S-";
    Object v4 = ((org.apache.commons.cli.Options)v2).getOption(((java.lang.String)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v8 = ((org.apache.commons.cli.Options)v7).getOptions();
    Object v9 = " ]";
    Object v10 = ((org.apache.commons.cli.Options)v7).getOption(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Options)v4).addOption(((org.apache.commons.cli.Option)v6));
    Object v8 = "-";
    Object v9 = ((org.apache.commons.cli.Options)v7).hasOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.cli.Options)v2).getOptionGroup(((org.apache.commons.cli.Option)v4));
    Object v6 = "-";
    Object v7 = ((org.apache.commons.cli.Options)v2).hasOption(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v7 = new org.apache.commons.cli.OptionGroup();
    Object v8 = ((org.apache.commons.cli.Options)v6).addOptionGroup(((org.apache.commons.cli.OptionGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = " ] [ long";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = "";
    Object v2 = false;
    Object v3 = "?";
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "E-";
    Object v6 = ((org.apache.commons.cli.Options)v4).hasOption(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    ((org.apache.commons.cli.OptionGroup)v1).setSelected(((org.apache.commons.cli.Option)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = ((org.apache.commons.cli.Options)v2).getRequiredOptions();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Options)v4).addOption(((org.apache.commons.cli.Option)v6));
    Object v8 = new org.apache.commons.cli.OptionGroup();
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).toString();
    Object v10 = ((org.apache.commons.cli.Options)v7).addOptionGroup(((org.apache.commons.cli.OptionGroup)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.Options)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = "";
    Object v8 = ((org.apache.commons.cli.Options)v6).hasOption(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = "-";
    Object v5 = ((org.apache.commons.cli.Options)v3).hasOption(((java.lang.String)v4));
    Object v6 = "*";
    Object v7 = ((org.apache.commons.cli.Options)v3).getMatchingOptions(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = new org.apache.commons.cli.OptionGroup();
    Object v4 = ((org.apache.commons.cli.Options)v2).addOptionGroup(((org.apache.commons.cli.OptionGroup)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Option)v6).getValues();
    Object v8 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v9 = "";
    Object v10 = "Z-";
    Object v11 = false;
    Object v12 = ")";
    Object v13 = ((org.apache.commons.cli.Options)v8).addOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.cli.Options)v13).getRequiredOptions();
    Object v15 = "--r";
    Object v16 = ((org.apache.commons.cli.Options)v13).getMatchingOptions(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.OptionGroup)v5).getNames();
    Object v7 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v8 = new org.apache.commons.cli.OptionGroup();
    Object v9 = ((org.apache.commons.cli.Options)v7).addOptionGroup(((org.apache.commons.cli.OptionGroup)v8));
    Object v10 = "--";
    Object v11 = ((org.apache.commons.cli.Options)v9).hasOption(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v3 = "S-";
    Object v4 = ((org.apache.commons.cli.Options)v2).getOption(((java.lang.String)v3));
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    Object v7 = ((org.apache.commons.cli.Options)v2).addOption(((org.apache.commons.cli.Option)v6));
    Object v8 = "#";
    Object v9 = ((org.apache.commons.cli.Options)v7).hasOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "e";
    Object v1 = org.apache.commons.cli.PatternOptionBuilder.parsePattern(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.cli.Options)v4).getOption(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = true;
    Object v9 = "-";
    Object v10 = ((org.apache.commons.cli.Options)v4).addOption(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = new org.apache.commons.cli.OptionGroup();
    Object v12 = ((org.apache.commons.cli.Options)v10).addOptionGroup(((org.apache.commons.cli.OptionGroup)v11));
    Object v13 = ">";
    Object v14 = ((org.apache.commons.cli.Options)v12).getMatchingOptions(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = new org.apache.commons.cli.OptionGroup();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    ((org.apache.commons.cli.OptionGroup)v1).setSelected(((org.apache.commons.cli.Option)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Options)v0).addOptionGroup(((org.apache.commons.cli.OptionGroup)v1));
    Object v6 = "-";
    Object v7 = ((org.apache.commons.cli.Options)v5).getOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.Options();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.Options)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.OptionGroup)v5).getNames();
    Object v7 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v8 = "usageQ ";
    Object v9 = ((org.apache.commons.cli.Options)v7).hasShortOption(((java.lang.String)v8));
    Object v10 = Character.valueOf((char)0);
    Object v11 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v10).charValue()));
    Object v12 = ((org.apache.commons.cli.Options)v7).addOption(((org.apache.commons.cli.Option)v11));
    org.junit.Assert.assertNotNull(v12);
  }
}
