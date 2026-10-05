package org.apache.commons.lang;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30L;
    Object v1 = 12L;
    Object v2 = 15L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(30L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "The fragment ";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -20.751418469356224D;
    Object v1 = 45.0D;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "GMT";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -53.519394F;
    Object v1 = 1.0F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 50.67303F;
    Object v1 = -38.467953F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "](";
    Object v1 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 2;
    Object v1 = 1;
    Object v2 = -1;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 16L;
    Object v1 = 18L;
    Object v2 = -5L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-5L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "e";
    Object v1 = org.apache.commons.lang.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1L;
    Object v1 = 0L;
    Object v2 = -9L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-9L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "K";
    Object v1 = org.apache.commons.lang.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -1L;
    Object v1 = -40L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "user.hom";
    Object v1 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "[";
    Object v1 = org.apache.commons.lang.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 42;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = -57L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 30;
    Object v1 = 0;
    Object v2 = 12;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(30), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.NumberUtils.stringToInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 3.9435003591686564D;
    Object v1 = -4.739939702468522D;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -36L;
    Object v1 = 0L;
    Object v2 = -2L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1.0F;
    Object v1 = 1.0F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Different enum class '";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "mu";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 2L;
    Object v1 = 1L;
    Object v2 = 1L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0L;
    Object v1 = 3L;
    Object v2 = -13L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(3L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "1+6";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 28;
    Object v1 = 0;
    Object v2 = -8;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(28), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.lang.NumberUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 8;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "eth";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = org.apache.commons.lang.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = -40.44353F;
    Object v1 = 24.343266F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 38L;
    Object v1 = 0L;
    Object v2 = 35L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -53L;
    Object v1 = -13L;
    Object v2 = 3L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(3L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Windows";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 0;
    Object v1 = -8;
    Object v2 = -29;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-29), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = -22L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-22L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "F";
    Object v1 = org.apache.commons.lang.NumberUtils.stringToInt(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = org.apache.commons.lang.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = 52L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(52L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0;
    Object v1 = 3;
    Object v2 = -28;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-28), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 44;
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(44), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "9674";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 0.0F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -37L;
    Object v1 = -5L;
    Object v2 = 1L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-37L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "9$8";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "s";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 20;
    Object v1 = 2;
    Object v2 = -5;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-5), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "1.";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "874";
    Object v1 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(874), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -23L;
    Object v1 = 0L;
    Object v2 = 14L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(14L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 32.0F;
    Object v1 = 1.0F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = 93;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(93), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "L";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = -4.952053F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0;
    Object v1 = -41;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-41), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 32L;
    Object v1 = -2L;
    Object v2 = 15L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-2L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -25L;
    Object v1 = 1L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-25L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "199";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = -45.43448332097926D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -1.0D;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -45;
    Object v1 = 36;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(36), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "thorn";
    Object v1 = org.apache.commons.lang.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "931";
    Object v1 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(931), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -41L;
    Object v1 = 1L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-41L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "+";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "7";
    Object v1 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(7), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -21L;
    Object v1 = 9L;
    Object v2 = 28L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-21L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "T;e Range must not be null";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 66L;
    Object v1 = -21L;
    Object v2 = 1L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-21L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "0";
    Object v1 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0L;
    Object v1 = -32L;
    Object v2 = 1L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -6.511455833023255D;
    Object v1 = -13.528769031678866D;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "V";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "fa";
    Object v1 = org.apache.commons.lang.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -21L;
    Object v1 = 1L;
    Object v2 = -1L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-21L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "L";
    Object v1 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "1.2";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "The Aray must not be null";
    Object v1 = org.apache.commons.lang.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -24L;
    Object v1 = 1L;
    Object v2 = 24L;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-24L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 2;
    Object v1 = 1;
    Object v2 = 22;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 23;
    Object v1 = 49;
    Object v2 = 41;
    Object v3 = org.apache.commons.lang.NumberUtils.minimum((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(23), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "Y";
    Object v1 = org.apache.commons.lang.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "}";
    Object v1 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1L;
    Object v1 = 0L;
    Object v2 = -5L;
    Object v3 = org.apache.commons.lang.NumberUtils.maximum((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "l";
    Object v1 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1.0F;
    Object v1 = 0.0F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -52.28942F;
    Object v1 = 17.939732F;
    Object v2 = org.apache.commons.lang.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }
}
