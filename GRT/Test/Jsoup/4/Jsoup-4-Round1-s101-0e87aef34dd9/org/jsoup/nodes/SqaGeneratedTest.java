package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "uci";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("uci"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "NotuLess";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("NotuLess"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "abbr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("abbr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "emsp14";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("emsp14"), v1);
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
    Object v0 = "YIKy";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("YIKy"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "uhar";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("uhar"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Could not parse attribute query '%s': unexpected token at '%s'";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Could not parse attribute query '%s': unexpected token at '%s'"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Tfr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Tfr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "e_uml";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("e_uml"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "Ycy";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "nleftrightarrow";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("nleftrightarrow"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "sqsubse";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("sqsubse"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "alefsym";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("alefsym"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "2";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("2"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "t";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("t"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "VerticalSeparator";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("VerticalSeparator"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "NotTildeFullEqual";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("NotTildeFullEqual"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "</";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("</"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "nm";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("nm"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "supseteq";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "ht!tps";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ht!tps"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "lar";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("lar"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Re";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Re"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "SMAGL";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("SMAGL"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "rd";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("rd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "dtri";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("dtri"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "with";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("with"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "m";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("m"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "RTf";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("RTf"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "nsu5seteq";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("nsu5seteq"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "thorz";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("thorz"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "lessgr";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "kf";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("kf"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "`caron";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("`caron"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "gtdotb";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "?";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("?"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "D";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("D"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "ba";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ba"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = ":gt(";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(":gt("), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "acirc";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("acirc"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "RightArrow";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("RightArrow"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "oint";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("oint"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Iacut";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Iacut"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Yc";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Yc"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "szlig";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("szlig"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "rect]";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("rect]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = " error loading URL";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" error loading URL"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Ucirc";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Ucirc"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "^";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("^"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "iscr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("iscr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "dot";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("dot"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "~";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("~"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "icirc";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("icirc"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "bsime";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("bsime"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "+";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("+"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "hoarr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("hoarr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "bull";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("bull"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "eqslant";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("eqslant"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "u";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("u"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Scedl";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Scedl"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "curre";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("curre"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "-";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("-"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "         ";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("         "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "DifferentialD";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("DifferentialD"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "RT";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("RT"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "xOtri";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("xOtri"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "nbsp1";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("nbsp1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "Dscr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Dscr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "Succeeds";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Succeeds"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "Nop1";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Nop1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "S";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("S"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "orderof";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("orderof"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "l4arlt";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("l4arlt"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "abs:O";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("abs:O"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Jsercy";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Jsercy"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "LINK";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("LINK"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "DD";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = " ";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "im";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("im"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Pre:edesEqual";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Pre:edesEqual"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "Intersection";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Intersection"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Queue did not match expected sequence";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Queue did not match expected sequence"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "rceil6";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("rceil6"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "bigtriangtledown";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("bigtriangtledown"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "ngeX";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ngeX"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "c:oprod";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("c:oprod"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Queue did not match expected squence";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Queue did not match expected squence"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "spades";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("spades"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "sqsu";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("sqsu"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "bTody";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("bTody"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "LessLesj";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("LessLesj"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "cuwged";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("cuwged"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "EM";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("EM"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "COPY";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("COPY"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Zs.cr";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Zs.cr"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "FilledVerySmallSquare";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "oS";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("oS"), v1);
  }
}
