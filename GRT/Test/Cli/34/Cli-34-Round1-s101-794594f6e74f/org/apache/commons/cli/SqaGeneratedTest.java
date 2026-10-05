package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = false;
    ((org.apache.commons.cli.Option)v2).setRequired((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).hasLongOpt();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    org.junit.Assert.assertEquals((Object)("[ option:   :: - :: class java.lang.String ]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Exception found c";
    ((org.apache.commons.cli.Option)v2).setDescription(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).acceptsArg();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli.Option)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getKey();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli.Option)v5).getKey();
    Object v7 = ((org.apache.commons.cli.Option)v2).equals(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.cli.Option)v2).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 56;
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Option)v2).hasArg();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "usage: ";
    Object v1 = "";
    Object v2 = false;
    Object v3 = "--";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasValueSeparator();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "U";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("U"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "1/";
    ((org.apache.commons.cli.Option)v2).setLongOpt(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).getValue();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getValue();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 34;
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).acceptsArg();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = Character.valueOf((char)1);
    ((org.apache.commons.cli.Option)v2).setValueSeparator((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).hasArgName();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasArg();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = "Default ption wasn't defined";
    Object v2 = false;
    Object v3 = "-";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasArgName();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ")";
    ((org.apache.commons.cli.Option)v2).setLongOpt(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "";
    ((org.apache.commons.cli.Option)v2).setDescription(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasLongOpt();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "5-";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("5-"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    ((org.apache.commons.cli.Option)v2).setOptionalArg((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = " to desied type: ";
    Object v6 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(" to desied type: "), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "-";
    ((org.apache.commons.cli.Option)v2).setLongOpt(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).requiresArg();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getValues();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = Character.valueOf((char)1);
    ((org.apache.commons.cli.Option)v5).setValueSeparator((((java.lang.Character)v6).charValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.Option)v5).hasArgName();
    Object v9 = ((org.apache.commons.cli.Option)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "--";
    ((org.apache.commons.cli.Option)v2).setArgName(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "-";
    ((org.apache.commons.cli.Option)v2).addValueForProcessing(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getValueSeparator();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = " [ARG]";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = "--";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "yes";
    ((org.apache.commons.cli.Option)v2).addValueForProcessing(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    ((org.apache.commons.cli.Option)v2).clearValues();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = Character.valueOf((char)1);
    ((org.apache.commons.cli.Option)v2).setValueSeparator((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).hasLongOpt();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 34;
    ((org.apache.commons.cli.Option)v2).setArgs((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.cli.Option)v2).clearValues();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Cannot add value, list full.";
    ((org.apache.commons.cli.Option)v2).setDescription(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).hasArgName();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = "(";
    Object v2 = false;
    Object v3 = "-";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = Character.valueOf((char)1);
    ((org.apache.commons.cli.Option)v4).setValueSeparator((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    Object v7 = ">";
    ((org.apache.commons.cli.Option)v4).setDescription(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).toString();
    org.junit.Assert.assertEquals((Object)("[ option:    [ARG] ::  :: class java.lang.String ]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = false;
    ((org.apache.commons.cli.Option)v4).setOptionalArg((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = -1;
    ((org.apache.commons.cli.Option)v4).setArgs((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.cli.Option)v4).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = " [ARG]";
    Object v6 = ((org.apache.commons.cli.Option)v4).getValue(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Option)v4).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "-";
    Object v7 = new org.apache.commons.cli.Option(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "5-";
    Object v9 = ((org.apache.commons.cli.Option)v7).getValue(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.cli.Option)v4).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "--";
    Object v6 = ((org.apache.commons.cli.Option)v4).getValue(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("--"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = " [-RG]";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getLongOpt();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "-";
    Object v7 = new org.apache.commons.cli.Option(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.apache.commons.cli.Option)v7).getType();
    ((org.apache.commons.cli.Option)v4).setType(((java.lang.Class)v8));
    Object v9 = null;
    Object v10 = ((org.apache.commons.cli.Option)v4).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    ((org.apache.commons.cli.Option)v2).setOptionalArg((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).getValues();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 8;
    ((org.apache.commons.cli.Option)v2).setArgs((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = "[";
    Object v2 = true;
    Object v3 = "--";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "";
    Object v7 = true;
    Object v8 = "";
    Object v9 = new org.apache.commons.cli.Option(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.cli.Option)v9).hasLongOpt();
    Object v11 = ((org.apache.commons.cli.Option)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getArgName();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.Option)v4).getValue(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("-"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Unrecognized option: ";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v2).acceptsArg();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = " H";
    Object v1 = "-";
    Object v2 = false;
    Object v3 = "The option '";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = false;
    ((org.apache.commons.cli.Option)v2).setOptionalArg((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = 4;
    Object v6 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).getValue();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).getId();
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hashCode();
    Object v4 = ((org.apache.commons.cli.Option)v2).requiresArg();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = Character.valueOf((char)1);
    ((org.apache.commons.cli.Option)v4).setValueSeparator((((java.lang.Character)v5).charValue()));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = ((org.apache.commons.cli.Option)v4).getValue((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).hasArg();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).getValueSeparator();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).requiresArg();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Y--";
    Object v4 = ((org.apache.commons.cli.Option)v2).addValue(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = Character.valueOf((char)65535);
    ((org.apache.commons.cli.Option)v3).setValueSeparator((((java.lang.Character)v4).charValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.cli.Option)v3).requiresArg();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = -1;
    Object v6 = ((org.apache.commons.cli.Option)v4).getValue((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getDescription();
    org.junit.Assert.assertEquals((Object)("-"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = Character.valueOf((char)0);
    ((org.apache.commons.cli.Option)v2).setValueSeparator((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = "-";
    Object v5 = ((org.apache.commons.cli.Option)v3).getValue(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("-"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = -13;
    Object v6 = ((org.apache.commons.cli.Option)v4).getValue((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = "--";
    Object v5 = ((org.apache.commons.cli.Option)v3).getValue(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli.Option)v3).getValues();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).hasValueSeparator();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "-";
    ((org.apache.commons.cli.Option)v4).setDescription(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "-H";
    Object v1 = ", ";
    Object v2 = false;
    Object v3 = "-";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = "-";
    ((org.apache.commons.cli.Option)v3).setArgName(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).toString();
    org.junit.Assert.assertEquals((Object)("[ option:   [ARG] :: --! :: class java.lang.String ]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).acceptsArg();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = "--";
    Object v2 = true;
    Object v3 = "Unrecognized option: ";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "F";
    ((org.apache.commons.cli.Option)v2).setArgName(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).toString();
    org.junit.Assert.assertEquals((Object)("[ option:   :: - :: class java.lang.String ]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).hasOptionalArg();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).getKey();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = "--";
    ((org.apache.commons.cli.Option)v4).setLongOpt(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = "";
    Object v8 = "-";
    Object v9 = new org.apache.commons.cli.Option(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.cli.Option)v9).acceptsArg();
    Object v11 = ((org.apache.commons.cli.Option)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = " ";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(" "), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).hasArgName();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "1";
    ((org.apache.commons.cli.Option)v2).setArgName(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).getKey();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).getValues();
    Object v6 = " ";
    ((org.apache.commons.cli.Option)v4).setDescription(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = true;
    ((org.apache.commons.cli.Option)v3).setRequired((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.cli.Option)v3).acceptsArg();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = true;
    Object v3 = "";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v4).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }
}
