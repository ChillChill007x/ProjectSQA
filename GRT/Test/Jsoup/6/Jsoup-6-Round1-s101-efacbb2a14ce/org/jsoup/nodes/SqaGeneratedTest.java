package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "eth";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("eth"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "LessEqualGreuater";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("LessEqualGreuater"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "abbr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("abbr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "ee";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ee"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "/";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.nodes.Entities();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "UpArrKw";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("UpArrKw"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "ert";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ert"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = ")";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(")"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "RuleDelayed";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("RuleDelayed"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Eacu_te";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Eacu_te"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "UpArrowDownArrow";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "nparallel";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("nparallel"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "succe";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("succe"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "VerticalSeparator";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("VerticalSeparator"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "2";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("2"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Object ";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Object "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "TripleDot";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("TripleDot"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "LowerRightArrow";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("LowerRightArrow"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "title";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("title"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "nmpf";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("nmpf"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "tridot";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "!";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("!"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "lar";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("lar"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "NotSucceedsSlantEqual";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("NotSucceedsSlantEqual"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "G4";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("G4"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "ro";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ro"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "doteq";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("doteq"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "su";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("su"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "rl";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("rl"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "natura";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("natura"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "OLf";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("OLf"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "nwar5k";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("nwar5k"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "eacuze";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("eacuze"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "lhrd";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "kgree";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("kgree"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "`si";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("`si"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "graveb";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "?";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("?"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "a";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("a"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = ":has(";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(":has("), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = ">";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(">"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Nu";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Nu"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "osol";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("osol"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "UpArrowBa";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("UpArrowBa"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "divide";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("divide"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "rsaquo]";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("rsaquo]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "X";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("X"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "iprod";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("iprod"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "dharr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("dharr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Unknown combinator: ";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Unknown combinator: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Icirc";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Icirc"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "boxVr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("boxVr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "i";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("i"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "hercon";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("hercon"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "boxdl";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("boxdl"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "fr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("fr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "Qf";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Qf"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Agrav";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Agrav"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "-";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "http";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("http"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Abreve";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Abreve"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "OL";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("OL"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "/O";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/O"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "QUOT1";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("QUOT1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "~";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("~"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "CircleDot";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("CircleDot"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "RightDownVectorBar";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("RightDownVectorBar"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "LeftRightVect1r";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("LeftRightVect1r"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "EAD";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("EAD"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "Stml";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Stml"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "pi";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("pi"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "lsi4";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("lsi4"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "BODYO";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("BODYO"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Eta";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Eta"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "IFRAME";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("IFRAME"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "sup2";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "Cookie value must not be null";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Cookie value must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "ij";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ij"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "</";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("</"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "NotEqua:";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("NotEqua:"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Ecy";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Ecy"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "SOURCE";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("SOURCE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "rm6oustache";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("rm6oustache"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "astt";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("astt"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "nleX";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("nleX"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = ":circlearrowleft";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(":circlearrowleft"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "TRCK";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("TRCK"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "subsetneqq";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("subsetneqq"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = " T";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" T"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Impliej";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Impliej"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "csugpe";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("csugpe"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "had";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("had"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "H4";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("H4"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "d";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("d"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "value";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("value"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Vb.ar";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Vb.ar"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "DScy";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "omicron";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("omicron"), v1);
  }
}
