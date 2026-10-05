package org.apache.commons.cli2.option;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaults(((org.apache.commons.cli2.WriteableCommandLine)v20));
    Object v21 = null;
    Object v22 = " (";
    Object v23 = " ";
    Object v24 = 0;
    Object v25 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v27 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v28 = java.util.List.of(((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v25),((java.util.List)v28));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).validate(((org.apache.commons.cli2.WriteableCommandLine)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
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
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).validate(((org.apache.commons.cli2.WriteableCommandLine)v20),((org.apache.commons.cli2.Option)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "Unexmected.token";
    Object v1 = "\"";
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = " Y(";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = -21;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getInitialSeparator();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "org.apache.commons.cli2.resFurce.bundle";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "-D";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v8 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Argument.minimum.exceeds.maximum";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = java.util.List.of(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = new java.util.HashSet(((java.util.Collection)v17));
    Object v19 = "ArgumentBuilder.empty.name";
    Object v20 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v14),((java.util.Set)v18),((java.util.Comparator)v20));
    Object v21 = null;
    Object v22 = "Switch.already.set";
    Object v23 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v22));
    org.junit.Assert.assertEquals((Object)("Switch.already.set"), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Argument.minimum.exceeds.maximum";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = java.util.List.of(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = new java.util.HashSet(((java.util.Collection)v17));
    Object v19 = "ArgumentBuilder.empty.name";
    Object v20 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v14),((java.util.Set)v18),((java.util.Comparator)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).toString();
    org.junit.Assert.assertEquals((Object)(" (<property>=<value>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaults(((org.apache.commons.cli2.WriteableCommandLine)v20));
    Object v21 = null;
    Object v22 = "Option.missing.required";
    Object v23 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v22));
    org.junit.Assert.assertEquals((Object)("Option.missing.required"), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
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
  public void test13() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaults(((org.apache.commons.cli2.WriteableCommandLine)v20));
    Object v21 = null;
    Object v22 = "Argument.minimum.exceeds.maximum";
    Object v23 = new java.lang.StringBuffer(((java.lang.String)v22));
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v26 = java.util.List.of(((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = new java.util.HashSet(((java.util.Collection)v26));
    Object v28 = "ArgumentBuilder.empty.name";
    Object v29 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v28));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v23),((java.util.Set)v27),((java.util.Comparator)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v12).hashCode();
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
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaultValues(((org.apache.commons.cli2.WriteableCommandLine)v21),((org.apache.commons.cli2.Option)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Argument.too.many.v";
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v12).findOption(((java.lang.String)v13));
    Object v15 = "-";
    Object v16 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)("-"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getTriggers();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getMinimum();
    org.junit.Assert.assertEquals((Object)(1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "Switch.no.en";
    Object v1 = "Y";
    Object v2 = 42;
    Object v3 = 30;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "\"";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 34;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).toString();
    org.junit.Assert.assertEquals((Object)(" (<property>=<value>"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "Unexpected.to(en";
    Object v1 = "!";
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "Enum.illegal.value";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
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
  public void test24() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 2;
    Object v14 = "Enum.illegal.value";
    Object v15 = "Option.missing.requ";
    Object v16 = 1;
    Object v17 = 28;
    Object v18 = Character.valueOf((char)0);
    Object v19 = Character.valueOf((char)0);
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = "-";
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23));
    Object v25 = 1;
    Object v26 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Character)v18).charValue()),(((java.lang.Character)v19).charValue()),((org.apache.commons.cli2.validation.Validator)v20),((java.lang.String)v21),((java.util.List)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.cli2.option.ArgumentImpl)v26).getTriggers();
    Object v28 = "ArgumentBuilder.empty.name";
    Object v29 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v28));
    Object v30 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).helpLines((((java.lang.Integer)v13).intValue()),((java.util.Set)v27),((java.util.Comparator)v29));
    Object v31 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getConsumeRemaining();
    org.junit.Assert.assertEquals((Object)("-"), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getDefaultValues();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v12).toString();
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getSubsequentSeparator();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
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
    Object v12 = ((org.apache.commons.cli2.option.OptionImpl)v11).toString();
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v7).equals(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new java.util.HashSet(((java.util.Collection)v15));
    Object v17 = ((org.apache.commons.cli2.option.OptionImpl)v12).equals(((java.lang.Object)v16));
    Object v18 = "\"";
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v18));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaults(((org.apache.commons.cli2.WriteableCommandLine)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "falNe";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Switch.enabled.startsWth.disabled";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new java.util.HashSet(((java.util.Collection)v16));
    Object v18 = "ArgumentBuilder.empty.name";
    Object v19 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v18));
    Object v20 = "ArgumentBuilder.empty.name";
    Object v21 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v20));
    Object v22 = ((java.util.Comparator)v19).thenComparing(((java.util.Comparator)v21));
    Object v23 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).helpLines((((java.lang.Integer)v13).intValue()),((java.util.Set)v17),((java.util.Comparator)v19));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "Argument.unexpec";
    Object v1 = "SourceDe";
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "Option.illegal.disabled.prefix";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = -12;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "HelpFormatter.width.too.narrow";
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)("HelpFormatter.width.too.narrow"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Argument.minimum.exceeds.maximum";
    Object v5 = new java.lang.StringBuffer(((java.lang.String)v4));
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v8 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new java.util.HashSet(((java.util.Collection)v8));
    Object v10 = "ArgumentBuilder.empty.name";
    Object v11 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v10));
    ((org.apache.commons.cli2.Option)v3).appendUsage(((java.lang.StringBuffer)v5),((java.util.Set)v9),((java.util.Comparator)v11));
    Object v12 = null;
    Object v13 = "Argument.minimum.exceeds.maximum";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v12).hashCode();
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "Unexpected.token";
    Object v1 = "Classpalidator.class.create";
    Object v2 = -3;
    Object v3 = -4;
    Object v4 = Character.valueOf((char)1);
    Object v5 = Character.valueOf((char)1);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "false";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = -45;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Argument.minimum.exceeds.maximum";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.cli2.option.OptionImpl)v12).equals(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getPreferredName();
    org.junit.Assert.assertEquals((Object)("Enum.illegal.value"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = -10;
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new java.util.HashSet(((java.util.Collection)v16));
    Object v18 = "ArgumentBuilder.empty.name";
    Object v19 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v18));
    Object v20 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).helpLines((((java.lang.Integer)v13).intValue()),((java.util.Set)v17),((java.util.Comparator)v19));
    Object v21 = "Option.illegal.enabled.preix";
    Object v22 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v21));
    org.junit.Assert.assertEquals((Object)("Option.illegal.enabled.preix"), v22);
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
    Object v8 = " (";
    Object v9 = " ";
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = " (";
    Object v13 = " ";
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.option.OptionImpl)v15).toString();
    Object v17 = ((org.apache.commons.cli2.option.OptionImpl)v11).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.cli2.option.OptionImpl)v7).equals(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getPrefixes();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
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
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaultValues(((org.apache.commons.cli2.WriteableCommandLine)v20),((org.apache.commons.cli2.Option)v24));
    Object v25 = null;
    Object v26 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getDescription();
    org.junit.Assert.assertEquals((Object)("Option.missing.requ"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "Unexpected.token";
    Object v1 = "AgumentBuilder.null.default";
    Object v2 = -4;
    Object v3 = 0;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "@";
    Object v8 = "Enum.illegal.value";
    Object v9 = "Option.missing.requ";
    Object v10 = 1;
    Object v11 = 28;
    Object v12 = Character.valueOf((char)0);
    Object v13 = Character.valueOf((char)0);
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = "-";
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = java.util.List.of(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = 1;
    Object v20 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Character)v12).charValue()),(((java.lang.Character)v13).charValue()),((org.apache.commons.cli2.validation.Validator)v14),((java.lang.String)v15),((java.util.List)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.cli2.option.ArgumentImpl)v20).getDefaultValues();
    Object v22 = 48;
    Object v23 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v21),(((java.lang.Integer)v22).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = -10;
    Object v3 = -11;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "Un#xpected.token";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = -3;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getConsumeRemaining();
    org.junit.Assert.assertEquals((Object)("-"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaults(((org.apache.commons.cli2.WriteableCommandLine)v20));
    Object v21 = null;
    Object v22 = "Argument.minimum.exceeds.maximum";
    Object v23 = new java.lang.StringBuffer(((java.lang.String)v22));
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v26 = java.util.List.of(((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = new java.util.HashSet(((java.util.Collection)v26));
    Object v28 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v29 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v30 = java.util.List.of(((java.lang.Object)v28),((java.lang.Object)v29));
    Object v31 = ((java.util.Set)v27).addAll(((java.util.Collection)v30));
    Object v32 = "ArgumentBuilder.empty.name";
    Object v33 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v32));
    Object v34 = java.util.function.Function.identity();
    Object v35 = "ArgumentBuilder.empty.name";
    Object v36 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v35));
    Object v37 = ((java.util.Comparator)v33).thenComparing(((java.util.function.Function)v34),((java.util.Comparator)v36));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v23),((java.util.Set)v27),((java.util.Comparator)v33));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = "+";
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Option.illegal.disabled.prefix*";
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)("Option.illegal.disabled.prefix*"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Argument.minimum.exceeds.maximum";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = "Enum.illegal.value";
    Object v16 = "Option.missing.requ";
    Object v17 = 1;
    Object v18 = 28;
    Object v19 = Character.valueOf((char)0);
    Object v20 = Character.valueOf((char)0);
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = "-";
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = 1;
    Object v27 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Character)v19).charValue()),(((java.lang.Character)v20).charValue()),((org.apache.commons.cli2.validation.Validator)v21),((java.lang.String)v22),((java.util.List)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v27).getTriggers();
    Object v29 = "ArgumentBuilder.empty.name";
    Object v30 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v29));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v14),((java.util.Set)v28),((java.util.Comparator)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v18 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v19 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaults(((org.apache.commons.cli2.WriteableCommandLine)v20));
    Object v21 = null;
    Object v22 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getValidator();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).getConsumeRemaining();
    org.junit.Assert.assertEquals((Object)("ar"), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).getPrefixes();
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getPreferredName();
    org.junit.Assert.assertEquals((Object)("Enum.illegal.value"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = " (";
    Object v6 = " ";
    Object v7 = 0;
    Object v8 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "-";
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)("-"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).getValidator();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Argument.minimum.exceeds.maximum";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = "Argument.minimum.exceeds.maximum";
    Object v16 = new java.lang.StringBuffer(((java.lang.String)v15));
    Object v17 = ((java.lang.StringBuffer)v14).append(((java.lang.StringBuffer)v16));
    Object v18 = "Enum.illegal.value";
    Object v19 = "Option.missing.requ";
    Object v20 = 1;
    Object v21 = 28;
    Object v22 = Character.valueOf((char)0);
    Object v23 = Character.valueOf((char)0);
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = "-";
    Object v26 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v27 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v28 = java.util.List.of(((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = 1;
    Object v30 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Character)v22).charValue()),(((java.lang.Character)v23).charValue()),((org.apache.commons.cli2.validation.Validator)v24),((java.lang.String)v25),((java.util.List)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((org.apache.commons.cli2.option.ArgumentImpl)v30).getTriggers();
    Object v32 = "ArgumentBuilder.empty.name";
    Object v33 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v32));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v14),((java.util.Set)v31),((java.util.Comparator)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = "Unexpected9.token";
    Object v2 = 0;
    Object v3 = -48;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "-";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = -5;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Unexpected.token";
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v13));
    Object v15 = " (";
    Object v16 = " ";
    Object v17 = 0;
    Object v18 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v20 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v21 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v18),((java.util.List)v21));
    Object v23 = "Cannot.bust";
    Object v24 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
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
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).defaultValues(((org.apache.commons.cli2.WriteableCommandLine)v20),((org.apache.commons.cli2.Option)v24));
    Object v25 = null;
    Object v26 = "Argument.minimum.exceeds.maximum";
    Object v27 = new java.lang.StringBuffer(((java.lang.String)v26));
    Object v28 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v29 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v30 = java.util.List.of(((java.lang.Object)v28),((java.lang.Object)v29));
    Object v31 = new java.util.HashSet(((java.util.Collection)v30));
    Object v32 = "ArgumentBuilder.empty.name";
    Object v33 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v32));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v27),((java.util.Set)v31),((java.util.Comparator)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = "Opti";
    Object v36 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).stripBoundaryQuotes(((java.lang.String)v35));
    org.junit.Assert.assertEquals((Object)("Opti"), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = " (";
    Object v14 = " ";
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = " (";
    Object v18 = " ";
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.cli2.option.OptionImpl)v20).toString();
    Object v22 = ((org.apache.commons.cli2.option.OptionImpl)v16).equals(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.cli2.option.OptionImpl)v12).equals(((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "ArgumentBuilder.negative.mi";
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)("ArgumentBuilder.negative.mi"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "";
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).getPreferredName();
    org.junit.Assert.assertEquals((Object)("--"), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Option.missin";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getPrefixes();
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).getId();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Unexpected.toke@n";
    Object v1 = "Unexpected.oken";
    Object v2 = -39;
    Object v3 = -27;
    Object v4 = Character.valueOf((char)1);
    Object v5 = Character.valueOf((char)65535);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "`   ";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = 1;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = "Enum.illegal.value";
    Object v6 = "Option.missing.requ";
    Object v7 = 1;
    Object v8 = 28;
    Object v9 = Character.valueOf((char)0);
    Object v10 = Character.valueOf((char)0);
    Object v11 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v12 = "-";
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = 1;
    Object v17 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()),(((java.lang.Character)v10).charValue()),((org.apache.commons.cli2.validation.Validator)v11),((java.lang.String)v12),((java.util.List)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = "Unexpected.token";
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v17).stripBoundaryQuotes(((java.lang.String)v18));
    Object v20 = " (";
    Object v21 = " ";
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v26 = java.util.List.of(((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v23),((java.util.List)v26));
    Object v28 = "Cannot.bust";
    Object v29 = ((org.apache.commons.cli2.option.ArgumentImpl)v17).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v27),((java.lang.String)v28));
    Object v30 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Argument.minimum.exceeds.maximum";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v17 = java.util.List.of(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = new java.util.HashSet(((java.util.Collection)v17));
    Object v19 = "ArgumentBuilder.empty.name";
    Object v20 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v19));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v14),((java.util.Set)v18),((java.util.Comparator)v20));
    Object v21 = null;
    Object v22 = "Argument.minimum.exceeds.maximum";
    Object v23 = new java.lang.StringBuffer(((java.lang.String)v22));
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v26 = java.util.List.of(((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = new java.util.HashSet(((java.util.Collection)v26));
    Object v28 = "ArgumentBuilder.empty.name";
    Object v29 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v28));
    ((org.apache.commons.cli2.option.ArgumentImpl)v12).appendUsage(((java.lang.StringBuffer)v23),((java.util.Set)v27),((java.util.Comparator)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).getValidator();
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).getInitialSeparator();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = "Unexpected.token";
    Object v14 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)("Unexpected.token"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.option.OptionImpl)v34).toString();
    Object v36 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).getMaximum();
    org.junit.Assert.assertEquals((Object)(54), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.Option)v34).getTriggers();
    Object v36 = ((org.apache.commons.cli2.option.OptionImpl)v34).hashCode();
    org.junit.Assert.assertEquals((Object)(-1782839485), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = "i ";
    Object v36 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).stripBoundaryQuotes(((java.lang.String)v35));
    org.junit.Assert.assertEquals((Object)("i "), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).getDescription();
    org.junit.Assert.assertEquals((Object)("Argument.missing.values"), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32;
    Object v5 = "Enum.illegal.value";
    Object v6 = "Option.missing.requ";
    Object v7 = 1;
    Object v8 = 28;
    Object v9 = Character.valueOf((char)0);
    Object v10 = Character.valueOf((char)0);
    Object v11 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v12 = "-";
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = 1;
    Object v17 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()),(((java.lang.Character)v10).charValue()),((org.apache.commons.cli2.validation.Validator)v11),((java.lang.String)v12),((java.util.List)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.apache.commons.cli2.option.ArgumentImpl)v17).getPrefixes();
    Object v19 = "ArgumentBuilder.empty.name";
    Object v20 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v19));
    Object v21 = ((org.apache.commons.cli2.Option)v3).helpLines((((java.lang.Integer)v4).intValue()),((java.util.Set)v18),((java.util.Comparator)v20));
    Object v22 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = "ArgumentBuilder.null.consume.rem";
    Object v36 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).stripBoundaryQuotes(((java.lang.String)v35));
    Object v37 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
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
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v7).getId();
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "DISPLAY_4GROUP_EXPANDED";
    Object v1 = "~";
    Object v2 = 5;
    Object v3 = 21;
    Object v4 = Character.valueOf((char)60);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "--";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = 1;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "-";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "--";
    Object v1 = "Argument.missing.values";
    Object v2 = 1;
    Object v3 = 54;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = " (";
    Object v20 = " ";
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v24 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v25 = java.util.List.of(((java.lang.Object)v23),((java.lang.Object)v24));
    Object v26 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v25));
    ((org.apache.commons.cli2.option.ArgumentImpl)v18).defaults(((org.apache.commons.cli2.WriteableCommandLine)v26));
    Object v27 = null;
    Object v28 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v29 = "ar";
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = 0;
    Object v34 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v28),((java.lang.String)v29),((java.util.List)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = "ClassValidator.clss.access";
    Object v36 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).stripBoundaryQuotes(((java.lang.String)v35));
    Object v37 = ((org.apache.commons.cli2.option.ArgumentImpl)v34).getMaximum();
    org.junit.Assert.assertEquals((Object)(54), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.Option)v3).getTriggers();
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "Option.illgal.short.prefix";
    Object v1 = ",";
    Object v2 = -11;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "Switch.prefsrredName.too.short";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = 17;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Enum.illegal.value";
    Object v1 = "Option.missing.requ";
    Object v2 = 1;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v7 = "-";
    Object v8 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v9 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v10 = java.util.List.of(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v6),((java.lang.String)v7),((java.util.List)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v12).hashCode();
    Object v14 = "SourceDest.must.enforce.va^lues";
    Object v15 = ((org.apache.commons.cli2.option.ArgumentImpl)v12).stripBoundaryQuotes(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)("SourceDest.must.enforce.va^lues"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Option.illegal.long.prefix";
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).findOption(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Option.illgal.short.prefix";
    Object v1 = ",";
    Object v2 = -11;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "Switch.prefsrredName.too.short";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = 17;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = " (";
    Object v27 = " ";
    Object v28 = 0;
    Object v29 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = java.util.function.Function.identity();
    Object v31 = ((org.apache.commons.cli2.option.OptionImpl)v29).equals(((java.lang.Object)v30));
    Object v32 = ((org.apache.commons.cli2.option.OptionImpl)v25).equals(((java.lang.Object)v31));
    Object v33 = ((org.apache.commons.cli2.option.ArgumentImpl)v25).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Enum.illegal.value";
    Object v5 = "Option.missing.requ";
    Object v6 = 1;
    Object v7 = 28;
    Object v8 = Character.valueOf((char)0);
    Object v9 = Character.valueOf((char)0);
    Object v10 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v11 = "-";
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v14 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = 1;
    Object v16 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()),((org.apache.commons.cli2.validation.Validator)v10),((java.lang.String)v11),((java.util.List)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = ((org.apache.commons.cli2.option.ArgumentImpl)v16).stripBoundaryQuotes(((java.lang.String)v17));
    Object v19 = ((org.apache.commons.cli2.option.OptionImpl)v3).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Option.illgal.short.prefix";
    Object v1 = ",";
    Object v2 = -11;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "Switch.prefsrredName.too.short";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = 17;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = "ClassValidator.class.notfound";
    Object v27 = ((org.apache.commons.cli2.option.ArgumentImpl)v25).stripBoundaryQuotes(((java.lang.String)v26));
    org.junit.Assert.assertEquals((Object)("ClassValidator.class.notfound"), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = " (";
    Object v1 = " ";
    Object v2 = 0;
    Object v3 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    Object v5 = ((org.apache.commons.cli2.option.OptionImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(52356920), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Option.illgal.short.prefix";
    Object v1 = ",";
    Object v2 = -11;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "Switch.prefsrredName.too.short";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = 17;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.cli2.option.ArgumentImpl)v25).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Option.illgal.short.prefix";
    Object v1 = ",";
    Object v2 = -11;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "Switch.prefsrredName.too.short";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = 17;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v27 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v28 = java.util.List.of(((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = new java.util.HashSet(((java.util.Collection)v28));
    Object v30 = ((org.apache.commons.cli2.option.OptionImpl)v25).equals(((java.lang.Object)v29));
    Object v31 = ((org.apache.commons.cli2.option.ArgumentImpl)v25).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "Option.illgal.short.prefix";
    Object v1 = ",";
    Object v2 = -11;
    Object v3 = 28;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = "Enum.illegal.value";
    Object v7 = "Option.missing.requ";
    Object v8 = 1;
    Object v9 = 28;
    Object v10 = Character.valueOf((char)0);
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v13 = "-";
    Object v14 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v15 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v16 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()),((org.apache.commons.cli2.validation.Validator)v12),((java.lang.String)v13),((java.util.List)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.cli2.option.ArgumentImpl)v18).getValidator();
    Object v20 = "Switch.prefsrredName.too.short";
    Object v21 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v22 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v23 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = 17;
    Object v25 = new org.apache.commons.cli2.option.ArgumentImpl(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()),((org.apache.commons.cli2.validation.Validator)v19),((java.lang.String)v20),((java.util.List)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = " (";
    Object v27 = " ";
    Object v28 = 0;
    Object v29 = new org.apache.commons.cli2.option.PropertyOption(((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v31 = org.apache.commons.cli2.validation.NumberValidator.getNumberInstance();
    Object v32 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31));
    Object v33 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v29),((java.util.List)v32));
    Object v34 = "org.apache.commons.cli2.resouQrce.CLIMessageBundle_en_US";
    Object v35 = ((org.apache.commons.cli2.option.ArgumentImpl)v25).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v33),((java.lang.String)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }
}
