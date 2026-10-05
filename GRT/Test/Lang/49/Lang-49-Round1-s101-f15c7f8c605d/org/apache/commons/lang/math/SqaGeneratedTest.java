package org.apache.commons.lang.math;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 48.589278342601325D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(117829/2425), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 24;
    Object v1 = -7;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-24/7), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -24;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-24/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 13;
    Object v1 = 4;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(17/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -17;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-17/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 35;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = -42;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 7.206078729482806D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(31296/4343), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "[";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1;
    Object v1 = -14;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1/14), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 2;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)2)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -26;
    Object v1 = 7;
    Object v2 = -33;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = -22;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-22/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 4;
    Object v1 = -23;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-4/23), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -30.09078019977397D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-21214/705), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 6;
    Object v2 = -13;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 12.442183435312966D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(38521/3096), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1.889243335686075D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(14806/7837), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = 9;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -39;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 37.99233540498368D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(84267/2218), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 37.63641948132035D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(245126/6513), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 17;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1/1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 7;
    Object v1 = 2;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(7/2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0;
    Object v1 = 12;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/12), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0/1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -28;
    Object v1 = 3;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-28/3), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1;
    Object v1 = 52;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1/52), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0;
    Object v1 = -34;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/34), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0;
    Object v1 = 46;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(46/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -22;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 23.38882380061899D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(199647/8536), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -9.961132949603941D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-48182/4837), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = -41;
    Object v1 = 61;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -17;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 2.353071141940009D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(5325/2263), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 58;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = -9;
    Object v1 = 42;
    Object v2 = 2147483647;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "@";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = " is not a valid number.";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 6;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "upsih";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0;
    Object v1 = -6;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/6), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 28;
    Object v1 = -1;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-28/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 11.228668766302857D;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)11)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = -1;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0;
    Object v1 = 35;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(35/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -17.962537395701855D;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-17)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "f]";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2/1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -13;
    Object v1 = 11;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-13/11), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = -33;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/33), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 42.14192250038137D;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)42)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = -15;
    Object v1 = -12;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(15/12), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = -5;
    Object v1 = -1;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(5/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = -19;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "lengtN must be valid";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 2;
    Object v1 = -11;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-2/11), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "o";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0;
    Object v1 = 3;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = -46;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -78;
    Object v1 = 0;
    Object v2 = 7;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-546/7), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = -1;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -7.53805151650972D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-25456/3377), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 16;
    Object v1 = 1;
    Object v2 = 16;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(257/16), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "?";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "The Print";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = -35;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = 22;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1/22), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -25;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-25/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = -13;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 0;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -36;
    Object v1 = 28;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-9/7), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -8;
    Object v1 = 34;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-4/17), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = -23;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0;
    Object v1 = -4;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/4), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1;
    Object v1 = 31;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(32/1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0;
    Object v1 = 19;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0/19), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 26.695488369294466D;
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(7101/266), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.Fraction.getFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = -10;
    Object v1 = -2;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(5/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -7;
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-7/1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = org.apache.commons.lang.math.Fraction.getFraction(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }
}
