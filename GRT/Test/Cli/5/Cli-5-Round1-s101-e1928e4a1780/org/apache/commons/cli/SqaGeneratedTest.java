package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("_"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "--b";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("b"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("--"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.Util();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Unrecognized option: ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Unrecognized option: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "arg";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("arg"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "w";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("w"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "arg2";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("arg2"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "'";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("'"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "-V";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-V"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = ">-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(">-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "InstantiationException; Unale to create: ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("InstantiationException; Unale to create: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "B-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("B-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "-L";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("L"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Y ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Y "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = " ] [ long ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" ] [ long "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "cmdLineSyntax not provYided";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("cmdLineSyntax not provYided"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "C-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("C-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "mu6t specify longopt";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("mu6t specify longopt"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "}";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("}"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "-t";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("t"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "--k";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("k"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "+";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("+"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "--a";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("a"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "s";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("s"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Z";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Z"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "ar";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ar"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "   ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("   "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "arg";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("arg"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = " ]";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" ]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "4";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("4"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "-J";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("J"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "'";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("'"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "z";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("z"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "IllegalAccessExceptionQ; Unable to create: ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("IllegalAccessExceptionQ; Unable to create: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "#";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("#"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "?-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("?-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = ";";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(";"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "UnableZ to find: ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("UnableZ to find: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "1";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = " ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "-Q";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Q"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "y\"";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("y\""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "0]";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("0]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "rg";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("rg"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = ",";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(","), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "` ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("` "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Missing required o-tion";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Missing required o-tion"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "8";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("8"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "9-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("9-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "7";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("7"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "G";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("G"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "+ARGV";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("+ARGV"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "an option from this group has already been selected: '";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("an option from this group has already been selected: '"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = " ]i";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" ]i"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Unrecognied option: ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Unrecognied option: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "ye";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ye"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "B ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("B "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = " | ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" | "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "1";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = ":: ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(":: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "-S";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("S"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "-D";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-D"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " |";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" |"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "\"-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\"-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = " ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "~-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("~-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Not yet implemente0";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Not yet implemente0"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "-y";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("y"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "cmdLineSyntax not provided";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("cmdLineSyntax not provided"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "* ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("* "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = " i";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" i"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "-.";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("."), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "t-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("t-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "s";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("s"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "IllegalAccessException; Unable to create:";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("IllegalAccessException; Unable to create:"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "A";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("A"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "b";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("b"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "-p";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-p"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "NO_ARGS_ALLOWED";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("NO_ARGS_ALLOWED"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "I-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("I-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = ", ";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(", "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Missing required optioVn";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Missing required optioVn"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "aHg";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("aHg"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "arCg";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("arCg"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "b-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("b-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "p-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("p-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "*-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("*-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "T";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("T"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "--n";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "-`";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-`"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "-l";
    Object v1 = org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-l"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = ";-";
    Object v1 = org.apache.commons.cli.Util.stripLeadingHyphens(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(";-"), v1);
  }
}
