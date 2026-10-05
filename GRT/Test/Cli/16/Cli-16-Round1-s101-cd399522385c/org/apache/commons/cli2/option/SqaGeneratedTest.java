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
    Object v6 = new java.util.ArrayList();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    ((org.apache.commons.cli2.option.GroupImpl)v5).validate(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.option.GroupImpl)v7).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-491263886), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v11 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v9),((java.util.Comparator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = "Cannot.burst";
    Object v17 = ((org.apache.commons.cli2.CommandLine)v15).getSwitch(((java.lang.String)v16));
    ((org.apache.commons.cli2.option.GroupImpl)v7).defaults(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = new java.lang.StringBuffer(((java.lang.String)v6));
    Object v8 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new java.util.TreeSet(((java.util.SortedSet)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = "DISPLAY_PARENT_ARGUMENT";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v10),((java.util.Comparator)v11),((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = new java.util.ArrayList();
    Object v17 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v18 = new java.util.TreeSet(((java.util.Comparator)v17));
    Object v19 = new java.util.TreeSet(((java.util.SortedSet)v18));
    Object v20 = ((java.util.List)v16).removeAll(((java.util.Collection)v19));
    Object v21 = "(";
    Object v22 = "Enum.illegal.value";
    Object v23 = 0;
    Object v24 = 0;
    Object v25 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.cli2.CommandLine)v15).getOptionCount(((org.apache.commons.cli2.Option)v25));
    Object v27 = "T";
    Object v28 = ((org.apache.commons.cli2.option.GroupImpl)v7).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v15),((java.lang.String)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.option.OptionImpl)v9).toString();
    org.junit.Assert.assertEquals((Object)("[( ()]"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "Argument.unexpected.value";
    Object v11 = new java.lang.StringBuffer(((java.lang.String)v10));
    Object v12 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v13 = new java.util.TreeSet(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v15 = "Option.missing.required";
    ((org.apache.commons.cli2.option.GroupImpl)v9).appendUsage(((java.lang.StringBuffer)v11),((java.util.Set)v13),((java.util.Comparator)v14),((java.lang.String)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    ((org.apache.commons.cli2.option.GroupImpl)v7).defaults(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.option.GroupImpl)v9).getDescription();
    org.junit.Assert.assertEquals((Object)("Enum.illegal.value"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
  public void test16() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v7).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v10),((java.util.Comparator)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.option.OptionImpl)v9).toString();
    Object v11 = new java.util.ArrayList();
    Object v12 = "\"";
    Object v13 = "b ";
    Object v14 = 1;
    Object v15 = 0;
    Object v16 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v11),((java.lang.String)v12),((java.lang.String)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new java.util.ArrayList();
    Object v18 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v16),((java.util.List)v17));
    ((org.apache.commons.cli2.option.GroupImpl)v9).validate(((org.apache.commons.cli2.WriteableCommandLine)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.ArrayList();
    Object v11 = ((org.apache.commons.cli2.option.OptionImpl)v9).equals(((java.lang.Object)v10));
    Object v12 = "Argument.unexpected.value";
    Object v13 = new java.lang.StringBuffer(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v9).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = "Unexpected.token";
    Object v17 = ((org.apache.commons.cli2.option.GroupImpl)v7).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v15),((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.ArrayList();
    Object v11 = "\"";
    Object v12 = "b ";
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.ArrayList();
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v16));
    ((org.apache.commons.cli2.option.GroupImpl)v9).validate(((org.apache.commons.cli2.WriteableCommandLine)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
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
  public void test22() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "DI";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = new java.util.ArrayList();
    Object v17 = new java.util.ArrayList();
    Object v18 = ((java.util.List)v16).retainAll(((java.util.Collection)v17));
    Object v19 = "true";
    Object v20 = "Unexpected.token";
    Object v21 = 6;
    Object v22 = -25;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "Unexpected.token";
    Object v25 = ((org.apache.commons.cli2.CommandLine)v15).getProperty(((org.apache.commons.cli2.Option)v23),((java.lang.String)v24));
    ((org.apache.commons.cli2.option.GroupImpl)v7).validate(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v26 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v7).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v13 = "DISPLAY_ALKIASES";
    Object v14 = "Switch.enabled.startsWith.disabl";
    Object v15 = 13;
    Object v16 = -2;
    Object v17 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "ArgumentBuilder.$ull.consume.remaining";
    Object v11 = ((org.apache.commons.cli2.option.GroupImpl)v9).findOption(((java.lang.String)v10));
    Object v12 = "Argument.unexpected.value";
    Object v13 = new java.lang.StringBuffer(((java.lang.String)v12));
    Object v14 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v18 = "Option.illegal.disabled.prefix";
    ((org.apache.commons.cli2.option.GroupImpl)v9).appendUsage(((java.lang.StringBuffer)v13),((java.util.Set)v16),((java.util.Comparator)v17),((java.lang.String)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -46;
    Object v7 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v11 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v9),((java.util.Comparator)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
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
  public void test28() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "Argument.unexpected.value";
    Object v9 = ((org.apache.commons.cli2.option.GroupImpl)v7).findOption(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v7).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v13 = "DISPLAY_ALKIASES";
    Object v14 = "Switch.enabled.startsWith.disabl";
    Object v15 = 13;
    Object v16 = -2;
    Object v17 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.apache.commons.cli2.option.GroupImpl)v17).getMaximum();
    org.junit.Assert.assertEquals((Object)(-2), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.option.GroupImpl)v9).getMinimum();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
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
  public void test34() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).getId();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getAnonymous();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
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
    Object v14 = "orgapache.commons.cli2.resource.bundle";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v7).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v13 = "DISPLAY_ALKIASES";
    Object v14 = "Switch.enabled.startsWith.disabl";
    Object v15 = 13;
    Object v16 = -2;
    Object v17 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.util.ArrayList();
    Object v19 = "\"";
    Object v20 = "b ";
    Object v21 = 1;
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new java.util.ArrayList();
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v23),((java.util.List)v24));
    ((org.apache.commons.cli2.option.GroupImpl)v17).validate(((org.apache.commons.cli2.WriteableCommandLine)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = new java.lang.StringBuffer(((java.lang.String)v6));
    Object v8 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v9),((java.util.Comparator)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v7).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v13 = "DISPLAY_ALKIASES";
    Object v14 = "Switch.enabled.startsWith.disabl";
    Object v15 = 13;
    Object v16 = -2;
    Object v17 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.util.ArrayList();
    Object v19 = "\"";
    Object v20 = "b ";
    Object v21 = 1;
    Object v22 = 0;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new java.util.ArrayList();
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v23),((java.util.List)v24));
    Object v26 = "HelpFormatter.width.too";
    Object v27 = ((org.apache.commons.cli2.option.GroupImpl)v17).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v25),((java.lang.String)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v11 = ((java.util.Comparator)v10).reversed();
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v9),((java.util.Comparator)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getTriggers();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v7).getParent();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.ArrayList();
    Object v14 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v13));
    ((org.apache.commons.cli2.option.GroupImpl)v6).validate(((org.apache.commons.cli2.WriteableCommandLine)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    Object v3 = new java.util.TreeSet(((java.util.SortedSet)v2));
    Object v4 = ((java.util.List)v0).removeAll(((java.util.Collection)v3));
    Object v5 = "(";
    Object v6 = "Enum.illegal.value";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.cli2.option.OptionImpl)v9).hashCode();
    Object v11 = "";
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v9).findOption(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
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
    Object v14 = new java.util.ArrayList();
    Object v15 = "ClassValidator.bad.classname";
    Object v16 = "Unexpected.token";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = false;
    Object v21 = ((org.apache.commons.cli2.CommandLine)v13).getSwitch(((org.apache.commons.cli2.Option)v19),((java.lang.Boolean)v20));
    Object v22 = " X";
    Object v23 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "Argument.unexpected.value";
    Object v9 = new java.lang.StringBuffer(((java.lang.String)v8));
    Object v10 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v11 = new java.util.TreeSet(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v13 = "-";
    ((org.apache.commons.cli2.option.GroupImpl)v7).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v11),((java.util.Comparator)v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getPreferredName();
    org.junit.Assert.assertEquals((Object)("En]m.illegal.value"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(549653169), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "\"";
    Object v8 = "b ";
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v11).equals(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).toString();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(193070154), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "r";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getOptions();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v11).getAnonymous();
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "ClassValidator.bad.classname";
    Object v9 = "Unexpected.token";
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v6).setParent(((org.apache.commons.cli2.Option)v12));
    Object v13 = null;
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v6).getDescription();
    org.junit.Assert.assertEquals((Object)("Argument.too.many.defauuts"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(1039100923), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getOptions();
    Object v7 = "org.apache.commons.cli2.resource.bundle";
    Object v8 = "Argument.too.many.valu";
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getMinimum();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Command.preferredNme.too.short";
    Object v2 = "@";
    Object v3 = 23;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = new java.lang.StringBuffer(((java.lang.String)v6));
    Object v8 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new java.util.TreeSet(((java.util.SortedSet)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = "";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v10),((java.util.Comparator)v11),((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
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
    Object v14 = "Option.missing.required";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Missing.optio(n";
    Object v2 = "Arument.too.few.defaults";
    Object v3 = 2;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Missing.optio(n";
    Object v2 = "Arument.too.few.defaults";
    Object v3 = 2;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Unexpected.to~en";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.util.ArrayList();
    Object v2 = ((java.util.List)v0).retainAll(((java.util.Collection)v1));
    Object v3 = "true";
    Object v4 = "Unexpected.token";
    Object v5 = 6;
    Object v6 = -25;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = ((org.apache.commons.cli2.option.GroupImpl)v7).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v13 = "DISPLAY_ALKIASES";
    Object v14 = "Switch.enabled.startsWith.disabl";
    Object v15 = 13;
    Object v16 = -2;
    Object v17 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v19 = new java.util.TreeSet(((java.util.Comparator)v18));
    Object v20 = new java.util.TreeSet(((java.util.SortedSet)v19));
    Object v21 = ((org.apache.commons.cli2.option.OptionImpl)v17).equals(((java.lang.Object)v20));
    Object v22 = new java.util.ArrayList();
    Object v23 = "\"";
    Object v24 = "b ";
    Object v25 = 1;
    Object v26 = 0;
    Object v27 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v22),((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = new java.util.ArrayList();
    Object v29 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v27),((java.util.List)v28));
    ((org.apache.commons.cli2.option.GroupImpl)v17).defaults(((org.apache.commons.cli2.WriteableCommandLine)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).toString();
    org.junit.Assert.assertEquals((Object)("[Argument.unexp/ected.value ()]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.Option)v5).getTriggers();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(549653169), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = " (";
    Object v2 = "Missing.option";
    Object v3 = 9;
    Object v4 = 28;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Missing.optio(n";
    Object v2 = "Arument.too.few.defaults";
    Object v3 = 2;
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
  public void test72() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getOptions();
    Object v7 = "org.apache.commons.cli2.resource.bundle";
    Object v8 = "Argument.too.many.valu";
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = "\"";
    Object v14 = "b ";
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.util.ArrayList();
    Object v19 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v17),((java.util.List)v18));
    ((org.apache.commons.cli2.option.GroupImpl)v11).validate(((org.apache.commons.cli2.WriteableCommandLine)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getOptions();
    Object v7 = "org.apache.commons.cli2.resource.bundle";
    Object v8 = "Argument.too.many.valu";
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Argument.unexpected.value";
    Object v13 = new java.lang.StringBuffer(((java.lang.String)v12));
    Object v14 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = new java.util.ArrayList();
    Object v17 = ((java.util.Set)v15).removeAll(((java.util.Collection)v16));
    Object v18 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v19 = "-}";
    ((org.apache.commons.cli2.option.GroupImpl)v11).appendUsage(((java.lang.StringBuffer)v13),((java.util.Set)v15),((java.util.Comparator)v18),((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = new java.lang.StringBuffer(((java.lang.String)v6));
    Object v8 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new java.util.TreeSet(((java.util.SortedSet)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = "Unexpected.toen";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v10),((java.util.Comparator)v11),((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Command.preferredNme.too.short";
    Object v2 = "@";
    Object v3 = 23;
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
    Object v14 = "DISPLAY_ARGUMENT_NUMBERED";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v5).getMaximum();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Command.preferredNme.too.short";
    Object v2 = "@";
    Object v3 = 23;
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
    Object v23 = null;
    ((org.apache.commons.cli2.option.GroupImpl)v5).process(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.util.ListIterator)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = ((java.util.List)v6).listIterator();
    Object v8 = "En]m.illegal.value";
    Object v9 = "Argument.too.many.defauuts";
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
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
    Object v14 = "SourceDestArgument";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v13),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Missing.optio(n";
    Object v2 = "Arument.too.few.defaults";
    Object v3 = 2;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.OptionImpl)v5).toString();
    org.junit.Assert.assertEquals((Object)("Missing.optio(n ()"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
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
  public void test81() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getOptions();
    Object v7 = "org.apache.commons.cli2.resource.bundle";
    Object v8 = "Argument.too.many.valu";
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "-D";
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v11).findOption(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Missing.optio(n";
    Object v2 = "Arument.too.few.defaults";
    Object v3 = 2;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v10 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v8),((java.util.Comparator)v9));
    Object v11 = 0;
    Object v12 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v13 = new java.util.TreeSet(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v11).intValue()),((java.util.Set)v13),((java.util.Comparator)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = new java.lang.StringBuffer(((java.lang.String)v6));
    Object v8 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v11 = new java.util.TreeSet(((java.util.Comparator)v10));
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = ((java.util.Set)v9).retainAll(((java.util.Collection)v12));
    Object v14 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v15 = "Un";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v9),((java.util.Comparator)v14),((java.lang.String)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getPrefixes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Missing.optio(n";
    Object v2 = "Arument.too.few.defaults";
    Object v3 = 2;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "SourceDestArgu.ment";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.List)v0).listIterator();
    Object v2 = "En]m.illegal.value";
    Object v3 = "Argument.too.many.defauuts";
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new java.util.ArrayList();
    Object v14 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v12),((java.util.List)v13));
    Object v15 = "org.apache.commons.cli2.resource.CLI";
    Object v16 = ((org.apache.commons.cli2.Option)v6).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v14),((java.lang.String)v15));
    Object v17 = new java.util.ArrayList();
    Object v18 = "Argument.unexp/ected.value";
    Object v19 = "-";
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v6).setParent(((org.apache.commons.cli2.Option)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Option._o.name";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Command.preferredNme.too.short";
    Object v2 = "@";
    Object v3 = 23;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = "Unexpected.to~en";
    Object v8 = "";
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v5).setParent(((org.apache.commons.cli2.Option)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Unexpected.to~en";
    Object v2 = "";
    Object v3 = 0;
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
    Object v14 = new java.util.ArrayList();
    Object v15 = "Missing.optio(n";
    Object v16 = "Arument.too.few.defaults";
    Object v17 = 2;
    Object v18 = 0;
    Object v19 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new java.util.ArrayList();
    Object v21 = "ClassValidator.bad.classname";
    Object v22 = "Unexpected.token";
    Object v23 = 1;
    Object v24 = 1;
    Object v25 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v20),((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.cli2.option.GroupImpl)v25).getOptions();
    Object v27 = "org.apache.commons.cli2.resource.bundle";
    Object v28 = "Argument.too.many.valu";
    Object v29 = 0;
    Object v30 = 1;
    Object v31 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v26),((java.lang.String)v27),((java.lang.String)v28),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((org.apache.commons.cli2.CommandLine)v13).getValue(((org.apache.commons.cli2.Option)v19),((java.lang.Object)v31));
    ((org.apache.commons.cli2.option.GroupImpl)v5).defaults(((org.apache.commons.cli2.WriteableCommandLine)v13));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = " (";
    Object v2 = "Missing.option";
    Object v3 = 9;
    Object v4 = 28;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = ((java.util.List)v6).removeAll(((java.util.Collection)v9));
    Object v11 = "(";
    Object v12 = "Enum.illegal.value";
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v6),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v15).getDescription();
    Object v17 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Command.preferredNme.too.short";
    Object v2 = "@";
    Object v3 = 23;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Unexpected.token";
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v5).findOption(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "ClassValidator.bad.classname";
    Object v2 = "Unexpected.token";
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getPreferredName();
    org.junit.Assert.assertEquals((Object)("ClassValidator.bad.classname"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -18;
    Object v7 = new java.util.ArrayList();
    Object v8 = "Argument.unexp/ected.value";
    Object v9 = "-";
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.cli2.option.GroupImpl)v12).getPrefixes();
    Object v14 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v15 = ((java.util.Comparator)v14).reversed();
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v5).helpLines((((java.lang.Integer)v6).intValue()),((java.util.Set)v13),((java.util.Comparator)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Argument.unexp/ected.value";
    Object v2 = "-";
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = new java.lang.StringBuffer(((java.lang.String)v6));
    Object v8 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new java.util.TreeSet(((java.util.SortedSet)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v12 = "";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v10),((java.util.Comparator)v11),((java.lang.String)v12));
    Object v13 = null;
    Object v14 = "Argument.unexpected.value";
    Object v15 = new java.lang.StringBuffer(((java.lang.String)v14));
    Object v16 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    Object v18 = new java.util.TreeSet(((java.util.SortedSet)v17));
    Object v19 = new java.util.ArrayList();
    Object v20 = "Argument.unexp/ected.value";
    Object v21 = "-";
    Object v22 = 0;
    Object v23 = 1;
    Object v24 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v19),((java.lang.String)v20),((java.lang.String)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = new java.util.ArrayList();
    Object v26 = ((org.apache.commons.cli2.option.OptionImpl)v24).equals(((java.lang.Object)v25));
    Object v27 = ((java.util.Set)v18).contains(((java.lang.Object)v26));
    Object v28 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v29 = "ArgumentBuilder.negative.minimum";
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v15),((java.util.Set)v18),((java.util.Comparator)v28),((java.lang.String)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getAnonymous();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Missing.optio(n";
    Object v2 = "Arument.too.few.defaults";
    Object v3 = 2;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Argument.unexpected.value";
    Object v7 = new java.lang.StringBuffer(((java.lang.String)v6));
    Object v8 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = new java.util.TreeSet(((java.util.SortedSet)v9));
    Object v11 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v7),((java.util.Set)v10),((java.util.Comparator)v11));
    Object v12 = null;
    Object v13 = "Argument.unexpected.value";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = new java.util.ArrayList();
    Object v16 = ((java.util.List)v15).listIterator();
    Object v17 = "En]m.illegal.value";
    Object v18 = "Argument.too.many.defauuts";
    Object v19 = 0;
    Object v20 = 0;
    Object v21 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v15),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.cli2.option.GroupImpl)v21).getTriggers();
    Object v23 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v24 = java.util.function.Function.identity();
    Object v25 = org.apache.commons.cli2.option.ReverseStringComparator.getInstance();
    Object v26 = ((java.util.Comparator)v23).thenComparing(((java.util.function.Function)v24),((java.util.Comparator)v25));
    ((org.apache.commons.cli2.option.GroupImpl)v5).appendUsage(((java.lang.StringBuffer)v14),((java.util.Set)v22),((java.util.Comparator)v23));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "Command.preferredNme.too.short";
    Object v2 = "@";
    Object v3 = 23;
    Object v4 = 0;
    Object v5 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli2.option.GroupImpl)v5).getTriggers();
    org.junit.Assert.assertNotNull(v6);
  }
}
