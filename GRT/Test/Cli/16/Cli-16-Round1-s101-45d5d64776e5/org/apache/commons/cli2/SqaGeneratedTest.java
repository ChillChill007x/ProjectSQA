package org.apache.commons.cli2;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.util.HashSet();
    Object v6 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v7 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v5),((java.util.Comparator)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getDescription();
    org.junit.Assert.assertEquals((Object)(" "), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    org.junit.Assert.assertEquals((Object)(" ("), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
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
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
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
    Object v12 = " ";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.cli2.Option)v3).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
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
    Object v12 = "DISPLAY_GROUP_ARGUMENT";
    Object v13 = ((org.apache.commons.cli2.CommandLine)v11).getValues(((java.lang.String)v12));
    ((org.apache.commons.cli2.Option)v3).defaults(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
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
    ((org.apache.commons.cli2.Option)v3).defaults(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v12 = null;
    Object v13 = -29;
    Object v14 = new java.util.HashSet();
    Object v15 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v16 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v13).intValue()),((java.util.Set)v14),((java.util.Comparator)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v8),((java.util.List)v11));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    org.junit.Assert.assertEquals((Object)(" ("), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "ArgumentBuilder.null.n4ame";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Unexpected";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
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
    Object v12 = "ArgumentBuilder.null.refaults";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getParent();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = "Unexpected.token";
    Object v9 = ((org.apache.commons.cli2.Option)v7).findOption(((java.lang.String)v8));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v8),((java.util.List)v11));
    Object v13 = "Swith.already.set";
    Object v14 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v8),((java.util.List)v11));
    Object v13 = "ClassValidator.class.create";
    Object v14 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).isRequired();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.Option)v13).getTriggers();
    Object v15 = ((org.apache.commons.cli2.Option)v13).getTriggers();
    Object v16 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v15),((java.util.Comparator)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -22;
    Object v5 = new java.util.HashSet();
    Object v6 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v7 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v5),((java.util.Comparator)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getParent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -7;
    Object v5 = new java.util.HashSet();
    Object v6 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v7 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v5),((java.util.Comparator)v6));
    Object v8 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    org.junit.Assert.assertEquals((Object)(" ("), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getId();
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.cli2.Option)v8).getPreferredName();
    Object v10 = new java.lang.StringBuffer(((java.lang.CharSequence)v9));
    Object v11 = " (";
    Object v12 = " ";
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.cli2.Option)v14).getPrefixes();
    Object v16 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v10),((java.util.Set)v15),((java.util.Comparator)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getParent();
    org.junit.Assert.assertNull(v5);
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
    Object v16 = " (";
    Object v17 = " ";
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = new java.util.HashSet();
    Object v22 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v23 = ((org.apache.commons.cli2.Option)v19).helpLines((((java.lang.Integer)v20).intValue()),((java.util.Set)v21),((java.util.Comparator)v22));
    Object v24 = ((org.apache.commons.cli2.CommandLine)v11).getValues(((org.apache.commons.cli2.Option)v15),((java.util.List)v23));
    ((org.apache.commons.cli2.Option)v3).defaults(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.Option)v13).getPrefixes();
    Object v15 = " (";
    Object v16 = " ";
    Object v17 = 0;
    Object v18 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.Option)v18).getTriggers();
    Object v20 = ((org.apache.commons.cli2.Option)v18).getTriggers();
    Object v21 = ((java.util.Set)v14).remove(((java.lang.Object)v20));
    Object v22 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v23 = java.util.function.Function.identity();
    Object v24 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v25 = ((java.util.Comparator)v22).thenComparing(((java.util.function.Function)v23),((java.util.Comparator)v24));
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v14),((java.util.Comparator)v22));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
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
    Object v12 = "ArgumentBuilder.empty.consume.remaining";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = new java.util.HashSet();
    Object v15 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v16 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v17 = ((java.util.Comparator)v15).thenComparing(((java.util.Comparator)v16));
    Object v18 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v13).intValue()),((java.util.Set)v14),((java.util.Comparator)v15));
    org.junit.Assert.assertNotNull(v18);
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
    Object v12 = "Unexpected.token";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
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
    Object v12 = "Unexpeted.token";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v8),((java.util.List)v11));
    Object v13 = "ption.identical.prefixes";
    Object v14 = ((org.apache.commons.cli2.CommandLine)v12).hasOption(((java.lang.String)v13));
    ((org.apache.commons.cli2.Option)v3).defaults(((org.apache.commons.cli2.WriteableCommandLine)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.util.HashSet();
    Object v6 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v7 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v5),((java.util.Comparator)v6));
    Object v8 = 8;
    Object v9 = new java.util.HashSet();
    Object v10 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v11 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v9),((java.util.Comparator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -17;
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.cli2.Option)v8).getPrefixes();
    Object v10 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v11 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v9),((java.util.Comparator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.Option)v13).getPrefixes();
    Object v15 = " (";
    Object v16 = " ";
    Object v17 = 0;
    Object v18 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = -22;
    Object v20 = new java.util.HashSet();
    Object v21 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v22 = ((org.apache.commons.cli2.Option)v18).helpLines((((java.lang.Integer)v19).intValue()),((java.util.Set)v20),((java.util.Comparator)v21));
    Object v23 = ((java.util.Set)v14).removeAll(((java.util.Collection)v22));
    Object v24 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v14),((java.util.Comparator)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = "Option.mis";
    Object v10 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v14));
    ((org.apache.commons.cli2.Option)v7).validate(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v16 = null;
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).isRequired();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getDescription();
    org.junit.Assert.assertEquals((Object)(" "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "p+";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
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
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
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
    Object v12 = "org.apache.commons.cli2.resource.CLIMessageBundle_en_US";
    Object v13 = ((org.apache.commons.cli2.CommandLine)v11).hasOption(((java.lang.String)v12));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Argument.missing.values";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v12 = java.util.List.of(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v9),((java.util.List)v12));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
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
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = new java.util.HashSet();
    Object v11 = ((java.util.Set)v10).toArray();
    Object v12 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v10),((java.util.Comparator)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
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
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Unexpected.token";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = ((org.apache.commons.cli2.Option)v9).getPreferredName();
    org.junit.Assert.assertEquals((Object)(" ("), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getId();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v5);
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
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v16));
    ((org.apache.commons.cli2.Option)v9).defaults(((org.apache.commons.cli2.WriteableCommandLine)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "SourceDestArgu.ment";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getId();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v8),((java.util.List)v11));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = " (";
    Object v18 = " ";
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    ((org.apache.commons.cli2.Option)v16).setParent(((org.apache.commons.cli2.Option)v20));
    Object v21 = null;
    Object v22 = ((org.apache.commons.cli2.Option)v16).getParent();
    Object v23 = "fals";
    Object v24 = "HelpFormatter.gutter.too.long";
    ((org.apache.commons.cli2.WriteableCommandLine)v12).addProperty(((org.apache.commons.cli2.Option)v22),((java.lang.String)v23),((java.lang.String)v24));
    Object v25 = null;
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v12));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = ((org.apache.commons.cli2.Option)v9).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v10);
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
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = ((org.apache.commons.cli2.Option)v9).getPrefixes();
    Object v11 = ((org.apache.commons.cli2.Option)v9).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = ((org.apache.commons.cli2.Option)v9).getParent();
    org.junit.Assert.assertNull(v10);
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
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = ((org.apache.commons.cli2.Option)v9).getPrefixes();
    org.junit.Assert.assertNotNull(v10);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.cli2.Option)v7).setParent(((org.apache.commons.cli2.Option)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.cli2.Option)v7).getParent();
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v16));
    ((org.apache.commons.cli2.Option)v9).validate(((org.apache.commons.cli2.WriteableCommandLine)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = ((org.apache.commons.cli2.Option)v9).getPrefixes();
    Object v11 = ((org.apache.commons.cli2.Option)v9).getDescription();
    org.junit.Assert.assertEquals((Object)(" "), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 35;
    Object v5 = new java.util.HashSet();
    Object v6 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v7 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v5),((java.util.Comparator)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v8),((java.util.List)v11));
    Object v13 = "Argument.missingvalues";
    Object v14 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ", ";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli2.Option)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getId();
    Object v5 = "DateValidator.daRte.OutOfRange";
    Object v6 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "ArgumentBuilder.negaive.maximum";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
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
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Option.missin";
    Object v15 = ((org.apache.commons.cli2.Option)v13).findOption(((java.lang.String)v14));
    ((org.apache.commons.cli2.Option)v9).setParent(((org.apache.commons.cli2.Option)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    org.junit.Assert.assertEquals((Object)(" ("), v5);
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
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
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
    ((org.apache.commons.cli2.Option)v21).setParent(((org.apache.commons.cli2.Option)v25));
    Object v26 = null;
    Object v27 = ((org.apache.commons.cli2.Option)v21).getParent();
    Object v28 = ((org.apache.commons.cli2.CommandLine)v17).getProperties(((org.apache.commons.cli2.Option)v27));
    Object v29 = "tre";
    Object v30 = ((org.apache.commons.cli2.Option)v9).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v17),((java.lang.String)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.cli2.Option)v8).getPrefixes();
    Object v10 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v11 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v9),((java.util.Comparator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
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
    Object v16 = " (";
    Object v17 = " ";
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = new java.util.HashSet();
    Object v22 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v23 = ((org.apache.commons.cli2.Option)v19).helpLines((((java.lang.Integer)v20).intValue()),((java.util.Set)v21),((java.util.Comparator)v22));
    Object v24 = 8;
    Object v25 = new java.util.HashSet();
    Object v26 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v27 = ((org.apache.commons.cli2.Option)v19).helpLines((((java.lang.Integer)v24).intValue()),((java.util.Set)v25),((java.util.Comparator)v26));
    Object v28 = ((org.apache.commons.cli2.CommandLine)v11).getValues(((org.apache.commons.cli2.Option)v15),((java.util.List)v27));
    Object v29 = "NumberValidator.number.OutOfRange";
    Object v30 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
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
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.Option)v13).getTriggers();
    Object v15 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v14),((java.util.Comparator)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v16));
    ((org.apache.commons.cli2.Option)v9).defaults(((org.apache.commons.cli2.WriteableCommandLine)v17));
    Object v18 = null;
    Object v19 = ((org.apache.commons.cli2.Option)v9).getId();
    org.junit.Assert.assertEquals((Object)(0), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 13;
    Object v5 = new java.util.HashSet();
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.Option)v9).getTriggers();
    Object v11 = ((org.apache.commons.cli2.Option)v9).getTriggers();
    Object v12 = ((java.util.Set)v5).addAll(((java.util.Collection)v11));
    Object v13 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v14 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v5),((java.util.Comparator)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = "Argument.unexpected.value";
    Object v11 = ((org.apache.commons.cli2.Option)v9).findOption(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.util.HashSet();
    Object v6 = ((java.util.Set)v5).hashCode();
    Object v7 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v8 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v5),((java.util.Comparator)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = 21;
    Object v11 = new java.util.HashSet();
    Object v12 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v13 = ((org.apache.commons.cli2.Option)v9).helpLines((((java.lang.Integer)v10).intValue()),((java.util.Set)v11),((java.util.Comparator)v12));
    Object v14 = " (";
    Object v15 = " ";
    Object v16 = 0;
    Object v17 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = java.util.List.of(((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v17),((java.util.List)v20));
    ((org.apache.commons.cli2.Option)v9).validate(((org.apache.commons.cli2.WriteableCommandLine)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
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
    Object v12 = "--";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v8),((java.util.List)v11));
    Object v13 = null;
    Object v14 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.util.ListIterator)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v16 = true;
    ((org.apache.commons.cli2.WriteableCommandLine)v11).addSwitch(((org.apache.commons.cli2.Option)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    Object v18 = "MOption.missing.required";
    Object v19 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
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
    Object v22 = true;
    ((org.apache.commons.cli2.WriteableCommandLine)v17).addSwitch(((org.apache.commons.cli2.Option)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
    ((org.apache.commons.cli2.Option)v9).validate(((org.apache.commons.cli2.WriteableCommandLine)v17));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 25;
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.cli2.Option)v8).getPrefixes();
    Object v10 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v11 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v9),((java.util.Comparator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.cli2.Option)v3).getParent();
    Object v10 = ((org.apache.commons.cli2.Option)v9).isRequired();
    Object v11 = 1;
    Object v12 = new java.util.HashSet();
    ((java.util.Set)v12).clear();
    Object v13 = null;
    Object v14 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    Object v15 = ((org.apache.commons.cli2.Option)v9).helpLines((((java.lang.Integer)v11).intValue()),((java.util.Set)v12),((java.util.Comparator)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).isRequired();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = java.util.List.of(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v8),((java.util.List)v11));
    Object v13 = " ";
    Object v14 = ((org.apache.commons.cli2.CommandLine)v12).getProperty(((java.lang.String)v13));
    Object v15 = null;
    ((org.apache.commons.cli2.Option)v3).process(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.util.ListIterator)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v12 = "ArgumentBuilder.null.consume.remaining";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.cli2.Option)v3).getDescription();
    org.junit.Assert.assertEquals((Object)(" "), v14);
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
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.Option)v13).getPrefixes();
    Object v15 = ((java.util.Set)v14).iterator();
    Object v16 = org.apache.commons.cli2.util.Comparators.preferredNameLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v14),((java.util.Comparator)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Uexpected.token";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
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
    ((org.apache.commons.cli2.Option)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "OptiYon.missing.required";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "DateValidator.date.MutOfRange";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }
}
