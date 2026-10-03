package org.apache.commons.math3.fraction;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 19;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0;
    Object v1 = -34;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -12;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.fraction.FractionConversionException");
    } catch (org.apache.commons.math3.fraction.FractionConversionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = -3.0429489156345912D;
    Object v1 = 19.214555264801284D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-4), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 11;
    Object v1 = -8;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-11 / 8), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = -28.45122036692579D;
    Object v1 = 37;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-882 / 31), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 26.1279797123314D;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(8779 / 336), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1;
    Object v1 = 16;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1 / 16), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -23;
    Object v1 = 10;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-23 / 10), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -16.708413210047315D;
    Object v2 = -6;
    Object v3 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.fraction.FractionConversionException");
    } catch (org.apache.commons.math3.fraction.FractionConversionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = -19;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 45.1572155852735D;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(17521 / 388), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -26;
    Object v1 = -28;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(13 / 14), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(15), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 43;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(43), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 4;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = -3;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 8;
    Object v1 = 3;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(8 / 3), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 33;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 72;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(72), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1 / 2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -13;
    Object v1 = 2;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-13 / 2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = -3;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0;
    Object v1 = 44;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 2;
    Object v1 = 18;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1 / 9), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = -15;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -1;
    Object v1 = 24;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1 / 24), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = 2;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0;
    Object v1 = 41;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 47.708179958536164D;
    Object v1 = 0.0D;
    Object v2 = 31;
    Object v3 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(1158904637 / 24291529), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 35.116092781753736D;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(13309 / 379), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 74;
    Object v1 = 32;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(37 / 16), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -26;
    Object v1 = 1;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-26), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0;
    Object v1 = -1;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = -42;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1 / 42), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -37;
    Object v1 = 39;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-37 / 39), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 2;
    Object v1 = -26;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1 / 13), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -16;
    Object v1 = 40;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-2 / 5), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -2.882226107594335D;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1297 / 450), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 50.403931369803004D;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)50)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0;
    Object v1 = ((java.lang.Number)v0).byteValue();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = -81;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -7;
    Object v1 = 4;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-7 / 4), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = -10;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-10), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 10;
    Object v1 = -16;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-5 / 8), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 11.21248448957205D;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(8443 / 753), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 35.70594296348049D;
    Object v1 = 2;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(36), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 49;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 12;
    Object v1 = -86;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-6 / 43), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1;
    Object v1 = ((java.lang.Number)v0).shortValue();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 53;
    Object v1 = 1;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(53), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = -24;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1 / 24), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1 / 12), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 10;
    Object v1 = 1;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(10), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -47;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-47), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -54;
    Object v1 = -8;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(27 / 4), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -5;
    Object v1 = -41;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(5 / 41), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 43;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0;
    Object v1 = 28;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 9;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(9), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -10.70982332798808D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-11), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -26;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-26), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 5.333010996591836D;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(5), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1 / 31), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-15), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0;
    Object v1 = 4;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0;
    Object v1 = 36;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-29), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0;
    Object v1 = 10;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1;
    Object v1 = 10;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1 / 10), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 27;
    Object v1 = -6;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-9 / 2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = -17;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 7;
    Object v1 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(7), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.fraction.FractionConversionException");
    } catch (org.apache.commons.math3.fraction.FractionConversionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0;
    Object v1 = 50;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 10;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0;
    Object v1 = 26;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 16;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 9;
    Object v1 = 9;
    Object v2 = new org.apache.commons.math3.fraction.Fraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 45;
    Object v1 = 3;
    Object v2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(15), v2);
  }
}
