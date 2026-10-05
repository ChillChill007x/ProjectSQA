package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).iterator();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "IllegalAccessException; Unable to create: ";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getOptions();
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)65535);
    Object v2 = "--";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v1).charValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("--"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues((((java.lang.Character)v1).charValue()));
    Object v3 = "-_";
    Object v4 = "q1";
    Object v5 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("q1"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = "W";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("W"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "}";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "\"";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getOptions();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = "\\";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("\\"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "";
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("-"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getArgs();
    Object v2 = "m";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)65535);
    Object v2 = "U";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v1).charValue()),((java.lang.String)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    ((org.apache.commons.cli.CommandLine)v0).addArg(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)1);
    Object v2 = "\"";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v1).charValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("\""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "--";
    Object v5 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("--"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "1";
    Object v2 = "Unable to find~: ";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Unable to find~: "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getArgList();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "z";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--a";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "T";
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("-"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ", ";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "";
    Object v2 = "O";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("O"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = "usage: ";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("usage: "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "[";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)2);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption((((java.lang.Character)v1).charValue()));
    Object v3 = " ]";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "H";
    Object v2 = "--";
    Object v3 = new org.apache.commons.cli.Option(((java.lang.String)v1),((java.lang.String)v2));
    ((org.apache.commons.cli.CommandLine)v0).addOption(((org.apache.commons.cli.Option)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    ((org.apache.commons.cli.CommandLine)v0).addArg(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "a";
    Object v2 = "";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "";
    Object v2 = "USable to parse: ";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("USable to parse: "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getOptions();
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptions();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = " ] [ long ";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    Object v3 = " ";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).hasOption((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "cmdLineSynax not provided";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getArgs();
    Object v2 = "+ARG";
    Object v3 = "-)";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("-)"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getArgs();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getOptions();
    Object v2 = "-";
    ((org.apache.commons.cli.CommandLine)v0).addArg(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("-"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    Object v3 = "9-";
    Object v4 = "n-";
    Object v5 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("n-"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = "G";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("G"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("-"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "c-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "--";
    Object v5 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("--"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-u-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "Unrecognized option:";
    Object v2 = "'";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("'"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)1);
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v1).charValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("-"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "6]";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "[ ption: ";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "\"--";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = "";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject((((java.lang.Character)v1).charValue()));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "true";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getOptions();
    Object v2 = "G";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-a";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "t";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = " ]";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "--";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    Object v3 = "-t";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "arg";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "arg";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)64);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues((((java.lang.Character)v1).charValue()));
    Object v3 = "H";
    Object v4 = "--";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v3),((java.lang.String)v4));
    ((org.apache.commons.cli.CommandLine)v0).addOption(((org.apache.commons.cli.Option)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = " (";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "n--";
    Object v2 = "--";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("--"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-g";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "[";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)58);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getArgs();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption(((java.lang.String)v1));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject((((java.lang.Character)v1).charValue()));
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getArgList();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "arCg";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).hasOption(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues((((java.lang.Character)v1).charValue()));
    Object v3 = "-";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "p-";
    Object v2 = " ]";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(" ]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).iterator();
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getArgs();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = " ";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = ((org.apache.commons.cli.CommandLine)v0).getOptions();
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).iterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "Unable to parse: ";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-J-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "J-";
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionObject(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = "-";
    Object v2 = "-u";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "-[";
    Object v5 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = " :: ";
    Object v2 = "-";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("-"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v1).charValue()));
    Object v3 = "--";
    Object v4 = ((org.apache.commons.cli.CommandLine)v0).getOptionValues(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.CommandLine();
    Object v1 = Character.valueOf((char)1);
    Object v2 = "u-";
    Object v3 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue((((java.lang.Character)v1).charValue()),((java.lang.String)v2));
    Object v4 = "Unrecognized option: ";
    Object v5 = "-";
    Object v6 = ((org.apache.commons.cli.CommandLine)v0).getOptionValue(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("-"), v6);
  }
}
