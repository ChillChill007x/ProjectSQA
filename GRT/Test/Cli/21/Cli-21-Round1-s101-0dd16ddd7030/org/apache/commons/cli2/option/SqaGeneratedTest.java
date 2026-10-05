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
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    ((org.apache.commons.cli2.option.GroupImpl)v6).validate(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v6).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(5925032), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).hashCode();
    Object v8 = "Switch.disabled.startsWit";
    Object v9 = ((org.apache.commons.cli2.option.GroupImpl)v6).findOption(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    ((org.apache.commons.cli2.option.GroupImpl)v6).defaults(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v16 = null;
    Object v17 = new java.util.ArrayList();
    Object v18 = "\"";
    Object v19 = "b ";
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = true;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.util.ArrayList();
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v23),((java.util.List)v24));
    Object v26 = "ArgumentBuilder.null.name";
    Object v27 = ((org.apache.commons.cli2.option.GroupImpl)v6).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v25),((java.lang.String)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getMinimum();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.Option)v6).getTriggers();
    Object v8 = new java.util.ArrayList();
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v6).setParent(((org.apache.commons.cli2.Option)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).toString();
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = true;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.ArrayList();
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v14),((java.util.List)v15));
    ((org.apache.commons.cli2.option.GroupImpl)v6).validate(((org.apache.commons.cli2.WriteableCommandLine)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = new java.util.ArrayList();
    Object v9 = new java.util.ArrayList();
    Object v10 = "\"";
    Object v11 = "b ";
    Object v12 = 1;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v15).isRequired();
    Object v17 = new java.util.ArrayList();
    Object v18 = "\"";
    Object v19 = "b ";
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = true;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.util.ArrayList();
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v23),((java.util.List)v24));
    Object v26 = 1;
    Object v27 = new java.lang.StringBuffer((((java.lang.Integer)v26).intValue()));
    Object v28 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v16),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = "Unexpected.tok!n";
    Object v30 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v29));
    Object v31 = ((org.apache.commons.cli2.option.GroupImpl)v6).helpLines((((java.lang.Integer)v7).intValue()),((java.util.Set)v28),((java.util.Comparator)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = new java.util.ArrayList();
    Object v17 = "\"";
    Object v18 = "b ";
    Object v19 = 1;
    Object v20 = 0;
    Object v21 = true;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = false;
    ((org.apache.commons.cli2.WriteableCommandLine)v15).addSwitch(((org.apache.commons.cli2.Option)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    ((org.apache.commons.cli2.option.GroupImpl)v6).defaults(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -19;
    Object v8 = new java.util.ArrayList();
    Object v9 = new java.util.ArrayList();
    Object v10 = "\"";
    Object v11 = "b ";
    Object v12 = 1;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v15).isRequired();
    Object v17 = new java.util.ArrayList();
    Object v18 = "\"";
    Object v19 = "b ";
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = true;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new java.util.ArrayList();
    Object v25 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v23),((java.util.List)v24));
    Object v26 = 1;
    Object v27 = new java.lang.StringBuffer((((java.lang.Integer)v26).intValue()));
    Object v28 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v16),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = "Unexpected.tok!n";
    Object v30 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v29));
    Object v31 = ((org.apache.commons.cli2.option.GroupImpl)v6).helpLines((((java.lang.Integer)v7).intValue()),((java.util.Set)v28),((java.util.Comparator)v30));
    Object v32 = ((org.apache.commons.cli2.option.GroupImpl)v6).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).toString();
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = true;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.ArrayList();
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v14),((java.util.List)v15));
    ((org.apache.commons.cli2.option.GroupImpl)v6).defaults(((org.apache.commons.cli2.WriteableCommandLine)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = "Unexpected";
    Object v17 = ((org.apache.commons.cli2.option.GroupImpl)v6).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v15),((java.lang.String)v16));
    Object v18 = ((org.apache.commons.cli2.option.GroupImpl)v6).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).toString();
    Object v8 = 1;
    Object v9 = new java.lang.StringBuffer((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.lang.StringBuffer(((java.lang.CharSequence)v9));
    Object v11 = new java.util.ArrayList();
    Object v12 = new java.util.ArrayList();
    Object v13 = "\"";
    Object v14 = "b ";
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = true;
    Object v18 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.apache.commons.cli2.option.GroupImpl)v18).isRequired();
    Object v20 = new java.util.ArrayList();
    Object v21 = "\"";
    Object v22 = "b ";
    Object v23 = 1;
    Object v24 = 0;
    Object v25 = true;
    Object v26 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v20),((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new java.util.ArrayList();
    Object v28 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v26),((java.util.List)v27));
    Object v29 = 1;
    Object v30 = new java.lang.StringBuffer((((java.lang.Integer)v29).intValue()));
    Object v31 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v19),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = ((java.util.Set)v31).size();
    Object v33 = "Unexpected.tok!n";
    Object v34 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v33));
    Object v35 = "Command.p$eferredName.too.short";
    ((org.apache.commons.cli2.option.GroupImpl)v6).appendUsage(((java.lang.StringBuffer)v10),((java.util.Set)v31),((java.util.Comparator)v34),((java.lang.String)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = ((org.apache.commons.cli2.WriteableCommandLine)v15).getCurrentOption();
    ((org.apache.commons.cli2.option.GroupImpl)v6).validate(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).isRequired();
    Object v15 = ((org.apache.commons.cli2.option.OptionImpl)v6).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = "org.apache.commons.cli2.resource.CLIMessageBundle_en_US";
    Object v17 = ((org.apache.commons.cli2.option.GroupImpl)v6).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v15),((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getAnonymous();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v13).toString();
    Object v15 = ((org.apache.commons.cli2.option.OptionImpl)v13).getId();
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = "ClassV";
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v13).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    ((org.apache.commons.cli2.option.GroupImpl)v13).validate(((org.apache.commons.cli2.WriteableCommandLine)v22));
    Object v23 = null;
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v13).getMinimum();
    org.junit.Assert.assertEquals((Object)(-11), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Missing.option";
    Object v8 = ((org.apache.commons.cli2.option.GroupImpl)v6).findOption(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v13).hashCode();
    org.junit.Assert.assertEquals((Object)(1598933363), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v13).getParent();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getOptions();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    ((org.apache.commons.cli2.option.GroupImpl)v13).defaults(((org.apache.commons.cli2.WriteableCommandLine)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).getId();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = ((org.apache.commons.cli2.option.OptionImpl)v13).equals(((java.lang.Object)v14));
    Object v16 = "ArbumentBuilder.negative.maximum";
    Object v17 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.apache.commons.cli2.option.GroupImpl)v20).getAnonymous();
    Object v22 = "DISPLAY_ALKIASES";
    Object v23 = "Switch.enabled.startsWith.disabl";
    Object v24 = -11;
    Object v25 = 13;
    Object v26 = true;
    Object v27 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v21),((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v13).setParent(((org.apache.commons.cli2.Option)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = "";
    Object v24 = ((org.apache.commons.cli2.CommandLine)v22).getValues(((java.lang.String)v23));
    ((org.apache.commons.cli2.option.GroupImpl)v13).defaults(((org.apache.commons.cli2.WriteableCommandLine)v22));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "Switch.already.set";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = "Enum.illegal.value";
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v13).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    ((org.apache.commons.cli2.option.GroupImpl)v13).validate(((org.apache.commons.cli2.WriteableCommandLine)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = "Option.trigger.needs.prefx";
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v13).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "HelpFormatter.width.too.narrow";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v13).hashCode();
    org.junit.Assert.assertEquals((Object)(4052240), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "Argument.too.many.valu";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).hashCode();
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = true;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.ArrayList();
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v14),((java.util.List)v15));
    ((org.apache.commons.cli2.option.GroupImpl)v6).validate(((org.apache.commons.cli2.WriteableCommandLine)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = ((org.apache.commons.cli2.option.OptionImpl)v13).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.apache.commons.cli2.option.GroupImpl)v20).getAnonymous();
    Object v22 = "P";
    Object v23 = "";
    Object v24 = 15;
    Object v25 = -16;
    Object v26 = false;
    Object v27 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v21),((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((org.apache.commons.cli2.option.OptionImpl)v27).hashCode();
    Object v29 = ((org.apache.commons.cli2.option.OptionImpl)v13).equals(((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v13).toString();
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).getPreferredName();
    org.junit.Assert.assertEquals((Object)("P"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getPrefixes();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).isRequired();
    Object v15 = new java.util.ArrayList();
    Object v16 = "\"";
    Object v17 = "b ";
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = true;
    Object v21 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v15),((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new java.util.ArrayList();
    Object v23 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v21),((java.util.List)v22));
    ((org.apache.commons.cli2.option.GroupImpl)v13).defaults(((org.apache.commons.cli2.WriteableCommandLine)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getAnonymous();
    Object v15 = "Un#xpected.token";
    Object v16 = "Command.preferredName.too.short";
    Object v17 = 0;
    Object v18 = 8;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v6).setParent(((org.apache.commons.cli2.Option)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 6;
    Object v15 = new java.util.ArrayList();
    Object v16 = new java.util.ArrayList();
    Object v17 = "\"";
    Object v18 = "b ";
    Object v19 = 1;
    Object v20 = 0;
    Object v21 = true;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((org.apache.commons.cli2.option.GroupImpl)v22).isRequired();
    Object v24 = new java.util.ArrayList();
    Object v25 = "\"";
    Object v26 = "b ";
    Object v27 = 1;
    Object v28 = 0;
    Object v29 = true;
    Object v30 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v24),((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new java.util.ArrayList();
    Object v32 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v30),((java.util.List)v31));
    Object v33 = 1;
    Object v34 = new java.lang.StringBuffer((((java.lang.Integer)v33).intValue()));
    Object v35 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v23),((java.lang.Object)v32),((java.lang.Object)v34));
    Object v36 = "Unexpected.tok!n";
    Object v37 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v36));
    Object v38 = ((org.apache.commons.cli2.option.GroupImpl)v13).helpLines((((java.lang.Integer)v14).intValue()),((java.util.Set)v35),((java.util.Comparator)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.Option)v13).getPreferredName();
    Object v15 = ((org.apache.commons.cli2.option.OptionImpl)v13).getParent();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.apache.commons.cli2.option.GroupImpl)v20).getAnonymous();
    Object v22 = "Un#xpected.token";
    Object v23 = "Command.preferredName.too.short";
    Object v24 = 0;
    Object v25 = 8;
    Object v26 = true;
    Object v27 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v21),((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v13).setParent(((org.apache.commons.cli2.Option)v27));
    Object v28 = null;
    Object v29 = new java.util.ArrayList();
    Object v30 = "\"";
    Object v31 = "b ";
    Object v32 = 1;
    Object v33 = 0;
    Object v34 = true;
    Object v35 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v29),((java.lang.String)v30),((java.lang.String)v31),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new java.util.ArrayList();
    Object v37 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v35),((java.util.List)v36));
    ((org.apache.commons.cli2.option.GroupImpl)v13).validate(((org.apache.commons.cli2.WriteableCommandLine)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "DISPLAY_PARENT_ARGUMENT";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v13).getPrefixes();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getMinimum();
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = "Enum.illegal.value";
    Object v24 = new java.util.ArrayList();
    Object v25 = ((org.apache.commons.cli2.CommandLine)v22).getValue(((java.lang.String)v23),((java.lang.Object)v24));
    Object v26 = null;
    Object v27 = ((org.apache.commons.cli2.option.OptionImpl)v13).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.util.ListIterator)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getDescription();
    org.junit.Assert.assertEquals((Object)("Switch.enabled.startsWith.disabl"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    ((org.apache.commons.cli2.option.GroupImpl)v13).defaults(((org.apache.commons.cli2.WriteableCommandLine)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getTriggers();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "+";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = new java.util.ArrayList();
    Object v24 = "\"";
    Object v25 = "b ";
    Object v26 = 1;
    Object v27 = 0;
    Object v28 = true;
    Object v29 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v23),((java.lang.String)v24),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((org.apache.commons.cli2.option.GroupImpl)v29).getAnonymous();
    Object v31 = "DISPLAY_ALKIASES";
    Object v32 = "Switch.enabled.startsWith.disabl";
    Object v33 = -11;
    Object v34 = 13;
    Object v35 = true;
    Object v36 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v30),((java.lang.String)v31),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()),(((java.lang.Boolean)v35).booleanValue()));
    Object v37 = ((org.apache.commons.cli2.CommandLine)v22).getValues(((org.apache.commons.cli2.Option)v36));
    ((org.apache.commons.cli2.option.GroupImpl)v13).defaults(((org.apache.commons.cli2.WriteableCommandLine)v22));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1;
    Object v15 = new java.util.ArrayList();
    Object v16 = "\"";
    Object v17 = "b ";
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = true;
    Object v21 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v15),((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.apache.commons.cli2.option.GroupImpl)v21).getAnonymous();
    Object v23 = "Un#xpected.token";
    Object v24 = "Command.preferredName.too.short";
    Object v25 = 0;
    Object v26 = 8;
    Object v27 = true;
    Object v28 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v22),((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((org.apache.commons.cli2.option.GroupImpl)v28).getTriggers();
    Object v30 = ((java.util.Collection)v29).parallelStream();
    Object v31 = "Unexpected.tok!n";
    Object v32 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v31));
    Object v33 = ((org.apache.commons.cli2.option.GroupImpl)v13).helpLines((((java.lang.Integer)v14).intValue()),((java.util.Set)v29),((java.util.Comparator)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.apache.commons.cli2.option.GroupImpl)v20).getAnonymous();
    Object v22 = "P";
    Object v23 = "";
    Object v24 = 15;
    Object v25 = -16;
    Object v26 = false;
    Object v27 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v21),((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    ((org.apache.commons.cli2.option.OptionImpl)v13).setParent(((org.apache.commons.cli2.Option)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "Option._o.name";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1;
    Object v15 = new java.lang.StringBuffer((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.lang.StringBuffer(((java.lang.CharSequence)v15));
    Object v17 = new java.util.ArrayList();
    Object v18 = "\"";
    Object v19 = "b ";
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = true;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v23).getAnonymous();
    Object v25 = "Un#xpected.token";
    Object v26 = "Command.preferredName.too.short";
    Object v27 = 0;
    Object v28 = 8;
    Object v29 = true;
    Object v30 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v24),((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((org.apache.commons.cli2.option.GroupImpl)v30).getTriggers();
    Object v32 = "Unexpected.tok!n";
    Object v33 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v32));
    Object v34 = "Unexpected.token";
    ((org.apache.commons.cli2.option.GroupImpl)v13).appendUsage(((java.lang.StringBuffer)v16),((java.util.Set)v31),((java.util.Comparator)v33),((java.lang.String)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    ((org.apache.commons.cli2.option.GroupImpl)v13).defaults(((org.apache.commons.cli2.WriteableCommandLine)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = "-";
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v13).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getAnonymous();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v13).hashCode();
    org.junit.Assert.assertEquals((Object)(356101211), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v14));
    Object v16 = new java.util.ArrayList();
    Object v17 = "\"";
    Object v18 = "b ";
    Object v19 = 1;
    Object v20 = 0;
    Object v21 = true;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new java.util.ArrayList();
    Object v24 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v22),((java.util.List)v23));
    Object v25 = "Option.illegal.disabled.prefix";
    Object v26 = ((org.apache.commons.cli2.option.GroupImpl)v13).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v24),((java.lang.String)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 1;
    Object v9 = new java.lang.StringBuffer((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.util.ArrayList();
    Object v11 = "\"";
    Object v12 = "b ";
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = true;
    Object v16 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v10),((java.lang.String)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((org.apache.commons.cli2.option.GroupImpl)v16).getAnonymous();
    Object v18 = "DISPLAY_ALKIASES";
    Object v19 = "Switch.enabled.startsWith.disabl";
    Object v20 = -11;
    Object v21 = 13;
    Object v22 = true;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = "DISPLAY_PARENT_ARGUMENT";
    Object v25 = ((org.apache.commons.cli2.option.GroupImpl)v23).findOption(((java.lang.String)v24));
    Object v26 = ((org.apache.commons.cli2.option.GroupImpl)v23).getPrefixes();
    Object v27 = "Unexpected.tok!n";
    Object v28 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v27));
    Object v29 = "";
    ((org.apache.commons.cli2.option.GroupImpl)v7).appendUsage(((java.lang.StringBuffer)v9),((java.util.Set)v26),((java.util.Comparator)v28),((java.lang.String)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1;
    Object v15 = new java.lang.StringBuffer((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.lang.StringBuffer(((java.lang.CharSequence)v15));
    Object v17 = new java.util.ArrayList();
    Object v18 = "\"";
    Object v19 = "b ";
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = true;
    Object v23 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v17),((java.lang.String)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v23).getAnonymous();
    Object v25 = "Un#xpected.token";
    Object v26 = "Command.preferredName.too.short";
    Object v27 = 0;
    Object v28 = 8;
    Object v29 = true;
    Object v30 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v24),((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((org.apache.commons.cli2.option.GroupImpl)v30).getTriggers();
    Object v32 = "Unexpected.tok!n";
    Object v33 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v32));
    Object v34 = "value";
    ((org.apache.commons.cli2.option.GroupImpl)v13).appendUsage(((java.lang.StringBuffer)v16),((java.util.Set)v31),((java.util.Comparator)v33),((java.lang.String)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = ((org.apache.commons.cli2.option.OptionImpl)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList();
    Object v16 = new java.util.ArrayList();
    Object v17 = "\"";
    Object v18 = "b ";
    Object v19 = 1;
    Object v20 = 0;
    Object v21 = true;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((org.apache.commons.cli2.option.GroupImpl)v22).isRequired();
    Object v24 = new java.util.ArrayList();
    Object v25 = "\"";
    Object v26 = "b ";
    Object v27 = 1;
    Object v28 = 0;
    Object v29 = true;
    Object v30 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v24),((java.lang.String)v25),((java.lang.String)v26),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new java.util.ArrayList();
    Object v32 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v30),((java.util.List)v31));
    Object v33 = 1;
    Object v34 = new java.lang.StringBuffer((((java.lang.Integer)v33).intValue()));
    Object v35 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v23),((java.lang.Object)v32),((java.lang.Object)v34));
    Object v36 = "Unexpected.tok!n";
    Object v37 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v36));
    Object v38 = ((org.apache.commons.cli2.option.GroupImpl)v13).helpLines((((java.lang.Integer)v14).intValue()),((java.util.Set)v35),((java.util.Comparator)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 3;
    Object v15 = new java.util.ArrayList();
    Object v16 = "\"";
    Object v17 = "b ";
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = true;
    Object v21 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v15),((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.apache.commons.cli2.option.GroupImpl)v21).getAnonymous();
    Object v23 = "Un#xpected.token";
    Object v24 = "Command.preferredName.too.short";
    Object v25 = 0;
    Object v26 = 8;
    Object v27 = true;
    Object v28 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v22),((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((org.apache.commons.cli2.option.GroupImpl)v28).getPrefixes();
    Object v30 = ((java.util.Set)v29).size();
    Object v31 = "Unexpected.tok!n";
    Object v32 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v31));
    Object v33 = ((org.apache.commons.cli2.option.GroupImpl)v13).helpLines((((java.lang.Integer)v14).intValue()),((java.util.Set)v29),((java.util.Comparator)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1;
    Object v15 = new java.lang.StringBuffer((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.ArrayList();
    Object v17 = "\"";
    Object v18 = "b ";
    Object v19 = 1;
    Object v20 = 0;
    Object v21 = true;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((org.apache.commons.cli2.option.GroupImpl)v22).getAnonymous();
    Object v24 = "Un#xpected.token";
    Object v25 = "Command.preferredName.too.short";
    Object v26 = 0;
    Object v27 = 8;
    Object v28 = true;
    Object v29 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v23),((java.lang.String)v24),((java.lang.String)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = ((org.apache.commons.cli2.option.GroupImpl)v29).getTriggers();
    Object v31 = "Unexpected.tok!n";
    Object v32 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v31));
    ((org.apache.commons.cli2.option.GroupImpl)v13).appendUsage(((java.lang.StringBuffer)v15),((java.util.Set)v30),((java.util.Comparator)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.cli2.option.OptionImpl)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-1708440205), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    Object v8 = new java.lang.StringBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = new java.util.ArrayList();
    Object v10 = "\"";
    Object v11 = "b ";
    Object v12 = 1;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v15).getAnonymous();
    Object v17 = "DISPLAY_ALKIASES";
    Object v18 = "Switch.enabled.startsWith.disabl";
    Object v19 = -11;
    Object v20 = 13;
    Object v21 = true;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "DISPLAY_PARENT_ARGUMENT";
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v22).findOption(((java.lang.String)v23));
    Object v25 = ((org.apache.commons.cli2.option.GroupImpl)v22).getPrefixes();
    Object v26 = "Unexpected.tok!n";
    Object v27 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v26));
    Object v28 = "ArgumentBuilder.null.validator";
    ((org.apache.commons.cli2.option.GroupImpl)v6).appendUsage(((java.lang.StringBuffer)v8),((java.util.Set)v25),((java.util.Comparator)v27),((java.lang.String)v28));
    Object v29 = null;
    Object v30 = new java.util.ArrayList();
    Object v31 = "\"";
    Object v32 = "b ";
    Object v33 = 1;
    Object v34 = 0;
    Object v35 = true;
    Object v36 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v30),((java.lang.String)v31),((java.lang.String)v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()),(((java.lang.Boolean)v35).booleanValue()));
    Object v37 = new java.util.ArrayList();
    Object v38 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v36),((java.util.List)v37));
    ((org.apache.commons.cli2.option.GroupImpl)v6).defaults(((org.apache.commons.cli2.WriteableCommandLine)v38));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getOptions();
    Object v15 = "Unexpected.token";
    Object v16 = "NumberValidator.number.OutOfRange";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = false;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getOptions();
    Object v15 = "Unexpected.token";
    Object v16 = "NumberValidator.number.OutOfRange";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = false;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.apache.commons.cli2.option.OptionImpl)v20).getId();
    org.junit.Assert.assertEquals((Object)(0), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.apache.commons.cli2.option.GroupImpl)v20).getAnonymous();
    Object v22 = "Un#xpected.token";
    Object v23 = "Command.preferredName.too.short";
    Object v24 = 0;
    Object v25 = 8;
    Object v26 = true;
    Object v27 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v21),((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((org.apache.commons.cli2.option.OptionImpl)v13).equals(((java.lang.Object)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.GroupImpl)v13).getOptions();
    Object v15 = "Unexpected.token";
    Object v16 = "NumberValidator.number.OutOfRange";
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = false;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = "\"";
    Object v23 = "b ";
    Object v24 = 1;
    Object v25 = 0;
    Object v26 = true;
    Object v27 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v21),((java.lang.String)v22),((java.lang.String)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new java.util.ArrayList();
    Object v29 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v27),((java.util.List)v28));
    Object v30 = "ArgumentBuilder.null.defult";
    Object v31 = ((org.apache.commons.cli2.CommandLine)v29).getOptionCount(((java.lang.String)v30));
    Object v32 = null;
    Object v33 = ((org.apache.commons.cli2.option.OptionImpl)v20).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v29),((java.util.ListIterator)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "`   ";
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v13).findOption(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "ClassValidator.class.access";
    Object v3 = 14;
    Object v4 = -26;
    Object v5 = false;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "Un#xpected.token";
    Object v9 = "Command.preferredName.too.short";
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.cli2.option.OptionImpl)v13).toString();
    org.junit.Assert.assertEquals((Object)("[Un#xpected.token ()]"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "ClassValidator.class.access";
    Object v3 = 14;
    Object v4 = -26;
    Object v5 = false;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getTriggers();
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = true;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.util.ArrayList();
    Object v16 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v14),((java.util.List)v15));
    ((org.apache.commons.cli2.option.GroupImpl)v6).validate(((org.apache.commons.cli2.WriteableCommandLine)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.cli2.option.GroupImpl)v7).getTriggers();
    Object v9 = new java.util.ArrayList();
    Object v10 = "\"";
    Object v11 = "b ";
    Object v12 = 1;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.util.ArrayList();
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v16));
    ((org.apache.commons.cli2.option.GroupImpl)v7).defaults(((org.apache.commons.cli2.WriteableCommandLine)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "DISPLAY_ALKIASES";
    Object v9 = "Switch.enabled.startsWith.disabl";
    Object v10 = -11;
    Object v11 = 13;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = "\"";
    Object v16 = "b ";
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = true;
    Object v20 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v14),((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new java.util.ArrayList();
    Object v22 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v20),((java.util.List)v21));
    Object v23 = "Une_xpected.token";
    Object v24 = ((org.apache.commons.cli2.option.GroupImpl)v13).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v22),((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "ClassValidator.class.access";
    Object v3 = 14;
    Object v4 = -26;
    Object v5 = false;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    Object v8 = new java.lang.StringBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = "a";
    Object v10 = ((java.lang.StringBuffer)v8).indexOf(((java.lang.String)v9));
    Object v11 = new java.util.ArrayList();
    Object v12 = new java.util.ArrayList();
    Object v13 = "\"";
    Object v14 = "b ";
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = true;
    Object v18 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v12),((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.apache.commons.cli2.option.GroupImpl)v18).isRequired();
    Object v20 = new java.util.ArrayList();
    Object v21 = "\"";
    Object v22 = "b ";
    Object v23 = 1;
    Object v24 = 0;
    Object v25 = true;
    Object v26 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v20),((java.lang.String)v21),((java.lang.String)v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new java.util.ArrayList();
    Object v28 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v26),((java.util.List)v27));
    Object v29 = 1;
    Object v30 = new java.lang.StringBuffer((((java.lang.Integer)v29).intValue()));
    Object v31 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v19),((java.lang.Object)v28),((java.lang.Object)v30));
    Object v32 = "Unexpected.tok!n";
    Object v33 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v32));
    Object v34 = "ArgumentBuilder.null.defaults";
    ((org.apache.commons.cli2.option.GroupImpl)v6).appendUsage(((java.lang.StringBuffer)v8),((java.util.Set)v31),((java.util.Comparator)v33),((java.lang.String)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 5;
    Object v9 = new java.util.ArrayList();
    Object v10 = "\"";
    Object v11 = "b ";
    Object v12 = 1;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.cli2.option.GroupImpl)v15).getAnonymous();
    Object v17 = "Un#xpected.token";
    Object v18 = "Command.preferredName.too.short";
    Object v19 = 0;
    Object v20 = 8;
    Object v21 = true;
    Object v22 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v16),((java.lang.String)v17),((java.lang.String)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((org.apache.commons.cli2.option.GroupImpl)v22).getTriggers();
    Object v24 = "Unexpected.tok!n";
    Object v25 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v24));
    Object v26 = ((org.apache.commons.cli2.option.GroupImpl)v7).helpLines((((java.lang.Integer)v8).intValue()),((java.util.Set)v23),((java.util.Comparator)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    Object v2 = "ArgumentBuilder.null.nme";
    Object v3 = "";
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.cli2.option.GroupImpl)v7).getOptions();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "ClassValidator.class.access";
    Object v3 = 14;
    Object v4 = -26;
    Object v5 = false;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = "Unexpected.token";
    Object v17 = new java.util.ArrayList();
    Object v18 = ((org.apache.commons.cli2.CommandLine)v15).getValues(((java.lang.String)v16),((java.util.List)v17));
    ((org.apache.commons.cli2.option.GroupImpl)v6).validate(((org.apache.commons.cli2.WriteableCommandLine)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "\"";
    Object v2 = "b ";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.GroupImpl)v6).getAnonymous();
    Object v8 = "P";
    Object v9 = "";
    Object v10 = 15;
    Object v11 = -16;
    Object v12 = false;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = -39;
    Object v15 = new java.util.ArrayList();
    Object v16 = "\"";
    Object v17 = "b ";
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = true;
    Object v21 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v15),((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.apache.commons.cli2.option.GroupImpl)v21).getAnonymous();
    Object v23 = "Un#xpected.token";
    Object v24 = "Command.preferredName.too.short";
    Object v25 = 0;
    Object v26 = 8;
    Object v27 = true;
    Object v28 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v22),((java.lang.String)v23),((java.lang.String)v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((org.apache.commons.cli2.option.GroupImpl)v28).getPrefixes();
    Object v30 = "Unexpected.tok!n";
    Object v31 = org.apache.commons.cli2.util.Comparators.namedLast(((java.lang.String)v30));
    Object v32 = ((org.apache.commons.cli2.option.GroupImpl)v13).helpLines((((java.lang.Integer)v14).intValue()),((java.util.Set)v29),((java.util.Comparator)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "ClassValidator.class.access";
    Object v3 = 14;
    Object v4 = -26;
    Object v5 = false;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "\"";
    Object v9 = "b ";
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = true;
    Object v13 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v7),((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.ArrayList();
    Object v15 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v13),((java.util.List)v14));
    Object v16 = "ClassValidator.class.notfound";
    Object v17 = ((org.apache.commons.cli2.option.GroupImpl)v6).canProcess(((org.apache.commons.cli2.WriteableCommandLine)v15),((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "ClassValidator.class.access";
    Object v3 = 14;
    Object v4 = -26;
    Object v5 = false;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.Option)v6).getTriggers();
    Object v8 = new java.util.ArrayList();
    Object v9 = "\"";
    Object v10 = "b ";
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = true;
    Object v14 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v8),((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.apache.commons.cli2.option.GroupImpl)v14).getAnonymous();
    Object v16 = "Un#xpected.token";
    Object v17 = "Command.preferredName.too.short";
    Object v18 = 0;
    Object v19 = 8;
    Object v20 = true;
    Object v21 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v15),((java.lang.String)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.apache.commons.cli2.option.GroupImpl)v21).getPrefixes();
    Object v23 = ((org.apache.commons.cli2.option.OptionImpl)v6).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "ClassValidator.class.access";
    Object v3 = 14;
    Object v4 = -26;
    Object v5 = false;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.cli2.option.OptionImpl)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(1188710615), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new java.util.ArrayList();
    Object v1 = "-";
    Object v2 = "ClassValidator.class.access";
    Object v3 = 14;
    Object v4 = -26;
    Object v5 = false;
    Object v6 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Missin~.option";
    Object v8 = ((org.apache.commons.cli2.option.GroupImpl)v6).findOption(((java.lang.String)v7));
    Object v9 = new java.util.ArrayList();
    Object v10 = "\"";
    Object v11 = "b ";
    Object v12 = 1;
    Object v13 = 0;
    Object v14 = true;
    Object v15 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v9),((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.util.ArrayList();
    Object v17 = new org.apache.commons.cli2.commandline.WriteableCommandLineImpl(((org.apache.commons.cli2.Option)v15),((java.util.List)v16));
    Object v18 = new java.util.ArrayList();
    Object v19 = "-";
    Object v20 = "ClassValidator.class.access";
    Object v21 = 14;
    Object v22 = -26;
    Object v23 = false;
    Object v24 = new org.apache.commons.cli2.option.GroupImpl(((java.util.List)v18),((java.lang.String)v19),((java.lang.String)v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new java.util.ArrayList();
    ((org.apache.commons.cli2.WriteableCommandLine)v17).setDefaultValues(((org.apache.commons.cli2.Option)v24),((java.util.List)v25));
    Object v26 = null;
    ((org.apache.commons.cli2.option.GroupImpl)v6).validate(((org.apache.commons.cli2.WriteableCommandLine)v17));
    Object v27 = null;
      org.junit.Assert.fail("Expected org.apache.commons.cli2.OptionException");
    } catch (org.apache.commons.cli2.OptionException expected) { }
  }
}
