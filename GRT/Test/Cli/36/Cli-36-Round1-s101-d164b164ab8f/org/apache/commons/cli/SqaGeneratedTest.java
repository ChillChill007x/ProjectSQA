package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = ((org.apache.commons.cli.OptionGroup)v0).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = ((org.apache.commons.cli.OptionGroup)v0).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = false;
    ((org.apache.commons.cli.OptionGroup)v0).setRequired((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = true;
    ((org.apache.commons.cli.OptionGroup)v0).setRequired((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = "-";
    ((org.apache.commons.cli.Option)v2).setArgName(((java.lang.String)v3));
    Object v4 = null;
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = ((org.apache.commons.cli.OptionGroup)v0).getOptions();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = false;
    ((org.apache.commons.cli.OptionGroup)v3).setRequired((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = "-t-";
    ((org.apache.commons.cli.Option)v2).setLongOpt(((java.lang.String)v3));
    Object v4 = null;
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.Option)v5).getValue();
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v0).getOptions();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = "--";
    ((org.apache.commons.cli.Option)v2).setArgName(((java.lang.String)v3));
    Object v4 = null;
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = ((org.apache.commons.cli.OptionGroup)v3).getNames();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "t";
    ((org.apache.commons.cli.Option)v5).setLongOpt(((java.lang.String)v6));
    Object v7 = null;
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).getSelected();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).getNames();
    Object v5 = ((org.apache.commons.cli.OptionGroup)v3).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = ((org.apache.commons.cli.OptionGroup)v0).getNames();
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = true;
    ((org.apache.commons.cli.OptionGroup)v0).setRequired((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).getNames();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = true;
    ((org.apache.commons.cli.OptionGroup)v3).setRequired((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v5));
    Object v6 = null;
    Object v7 = Character.valueOf((char)1);
    Object v8 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v7).charValue()));
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v0).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    ((org.apache.commons.cli.Option)v2).setValueSeparator((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).getNames();
    Object v5 = ((org.apache.commons.cli.OptionGroup)v3).getNames();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.Option)v5).getValues();
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).toString();
    Object v5 = ((org.apache.commons.cli.OptionGroup)v3).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = ((org.apache.commons.cli.OptionGroup)v0).getNames();
    Object v2 = ((org.apache.commons.cli.OptionGroup)v0).getSelected();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).getOptions();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = ((org.apache.commons.cli.OptionGroup)v3).getSelected();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = ((org.apache.commons.cli.OptionGroup)v0).toString();
    Object v2 = ((org.apache.commons.cli.OptionGroup)v0).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).toString();
    Object v5 = ((org.apache.commons.cli.OptionGroup)v3).getOptions();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).getOptions();
    Object v5 = Character.valueOf((char)1);
    Object v6 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v5).charValue()));
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).getId();
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    ((org.apache.commons.cli.OptionGroup)v8).setSelected(((org.apache.commons.cli.Option)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001 -]"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).toString();
    Object v10 = ((org.apache.commons.cli.OptionGroup)v8).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001 -]"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = ((org.apache.commons.cli.OptionGroup)v0).getNames();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = ((org.apache.commons.cli.OptionGroup)v0).getNames();
    Object v2 = ((org.apache.commons.cli.OptionGroup)v0).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = "ys";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = false;
    ((org.apache.commons.cli.OptionGroup)v8).setRequired((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = Character.valueOf((char)1);
    Object v12 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v11).charValue()));
    ((org.apache.commons.cli.OptionGroup)v8).setSelected(((org.apache.commons.cli.Option)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = " ";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = true;
    ((org.apache.commons.cli.OptionGroup)v8).setRequired((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001 -]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).getNames();
    Object v10 = Character.valueOf((char)1);
    Object v11 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v10).charValue()));
    ((org.apache.commons.cli.OptionGroup)v8).setSelected(((org.apache.commons.cli.Option)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = 31;
    Object v7 = ((org.apache.commons.cli.Option)v5).getValue((((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = false;
    ((org.apache.commons.cli.OptionGroup)v8).setRequired((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).getNames();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).getNames();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = ((org.apache.commons.cli.OptionGroup)v3).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).getOptions();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    ((org.apache.commons.cli.OptionGroup)v8).setSelected(((org.apache.commons.cli.Option)v10));
    Object v11 = null;
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    ((org.apache.commons.cli.OptionGroup)v8).setSelected(((org.apache.commons.cli.Option)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.cli.OptionGroup)v0).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).getSelected();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v2));
    Object v3 = null;
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "--";
    ((org.apache.commons.cli.Option)v5).setLongOpt(((java.lang.String)v6));
    Object v7 = null;
    ((org.apache.commons.cli.OptionGroup)v0).setSelected(((org.apache.commons.cli.Option)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = "The option '";
    Object v12 = ((org.apache.commons.cli.Option)v10).getValue(((java.lang.String)v11));
    ((org.apache.commons.cli.OptionGroup)v8).setSelected(((org.apache.commons.cli.Option)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = false;
    ((org.apache.commons.cli.OptionGroup)v0).setRequired((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = Character.valueOf((char)1);
    Object v18 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v17).charValue()));
    Object v19 = "Not yet implemented";
    ((org.apache.commons.cli.Option)v18).setDescription(((java.lang.String)v19));
    Object v20 = null;
    ((org.apache.commons.cli.OptionGroup)v16).setSelected(((org.apache.commons.cli.Option)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.Option)v5).hashCode();
    ((org.apache.commons.cli.OptionGroup)v3).setSelected(((org.apache.commons.cli.Option)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = ((org.apache.commons.cli.OptionGroup)v16).toString();
    Object v18 = ((org.apache.commons.cli.OptionGroup)v16).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = Character.valueOf((char)1);
    Object v18 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v17).charValue()));
    Object v19 = ((org.apache.commons.cli.OptionGroup)v16).addOption(((org.apache.commons.cli.Option)v18));
    Object v20 = ((org.apache.commons.cli.OptionGroup)v16).getSelected();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = ((org.apache.commons.cli.OptionGroup)v16).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.Option)v10).getValues();
    ((org.apache.commons.cli.OptionGroup)v8).setSelected(((org.apache.commons.cli.Option)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = Character.valueOf((char)1);
    Object v18 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v17).charValue()));
    ((org.apache.commons.cli.OptionGroup)v16).setSelected(((org.apache.commons.cli.Option)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = ((org.apache.commons.cli.OptionGroup)v11).toString();
    Object v13 = ((org.apache.commons.cli.OptionGroup)v11).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    ((org.apache.commons.cli.OptionGroup)v11).setSelected(((org.apache.commons.cli.Option)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = false;
    ((org.apache.commons.cli.OptionGroup)v11).setRequired((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = true;
    ((org.apache.commons.cli.OptionGroup)v16).setRequired((((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = ((org.apache.commons.cli.OptionGroup)v8).getOptions();
    Object v10 = ((org.apache.commons.cli.OptionGroup)v8).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001 -]"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = ((org.apache.commons.cli.OptionGroup)v11).addOption(((org.apache.commons.cli.Option)v13));
    Object v15 = ((org.apache.commons.cli.OptionGroup)v11).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = true;
    ((org.apache.commons.cli.Option)v10).setRequired((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((org.apache.commons.cli.OptionGroup)v8).setSelected(((org.apache.commons.cli.Option)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    ((org.apache.commons.cli.OptionGroup)v11).setSelected(((org.apache.commons.cli.Option)v13));
    Object v14 = null;
    Object v15 = ((org.apache.commons.cli.OptionGroup)v11).getSelected();
    org.junit.Assert.assertEquals((Object)("\u0001"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = Character.valueOf((char)1);
    Object v18 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v17).charValue()));
    ((org.apache.commons.cli.OptionGroup)v16).setSelected(((org.apache.commons.cli.Option)v18));
    Object v19 = null;
    Object v20 = Character.valueOf((char)1);
    Object v21 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v20).charValue()));
    ((org.apache.commons.cli.OptionGroup)v16).setSelected(((org.apache.commons.cli.Option)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = ((org.apache.commons.cli.OptionGroup)v11).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = ((org.apache.commons.cli.OptionGroup)v16).getNames();
    Object v18 = ((org.apache.commons.cli.OptionGroup)v16).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = true;
    ((org.apache.commons.cli.OptionGroup)v8).setRequired((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = Character.valueOf((char)1);
    Object v18 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v17).charValue()));
    Object v19 = ((org.apache.commons.cli.Option)v18).hashCode();
    ((org.apache.commons.cli.OptionGroup)v16).setSelected(((org.apache.commons.cli.Option)v18));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = ((org.apache.commons.cli.OptionGroup)v16).getSelected();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = ((org.apache.commons.cli.OptionGroup)v16).getOptions();
    Object v18 = true;
    ((org.apache.commons.cli.OptionGroup)v16).setRequired((((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = ((org.apache.commons.cli.OptionGroup)v6).getOptions();
    Object v8 = Character.valueOf((char)1);
    Object v9 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v8).charValue()));
    ((org.apache.commons.cli.OptionGroup)v6).setSelected(((org.apache.commons.cli.Option)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = new org.apache.commons.cli.OptionGroup();
    Object v15 = Character.valueOf((char)1);
    Object v16 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v15).charValue()));
    Object v17 = ((org.apache.commons.cli.OptionGroup)v14).addOption(((org.apache.commons.cli.Option)v16));
    Object v18 = Character.valueOf((char)1);
    Object v19 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v18).charValue()));
    Object v20 = "-";
    ((org.apache.commons.cli.Option)v19).setDescription(((java.lang.String)v20));
    Object v21 = null;
    Object v22 = ((org.apache.commons.cli.OptionGroup)v17).addOption(((org.apache.commons.cli.Option)v19));
    Object v23 = ((org.apache.commons.cli.OptionGroup)v22).getNames();
    Object v24 = ((org.apache.commons.cli.Option)v13).equals(((java.lang.Object)v23));
    ((org.apache.commons.cli.OptionGroup)v11).setSelected(((org.apache.commons.cli.Option)v13));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = ((org.apache.commons.cli.OptionGroup)v6).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = ((org.apache.commons.cli.Option)v13).toString();
    Object v15 = ((org.apache.commons.cli.OptionGroup)v11).addOption(((org.apache.commons.cli.Option)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = Character.valueOf((char)1);
    Object v18 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v17).charValue()));
    Object v19 = "--";
    Object v20 = ((org.apache.commons.cli.Option)v18).getValue(((java.lang.String)v19));
    ((org.apache.commons.cli.OptionGroup)v16).setSelected(((org.apache.commons.cli.Option)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v5 = ((org.apache.commons.cli.OptionGroup)v4).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v5 = ((org.apache.commons.cli.OptionGroup)v4).getNames();
    Object v6 = Character.valueOf((char)1);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.cli.Option)v7).clone();
    ((org.apache.commons.cli.OptionGroup)v4).setSelected(((org.apache.commons.cli.Option)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = "-N-";
    ((org.apache.commons.cli.Option)v13).setArgName(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v13));
    Object v17 = ((org.apache.commons.cli.OptionGroup)v16).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = ((org.apache.commons.cli.OptionGroup)v6).getOptions();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v7 = ((org.apache.commons.cli.OptionGroup)v6).getNames();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = ((org.apache.commons.cli.Option)v13).toString();
    Object v15 = ((org.apache.commons.cli.OptionGroup)v11).addOption(((org.apache.commons.cli.Option)v13));
    Object v16 = ((org.apache.commons.cli.OptionGroup)v15).toString();
    org.junit.Assert.assertEquals((Object)("[-\u0001]"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = Character.valueOf((char)1);
    Object v13 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v12).charValue()));
    Object v14 = ((org.apache.commons.cli.Option)v13).toString();
    Object v15 = ((org.apache.commons.cli.OptionGroup)v11).addOption(((org.apache.commons.cli.Option)v13));
    Object v16 = Character.valueOf((char)1);
    Object v17 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v16).charValue()));
    ((org.apache.commons.cli.OptionGroup)v15).setSelected(((org.apache.commons.cli.Option)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.OptionGroup();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.OptionGroup)v0).addOption(((org.apache.commons.cli.Option)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v4).charValue()));
    Object v6 = "-";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.OptionGroup)v3).addOption(((org.apache.commons.cli.Option)v5));
    Object v9 = Character.valueOf((char)1);
    Object v10 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.cli.OptionGroup)v8).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = ((org.apache.commons.cli.OptionGroup)v11).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }
}
