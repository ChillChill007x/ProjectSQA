package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isWordChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = true;
    ((com.google.javascript.jscomp.CodeConsumer)v0).addOp(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -3.786070440569023D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    ((com.google.javascript.jscomp.CodeConsumer)v0).endFunction((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 7.9262258617538315D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.CodeConsumer)v0).endLine();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "7";
    Object v2 = true;
    ((com.google.javascript.jscomp.CodeConsumer)v0).addOp(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isWordChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.CodeConsumer)v0).listSeparator();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = true;
    ((com.google.javascript.jscomp.CodeConsumer)v0).appendOp(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 29.455980587569233D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.CodeConsumer)v0).maybeEndStatement();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -19.290765971716525D;
    ((com.google.javascript.jscomp.CodeConsumer)v0).addNumber((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 9.067793004795991D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.CodeConsumer)v0).appendBlockEnd();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    ((com.google.javascript.jscomp.CodeConsumer)v0).endBlock((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 45.5643212642094D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = Character.valueOf((char)65535);
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isWordChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = -3.709808103647683D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 7.747137345583413D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -23.34863808930069D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -4.240557538845608D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 4.235846600529854D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    ((com.google.javascript.jscomp.CodeConsumer)v0).endBlock((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -75.47051391351305D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    ((com.google.javascript.jscomp.CodeConsumer)v0).endStatement((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 33.38161212029391D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "D";
    ((com.google.javascript.jscomp.CodeConsumer)v0).add(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -21.558983129447878D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 36.0480090022567D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 36.06176400155114D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 21.011328413664106D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -1.4429613373084935D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = Character.valueOf((char)4);
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isWordChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 7.572216246456455D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 27.939258178751487D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "argments";
    ((com.google.javascript.jscomp.CodeConsumer)v0).append(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.CodeConsumer)v0).getLastChar();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -26.59337453637908D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -15.642723685990346D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 13.95190935018715D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 29.826572290521053D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 8.675431654334721D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Character.valueOf((char)3);
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isWordChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "E!";
    ((com.google.javascript.jscomp.CodeConsumer)v0).add(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 16.912054484700462D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 11.931321508596222D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 6.139068145212112D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -16.167598409835097D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    ((com.google.javascript.jscomp.CodeConsumer)v0).addNumber((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 6.526905602161547D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -15.553481318239022D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -40.61421586860737D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 2.741443934905961D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -14.667842758991291D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1.138873575243748D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 3.9551362322416863D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -20.17476469014732D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = Character.valueOf((char)2);
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isWordChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    ((com.google.javascript.jscomp.CodeConsumer)v0).add(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -9.924634357781875D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.CodeConsumer)v0).beginCaseBody();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 0.02017171526827899D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    ((com.google.javascript.jscomp.CodeConsumer)v0).beginBlock();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 3.0D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -33.616626334015926D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 13.977676797106529D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1.0D;
    ((com.google.javascript.jscomp.CodeConsumer)v0).addNumber((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    ((com.google.javascript.jscomp.CodeConsumer)v0).append(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "!";
    ((com.google.javascript.jscomp.CodeConsumer)v0).append(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 72.50998764219497D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 12.197423802343877D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    ((com.google.javascript.jscomp.CodeConsumer)v0).endFunction((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 7.9122752145463D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 48.66940503892833D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "m";
    Object v2 = false;
    ((com.google.javascript.jscomp.CodeConsumer)v0).addOp(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 29.728623423385564D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -13.720556276407214D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -19.153711097551472D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -10.373692331018773D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    ((com.google.javascript.jscomp.CodeConsumer)v0).addIdentifier(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    ((com.google.javascript.jscomp.CodeConsumer)v0).endStatement((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -4.698679003447495D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 5.700686007029846D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "missinjg prop: ";
    Object v2 = true;
    ((com.google.javascript.jscomp.CodeConsumer)v0).appendOp(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -28.360988959589005D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -44.725253756933654D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "I";
    ((com.google.javascript.jscomp.CodeConsumer)v0).add(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 23.1355509163512D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Q";
    ((com.google.javascript.jscomp.CodeConsumer)v0).add(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -37.74679791569006D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -32.96470724214503D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -13.73811168190623D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = Character.valueOf((char)127);
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isWordChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 25.753772547206683D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "w";
    ((com.google.javascript.jscomp.CodeConsumer)v0).addIdentifier(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -49.957214355868544D;
    Object v1 = com.google.javascript.jscomp.CodeConsumer.isNegativeZero((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }
}
