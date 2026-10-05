package org.apache.commons.cli2.builder;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = "[";
    ((org.apache.commons.cli2.builder.PatternBuilder)v3).withPattern(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).create();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = "-]";
    ((org.apache.commons.cli2.builder.PatternBuilder)v3).withPattern(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = "u-";
    ((org.apache.commons.cli2.builder.PatternBuilder)v3).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = "ArgumentBuilder.null.name";
    ((org.apache.commons.cli2.builder.PatternBuilder)v4).withPattern(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = "Argument.minimum.cexceeds.maximum";
    ((org.apache.commons.cli2.builder.PatternBuilder)v4).withPattern(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = "";
    ((org.apache.commons.cli2.builder.PatternBuilder)v4).withPattern(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).create();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    Object v2 = "Cannot.burst";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "URLValidator.malformed.URL";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    Object v2 = "-";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "+";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = "-";
    Object v3 = "X";
    Object v4 = -48;
    Object v5 = 0;
    Object v6 = Character.valueOf((char)1);
    Object v7 = Character.valueOf((char)0);
    Object v8 = java.text.NumberFormat.getInstance();
    Object v9 = new org.apache.commons.cli2.validation.NumberValidator(((java.text.NumberFormat)v8));
    Object v10 = "ArgumentBuilder.null.consume.remaining";
    Object v11 = new java.util.ArrayList();
    Object v12 = 5;
    Object v13 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()),(((java.lang.Character)v7).charValue()),((org.apache.commons.cli2.validation.Validator)v9),((java.lang.String)v10),((java.util.List)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1).withArgument(((org.apache.commons.cli2.Argument)v13));
    Object v15 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v16 = java.text.NumberFormat.getInstance();
    Object v17 = new org.apache.commons.cli2.validation.NumberValidator(((java.text.NumberFormat)v16));
    Object v18 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v15).withValidator(((org.apache.commons.cli2.validation.Validator)v17));
    Object v19 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v15));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).create();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).create();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "}(";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "-D";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).create();
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).reset();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withSubsequentSeparator((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "Missing.opt*on";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "Option.trigger.needs.pref^x";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withMaximum((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "I (";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).create();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).reset();
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).create();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withSubsequentSeparator((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v6 = "ClassValidator.class.create";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    Object v2 = " (";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    Object v3 = "Switch.preferredName.too.short";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    Object v2 = "Unexpected.token";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withSubsequentSeparator((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v6 = "false/";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = "Missing.option";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = "Option.ille";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).reset();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "Y";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).reset();
    Object v6 = "pro,erty";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withMaximum((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "-";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).create();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withInitialSeparator((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withInitialSeparator((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    Object v7 = "DISPLAY_GOUP_EXPANDED";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).create();
    Object v3 = "Switch.enabled.starsWith.disabled";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = "Enum.illegal.value";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = "-";
    Object v3 = "X";
    Object v4 = -48;
    Object v5 = 0;
    Object v6 = Character.valueOf((char)1);
    Object v7 = Character.valueOf((char)0);
    Object v8 = java.text.NumberFormat.getInstance();
    Object v9 = new org.apache.commons.cli2.validation.NumberValidator(((java.text.NumberFormat)v8));
    Object v10 = "ArgumentBuilder.null.consume.remaining";
    Object v11 = new java.util.ArrayList();
    Object v12 = 5;
    Object v13 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()),(((java.lang.Character)v7).charValue()),((org.apache.commons.cli2.validation.Validator)v9),((java.lang.String)v10),((java.util.List)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1).withArgument(((org.apache.commons.cli2.Argument)v13));
    Object v15 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v16 = java.text.NumberFormat.getInstance();
    Object v17 = new org.apache.commons.cli2.validation.NumberValidator(((java.text.NumberFormat)v16));
    Object v18 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v15).withValidator(((org.apache.commons.cli2.validation.Validator)v17));
    Object v19 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v15));
    Object v20 = ((org.apache.commons.cli2.builder.PatternBuilder)v19).reset();
    Object v21 = "URLValidator.malformed.URL";
    ((org.apache.commons.cli2.builder.PatternBuilder)v19).withPattern(((java.lang.String)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "Option.mis?sing.required";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).reset();
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "Unexpected).token";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = "u";
    Object v3 = ((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1).withShortName(((java.lang.String)v2));
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v4).withMaximum((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withSubsequentSeparator((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = "";
    ((org.apache.commons.cli2.builder.PatternBuilder)v3).withPattern(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "DISPLAY_ARGUMENT_BRACKETED";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).create();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = "  ";
    Object v3 = ((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1).withShortName(((java.lang.String)v2));
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v4).withSubsequentSeparator((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = "Switch.disabled.startsWith.enabled";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ";";
    ((org.apache.commons.cli2.builder.PatternBuilder)v4).withPattern(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    Object v7 = "true";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    Object v3 = ((org.apache.commons.cli2.builder.PatternBuilder)v2).create();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "HelpFormatter.gutter.too.l";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    Object v3 = "argu";
    ((org.apache.commons.cli2.builder.PatternBuilder)v2).withPattern(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v2).create();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = "  ";
    Object v3 = ((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1).withShortName(((java.lang.String)v2));
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v4).withSubsequentSeparator((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v8 = " \"(";
    ((org.apache.commons.cli2.builder.PatternBuilder)v7).withPattern(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).create();
    Object v3 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).create();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "HelpFormatter.gutter.too.long";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "1";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = "  ";
    Object v3 = ((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1).withShortName(((java.lang.String)v2));
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v4).withSubsequentSeparator((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v8 = "U`expected.token";
    ((org.apache.commons.cli2.builder.PatternBuilder)v7).withPattern(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withInitialSeparator((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = java.text.NumberFormat.getInstance();
    Object v4 = new org.apache.commons.cli2.validation.NumberValidator(((java.text.NumberFormat)v3));
    Object v5 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withValidator(((org.apache.commons.cli2.validation.Validator)v4));
    Object v6 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "Cannot.burst";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withMaximum((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).reset();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = "NumberValidator.number.OutOfRange";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "Switch.disabled.startsWith.enabled";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).reset();
    Object v7 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "--";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = "";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "Option.illegal.short.pefix";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withMaximum((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = "ClassValidator.class.access";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).reset();
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).reset();
    Object v7 = "ClassValidator.class.notfound";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).create();
    Object v3 = "true";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = "ClassValidator.clas#.notfound";
    ((org.apache.commons.cli2.builder.PatternBuilder)v1).withPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "tOption.illegal.short.prefix";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    Object v3 = ((org.apache.commons.cli2.builder.PatternBuilder)v2).create();
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v2).create();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withMaximum((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).reset();
    Object v7 = ":";
    ((org.apache.commons.cli2.builder.PatternBuilder)v6).withPattern(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    Object v3 = "AgumentBuilder.null.default";
    ((org.apache.commons.cli2.builder.PatternBuilder)v2).withPattern(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    Object v3 = "";
    ((org.apache.commons.cli2.builder.PatternBuilder)v2).withPattern(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withMaximum((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = "/Unexpected.token";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).create();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    Object v3 = "Passes properties and values to the application";
    ((org.apache.commons.cli2.builder.PatternBuilder)v2).withPattern(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).create();
    Object v2 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v3 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v4 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v2),((org.apache.commons.cli2.builder.ArgumentBuilder)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = 0;
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withMaximum((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = 0;
    Object v4 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v2).withMaximum((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v6 = "ArgumentBuilder.empty.consum.remaining";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = "u";
    Object v3 = ((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1).withShortName(((java.lang.String)v2));
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v4).withMaximum((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v8 = ((org.apache.commons.cli2.builder.PatternBuilder)v7).create();
    Object v9 = ((org.apache.commons.cli2.builder.PatternBuilder)v7).create();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = "u";
    Object v3 = ((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1).withShortName(((java.lang.String)v2));
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.cli2.builder.ArgumentBuilder)v4).withMaximum((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v8 = "1rgument.unexpected.value";
    ((org.apache.commons.cli2.builder.PatternBuilder)v7).withPattern(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = ((org.apache.commons.cli2.builder.PatternBuilder)v7).create();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).create();
    Object v2 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v3 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v4 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v2),((org.apache.commons.cli2.builder.ArgumentBuilder)v3));
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).create();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = "Option.identical.prefixes";
    ((org.apache.commons.cli2.builder.PatternBuilder)v0).withPattern(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v2 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v3 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v1),((org.apache.commons.cli2.builder.ArgumentBuilder)v2));
    Object v4 = ((org.apache.commons.cli2.builder.PatternBuilder)v3).reset();
    Object v5 = ((org.apache.commons.cli2.builder.PatternBuilder)v4).reset();
    Object v6 = ((org.apache.commons.cli2.builder.PatternBuilder)v5).reset();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).reset();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v1).reset();
    Object v3 = "UnexpIected.token";
    ((org.apache.commons.cli2.builder.PatternBuilder)v2).withPattern(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.PatternBuilder();
    Object v1 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    Object v2 = ((org.apache.commons.cli2.builder.PatternBuilder)v0).create();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli2.builder.GroupBuilder();
    Object v1 = "Switch.no.enabledPrefix";
    Object v2 = ((org.apache.commons.cli2.builder.GroupBuilder)v0).withDescription(((java.lang.String)v1));
    Object v3 = new org.apache.commons.cli2.builder.DefaultOptionBuilder();
    Object v4 = new org.apache.commons.cli2.builder.ArgumentBuilder();
    Object v5 = new org.apache.commons.cli2.builder.PatternBuilder(((org.apache.commons.cli2.builder.GroupBuilder)v0),((org.apache.commons.cli2.builder.DefaultOptionBuilder)v3),((org.apache.commons.cli2.builder.ArgumentBuilder)v4));
    Object v6 = "[h";
    ((org.apache.commons.cli2.builder.PatternBuilder)v5).withPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }
}
