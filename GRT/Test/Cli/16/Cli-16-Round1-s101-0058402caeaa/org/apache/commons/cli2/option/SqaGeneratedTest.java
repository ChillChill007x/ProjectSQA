package org.apache.commons.cli2.option;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
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
    Object v16 = ((org.apache.commons.cli2.WriteableCommandLine)v11).getUndefaultedValues(((org.apache.commons.cli2.Option)v15));
    Object v17 = "SourceDest.must.enforce.values";
    Object v18 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getDescription();
    org.junit.Assert.assertEquals((Object)(" "), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v7 = new java.util.TreeSet(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v7),((java.util.Comparator)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
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
  public void test6() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v7 = new java.util.TreeSet(((java.util.Comparator)v6));
    Object v8 = new java.util.TreeSet(((java.util.SortedSet)v7));
    Object v9 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v8),((java.util.Comparator)v9));
    Object v10 = null;
    Object v11 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v12 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 37;
    Object v5 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v8 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v6),((java.util.Comparator)v7));
    Object v9 = ((org.apache.commons.cli2.Option)v3).getDescription();
    org.junit.Assert.assertEquals((Object)(" "), v9);
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
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    org.junit.Assert.assertEquals((Object)(" ("), v4);
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
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.CommandLine)v11).getSwitch(((org.apache.commons.cli2.Option)v15));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "-";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v7 = new java.util.TreeSet(((java.util.Comparator)v6));
    Object v8 = new java.util.TreeSet(((java.util.SortedSet)v7));
    Object v9 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v8),((java.util.Comparator)v9));
    Object v10 = null;
    Object v11 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = "ArgumentBuilder.null.refaults";
    Object v7 = 0;
    Object v8 = ((java.lang.StringBuffer)v5).indexOf(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
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
    ((org.apache.commons.cli2.option.OptionImpl)v3).defaults(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "C'ommand.preferredName.too.short";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    Object v6 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v7 = new java.util.TreeSet(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = ((java.util.Set)v7).addAll(((java.util.Collection)v9));
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
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
    Object v13 = "";
    Object v14 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 27;
    Object v5 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = new java.lang.StringBuffer((((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v11).appendUsage(((java.lang.StringBuffer)v13),((java.util.Set)v16),((java.util.Comparator)v17));
    Object v18 = null;
    Object v19 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v20 = ((org.apache.commons.cli2.option.OptionImpl)v11).equals(((java.lang.Object)v19));
    Object v21 = 0;
    Object v22 = new java.lang.StringBuffer((((java.lang.Integer)v21).intValue()));
    Object v23 = ((java.util.Comparator)v7).compare(((java.lang.Object)v20),((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v6),((java.util.Comparator)v7));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "DISPLAY_PARENT_ARG?MENT";
    Object v5 = ((org.apache.commons.cli2.Option)v3).findOption(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).toString();
    org.junit.Assert.assertEquals((Object)(" (<property>=<value>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v3).setParent(((org.apache.commons.cli2.Option)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Y";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
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
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPrefixes();
    Object v9 = ((java.util.Set)v8).size();
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
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
    Object v12 = "Unex;pected.token";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    Object v5 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    Object v7 = new java.util.TreeSet(((java.util.SortedSet)v6));
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = java.util.function.Predicate.isEqual(((java.lang.Object)v11));
    Object v13 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v12));
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v7));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    Object v7 = new java.util.TreeSet(((java.util.SortedSet)v6));
    Object v8 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v9 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v10 = ((java.util.Comparator)v8).thenComparing(((java.util.Comparator)v9));
    Object v11 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v7),((java.util.Comparator)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
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
    Object v16 = "ArgumentBuilder.empty.name";
    Object v17 = ((org.apache.commons.cli2.CommandLine)v11).getProperty(((org.apache.commons.cli2.Option)v15),((java.lang.String)v16));
    Object v18 = "-";
    Object v19 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    Object v5 = 0;
    Object v6 = new java.lang.StringBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).getParent();
    org.junit.Assert.assertNull(v4);
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
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = "ArgumentBuilder.null.default";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    Object v14 = " (";
    Object v15 = " ";
    Object v16 = 0;
    Object v17 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v3).setParent(((org.apache.commons.cli2.Option)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 17;
    Object v5 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v8 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v6),((java.util.Comparator)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v4);
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
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
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
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v8 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v9 = ((java.util.Comparator)v7).thenComparing(((java.util.Comparator)v8));
    Object v10 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v6),((java.util.Comparator)v7));
    org.junit.Assert.assertNotNull(v10);
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
    Object v12 = "Switch.disabled.startsWith.enabled";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).toString();
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Command.preEferredName.too.short";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.option.OptionImpl)v7).equals(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = new java.lang.Object[]{null};
    Object v7 = ((java.util.Set)v5).toArray(((java.lang.Object[])v6));
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
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
    Object v8 = 17;
    Object v9 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v12 = ((org.apache.commons.cli2.Option)v7).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v9 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Argument.missing.values";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
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
    Object v13 = ((org.apache.commons.cli2.CommandLine)v11).getOptionCount(((java.lang.String)v12));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
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
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPrefixes();
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v17 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v18 = ((java.util.Comparator)v16).thenComparing(((java.util.Comparator)v17));
    Object v19 = ((org.apache.commons.cli2.Option)v12).helpLines((((java.lang.Integer)v13).intValue()),((java.util.Set)v15),((java.util.Comparator)v16));
    Object v20 = ((java.util.Set)v8).containsAll(((java.util.Collection)v19));
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v8));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.cli2.Option)v7).setParent(((org.apache.commons.cli2.Option)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.cli2.Option)v7).getPrefixes();
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
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
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    org.junit.Assert.assertEquals((Object)(" ("), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.cli2.Option)v9).setParent(((org.apache.commons.cli2.Option)v13));
    Object v14 = null;
    Object v15 = ((org.apache.commons.cli2.Option)v9).getPrefixes();
    Object v16 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v17 = " (";
    Object v18 = " ";
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.cli2.option.OptionImpl)v20).toString();
    Object v22 = ((org.apache.commons.cli2.option.OptionImpl)v20).hashCode();
    Object v23 = ((java.util.Comparator)v16).equals(((java.lang.Object)v22));
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v15),((java.util.Comparator)v16));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.Option)v9).getPrefixes();
    Object v11 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
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
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v7).hashCode();
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = new char[]{};
    Object v7 = ((java.lang.StringBuffer)v5).append(((char[])v6));
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
    Object v17 = ((org.apache.commons.cli2.Option)v11).getPrefixes();
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
    Object v27 = ((org.apache.commons.cli2.Option)v21).getPrefixes();
    Object v28 = ((java.util.Set)v17).contains(((java.lang.Object)v27));
    Object v29 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v17),((java.util.Comparator)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
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
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    Object v13 = 0;
    Object v14 = new java.lang.StringBuffer((((java.lang.Integer)v13).intValue()));
    Object v15 = Character.valueOf((char)1);
    Object v16 = ((java.lang.StringBuffer)v14).append((((java.lang.Character)v15).charValue()));
    Object v17 = " (";
    Object v18 = " ";
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.cli2.Option)v20).getPrefixes();
    Object v22 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v14),((java.util.Set)v21),((java.util.Comparator)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "--";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
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
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v7).isRequired();
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Option.illegal.long.prefix";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
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
    Object v20 = 17;
    Object v21 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v24 = ((org.apache.commons.cli2.Option)v19).helpLines((((java.lang.Integer)v20).intValue()),((java.util.Set)v22),((java.util.Comparator)v23));
    Object v25 = ((org.apache.commons.cli2.CommandLine)v11).getValues(((org.apache.commons.cli2.Option)v15),((java.util.List)v24));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getDescription();
    Object v5 = 61;
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.Option)v9).getTriggers();
    Object v11 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v12 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v5).intValue()),((java.util.Set)v10),((java.util.Comparator)v11));
    org.junit.Assert.assertNotNull(v12);
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
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    Object v12 = "URLValidator.malfrmed.URL";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v8 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = ((org.apache.commons.cli2.option.OptionImpl)v7).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "DISPLAY_PARENT_ARG?MENT";
    Object v11 = ((org.apache.commons.cli2.Option)v9).findOption(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.cli2.Option)v9).getPrefixes();
    Object v13 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v12),((java.util.Comparator)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
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
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPrefixes();
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "DISPLAY_PARENT_ARG?MENT";
    Object v10 = ((org.apache.commons.cli2.Option)v8).findOption(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.cli2.Option)v8).getPrefixes();
    Object v12 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v13 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v11),((java.util.Comparator)v12));
    org.junit.Assert.assertNotNull(v13);
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
    Object v9 = " (";
    Object v10 = " ";
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v15));
    Object v17 = "";
    Object v18 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v16),((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
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
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v7).toString();
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPreferredName();
    Object v5 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = "Unexpected.token";
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.Option)v9).getPreferredName();
    Object v11 = ((org.apache.commons.cli2.Option)v9).getTriggers();
    Object v12 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v11),((java.util.Comparator)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
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
    Object v13 = "--Q";
    Object v14 = ((org.apache.commons.cli2.CommandLine)v12).getProperty(((java.lang.String)v13));
    Object v15 = "Unexpected&.token";
    Object v16 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Option.missin";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
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
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v7),((java.util.List)v10));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
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
    Object v12 = "SourceDestArgu";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
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
    ((org.apache.commons.cli2.Option)v3).process(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.util.ListIterator)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    ((org.apache.commons.cli2.Option)v3).defaults(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    Object v21 = "Switc.preferredName.too.short";
    Object v22 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v20),((java.lang.String)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
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
    Object v12 = "--";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = ((org.apache.commons.cli2.Option)v7).getTriggers();
    Object v10 = " (";
    Object v11 = " ";
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = ((org.apache.commons.cli2.option.OptionImpl)v13).equals(((java.lang.Object)v15));
    Object v17 = ((java.util.Set)v9).contains(((java.lang.Object)v16));
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v9));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = " (";
    Object v8 = " ";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.cli2.Option)v10).getPrefixes();
    Object v12 = ((java.util.Set)v6).retainAll(((java.util.Collection)v11));
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v6));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getDescription();
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Argum&ent.unexpected.value";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.cli2.Option)v8).getPrefixes();
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
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
    Object v13 = "Option.i";
    Object v14 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v12),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
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
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v11));
    Object v12 = null;
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    Object v21 = " (";
    Object v22 = ((org.apache.commons.cli2.CommandLine)v20).getOption(((java.lang.String)v21));
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v20));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
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
    ((org.apache.commons.cli2.Option)v3).validate(((org.apache.commons.cli2.WriteableCommandLine)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getId();
    Object v5 = 11;
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.Option)v9).getPreferredName();
    Object v11 = ((org.apache.commons.cli2.Option)v9).getTriggers();
    Object v12 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v13 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v5).intValue()),((java.util.Set)v11),((java.util.Comparator)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Switch.already.set";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = " (";
    Object v5 = " ";
    Object v6 = 0;
    Object v7 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = ((org.apache.commons.cli2.Option)v7).getTriggers();
    Object v10 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = " (";
    Object v7 = " ";
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.Option)v9).getPreferredName();
    Object v11 = ((org.apache.commons.cli2.Option)v9).getTriggers();
    Object v12 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v13 = new java.util.TreeSet(((java.util.Comparator)v12));
    Object v14 = ((java.util.Set)v11).removeAll(((java.util.Collection)v13));
    Object v15 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v11),((java.util.Comparator)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
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
    Object v12 = " ..";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = " (";
    Object v8 = " ";
    Object v9 = 0;
    Object v10 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = 37;
    Object v12 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v13 = new java.util.TreeSet(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v15 = ((org.apache.commons.cli2.Option)v10).helpLines((((java.lang.Integer)v11).intValue()),((java.util.Set)v13),((java.util.Comparator)v14));
    Object v16 = ((org.apache.commons.cli2.Option)v10).getDescription();
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = ((java.lang.StringBuffer)v5).insert((((java.lang.Integer)v6).intValue()),((java.lang.CharSequence)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v21 = new java.util.TreeSet(((java.util.Comparator)v20));
    Object v22 = new java.util.TreeSet(((java.util.SortedSet)v21));
    Object v23 = org.apache.commons.cli2.util.Comparators.switchLast();
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v22),((java.util.Comparator)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 23;
    Object v5 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v6 = new java.util.TreeSet(((java.util.Comparator)v5));
    Object v7 = new java.util.TreeSet(((java.util.SortedSet)v6));
    Object v8 = ((java.util.Set)v7).hashCode();
    Object v9 = org.apache.commons.cli2.util.Comparators.switchLast();
    Object v10 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v7),((java.util.Comparator)v9));
    org.junit.Assert.assertNotNull(v10);
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
    Object v12 = "Argument.too.few.defaultsi";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v12 = "ArgumentBuilder.null.consume.remaining";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    Object v14 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    org.junit.Assert.assertNotNull(v14);
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
    Object v8 = ((org.apache.commons.cli2.Option)v7).getPreferredName();
    Object v9 = ((org.apache.commons.cli2.Option)v7).getTriggers();
    ((org.apache.commons.cli2.option.OptionImpl)v3).checkPrefixes(((java.util.Set)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
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
    Object v12 = "Argument.unexpocted.value";
    Object v13 = ((org.apache.commons.cli2.Option)v3).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v11),((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }
}
