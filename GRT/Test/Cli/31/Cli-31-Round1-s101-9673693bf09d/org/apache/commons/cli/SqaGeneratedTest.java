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
    org.junit.Assert.assertEquals((Object)("[ option:   :: - ]"), v3);
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
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    ((org.apache.commons.cli.Option)v2).setType(((java.lang.Object)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.cli.Option)v2).hasArg();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v2).hasLongOpt();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v2).getType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getValues();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = 36;
    Object v5 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasArgName();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getValue();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 31;
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v3).intValue()));
    Object v5 = "--";
    Object v6 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("--"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasValueSeparator();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).toString();
    Object v4 = "I-";
    ((org.apache.commons.cli.Option)v2).addValueForProcessing(((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).acceptsArg();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    ((org.apache.commons.cli.Option)v2).setRequired((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "--";
    Object v6 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("--"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli.Option)v5).hasArgName();
    ((org.apache.commons.cli.Option)v2).setType(((java.lang.Object)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.Option)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    ((org.apache.commons.cli.Option)v2).addValueForProcessing(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasArg();
    org.junit.Assert.assertEquals((Object)(false), v3);
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
    Object v3 = ((org.apache.commons.cli.Option)v2).getValue();
    Object v4 = ((org.apache.commons.cli.Option)v2).getKey();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getDescription();
    org.junit.Assert.assertEquals((Object)("-"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "m ";
    ((org.apache.commons.cli.Option)v2).addValueForProcessing(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = 0;
    Object v5 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).requiresArg();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "-3";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("-3"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).getValues();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli.Option)v5).getDescription();
    ((org.apache.commons.cli.Option)v2).setType(((java.lang.Object)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.Option)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = false;
    ((org.apache.commons.cli.Option)v5).setRequired((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.Option)v5).hasLongOpt();
    ((org.apache.commons.cli.Option)v2).setType(((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = "-`";
    Object v2 = false;
    Object v3 = "-6-";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).getArgName();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).toString();
    Object v5 = "--";
    ((org.apache.commons.cli.Option)v3).addValueForProcessing(((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = " ";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(" "), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = -39;
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).getKey();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getLongOpt();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "--";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("--"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = "--";
    ((org.apache.commons.cli.Option)v3).addValueForProcessing(((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = "";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Option(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Option)v6).hasArgName();
    ((org.apache.commons.cli.Option)v3).setType(((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = Character.valueOf((char)1);
    ((org.apache.commons.cli.Option)v3).setValueSeparator((((java.lang.Character)v9).charValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).hashCode();
    Object v5 = ((org.apache.commons.cli.Option)v3).acceptsArg();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "-F";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v2).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "0 ";
    Object v1 = "tru,e";
    Object v2 = true;
    Object v3 = "[ op<tion: ";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    ((org.apache.commons.cli.Option)v2).setType(((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    ((org.apache.commons.cli.Option)v2).setLongOpt(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = "";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Option(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Option)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = "f";
    Object v2 = true;
    Object v3 = "-";
    Object v4 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).hasLongOpt();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "N";
    ((org.apache.commons.cli.Option)v2).setDescription(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    ((org.apache.commons.cli.Option)v2).setArgName(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).getValue();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).hasArgName();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = -2;
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.cli.Option)v5).clone();
    Object v7 = ((org.apache.commons.cli.Option)v6).hasArgName();
    Object v8 = ((org.apache.commons.cli.Option)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    ((org.apache.commons.cli.Option)v2).setRequired((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).hasValueSeparator();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = false;
    ((org.apache.commons.cli.Option)v2).setRequired((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = "-";
    ((org.apache.commons.cli.Option)v3).addValueForProcessing(((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).toString();
    Object v5 = -24;
    ((org.apache.commons.cli.Option)v3).setArgs((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getValueSeparator();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Default option wasn'";
    ((org.apache.commons.cli.Option)v2).addValueForProcessing(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = Character.valueOf((char)1);
    ((org.apache.commons.cli.Option)v2).setValueSeparator((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("-"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getId();
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = ((org.apache.commons.cli.Option)v3).requiresArg();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "-";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Exception found c";
    ((org.apache.commons.cli.Option)v5).setDescription(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.Option)v5).acceptsArg();
    Object v9 = ((org.apache.commons.cli.Option)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = " ";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.cli.Option)v2).hasArg();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = -1;
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getValues();
    Object v4 = ((org.apache.commons.cli.Option)v2).hasArg();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    ((org.apache.commons.cli.Option)v2).setRequired((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.cli.Option)v3).getValue((((java.lang.Integer)v4).intValue()));
    Object v6 = "-";
    Object v7 = ((org.apache.commons.cli.Option)v3).getValue(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("-"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.apache.commons.cli.Option)v2).addValue(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = "-";
    ((org.apache.commons.cli.Option)v3).setDescription(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
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
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).requiresArg();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).hasArgs();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "Unable to ind the class: ";
    Object v1 = false;
    Object v2 = "'";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = " to desired type: ";
    Object v5 = ((org.apache.commons.cli.Option)v3).getValue(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(" to desired type: "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "+";
    ((org.apache.commons.cli.Option)v2).addValueForProcessing(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.RuntimeException");
    } catch (java.lang.RuntimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "A";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("A"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).getValuesList();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Unrecognized option:j";
    Object v4 = ((org.apache.commons.cli.Option)v2).getValue(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("Unrecognized option:j"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).getArgs();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = Character.valueOf((char)1);
    ((org.apache.commons.cli.Option)v3).setValueSeparator((((java.lang.Character)v4).charValue()));
    Object v5 = null;
    Object v6 = "";
    Object v7 = "-";
    Object v8 = new org.apache.commons.cli.Option(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.apache.commons.cli.Option)v8).getValue();
    Object v10 = ((org.apache.commons.cli.Option)v8).getKey();
    Object v11 = ((org.apache.commons.cli.Option)v3).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    ((org.apache.commons.cli.Option)v2).setArgs((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).getValues();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = "[";
    Object v5 = ((org.apache.commons.cli.Option)v3).getValue(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("["), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = "";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Option(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Option)v6).hasValueSeparator();
    Object v8 = ((org.apache.commons.cli.Option)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.cli.Option)v2).clone();
    Object v4 = "";
    Object v5 = "-";
    Object v6 = new org.apache.commons.cli.Option(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Option)v6).clone();
    Object v8 = ((org.apache.commons.cli.Option)v7).hasArgs();
    ((org.apache.commons.cli.Option)v3).setType(((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = ((org.apache.commons.cli.Option)v3).requiresArg();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "[ op@ion: ";
    ((org.apache.commons.cli.Option)v2).setArgName(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).getValues();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = "-";
    Object v2 = new org.apache.commons.cli.Option(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = -11;
    ((org.apache.commons.cli.Option)v2).setArgs((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.cli.Option)v2).requiresArg();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = "--!";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.cli.Option)v3).hasArgName();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }
}
