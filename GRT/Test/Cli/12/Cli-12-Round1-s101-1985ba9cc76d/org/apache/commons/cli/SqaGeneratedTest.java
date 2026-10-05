package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Unable "," ","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"[",""};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = java.io.Reader.nullReader();
    ((java.util.Properties)v3).load(((java.io.Reader)v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--","--"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)2);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{};
    Object v6 = new java.util.Properties();
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),((java.util.Properties)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)2);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{};
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)2);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"--","-","--7"};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" :: ","-"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = Character.valueOf((char)2);
    Object v8 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v7).charValue()));
    Object v9 = ((org.apache.commons.cli.Options)v6).addOption(((org.apache.commons.cli.Option)v8));
    Object v10 = new java.lang.String[]{"--"};
    Object v11 = new java.util.Properties();
    Object v12 = false;
    Object v13 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v10),((java.util.Properties)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-z","-Q-"," @]"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"'","--E","["};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{};
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = new java.util.Properties();
    Object v4 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)1)};
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = new java.io.ByteArrayInputStream(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((java.util.Properties)v3).load(((java.io.InputStream)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","",","};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new org.apache.commons.cli.OptionGroup();
    Object v6 = ((org.apache.commons.cli.Options)v4).addOptionGroup(((org.apache.commons.cli.OptionGroup)v5));
    Object v7 = new java.lang.String[]{};
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v4),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"`[","Q",""};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"7","--"};
    Object v8 = new java.util.Properties();
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--","--"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "--";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"-]"};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","arg"};
    Object v3 = new java.util.Properties();
    Object v4 = ((java.util.Properties)v3).elements();
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = ((org.apache.commons.cli.Options)v5).toString();
    Object v7 = new java.lang.String[]{""};
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Cannot add value, list full."};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","'"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"-",":"};
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((java.util.Properties)v3).elements();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"illegal option value '"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","","-"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = "arg";
    Object v7 = "arg";
    Object v8 = false;
    Object v9 = " ";
    Object v10 = ((org.apache.commons.cli.Options)v5).addOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{";arg",", "};
    Object v12 = true;
    Object v13 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"]"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "arj";
    Object v3 = false;
    Object v4 = "\"";
    Object v5 = ((org.apache.commons.cli.Options)v1).addOption(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.String)v4));
    Object v6 = new java.lang.String[]{"-","-B","p-"};
    Object v7 = new java.util.Properties();
    Object v8 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)1)};
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = new java.io.ByteArrayInputStream(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.Properties)v7).containsKey(((java.lang.Object)v11));
    Object v13 = false;
    Object v14 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v13).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"-`"};
    Object v5 = new java.util.Properties();
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"K>",">"};
    Object v8 = new java.util.Properties();
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"--"};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-_","-","-"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"--","--"};
    Object v8 = new java.util.Properties();
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"[+"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Unrecognized oNtion: ","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "@";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{" ","InstantiationExcepion; Unable to create: "};
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-",","};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = new java.util.Properties();
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = Character.valueOf((char)2);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.cli.Options)v5).getOptionGroup(((org.apache.commons.cli.Option)v7));
    Object v9 = new java.lang.String[]{"-:","--"};
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-O";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"","--"};
    Object v5 = new java.util.Properties();
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"arg","1"};
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-["};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"y","--."};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = new java.util.Properties();
    Object v8 = new org.apache.commons.cli.BasicParser();
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = new java.lang.String[]{};
    Object v11 = ((org.apache.commons.cli.Parser)v8).parse(((org.apache.commons.cli.Options)v9),((java.lang.String[])v10));
    Object v12 = java.util.function.Function.identity();
    Object v13 = ((java.util.Properties)v7).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v14 = true;
    Object v15 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = Character.valueOf((char)2);
    Object v2 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v1).charValue()));
    Object v3 = null;
    ((org.apache.commons.cli.Parser)v0).processArgs(((org.apache.commons.cli.Option)v2),((java.util.ListIterator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"]","arg'",""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = "9-";
    Object v6 = ((org.apache.commons.cli.Options)v4).hasOption(((java.lang.String)v5));
    Object v7 = new java.lang.String[]{"-","-"};
    Object v8 = new java.util.Properties();
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)2);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"R-"};
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = Character.valueOf((char)2);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.cli.Options)v5).getOptionGroup(((org.apache.commons.cli.Option)v7));
    Object v9 = new java.lang.String[]{"-2","--","-"};
    Object v10 = new java.util.Properties();
    Object v11 = new org.apache.commons.cli.BasicParser();
    Object v12 = ((java.util.Properties)v10).contains(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v9),((java.util.Properties)v10));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"arg","-"};
    Object v3 = new java.util.Properties();
    Object v4 = new org.apache.commons.cli.BasicParser();
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"--","-"};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v4).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.cli.Options();
    Object v10 = new java.lang.String[]{" ","InstantiationExcepion; Unable to create: "};
    Object v11 = ((org.apache.commons.cli.Parser)v4).parse(((org.apache.commons.cli.Options)v9),((java.lang.String[])v10));
    Object v12 = new org.apache.commons.cli.GnuParser();
    Object v13 = new org.apache.commons.cli.Options();
    Object v14 = Character.valueOf((char)2);
    Object v15 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v14).charValue()));
    Object v16 = ((org.apache.commons.cli.Options)v13).getOptionGroup(((org.apache.commons.cli.Option)v15));
    Object v17 = new java.lang.String[]{"R-"};
    Object v18 = true;
    Object v19 = ((org.apache.commons.cli.GnuParser)v12).flatten(((org.apache.commons.cli.Options)v13),((java.lang.String[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((java.util.Properties)v3).getOrDefault(((java.lang.Object)v11),((java.lang.Object)v19));
    Object v21 = true;
    Object v22 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-",""};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{};
    Object v8 = new java.util.Properties();
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","ar"};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new org.apache.commons.cli.OptionGroup();
    Object v7 = ((org.apache.commons.cli.Options)v5).addOptionGroup(((org.apache.commons.cli.OptionGroup)v6));
    Object v8 = new java.lang.String[]{"","an option from this group has already been sele)ted: '"};
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = Character.valueOf((char)2);
    Object v7 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.cli.Options)v5).addOption(((org.apache.commons.cli.Option)v7));
    Object v9 = new java.lang.String[]{};
    Object v10 = new java.util.Properties();
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v9),((java.util.Properties)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-L";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"ar",""};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"[ option: ","-","arg"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"Not yet implemened","b-"};
    Object v7 = new java.util.Properties();
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" "};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "[ O";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"--","-","d"};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"[","s"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "arg";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = new java.util.Properties();
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = " ::";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{", U",">","-"};
    Object v5 = new java.util.Properties();
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = "'";
    ((java.util.Properties)v5).storeToXML(((java.io.OutputStream)v6),((java.lang.String)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--"};
    Object v3 = new java.util.Properties();
    Object v4 = ((java.util.Properties)v3).values();
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"E-","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)2);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"Unable to find: ","","-"};
    Object v6 = new java.util.Properties();
    Object v7 = ((java.util.Properties)v6).entrySet();
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--","-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"-","-"};
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","--"};
    Object v3 = new java.util.Properties();
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"F-","--","-/"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"a@rg","\""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-,-","--","--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{", J","--","-"};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","Y-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{};
    Object v6 = new java.util.Properties();
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{", "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"-"," "};
    Object v7 = new java.util.Properties();
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "arg";
    Object v3 = false;
    Object v4 = "";
    Object v5 = ((org.apache.commons.cli.Options)v1).addOption(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.String)v4));
    Object v6 = new java.lang.String[]{"arg","C--"};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = Character.valueOf((char)2);
    Object v3 = org.apache.commons.cli.OptionBuilder.create((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v3));
    Object v5 = new java.lang.String[]{"-"," ",""};
    Object v6 = new java.util.Properties();
    Object v7 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)1)};
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.apache.commons.cli.GnuParser();
    Object v12 = new org.apache.commons.cli.Options();
    Object v13 = new java.lang.String[]{""};
    Object v14 = true;
    Object v15 = ((org.apache.commons.cli.GnuParser)v11).flatten(((org.apache.commons.cli.Options)v12),((java.lang.String[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((java.util.Properties)v6).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v15));
    Object v17 = true;
    Object v18 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v5),((java.util.Properties)v6),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"Unable to parse: ","-"};
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "-[";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"-","-","R-"};
    Object v5 = new java.util.Properties();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" <"," ?[ARG]","-"};
    Object v3 = new java.util.Properties();
    Object v4 = false;
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"["};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli.GnuParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"'","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.GnuParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).toString();
    Object v3 = new java.lang.String[]{" :: "};
    Object v4 = new java.util.Properties();
    Object v5 = "Unable to find: ";
    Object v6 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v5));
    Object v7 = new java.io.PrintWriter(((java.io.File)v6));
    ((java.util.Properties)v4).list(((java.io.PrintWriter)v7));
    Object v8 = null;
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v4),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.BasicParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{""};
    Object v3 = new java.util.Properties();
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v3));
    org.junit.Assert.assertNotNull(v4);
  }
}
