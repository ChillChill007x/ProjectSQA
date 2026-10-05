package org.apache.commons.lang3.math;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 48.589278342601325D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(117829/2425), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 24;
    Object v1 = -6;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-4/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -26;
    Object v1 = 1;
    Object v2 = 2;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-53/2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 14;
    Object v1 = 3;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = -17;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 36;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(36/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = -43;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 8.206078729482806D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(35639/4343), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 31;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(31/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "A-";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = -14;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/14), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = 5;
    Object v2 = -32;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 5;
    Object v1 = -23;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-5/23), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = -30.09078019977397D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-21214/705), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 5;
    Object v2 = -14;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 4;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(4/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 12.442183435312966D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(38521/3096), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0.8892433356860748D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(6969/7837), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = 9;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -40;
    Object v2 = -2;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 39.99233540498368D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(88703/2218), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 36.63641948132035D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(238613/6513), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 16;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0/1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 8;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0;
    Object v1 = 13;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/13), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1/1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -30;
    Object v1 = 4;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-15/2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = -1;
    Object v1 = 52;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1/52), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1;
    Object v1 = -33;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1/33), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 46;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -24;
    Object v2 = 2;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 23.38882380061899D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(199647/8536), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -8.961132949603941D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-43345/4837), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -40;
    Object v1 = 60;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-100/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -16;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 2.353071141940009D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(5325/2263), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 59;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = 41;
    Object v2 = 2147483647;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "@";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "\u00a7";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 6;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(6/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "{";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1/7), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 26;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 10.228668766302857D;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)10)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 14;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(14/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 35;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -18.962537395701855D;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-18)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "&foacute;";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -14;
    Object v1 = 12;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-7/6), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1;
    Object v1 = -32;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1/32), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 43.14192250038137D;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)43)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -16;
    Object v1 = -13;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(16/13), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = -4;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-4/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = -18;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-18/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "escNpePlus";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0;
    Object v1 = -11;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/11), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "o";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0;
    Object v1 = 2;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = -47;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -79;
    Object v1 = 1;
    Object v2 = 7;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-554/7), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "The Integ";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0;
    Object v1 = -34;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/34), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(2/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -6.53805151650972D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-22079/3377), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 17;
    Object v1 = 0;
    Object v2 = 17;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(289/17), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "?";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1;
    Object v1 = 14;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1/14), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -35;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-35/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0;
    Object v1 = 23;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/23), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = -13;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -36;
    Object v1 = 29;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-36/29), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -9;
    Object v1 = 35;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-9/35), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "&cent;";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = -3;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1/3), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 31;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1;
    Object v1 = 19;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1/19), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 27.695488369294466D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(7367/266), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0;
    Object v1 = -1;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -12;
    Object v1 = -3;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(4/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = -7;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 8.327211613818235D;
    Object v1 = org.apache.commons.lang3.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(69374/8331), v1);
  }
}
