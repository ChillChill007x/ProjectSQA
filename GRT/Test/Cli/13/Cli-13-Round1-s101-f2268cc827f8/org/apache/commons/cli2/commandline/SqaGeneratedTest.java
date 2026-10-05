package org.apache.commons.cli2.commandline;
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
    Object v9 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).looksLikeOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).setDefaultSwitch(((org.apache.commons.cli2.Option)v11),((java.lang.Boolean)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
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
    Object v8 = "ArgumentBuilder";
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v15));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((java.lang.String)v8),((java.lang.Object)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getOptionCount(((org.apache.commons.cli2.Option)v21));
    org.junit.Assert.assertEquals((Object)(0), v22);
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
    Object v8 = "true";
    Object v9 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValues(((java.lang.String)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getUndefaultedValues(((org.apache.commons.cli2.Option)v13));
    org.junit.Assert.assertNotNull(v14);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getTriggers();
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addOption(((org.apache.commons.cli2.Option)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
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
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).setDefaultValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
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
    Object v12 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getUndefaultedValues(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v12);
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
    Object v8 = "Option.trig";
    Object v9 = "HelpFormatter.gutter.toE.long";
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addProperty(((java.lang.String)v8),((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
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
    Object v12 = ((org.apache.commons.cli2.Option)v11).isRequired();
    Object v13 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getUndefaultedValues(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v13);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getOptionCount(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertEquals((Object)(0), v12);
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
    Object v12 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getSwitch(((org.apache.commons.cli2.Option)v11));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = 26;
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.Set.of(((java.lang.Object)v21));
    Object v23 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v24 = ((org.apache.commons.cli2.Option)v16).helpLines((((java.lang.Integer)v17).intValue()),((java.util.Set)v22),((java.util.Comparator)v23));
    Object v25 = " (";
    Object v26 = " ";
    Object v27 = 0;
    Object v28 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = java.util.Set.of(((java.lang.Object)v28));
    Object v30 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((org.apache.commons.cli2.Option)v16),((java.lang.Object)v29));
    org.junit.Assert.assertNotNull(v30);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getDescription();
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
    Object v25 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v20).getUndefaultedValues(((org.apache.commons.cli2.Option)v24));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).setDefaultValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
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
    Object v12 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValues(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNotNull(v12);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    org.junit.Assert.assertNotNull(v15);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getSwitch(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertNull(v12);
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
    Object v12 = ((org.apache.commons.cli2.CommandLine)v7).hasOption(((org.apache.commons.cli2.Option)v11));
    Object v13 = "[";
    Object v14 = true;
    Object v15 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getSwitch(((java.lang.String)v13),((java.lang.Boolean)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
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
    Object v8 = "";
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((java.lang.String)v8),((java.lang.Object)v12));
    Object v14 = "-";
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = java.util.List.of(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = ((java.util.List)v17).listIterator();
    Object v19 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValues(((java.lang.String)v14),((java.util.List)v17));
    org.junit.Assert.assertNotNull(v19);
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
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Set.of(((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
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
    Object v12 = ((org.apache.commons.cli2.Option)v11).getDescription();
    Object v13 = true;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addSwitch(((org.apache.commons.cli2.Option)v11),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
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
    Object v21 = false;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).setDefaultSwitch(((org.apache.commons.cli2.Option)v11),((java.lang.Boolean)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
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
    Object v8 = "Unexpected.token";
    Object v9 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).looksLikeOption(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v5 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v6 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v6));
    Object v8 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).toString();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
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
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    ((org.apache.commons.cli2.Option)v11).defaults(((org.apache.commons.cli2.WriteableCommandLine)v19));
    Object v20 = null;
    Object v21 = false;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addSwitch(((org.apache.commons.cli2.Option)v11),(((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
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
    ((org.apache.commons.cli2.Option)v11).defaults(((org.apache.commons.cli2.WriteableCommandLine)v19));
    Object v20 = null;
    Object v21 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getOptionCount(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertEquals((Object)(0), v21);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((org.apache.commons.cli2.Option)v11));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addOption(((org.apache.commons.cli2.Option)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
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
    Object v8 = "Option.missing.required";
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
    Object v21 = " (";
    Object v22 = " ";
    Object v23 = 0;
    Object v24 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = java.util.Set.of(((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v16).getValue(((org.apache.commons.cli2.Option)v20),((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((java.lang.String)v8),((java.lang.Object)v26));
    org.junit.Assert.assertNotNull(v27);
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
    Object v8 = "7";
    Object v9 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValues(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
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
    Object v8 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getOptionTriggers();
    org.junit.Assert.assertNotNull(v8);
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
    Object v8 = "Argument.too.few.Cefaults";
    Object v9 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getSwitch(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
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
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    Object v20 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v19).getOptionTriggers();
    Object v21 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v20));
    org.junit.Assert.assertNotNull(v21);
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
    Object v12 = false;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addSwitch(((org.apache.commons.cli2.Option)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
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
    Object v8 = "1";
    Object v9 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getSwitch(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
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
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v19).getUndefaultedValues(((org.apache.commons.cli2.Option)v23));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).setDefaultValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Unexpected.token";
    Object v13 = new java.lang.StringBuffer(((java.lang.String)v12));
    Object v14 = " (";
    Object v15 = " ";
    Object v16 = 0;
    Object v17 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.Set.of(((java.lang.Object)v17));
    Object v19 = org.apache.commons.cli2.util.Comparators.requiredLast();
    ((org.apache.commons.cli2.Option)v11).appendUsage(((java.lang.StringBuffer)v13),((java.util.Set)v18),((java.util.Comparator)v19));
    Object v20 = null;
    Object v21 = true;
    Object v22 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getSwitch(((org.apache.commons.cli2.Option)v11),((java.lang.Boolean)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).setDefaultValues(((org.apache.commons.cli2.Option)v21),((java.util.List)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getTriggers();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = true;
    Object v23 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getSwitch(((org.apache.commons.cli2.Option)v21),((java.lang.Boolean)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
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
    Object v12 = true;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addSwitch(((org.apache.commons.cli2.Option)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "-";
    Object v19 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getProperty(((java.lang.String)v18));
    org.junit.Assert.assertNull(v19);
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
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addOption(((org.apache.commons.cli2.Option)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getNormalised();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getUndefaultedValues(((org.apache.commons.cli2.Option)v21));
    Object v23 = "Command.preferredName.too.short";
    Object v24 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).looksLikeOption(((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "Argument.missing.values";
    Object v19 = true;
    Object v20 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getSwitch(((java.lang.String)v18),((java.lang.Boolean)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "Option.missing";
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getValue(((java.lang.String)v18),((java.lang.Object)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getValues(((org.apache.commons.cli2.Option)v21));
    Object v23 = " (";
    Object v24 = " ";
    Object v25 = 0;
    Object v26 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).setDefaultSwitch(((org.apache.commons.cli2.Option)v26),((java.lang.Boolean)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
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
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v19).addOption(((org.apache.commons.cli2.Option)v23));
    Object v24 = null;
    Object v25 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v19).getNormalised();
    Object v26 = ((java.util.Collection)v25).parallelStream();
    Object v27 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v25));
    org.junit.Assert.assertNotNull(v27);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getSwitch(((org.apache.commons.cli2.Option)v11));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getOptionCount(((org.apache.commons.cli2.Option)v16));
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.Option)v21).getId();
    Object v23 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getUndefaultedValues(((org.apache.commons.cli2.Option)v21));
    org.junit.Assert.assertNotNull(v23);
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
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addOption(((org.apache.commons.cli2.Option)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "Unexpected";
    Object v19 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getOption(((java.lang.String)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "Option.missing.required";
    Object v19 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getValue(((java.lang.String)v18));
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = false;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).setDefaultSwitch(((org.apache.commons.cli2.Option)v23),((java.lang.Boolean)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "-";
    Object v19 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).looksLikeOption(((java.lang.String)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
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
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v18));
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = " (";
    Object v25 = " ";
    Object v26 = 0;
    Object v27 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v24),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v29 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v30 = java.util.List.of(((java.lang.Object)v28),((java.lang.Object)v29));
    Object v31 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v27),((java.util.List)v30));
    ((org.apache.commons.cli2.Option)v23).defaults(((org.apache.commons.cli2.WriteableCommandLine)v31));
    Object v32 = null;
    Object v33 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v19).getOptionCount(((org.apache.commons.cli2.Option)v23));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).addValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).hasOption(((org.apache.commons.cli2.Option)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getValues(((org.apache.commons.cli2.Option)v21),((java.util.List)v24));
    Object v26 = " (";
    Object v27 = " ";
    Object v28 = 0;
    Object v29 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = true;
    Object v31 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getSwitch(((org.apache.commons.cli2.Option)v29),((java.lang.Boolean)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "Command.preferredName.too.short";
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getValue(((java.lang.String)v18),((java.lang.Object)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).toString();
    org.junit.Assert.assertEquals((Object)(""), v18);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getSwitch(((org.apache.commons.cli2.Option)v11),((java.lang.Boolean)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "    ";
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = ((java.util.Collection)v21).stream();
    Object v23 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getValues(((java.lang.String)v18),((java.util.List)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = " (";
    Object v23 = " ";
    Object v24 = 0;
    Object v25 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).addValue(((org.apache.commons.cli2.Option)v21),((java.lang.Object)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
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
    Object v8 = ((org.apache.commons.cli2.CommandLine)v7).getOptions();
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.Option)v12).isRequired();
    Object v14 = " (";
    Object v15 = " ";
    Object v16 = 0;
    Object v17 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = java.util.List.of(((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v17),((java.util.List)v20));
    Object v22 = " (";
    Object v23 = " ";
    Object v24 = 0;
    Object v25 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v21).getOptionCount(((org.apache.commons.cli2.Option)v25));
    Object v27 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((org.apache.commons.cli2.Option)v12),((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(0), v27);
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
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v19).getUndefaultedValues(((org.apache.commons.cli2.Option)v23));
    Object v25 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v24));
    org.junit.Assert.assertNotNull(v25);
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
    Object v8 = "HelpFormatter.width.too.narVrow";
    Object v9 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).looksLikeOption(((java.lang.String)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = " (";
    Object v15 = " ";
    Object v16 = 0;
    Object v17 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v21),((java.util.List)v24));
    Object v26 = " (";
    Object v27 = " ";
    Object v28 = 0;
    Object v29 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v25).getValues(((org.apache.commons.cli2.Option)v29));
    Object v31 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v17),((java.util.List)v30));
    Object v32 = " (";
    Object v33 = " ";
    Object v34 = 0;
    Object v35 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v32),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((org.apache.commons.cli2.Option)v35).getId();
    Object v37 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v31).getUndefaultedValues(((org.apache.commons.cli2.Option)v35));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).setDefaultValues(((org.apache.commons.cli2.Option)v13),((java.util.List)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = 32;
    Object v23 = " (";
    Object v24 = " ";
    Object v25 = 0;
    Object v26 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v28 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v29 = java.util.List.of(((java.lang.Object)v27),((java.lang.Object)v28));
    Object v30 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v26),((java.util.List)v29));
    Object v31 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v30).getOptionTriggers();
    Object v32 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v33 = ((org.apache.commons.cli2.Option)v21).helpLines((((java.lang.Integer)v22).intValue()),((java.util.Set)v31),((java.util.Comparator)v32));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).addOption(((org.apache.commons.cli2.Option)v21));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getTriggers();
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "DISPLAY_PARENT_CHILDREN";
    Object v19 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getOption(((java.lang.String)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = true;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).addSwitch(((org.apache.commons.cli2.Option)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
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
    Object v8 = "H";
    Object v9 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getOptionCount(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(0), v9);
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
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = " (";
    Object v17 = " ";
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = java.util.List.of(((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v19),((java.util.List)v22));
    Object v24 = " (";
    Object v25 = " ";
    Object v26 = 0;
    Object v27 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v24),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v23).getValues(((org.apache.commons.cli2.Option)v27));
    Object v29 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v28));
    Object v30 = "ArgumentBuilder.null.name";
    Object v31 = ((org.apache.commons.cli2.Option)v11).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v29),((java.lang.String)v30));
    Object v32 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v33 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v34 = java.util.List.of(((java.lang.Object)v32),((java.lang.Object)v33));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).setDefaultValues(((org.apache.commons.cli2.Option)v11),((java.util.List)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getSwitch(((org.apache.commons.cli2.Option)v21));
    Object v23 = "Unexpected.token";
    Object v24 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getValue(((java.lang.String)v23));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v21),((java.util.List)v24));
    Object v26 = " (";
    Object v27 = " ";
    Object v28 = 0;
    Object v29 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((org.apache.commons.cli2.Option)v29).getTriggers();
    Object v31 = " (";
    Object v32 = " ";
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v31),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v25).getValue(((org.apache.commons.cli2.Option)v29),((java.lang.Object)v34));
    Object v36 = false;
    Object v37 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getSwitch(((org.apache.commons.cli2.Option)v35),((java.lang.Boolean)v36));
    org.junit.Assert.assertEquals((Object)(false), v37);
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
    Object v12 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((org.apache.commons.cli2.Option)v11));
    Object v13 = "Unexpected.token";
    Object v14 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).looksLikeOption(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v21),((java.util.List)v24));
    Object v26 = " (";
    Object v27 = " ";
    Object v28 = 0;
    Object v29 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((org.apache.commons.cli2.Option)v29).getTriggers();
    Object v31 = " (";
    Object v32 = " ";
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v31),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v25).getValue(((org.apache.commons.cli2.Option)v29),((java.lang.Object)v34));
    Object v36 = false;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).addSwitch(((org.apache.commons.cli2.Option)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "Unexpected.token";
    Object v19 = "Unexpected.token";
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).addProperty(((java.lang.String)v18),((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getValues(((org.apache.commons.cli2.Option)v21),((java.util.List)v24));
    org.junit.Assert.assertNotNull(v25);
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
    Object v8 = "aDrg";
    Object v9 = ((org.apache.commons.cli2.CommandLine)v7).getOption(((java.lang.String)v8));
    Object v10 = "Unexpected.toke5";
    Object v11 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).hasOption(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getProperties();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "Unexected.token";
    Object v19 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).hasOption(((java.lang.String)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
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
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValue(((org.apache.commons.cli2.Option)v11),((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.Option)v21).getPrefixes();
    Object v23 = false;
    Object v24 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getSwitch(((org.apache.commons.cli2.Option)v21),((java.lang.Boolean)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).addOption(((org.apache.commons.cli2.Option)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.Option)v11).getPreferredName();
    Object v13 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getOptionCount(((org.apache.commons.cli2.Option)v11));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getUndefaultedValues(((org.apache.commons.cli2.Option)v21));
    org.junit.Assert.assertNotNull(v22);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getSwitch(((org.apache.commons.cli2.Option)v11),((java.lang.Boolean)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getUndefaultedValues(((org.apache.commons.cli2.Option)v21));
    Object v23 = " (";
    Object v24 = " ";
    Object v25 = 0;
    Object v26 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getUndefaultedValues(((org.apache.commons.cli2.Option)v26));
    org.junit.Assert.assertNotNull(v27);
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
    Object v8 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getOptions();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = "true";
    Object v19 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).looksLikeOption(((java.lang.String)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = "";
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValue(((java.lang.String)v12),((java.lang.Object)v16));
    Object v18 = "-";
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = ((java.util.List)v21).listIterator();
    Object v23 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((java.lang.String)v18),((java.util.List)v21));
    Object v24 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getOptionCount(((org.apache.commons.cli2.Option)v21));
    org.junit.Assert.assertEquals((Object)(0), v22);
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
    Object v8 = "ClassValidator.class";
    Object v9 = "@";
    Object v10 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getProperty(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("@"), v10);
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
    Object v8 = "";
    Object v9 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getProperty(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = "";
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValue(((java.lang.String)v12),((java.lang.Object)v16));
    Object v18 = "-";
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = ((java.util.List)v21).listIterator();
    Object v23 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((java.lang.String)v18),((java.util.List)v21));
    Object v24 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v23));
    Object v25 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v24).toString();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = "";
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValue(((java.lang.String)v12),((java.lang.Object)v16));
    Object v18 = "-";
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = ((java.util.List)v21).listIterator();
    Object v23 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((java.lang.String)v18),((java.util.List)v21));
    Object v24 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v23));
    Object v25 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v24).getOptionTriggers();
    Object v26 = " (";
    Object v27 = " ";
    Object v28 = 0;
    Object v29 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((org.apache.commons.cli2.Option)v29).getPreferredName();
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v24).addOption(((org.apache.commons.cli2.Option)v29));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = "";
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValue(((java.lang.String)v12),((java.lang.Object)v16));
    Object v18 = "-";
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = ((java.util.List)v21).listIterator();
    Object v23 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((java.lang.String)v18),((java.util.List)v21));
    Object v24 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v23));
    Object v25 = "Option.missing.required";
    Object v26 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v24).looksLikeOption(((java.lang.String)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = "";
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValue(((java.lang.String)v12),((java.lang.Object)v16));
    Object v18 = "-";
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = ((java.util.List)v21).listIterator();
    Object v23 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((java.lang.String)v18),((java.util.List)v21));
    Object v24 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v23));
    Object v25 = " (";
    Object v26 = " ";
    Object v27 = 0;
    Object v28 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()));
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v24).addOption(((org.apache.commons.cli2.Option)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = false;
    Object v23 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).getSwitch(((org.apache.commons.cli2.Option)v21),((java.lang.Boolean)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = " (";
    Object v23 = " ";
    Object v24 = 0;
    Object v25 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = java.util.Set.of(((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v17).getValue(((org.apache.commons.cli2.Option)v21),((java.lang.Object)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v11).getValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v3),((java.util.List)v16));
    Object v18 = " (";
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = true;
    ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v17).setDefaultSwitch(((org.apache.commons.cli2.Option)v21),((java.lang.Boolean)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
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
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v19).getValues(((org.apache.commons.cli2.Option)v23));
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v24));
    Object v26 = "Command.preferredName.too.short";
    Object v27 = " (";
    Object v28 = " ";
    Object v29 = 0;
    Object v30 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v27),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v25).getValue(((java.lang.String)v26),((java.lang.Object)v30));
    Object v32 = ((org.apache.commons.cli2.commandline.CommandLineImpl)v7).getValues(((org.apache.commons.cli2.Option)v31));
    Object v33 = " (";
    Object v34 = " ";
    Object v35 = 0;
    Object v36 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v33),((java.lang.String)v34),(((java.lang.Integer)v35).intValue()));
    Object v37 = false;
    Object v38 = ((org.apache.commons.cli2.commandline.WriteableCommandLineImpl)v7).getSwitch(((org.apache.commons.cli2.Option)v36),((java.lang.Boolean)v37));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }
}
