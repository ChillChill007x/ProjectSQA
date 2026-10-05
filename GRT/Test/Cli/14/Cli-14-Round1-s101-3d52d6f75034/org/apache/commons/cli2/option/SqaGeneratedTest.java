package org.apache.commons.cli2.option;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 13;
    Object v7 = new java.lang.Object[]{};
    Object v8 = java.util.Set.of(((java.lang.Object[])v7));
    Object v9 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v10 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v8),((java.util.Comparator)v9));
    Object v11 = new java.util.ArrayList();
    Object v12 = "\"";
    Object v13 = "b ";
    Object v14 = 1;
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v11),((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new java.util.ArrayList();
    Object v18 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v17));
    ((org.apache.commons.cli2.option.GroupImpl)v5).validate(((org.apache.commons.cli2.WriteableCommandLine)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    ((org.apache.commons.cli2.option.GroupImpl)v5).validate(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).getId();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getOptions();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = new java.lang.Object[]{};
    Object v10 = java.util.Set.of(((java.lang.Object[])v9));
    Object v11 = org.apache.commons.cli2.util.Comparators.requiredLast();
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v8),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.option.OptionImpl)v11).getId();
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v14 = null;
    Object v15 = new java.util.ArrayList();
    Object v16 = "\"";
    Object v17 = "b ";
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v15),((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = "Option.illegal.enabled.prefix";
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getPrefixes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\\nexpected.token";
    Object v10 = "-";
    Object v11 = -37;
    Object v12 = 1;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getPrefixes();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v16 = "faljse";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v14),((java.util.Comparator)v15),((java.lang.String)v16));
    Object v17 = null;
    Object v18 = "y";
    Object v19 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(5925032), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "DISPLAY7_ALIASES";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "Command.preferredNametoo.short";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    Object v16 = new java.util.ArrayList();
    Object v17 = "\"";
    Object v18 = "b ";
    Object v19 = 1;
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new java.util.ArrayList();
    Object v23 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v21),((java.util.List)v22));
    ((org.apache.commons.cli2.option.GroupImpl)v5).validate(((org.apache.commons.cli2.WriteableCommandLine)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = new java.lang.Object[]{};
    Object v8 = java.util.Set.of(((java.lang.Object[])v7));
    Object v9 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v10 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v8),((java.util.Comparator)v9));
    Object v11 = new java.util.ArrayList();
    Object v12 = "\"";
    Object v13 = "b ";
    Object v14 = 1;
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v11),((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new java.util.ArrayList();
    Object v18 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v17));
    Object v19 = new java.util.ArrayList();
    Object v20 = "-";
    Object v21 = "Option.illegal.disabled.prefix";
    Object v22 = 46;
    Object v23 = 0;
    Object v24 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v19),((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.apache.commons.cli2.CommandLine)v18).getValue(((org.apache.commons.cli2.Option)v24));
    Object v26 = "true";
    Object v27 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v18),((java.lang.String)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = new java.util.ArrayList();
    Object v10 = "\\nexpected.token";
    Object v11 = "-";
    Object v12 = -37;
    Object v13 = 1;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v14).getPrefixes();
    Object v16 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v17 = "Unexpected.token";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v8),((java.util.Set)v15),((java.util.Comparator)v16),((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getTriggers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 24;
    Object v7 = new java.lang.Object[]{};
    Object v8 = java.util.Set.of(((java.lang.Object[])v7));
    Object v9 = ((java.util.Collection)v8).stream();
    Object v10 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v11 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v8),((java.util.Comparator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getAnonymous();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((java.lang.StringBuffer)v8).append((((java.lang.Character)v9).charValue()));
    Object v11 = new java.util.ArrayList();
    Object v12 = "\\nexpected.token";
    Object v13 = "-";
    Object v14 = -37;
    Object v15 = 1;
    Object v16 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v11),((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.cli2.option.GroupImpl)v16).getPrefixes();
    Object v18 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v19 = "org.apache.commons.cli2.resourc";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v8),((java.util.Set)v17),((java.util.Comparator)v18),((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getMinimum();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = new java.util.ArrayList();
    Object v8 = "-";
    Object v9 = "Option.illegal.disabled.prefix";
    Object v10 = 46;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getTriggers();
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.apache.commons.cli2.option.OptionImpl)v19).getId();
    Object v21 = ((java.util.Set)v13).equals(((java.lang.Object)v20));
    Object v22 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v23 = ((java.util.Comparator)v22).reversed();
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v13),((java.util.Comparator)v22));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "-";
    Object v10 = "Option.illegal.disabled.prefix";
    Object v11 = 46;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getTriggers();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v16 = java.util.function.Function.identity();
    Object v17 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v18 = ((java.util.Comparator)v15).thenComparing(((java.util.function.Function)v16),((java.util.Comparator)v17));
    Object v19 = "--";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v14),((java.util.Comparator)v15),((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "DISPLAY_GOUP_EXPANDED";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    ((org.apache.commons.cli2.option.GroupImpl)v5).validate(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "-";
    Object v10 = "Option.illegal.disabled.prefix";
    Object v11 = 46;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getTriggers();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v16 = "DateValidator.date.Out";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v14),((java.util.Comparator)v15),((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getTriggers();
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.ArrayList();
    Object v14 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v13));
    Object v15 = "\"";
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v14),((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(1448794068), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getDescription();
    org.junit.Assert.assertEquals((Object)("Option.illegal.disabled.prefix"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getMaximum();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = new java.util.ArrayList();
    Object v8 = "-";
    Object v9 = "Option.illegal.disabled.prefix";
    Object v10 = 46;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getTriggers();
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.apache.commons.cli2.option.OptionImpl)v19).getId();
    Object v21 = ((java.util.Set)v13).equals(((java.lang.Object)v20));
    Object v22 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v23 = ((java.util.Comparator)v22).reversed();
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v13),((java.util.Comparator)v22));
    Object v25 = ((java.util.List)v24).listIterator();
    Object v26 = "En]m.illegal.value";
    Object v27 = "Argument.too.many.defauuts";
    Object v28 = 0;
    Object v29 = 0;
    Object v30 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v24),((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "ClassValidator.bad.classname";
    Object v8 = "Unexpected.token";
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).getId();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getPrefixes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(193070154), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "  S  ";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getOptions();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "ClassValidator.class.create";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\\nexpected.token";
    Object v10 = "-";
    Object v11 = -37;
    Object v12 = 1;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getPrefixes();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v16 = "Option.no.name";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v14),((java.util.Comparator)v15),((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -27;
    Object v7 = new java.util.ArrayList();
    Object v8 = "-";
    Object v9 = "Option.illegal.disabled.prefix";
    Object v10 = 46;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getTriggers();
    Object v14 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v13),((java.util.Comparator)v14));
    Object v16 = new java.util.ArrayList();
    Object v17 = "\"";
    Object v18 = "b ";
    Object v19 = 1;
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new java.util.ArrayList();
    Object v23 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v21),((java.util.List)v22));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).toString();
    Object v7 = new java.util.ArrayList();
    Object v8 = "-";
    Object v9 = "Option.illegal.disabled.prefix";
    Object v10 = 46;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.ArrayList();
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v12).equals(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).hashCode();
    Object v7 = new java.util.ArrayList();
    Object v8 = "ClassValidator.bad.classname";
    Object v9 = "Unexpected.token";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getPrefixes();
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = new java.util.ArrayList();
    Object v10 = "-";
    Object v11 = "Option.illegal.disabled.prefix";
    Object v12 = 46;
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v14).getTriggers();
    Object v16 = java.util.function.Function.identity();
    Object v17 = ((java.util.Set)v15).equals(((java.lang.Object)v16));
    Object v18 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v19 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v20 = ((java.util.Comparator)v18).thenComparing(((java.util.Comparator)v19));
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v8),((java.util.Set)v15),((java.util.Comparator)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 46;
    Object v7 = new java.util.ArrayList();
    Object v8 = "ClassValidator.bad.classname";
    Object v9 = "Unexpected.token";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getPrefixes();
    Object v14 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v13),((java.util.Comparator)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "Unexpected.token";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\\nexpected.token";
    Object v10 = "-";
    Object v11 = -37;
    Object v12 = 1;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getPrefixes();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v16 = "ArgumentBuilder.negative.maximum";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v14),((java.util.Comparator)v15),((java.lang.String)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Option.illegal.enabled.preix";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = new java.util.ArrayList();
    Object v8 = "-";
    Object v9 = "Option.illegal.disabled.prefix";
    Object v10 = 46;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getTriggers();
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.apache.commons.cli2.option.OptionImpl)v19).getId();
    Object v21 = ((java.util.Set)v13).equals(((java.lang.Object)v20));
    Object v22 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v23 = ((java.util.Comparator)v22).reversed();
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v13),((java.util.Comparator)v22));
    Object v25 = ((java.util.List)v24).listIterator();
    Object v26 = "En]m.illegal.value";
    Object v27 = "Argument.too.many.defauuts";
    Object v28 = 0;
    Object v29 = 0;
    Object v30 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v24),((java.lang.String)v26),((java.lang.String)v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = new java.util.ArrayList();
    Object v32 = "-";
    Object v33 = "Option.illegal.disabled.prefix";
    Object v34 = 46;
    Object v35 = 0;
    Object v36 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v31),((java.lang.String)v32),((java.lang.String)v33),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = ((org.apache.commons.cli2.option.GroupImpl)v36).getMaximum();
    Object v38 = ((org.apache.commons.cli2.option.OptionImpl)v30).equals(((java.lang.Object)v37));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "HelpFormatter.width.too.narrow";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v14 = null;
    Object v15 = 4;
    Object v16 = new java.lang.StringBuffer((((java.lang.Integer)v15).intValue()));
    Object v17 = new java.util.ArrayList();
    Object v18 = "-";
    Object v19 = "Option.illegal.disabled.prefix";
    Object v20 = 46;
    Object v21 = 0;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.cli2.option.GroupImpl)v22).getTriggers();
    Object v24 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v25 = "";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v16),((java.util.Set)v23),((java.util.Comparator)v24),((java.lang.String)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Unexpected.token";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).getId();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    ((org.apache.commons.cli2.option.GroupImpl)v5).validate(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.Option)v5).getDescription();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(983338502), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "ClassValidator.bad.classname";
    Object v10 = "Unexpected.token";
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getPrefixes();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v16 = "R";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v14),((java.util.Comparator)v15),((java.lang.String)v16));
    Object v17 = null;
    Object v18 = new java.util.ArrayList();
    Object v19 = "\"";
    Object v20 = "b ";
    Object v21 = 1;
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new java.util.ArrayList();
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v23),((java.util.List)v24));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "--";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "Option.missing.required";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getAnonymous();
    Object v7 = "Un#xpected.token";
    Object v8 = "Command.preferredName.too.short";
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Unexpected.to~en";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\\nexpected.token";
    Object v2 = "-";
    Object v3 = -37;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getTriggers();
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.ArrayList();
    Object v14 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v13));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Unexpected.to~en";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).toString();
    org.junit.Assert.assertEquals((Object)("[Unexpected.to~en ()]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Unexpected.to~en";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = new java.util.ArrayList();
    Object v10 = "ClassValidator.bad.classname";
    Object v11 = "Unexpected.token";
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v14).getPrefixes();
    Object v16 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v17 = "Switch.preferredName.too.short";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v8),((java.util.Set)v15),((java.util.Comparator)v16),((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = " (";
    Object v2 = "Missing.option";
    Object v3 = 5;
    Object v4 = 28;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getAnonymous();
    Object v7 = "Un#xpected.token";
    Object v8 = "Command.preferredName.too.short";
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = "\"";
    Object v14 = "b ";
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.util.ArrayList();
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v17),((java.util.List)v18));
    ((org.apache.commons.cli2.option.GroupImpl)v11).defaults(((org.apache.commons.cli2.WriteableCommandLine)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Unexpected.to~en";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getTriggers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Unexpected.to~en";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -18;
    Object v7 = new java.util.ArrayList();
    Object v8 = "ClassValidator.bad.classname";
    Object v9 = "Unexpected.token";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getPrefixes();
    Object v14 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v15 = ((org.apache.commons.cli2.Option)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v13),((java.util.Comparator)v14));
    Object v16 = 4;
    Object v17 = new java.lang.StringBuffer((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "arg";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = " (";
    Object v2 = "Missing.option";
    Object v3 = 5;
    Object v4 = 28;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = new java.util.ArrayList();
    Object v10 = "-";
    Object v11 = "Option.illegal.disabled.prefix";
    Object v12 = 46;
    Object v13 = 0;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v14).getTriggers();
    Object v16 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v17 = "ArgumentBuilder.nu";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v8),((java.util.Set)v15),((java.util.Comparator)v16),((java.lang.String)v17));
    Object v18 = null;
    Object v19 = "Command.preferredName";
    Object v20 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getPreferredName();
    org.junit.Assert.assertEquals((Object)("@"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "Unexected.token";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = " (";
    Object v2 = "Missing.option";
    Object v3 = 5;
    Object v4 = 28;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "-";
    Object v10 = "Option.illegal.disabled.prefix";
    Object v11 = 46;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getTriggers();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    ((org.apache.commons.cli2.Option)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v14),((java.util.Comparator)v15));
    Object v16 = null;
    Object v17 = ((org.apache.commons.cli2.option.OptionImpl)v5).toString();
    org.junit.Assert.assertEquals((Object)(" ( ()"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = " (";
    Object v2 = "Missing.option";
    Object v3 = 5;
    Object v4 = 28;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "O";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    Object v8 = "Option.illegal.long.prefix";
    Object v9 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v11).getMinimum();
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "ArgumentBuilder.nul;l.default";
    Object v15 = false;
    Object v16 = ((org.apache.commons.cli2.CommandLine)v13).getSwitch(((java.lang.String)v14),((java.lang.Boolean)v15));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = " (";
    Object v2 = "Missing.option";
    Object v3 = 5;
    Object v4 = 28;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "Command.preferredNaEme.too.short";
    Object v3 = 0;
    Object v4 = 21;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Unexpected.to~en";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "Unexpected.to~en";
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getTriggers();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v16 = ((java.util.Comparator)v15).reversed();
    Object v17 = "falsl";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v14),((java.util.Comparator)v15),((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getAnonymous();
    Object v7 = "Un#xpected.token";
    Object v8 = "Command.preferredName.too.short";
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "rgument.missing.values";
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v11).findOption(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "@";
    Object v2 = "ArgumentBuilder.negative.maximum";
    Object v3 = 1;
    Object v4 = 16;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "DISPLAY_PARENT_CHILDREN";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getAnonymous();
    Object v7 = "Un#xpected.token";
    Object v8 = "Command.preferredName.too.short";
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = "\"";
    Object v14 = "b ";
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.util.ArrayList();
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v17),((java.util.List)v18));
    Object v20 = "URLValidator.malformedURL";
    Object v21 = ((org.apache.commons.cli2.option.GroupImpl)v11).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v19),((java.lang.String)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "Option.illegal.disabled.prefix";
    Object v3 = 46;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = "  ";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "";
    Object v2 = "Command.preferredNaEme.too.short";
    Object v3 = 0;
    Object v4 = 21;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v11),((java.util.List)v12));
    Object v14 = new java.util.ArrayList();
    Object v15 = ((java.util.Collection)v14).parallelStream();
    Object v16 = "ArgumentBuilder.null.nme";
    Object v17 = "";
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.cli2.WriteableCommandLine)v13).getUndefaultedValues(((org.apache.commons.cli2.Option)v20));
    Object v22 = "Switch.no.disabldPrefix";
    Object v23 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = " (";
    Object v2 = "Missing.option";
    Object v3 = 5;
    Object v4 = 28;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new java.util.ArrayList();
    Object v8 = "Unexpected.to~en";
    Object v9 = "";
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getTriggers();
    Object v14 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v13),((java.util.Comparator)v14));
    Object v16 = 4;
    Object v17 = new java.lang.StringBuffer((((java.lang.Integer)v16).intValue()));
    Object v18 = new java.util.ArrayList();
    Object v19 = "-";
    Object v20 = "Option.illegal.disabled.prefix";
    Object v21 = 46;
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v23).getTriggers();
    Object v25 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v26 = java.util.function.Function.identity();
    Object v27 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v28 = ((java.util.Comparator)v25).thenComparing(((java.util.function.Function)v26),((java.util.Comparator)v27));
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v17),((java.util.Set)v24),((java.util.Comparator)v25));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -21;
    Object v8 = new java.util.ArrayList();
    Object v9 = "Unexpected.to~en";
    Object v10 = "";
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getTriggers();
    Object v15 = org.apache.commons.cli2.util.Comparators.requiredLast();
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v6).helpLines((((java.lang.Integer)v7).intValue()),((java.util.Set)v14),((java.util.Comparator)v15));
    org.junit.Assert.assertNotNull(v16);
  }
}
