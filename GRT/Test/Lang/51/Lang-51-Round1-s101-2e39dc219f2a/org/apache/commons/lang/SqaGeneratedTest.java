package org.apache.commons.lang;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = 16;
    Object v3 = 1;
    Object v4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "H:mm:ss.SSS";
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.isTrue(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0;
    Object v2 = -37;
    Object v3 = -38;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.negate(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = false;
    Object v2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(((java.lang.Boolean)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = " \t\n\r\u000c";
    Object v2 = "p";
    Object v3 = "";
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.toIntegerObject((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toStringYesNo((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)("no"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = "yyyy-MM-dd'T'H";
    Object v2 = "false";
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "l";
    Object v1 = "";
    Object v2 = "_";
    Object v3 = "8838";
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "7";
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.toInteger((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new boolean[]{true,true};
    Object v1 = org.apache.commons.lang.BooleanUtils.xor(((boolean[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = false;
    Object v1 = "Requested random sting length ";
    Object v2 = "";
    Object v3 = org.apache.commons.lang.BooleanUtils.toString((((java.lang.Boolean)v0).booleanValue()),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBoolean((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 25;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toIntegerObject((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 62;
    Object v1 = -26;
    Object v2 = 0;
    Object v3 = -8;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = "";
    Object v2 = "The number must n";
    Object v3 = org.apache.commons.lang.BooleanUtils.toString((((java.lang.Boolean)v0).booleanValue()),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new boolean[]{};
    Object v1 = org.apache.commons.lang.BooleanUtils.xor(((boolean[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 8;
    Object v1 = 59;
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = false;
    Object v1 = true;
    Object v2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(((java.lang.Boolean)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.isNotFalse(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toInteger((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Invalid length: ";
    Object v1 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = "=";
    Object v2 = "";
    Object v3 = org.apache.commons.lang.BooleanUtils.toString((((java.lang.Boolean)v0).booleanValue()),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("="), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.lang.BooleanUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = 50;
    Object v3 = 46;
    Object v4 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.isNotFalse(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = false;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.BooleanUtils.toInteger((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.isFalse(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.lang.Boolean[]{false,true,true};
    Object v1 = org.apache.commons.lang.BooleanUtils.xor(((java.lang.Boolean[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = false;
    Object v1 = 42;
    Object v2 = 26;
    Object v3 = org.apache.commons.lang.BooleanUtils.toInteger((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(26), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = 28;
    Object v3 = org.apache.commons.lang.BooleanUtils.toInteger((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = false;
    Object v1 = 27;
    Object v2 = 25;
    Object v3 = org.apache.commons.lang.BooleanUtils.toInteger((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(25), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 24;
    Object v4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "O";
    Object v1 = "";
    Object v2 = " >= ";
    Object v3 = "The number must not be null";
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 3;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = "";
    Object v3 = "822";
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = "O";
    Object v2 = "";
    Object v3 = "";
    Object v4 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("O"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = -12;
    Object v1 = 0;
    Object v2 = 43;
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)("false"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toStringYesNo(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)("no"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "RangeS";
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = true;
    Object v1 = 153;
    Object v2 = 5;
    Object v3 = org.apache.commons.lang.BooleanUtils.toIntegerObject((((java.lang.Boolean)v0).booleanValue()),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(153), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -25;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = ">";
    Object v2 = "N";
    Object v3 = "";
    Object v4 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(">"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = true;
    Object v1 = 6;
    Object v2 = -15;
    Object v3 = org.apache.commons.lang.BooleanUtils.toIntegerObject((((java.lang.Boolean)v0).booleanValue()),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(6), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.toStringOnOff(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)("off"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = false;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.BooleanUtils.toIntegerObject((((java.lang.Boolean)v0).booleanValue()),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.isNotTrue(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "{K}";
    Object v1 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new boolean[]{true,false,false};
    Object v1 = org.apache.commons.lang.BooleanUtils.xor(((boolean[])v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = 71;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.BooleanUtils.toInteger((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(71), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = true;
    Object v1 = -25;
    Object v2 = -31;
    Object v3 = 17;
    Object v4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertEquals((Object)(-25), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.Boolean[]{false,true};
    Object v1 = org.apache.commons.lang.BooleanUtils.xor(((java.lang.Boolean[])v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = false;
    Object v1 = 0;
    Object v2 = 7;
    Object v3 = org.apache.commons.lang.BooleanUtils.toIntegerObject((((java.lang.Boolean)v0).booleanValue()),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(7), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.negate(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.isNotTrue(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = false;
    Object v1 = org.apache.commons.lang.BooleanUtils.isFalse(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = -36;
    Object v1 = 73;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "omicron";
    Object v1 = "";
    Object v2 = "The validated collection contains an element not of type ";
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0;
    Object v1 = -27;
    Object v2 = -18;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 35;
    Object v1 = 68;
    Object v2 = 7;
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "Delt";
    Object v1 = "9";
    Object v2 = "3";
    Object v3 = "Range[";
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = true;
    Object v1 = -23;
    Object v2 = 38;
    Object v3 = org.apache.commons.lang.BooleanUtils.toInteger((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-23), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 19;
    Object v2 = -6;
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = org.apache.commons.lang.BooleanUtils.isTrue(((java.lang.Boolean)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "ove";
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1;
    Object v1 = -10;
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = -26;
    Object v2 = 1;
    Object v3 = 46;
    Object v4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertEquals((Object)(-26), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = -53;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -38;
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = -23;
    Object v3 = -41;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0;
    Object v1 = -7;
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "user.dir";
    Object v1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 7;
    Object v2 = 17;
    Object v3 = -36;
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = "The number must not be null";
    Object v2 = "}";
    Object v3 = "";
    Object v4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = true;
    Object v1 = "X";
    Object v2 = "...";
    Object v3 = org.apache.commons.lang.BooleanUtils.toString((((java.lang.Boolean)v0).booleanValue()),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("X"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = false;
    Object v1 = "le";
    Object v2 = "0";
    Object v3 = org.apache.commons.lang.BooleanUtils.toString((((java.lang.Boolean)v0).booleanValue()),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("0"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = false;
    Object v1 = "";
    Object v2 = "end < start";
    Object v3 = org.apache.commons.lang.BooleanUtils.toString((((java.lang.Boolean)v0).booleanValue()),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("end < start"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = true;
    Object v1 = "";
    Object v2 = "";
    Object v3 = "java.home";
    Object v4 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = false;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = 4;
    Object v4 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)v0),((java.lang.Integer)v1),((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new boolean[]{true};
    Object v1 = org.apache.commons.lang.BooleanUtils.xor(((boolean[])v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new boolean[]{false,true,true};
    Object v1 = org.apache.commons.lang.BooleanUtils.xor(((boolean[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = 0;
    Object v2 = 20;
    Object v3 = org.apache.commons.lang.BooleanUtils.toIntegerObject((((java.lang.Boolean)v0).booleanValue()),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -63;
    Object v2 = -6;
    Object v3 = org.apache.commons.lang.BooleanUtils.toBoolean((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
