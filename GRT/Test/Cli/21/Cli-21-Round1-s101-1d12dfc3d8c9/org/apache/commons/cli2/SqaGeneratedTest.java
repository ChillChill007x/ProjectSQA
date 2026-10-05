package org.apache.commons.cli2;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Option.(illegal.short.prefix";
    Object v9 = "Enum.illegal.value";
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addProperty(((java.lang.String)v8),((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = ((org.apache.commons.cli2.CommandLine)v7).getOptionTriggers();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "|";
    Object v13 = "URLValidator.malformed.URL";
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = ((org.apache.commons.cli2.CommandLine)v7).getProperties();
    Object v9 = "URLValidator.malformed.URL";
    Object v10 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "ArgumentBuilder.empty.nam_e";
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v8),((java.lang.Boolean)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((org.apache.commons.cli2.Option)v11));
    Object v13 = "Unexpected.token";
    Object v14 = ((org.apache.commons.cli2.CommandLine)v7).getOption(((java.lang.String)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    ((org.apache.commons.cli2.WriteableCommandLine)v7).setDefaultValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "\"";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " ";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getOptionCount(((org.apache.commons.cli2.Option)v11));
    Object v13 = "ClassValidator.class.ac6ess";
    Object v14 = "ArgumentBuilder.n";
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addProperty(((java.lang.String)v13),((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "-g-";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    Object v20 = "\"";
    Object v21 = ((org.apache.commons.cli2.CommandLine)v19).getValues(((java.lang.String)v20));
    ((org.apache.commons.cli2.WriteableCommandLine)v7).setDefaultValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Option.illegal.short.prefix";
    Object v9 = ((org.apache.commons.cli2.WriteableCommandLine)v7).looksLikeOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Missing.option";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getOptionCount(((java.lang.String)v8));
    Object v10 = "Unexpected.token";
    Object v11 = " (";
    Object v12 = " ";
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((java.lang.String)v10),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getParent();
    Object v13 = ((org.apache.commons.cli2.WriteableCommandLine)v7).getUndefaultedValues(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getId();
    Object v13 = "org(.apache.commons.cli2.resource.bundle";
    Object v14 = "Argument.unexpecteZ.value";
    Object v15 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)("Argument.unexpecteZ.value"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.cli2.WriteableCommandLine)v7).setCurrentOption(((org.apache.commons.cli2.Option)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Unexpected.token";
    Object v9 = ((org.apache.commons.cli2.WriteableCommandLine)v7).looksLikeOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Option.no.name";
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v8),((java.lang.Boolean)v9));
    Object v11 = "Option.illegal.short.prefix";
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Option.n";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((java.lang.String)v8));
    Object v10 = "CommaHd.preferredName.too.short";
    Object v11 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v11));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v16),((java.lang.Object)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = ((org.apache.commons.cli2.WriteableCommandLine)v7).getCurrentOption();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Switch.enabled.startsWith.disabled";
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8),((java.util.List)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    ((org.apache.commons.cli2.Option)v11).validate(((org.apache.commons.cli2.WriteableCommandLine)v19));
    Object v20 = null;
    Object v21 = "URLValidator.malformed.URL";
    Object v22 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Option.";
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v15));
    Object v17 = " (";
    Object v18 = " ";
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.cli2.Option)v20).getParent();
    Object v22 = ((org.apache.commons.cli2.WriteableCommandLine)v16).getUndefaultedValues(((org.apache.commons.cli2.Option)v20));
    Object v23 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((java.lang.String)v8),((java.lang.Object)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "-v";
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((java.lang.String)v8),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "Switch.disabled.startsWith.enabled";
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v14 = null;
    Object v15 = " (";
    Object v16 = " ";
    Object v17 = 0;
    Object v18 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = false;
    ((org.apache.commons.cli2.WriteableCommandLine)v7).setDefaultSwitch(((org.apache.commons.cli2.Option)v18),((java.lang.Boolean)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getProperties(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Switch.preferredName.too.short";
    Object v13 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = ((org.apache.commons.cli2.CommandLine)v7).getProperties();
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    Object v21 = " (";
    Object v22 = " ";
    Object v23 = 0;
    Object v24 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.apache.commons.cli2.CommandLine)v20).getValues(((org.apache.commons.cli2.Option)v24));
    Object v26 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((org.apache.commons.cli2.Option)v12),((java.util.List)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v16 = "-v";
    Object v17 = " (";
    Object v18 = " ";
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.cli2.CommandLine)v15).getValue(((java.lang.String)v16),((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((org.apache.commons.cli2.Option)v21));
    Object v23 = ((org.apache.commons.cli2.WriteableCommandLine)v7).getCurrentOption();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 66;
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    Object v21 = " (";
    Object v22 = " ";
    Object v23 = 0;
    Object v24 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.apache.commons.cli2.CommandLine)v20).getProperties(((org.apache.commons.cli2.Option)v24));
    Object v26 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v27 = ((org.apache.commons.cli2.Option)v11).helpLines((((java.lang.Integer)v12).intValue()),((java.util.Set)v25),((java.util.Comparator)v26));
    Object v28 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Option.illega";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "property";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getOption(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "--";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getOptionCount(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v16 = " (";
    Object v17 = " ";
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.cli2.CommandLine)v15).getValue(((org.apache.commons.cli2.Option)v19),((java.lang.Object)v23));
    Object v25 = " (";
    Object v26 = " ";
    Object v27 = 0;
    Object v28 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = java.util.List.of(((java.lang.Object)v29),((java.lang.Object)v30));
    Object v32 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v28),((java.util.List)v31));
    ((org.apache.commons.cli2.Option)v24).defaults(((org.apache.commons.cli2.WriteableCommandLine)v32));
    Object v33 = null;
    Object v34 = " (";
    Object v35 = " ";
    Object v36 = 0;
    Object v37 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v34),((java.lang.String)v35),(((java.lang.Integer)v36).intValue()));
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addValue(((org.apache.commons.cli2.Option)v24),((java.lang.Object)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v13 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = ((org.apache.commons.cli2.CommandLine)v7).getOptions();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "UnexQpected.token";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getOption(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v16 = " (";
    Object v17 = " ";
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.cli2.CommandLine)v15).getValue(((org.apache.commons.cli2.Option)v19),((java.lang.Object)v23));
    Object v25 = " (";
    Object v26 = " ";
    Object v27 = 0;
    Object v28 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = java.util.List.of(((java.lang.Object)v29),((java.lang.Object)v30));
    Object v32 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v28),((java.util.List)v31));
    ((org.apache.commons.cli2.Option)v24).validate(((org.apache.commons.cli2.WriteableCommandLine)v32));
    Object v33 = null;
    Object v34 = false;
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addSwitch(((org.apache.commons.cli2.Option)v24),(((java.lang.Boolean)v34).booleanValue()));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "URLValidator.malformed.URL";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getOptionCount(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Argument.too.many.values";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Unexpected.token";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getOption(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.cli2.CommandLine)v7).getOptions();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addOption(((org.apache.commons.cli2.Option)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "U`expected.token";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((java.lang.String)v8));
    Object v10 = " g(";
    Object v11 = true;
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v10),((java.lang.Boolean)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Cannot.burst";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    ((org.apache.commons.cli2.Option)v11).validate(((org.apache.commons.cli2.WriteableCommandLine)v19));
    Object v20 = null;
    Object v21 = "Unexpected.token";
    Object v22 = "SourceDest.must.enforcevalues";
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v21),((java.lang.String)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v16 = ((org.apache.commons.cli2.WriteableCommandLine)v15).getCurrentOption();
    Object v17 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getPreferredName();
    Object v13 = "";
    Object v14 = "Argument.missing.values";
    Object v15 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)("Argument.missing.values"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v11),((java.lang.Boolean)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v16 = " (";
    Object v17 = " ";
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.cli2.CommandLine)v15).getValue(((org.apache.commons.cli2.Option)v19),((java.lang.Object)v23));
    Object v25 = "]";
    Object v26 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v24),((java.lang.String)v25));
    Object v27 = " (";
    Object v28 = " ";
    Object v29 = 0;
    Object v30 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v27),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "";
    Object v13 = "-";
    Object v14 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = " (";
    Object v16 = " ";
    Object v17 = 0;
    Object v18 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "ClassValidator.class.create";
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v8),((java.lang.Boolean)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Enum.illegal.value";
    Object v13 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "-9-";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "vrue";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "--";
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v8),((java.lang.Boolean)v9));
    Object v11 = " (";
    Object v12 = " ";
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = java.util.List.of(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v14),((java.util.List)v17));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = " (";
    Object v24 = " ";
    Object v25 = 0;
    Object v26 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.cli2.CommandLine)v18).getValue(((org.apache.commons.cli2.Option)v22),((java.lang.Object)v26));
    Object v28 = ((org.apache.commons.cli2.CommandLine)v7).getOptionCount(((org.apache.commons.cli2.Option)v27));
    org.junit.Assert.assertEquals((Object)(0), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Argument.missing.values";
    Object v13 = "-";
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    ((org.apache.commons.cli2.WriteableCommandLine)v7).setDefaultSwitch(((org.apache.commons.cli2.Option)v11),((java.lang.Boolean)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "argT";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addSwitch(((org.apache.commons.cli2.Option)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Command.preferredName.too.short";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Unexpected.token";
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v8),((java.lang.Boolean)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v16 = ((org.apache.commons.cli2.WriteableCommandLine)v15).getCurrentOption();
    ((org.apache.commons.cli2.WriteableCommandLine)v7).setCurrentOption(((org.apache.commons.cli2.Option)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getPrefixes();
    Object v13 = ((org.apache.commons.cli2.CommandLine)v7).getProperties(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "ArgumentBuilder.null.defaul";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((java.lang.String)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = " (";
    Object v16 = " ";
    Object v17 = 0;
    Object v18 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v18),((java.util.List)v21));
    Object v23 = " (";
    Object v24 = " ";
    Object v25 = 0;
    Object v26 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.cli2.CommandLine)v22).getProperties(((org.apache.commons.cli2.Option)v26));
    Object v28 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v29 = ((org.apache.commons.cli2.Option)v13).helpLines((((java.lang.Integer)v14).intValue()),((java.util.Set)v27),((java.util.Comparator)v28));
    Object v30 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v13));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((org.apache.commons.cli2.Option)v11));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = false;
    Object v18 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v16),((java.lang.Boolean)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "ArgumentBuilder.negative.maximum";
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v15));
    Object v17 = " (";
    Object v18 = " ";
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.cli2.CommandLine)v16).getValues(((org.apache.commons.cli2.Option)v20));
    Object v22 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8),((java.util.List)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Unexpected.token";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addSwitch(((org.apache.commons.cli2.Option)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    Object v20 = "OpZion.illegal.disabled.prefix";
    Object v21 = ((org.apache.commons.cli2.Option)v11).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v19),((java.lang.String)v20));
    Object v22 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getPreferredName();
    Object v13 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = ((org.apache.commons.cli2.CommandLine)v7).getProperties();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getDescription();
    Object v13 = "SourcKeDest.must.enforce.values";
    Object v14 = "SourceDest.must.enforce.values";
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v13),((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "-";
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v15));
    Object v17 = ((org.apache.commons.cli2.CommandLine)v16).getProperties();
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = " (";
    Object v23 = " ";
    Object v24 = 0;
    Object v25 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v27 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v28 = java.util.List.of(((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v25),((java.util.List)v28));
    Object v30 = " (";
    Object v31 = " ";
    Object v32 = 0;
    Object v33 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()));
    Object v34 = ((org.apache.commons.cli2.CommandLine)v29).getValues(((org.apache.commons.cli2.Option)v33));
    Object v35 = ((org.apache.commons.cli2.CommandLine)v16).getValues(((org.apache.commons.cli2.Option)v21),((java.util.List)v34));
    Object v36 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8),((java.util.List)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v16 = ((org.apache.commons.cli2.WriteableCommandLine)v15).getCurrentOption();
    Object v17 = true;
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addSwitch(((org.apache.commons.cli2.Option)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "DateValidator.date.OutOfRange";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Switch.no.enabledPrefix";
    Object v13 = "Unexpected.to_ken";
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Unexpected.token";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = " (";
    Object v23 = " ";
    Object v24 = 0;
    Object v25 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.cli2.CommandLine)v17).getValue(((org.apache.commons.cli2.Option)v21),((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "+";
    Object v13 = ", ";
    Object v14 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v11),((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(", "), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Switch.already.set";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8));
    Object v10 = "nexpected.token";
    Object v11 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    Object v20 = "ClassValidator.class.create";
    Object v21 = true;
    Object v22 = ((org.apache.commons.cli2.CommandLine)v19).getSwitch(((java.lang.String)v20),((java.lang.Boolean)v21));
    Object v23 = ((org.apache.commons.cli2.CommandLine)v7).getValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v22));
    Object v24 = " (";
    Object v25 = " ";
    Object v26 = 0;
    Object v27 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v24),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = "URLValidator.malfrmed.URL";
    Object v29 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((org.apache.commons.cli2.Option)v27),((java.lang.String)v28));
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v16 = " (";
    Object v17 = " ";
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.cli2.CommandLine)v15).getValue(((org.apache.commons.cli2.Option)v19),((java.lang.Object)v23));
    Object v25 = false;
    ((org.apache.commons.cli2.WriteableCommandLine)v7).addSwitch(((org.apache.commons.cli2.Option)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    Object v20 = "Option.";
    Object v21 = " (";
    Object v22 = " ";
    Object v23 = 0;
    Object v24 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v26 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v27 = java.util.List.of(((java.lang.Object)v25),((java.lang.Object)v26));
    Object v28 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v24),((java.util.List)v27));
    Object v29 = " (";
    Object v30 = " ";
    Object v31 = 0;
    Object v32 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v29),((java.lang.String)v30),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((org.apache.commons.cli2.Option)v32).getParent();
    Object v34 = ((org.apache.commons.cli2.WriteableCommandLine)v28).getUndefaultedValues(((org.apache.commons.cli2.Option)v32));
    Object v35 = ((org.apache.commons.cli2.CommandLine)v19).getValue(((java.lang.String)v20),((java.lang.Object)v34));
    ((org.apache.commons.cli2.WriteableCommandLine)v7).setDefaultValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Une";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getProperty(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).isRequired();
    Object v13 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.cli2.Option)v11).setParent(((org.apache.commons.cli2.Option)v15));
    Object v16 = null;
    Object v17 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.cli2.Option)v11).setParent(((org.apache.commons.cli2.Option)v15));
    Object v16 = null;
    Object v17 = ((org.apache.commons.cli2.CommandLine)v7).getOptionCount(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).getProperties(((org.apache.commons.cli2.Option)v11));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = true;
    Object v18 = ((org.apache.commons.cli2.CommandLine)v7).getSwitch(((org.apache.commons.cli2.Option)v16),((java.lang.Boolean)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    ((org.apache.commons.cli2.WriteableCommandLine)v7).setDefaultSwitch(((org.apache.commons.cli2.Option)v11),((java.lang.Boolean)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "NumberValidator.number.OutOfRange";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getOption(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = "Switch.no.disabledPrefix";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    Object v20 = "Unexpected.token";
    Object v21 = ((org.apache.commons.cli2.CommandLine)v19).getValues(((java.lang.String)v20));
    Object v22 = ((org.apache.commons.cli2.CommandLine)v7).getValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v21));
    org.junit.Assert.assertNotNull(v22);
  }
}
