package org.apache.commons.lang;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("i"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("_"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "bISO-8859-1";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Biso-8859-1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "a";
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("a"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "8736";
    Object v1 = 16;
    Object v2 = 0;
    Object v3 = "[";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("8736"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "8";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("8"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang.WordUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Range[";
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("Range["), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "The number must not be NaN";
    Object v1 = 0;
    Object v2 = "869";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)("T869h869e869n869u869m869b869e869r869m869u869s869t869n869o869t869b869e869N869a869N"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "!";
    Object v1 = new char[]{Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("!"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "2X1";
    Object v1 = -11;
    Object v2 = 0;
    Object v3 = "949";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("949"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Ograve";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = 35;
    Object v2 = "B";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "<siz";
    Object v1 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("<siz"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "t";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("T"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Di2fferent enum class '";
    Object v1 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Dec'"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = "Igra";
    Object v3 = false;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "18D3";
    Object v1 = new char[]{Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("18D3"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "y";
    Object v1 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Y"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "[)";
    Object v1 = new char[]{Character.valueOf((char)2),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("[)"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "E";
    Object v1 = 1;
    Object v2 = "";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)("E"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "/";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("/"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "0";
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = "w";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("0"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = ": ";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(": "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "G";
    Object v1 = 1;
    Object v2 = -30;
    Object v3 = "569";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("G"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "z";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Z"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "956";
    Object v1 = 0;
    Object v2 = 4;
    Object v3 = "8595";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("956"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Array cannot be e";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("Array cannot be e"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = "";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "The numbers must not be null";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("The numbers must not be null"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = "true";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = 5;
    Object v2 = "The A";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = " Qis not valid.";
    Object v1 = 49;
    Object v2 = 0;
    Object v3 = "";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(" Qis not valid."), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "The date must";
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("The date must"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Cannot locate field ";
    Object v1 = 0;
    Object v2 = -12;
    Object v3 = "sup2";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("sup2"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "249";
    Object v1 = new char[]{Character.valueOf((char)10),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("249"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Unexpected Illeg";
    Object v1 = -8;
    Object v2 = 1;
    Object v3 = ",ava.vm.info";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("U,ava.vm.info"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "i";
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("i"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "`Ntilde";
    Object v1 = -9;
    Object v2 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("`Ntilde"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "J";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = "Array eKlement ";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = -1;
    Object v2 = 0;
    Object v3 = "am";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Array cannot be empty.";
    Object v1 = -46;
    Object v2 = 1;
    Object v3 = "'";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("A'"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "`";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("`"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "9";
    Object v1 = new char[]{Character.valueOf((char)65535),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("9"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "yacute";
    Object v1 = new char[]{Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("Yacute"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = "1";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "O";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("O"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "&";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("&"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Array cannot be empty.";
    Object v1 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Array Cannot Be Empty."), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "?";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("?"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "n";
    Object v1 = 8;
    Object v2 = 1;
    Object v3 = "G";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("n"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "DiffereVnt enum class '";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("dIFFEREvNT ENUM CLASS '"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "The number must not be NaN";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("tHE NUMBER MUST NOT BE nAn"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "91B";
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = "b";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("9b"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = 1;
    Object v2 = -13;
    Object v3 = "";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("T"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = -62;
    Object v2 = 0;
    Object v3 = "O";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "1";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("1"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "S";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("S"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "880";
    Object v1 = 1;
    Object v2 = -53;
    Object v3 = "";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("8"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.initials(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "java.specification.vendor";
    Object v1 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Java.specification.vendor"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Y";
    Object v1 = -39;
    Object v2 = "/";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)("Y"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "6]";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("6]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "4.";
    Object v1 = 21;
    Object v2 = 0;
    Object v3 = "rArr";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("4."), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "y";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("y"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = 38;
    Object v2 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "getEnumClass() must not be null";
    Object v1 = new char[]{Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("GetEnumClass() must not be null"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "[";
    Object v1 = new char[]{Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("["), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = " is not su&ported";
    Object v1 = new char[]{Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(" is not su&ported"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "0";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("0"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "*The number must not be null";
    Object v1 = 0;
    Object v2 = "ipermil";
    Object v3 = false;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)("*Theipermilnumberipermilmustipermilnotipermilbeipermilnull"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Date andPatterns must not be null";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("Date andpatterns must not be null"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "J";
    Object v1 = new char[]{Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("J"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "82:0";
    Object v1 = 8;
    Object v2 = 17;
    Object v3 = "\"";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("82:0"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "ndash6";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("ndash6"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = -8;
    Object v2 = 0;
    Object v3 = "cong";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("cong"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "8260";
    Object v1 = -18;
    Object v2 = "J";
    Object v3 = true;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)("8J2J6J0"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = 28;
    Object v3 = "The Array must not be null";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "'(";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("'("), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Z";
    Object v1 = org.apache.commons.lang.WordUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("z"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "6";
    Object v1 = 6;
    Object v2 = 27;
    Object v3 = " is not a valid number.";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("6"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "p";
    Object v1 = 25;
    Object v2 = 38;
    Object v3 = "i";
    Object v4 = org.apache.commons.lang.WordUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("p"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalizeFully(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "~";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("~"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "8";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang.WordUtils.uncapitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("8"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = 0;
    Object v2 = "";
    Object v3 = false;
    Object v4 = org.apache.commons.lang.WordUtils.wrap(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0days"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "W";
    Object v1 = new char[]{Character.valueOf((char)1)};
    Object v2 = org.apache.commons.lang.WordUtils.capitalize(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)("W"), v2);
  }
}
