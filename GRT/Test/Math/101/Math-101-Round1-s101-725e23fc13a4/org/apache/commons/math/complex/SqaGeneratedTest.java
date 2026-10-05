package org.apache.commons.math.complex;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "A";
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryCharacter(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "dimensions mismatch: ODE problem has dimension {0}, initial state vector has dime]sion {1}";
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = java.text.NumberFormat.getNumberInstance();
    ((org.apache.commons.math.complex.ComplexFormat)v0).setRealFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = org.apache.commons.math.complex.ComplexFormat.formatComplex(((org.apache.commons.math.complex.Complex)v2));
    org.junit.Assert.assertEquals((Object)("0"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = new java.lang.StringBuffer();
    Object v4 = -14;
    Object v5 = new java.text.FieldPosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v3),((java.text.FieldPosition)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = -14;
    Object v2 = new java.text.FieldPosition((((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.StringBuffer();
    Object v4 = -14;
    Object v5 = new java.text.FieldPosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v3),((java.text.FieldPosition)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    ((org.apache.commons.math.complex.ComplexFormat)v0).setRealFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "max:- ";
    Object v2 = 44;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = -14;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((org.apache.commons.math.complex.Complex)v3),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = java.text.NumberFormat.getNumberInstance();
    Object v1 = "not posOtive definite matrix";
    Object v2 = ((java.text.Format)v0).parseObject(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "\n";
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = java.text.NumberFormat.getNumberInstance();
    Object v2 = -33L;
    Object v3 = new java.lang.StringBuffer();
    Object v4 = -14;
    Object v5 = new java.text.FieldPosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.text.NumberFormat)v1).format((((java.lang.Long)v2).longValue()),((java.lang.StringBuffer)v3),((java.text.FieldPosition)v5));
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryFormat(((java.text.NumberFormat)v1));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "observed counts must not both be zero";
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryCharacter(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.text.NumberFormat.getNumberInstance();
    Object v1 = -14;
    Object v2 = new java.text.FieldPosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.Format)v0).formatToCharacterIterator(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = "hole betwen time ranges";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getAvailableLocales();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = java.text.NumberFormat.getNumberInstance();
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = "selected row and column";
    Object v3 = 44;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.Format)v1).parseObject(((java.lang.String)v2),((java.text.ParsePosition)v4));
    Object v6 = "]";
    Object v7 = ((java.text.Format)v1).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = "overflow: multiply";
    Object v4 = ((java.text.Format)v1).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "function can not be null.";
    Object v2 = 44;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.text.NumberFormat.getNumberInstance();
    Object v1 = 44;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.Format)v0).formatToCharacterIterator(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = ((org.apache.commons.math.complex.ComplexFormat)v1).getRealFormat();
    ((org.apache.commons.math.complex.ComplexFormat)v0).setRealFormat(((java.text.NumberFormat)v3));
    Object v4 = null;
    Object v5 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v6 = ((org.apache.commons.math.complex.ComplexFormat)v5).getImaginaryFormat();
    ((org.apache.commons.math.complex.ComplexFormat)v0).setRealFormat(((java.text.NumberFormat)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "ille";
    Object v2 = 44;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = "too small integration interval: length = {0}";
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryCharacter(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "probability of success must be between 0.0 and 1.0, inclusive.";
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryCharacter(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = "]";
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryCharacter(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = 44;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.StringBuffer();
    Object v4 = -14;
    Object v5 = new java.text.FieldPosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v3),((java.text.FieldPosition)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "matrix is singular";
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "lower bound must be < upper bound";
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = ((org.apache.commons.math.complex.ComplexFormat)v1).getRealFormat();
    ((org.apache.commons.math.complex.ComplexFormat)v0).setRealFormat(((java.text.NumberFormat)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = "z";
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = "";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "observed counts must not";
    Object v1 = "pas minimal ({0}) atteint, l''int\u00e9gration n\u00e9cessite {1}";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.math.complex.ComplexFormat.getInstance(((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = 2;
    ((java.lang.StringBuffer)v4).setLength((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = -14;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((org.apache.commons.math.complex.Complex)v3),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = "Matrices are /not multiplication compatible.";
    Object v7 = 44;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.math.complex.ComplexFormat)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v7 = ((org.apache.commons.math.complex.ComplexFormat)v6).getImaginaryFormat();
    ((org.apache.commons.math.complex.ComplexFormat)v5).setRealFormat(((java.text.NumberFormat)v7));
    Object v8 = null;
    Object v9 = 0.0D;
    Object v10 = 1.0D;
    Object v11 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new java.lang.StringBuffer();
    Object v13 = -14;
    Object v14 = new java.text.FieldPosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.math.complex.ComplexFormat)v5).format(((org.apache.commons.math.complex.Complex)v11),((java.lang.StringBuffer)v12),((java.text.FieldPosition)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "observed counts must not";
    Object v1 = "pas minimal ({0}) atteint, l''int\u00e9gration n\u00e9cessite {1}";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.math.complex.ComplexFormat.getInstance(((java.util.Locale)v2));
    Object v4 = java.text.NumberFormat.getNumberInstance();
    ((org.apache.commons.math.complex.ComplexFormat)v3).setRealFormat(((java.text.NumberFormat)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = new java.lang.StringBuffer();
    Object v7 = ((java.text.Format)v5).format(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = -14;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((org.apache.commons.math.complex.Complex)v3),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = "probability argument must be between 0 and 1 (inclusive)";
    Object v7 = 44;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.math.complex.ComplexFormat)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Polynomial degree must be positive: degr";
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = 6.0D;
    Object v4 = new org.apache.commons.math.complex.ComplexFormat();
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.lang.StringBuffer();
    Object v9 = -14;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.complex.ComplexFormat)v4).format(((org.apache.commons.math.complex.Complex)v7),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
    Object v12 = -14;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.NumberFormat)v2).format((((java.lang.Double)v3).doubleValue()),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
    Object v15 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v2));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "ANOVA: categoryData contains non-double[] elements.";
    Object v1 = java.text.NumberFormat.getNumberInstance();
    Object v2 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = "Function values at endpoints do not have different sig4ns.  Endpoints: [";
    ((org.apache.commons.math.complex.ComplexFormat)v5).setImaginaryCharacter(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 44;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.lang.StringBuffer();
    Object v11 = -14;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.math.complex.ComplexFormat)v5).format(((java.lang.Object)v9),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.complex.Complex)v8).asin();
    Object v10 = new java.lang.StringBuffer();
    Object v11 = -14;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.text.FieldPosition)v12).toString();
    Object v14 = ((org.apache.commons.math.complex.ComplexFormat)v5).format(((org.apache.commons.math.complex.Complex)v8),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = "Matri.x must have at least one row.";
    Object v2 = 44;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.complex.ComplexFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = "Cannot discard more elements than arecontained in this array.";
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryCharacter(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = ((java.text.Format)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = "Unparseable complex number: \"";
    Object v7 = 44;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    ((java.text.ParsePosition)v8).setErrorIndex((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = ((org.apache.commons.math.complex.ComplexFormat)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new java.lang.StringBuffer();
    Object v10 = 34;
    ((java.lang.StringBuffer)v9).setLength((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = -14;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math.complex.ComplexFormat)v5).format(((org.apache.commons.math.complex.Complex)v8),((java.lang.StringBuffer)v9),((java.text.FieldPosition)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "ANOVA: categoryData contains non-double[] elements.";
    Object v1 = java.text.NumberFormat.getNumberInstance();
    Object v2 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v1));
    Object v3 = "}";
    ((org.apache.commons.math.complex.ComplexFormat)v2).setImaginaryCharacter(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = ((java.text.Format)v2).clone();
    Object v4 = ((java.text.Format)v3).clone();
    Object v5 = "i";
    Object v6 = ((java.text.Format)v3).parseObject(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = "parameters relative tolerance is too small ({0}), no further improvement in the approximate solution is possible";
    ((org.apache.commons.math.complex.ComplexFormat)v3).setImaginaryCharacter(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v7 = ((org.apache.commons.math.complex.ComplexFormat)v6).getImaginaryFormat();
    Object v8 = "\n";
    Object v9 = 44;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.text.NumberFormat)v7).parseObject(((java.lang.String)v8),((java.text.ParsePosition)v10));
    ((org.apache.commons.math.complex.ComplexFormat)v5).setImaginaryFormat(((java.text.NumberFormat)v7));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = ((java.text.Format)v2).clone();
    ((org.apache.commons.math.complex.ComplexFormat)v0).setRealFormat(((java.text.NumberFormat)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = "parameters relative tolerance is too small ({0}, no further improvement in the approximate solution is possible";
    ((org.apache.commons.math.complex.ComplexFormat)v3).setImaginaryCharacter(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = "vector has wrong length";
    Object v7 = 44;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.ParsePosition)v8).toString();
    Object v10 = ((org.apache.commons.math.complex.ComplexFormat)v3).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Polynomial degree must be positive: degr";
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = 6.0D;
    Object v4 = new org.apache.commons.math.complex.ComplexFormat();
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.lang.StringBuffer();
    Object v9 = -14;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.complex.ComplexFormat)v4).format(((org.apache.commons.math.complex.Complex)v7),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
    Object v12 = -14;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.NumberFormat)v2).format((((java.lang.Double)v3).doubleValue()),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
    Object v15 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v2));
    Object v16 = "]";
    Object v17 = 44;
    Object v18 = new java.text.ParsePosition((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.math.complex.ComplexFormat)v15).parse(((java.lang.String)v16),((java.text.ParsePosition)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = "s`mple size must be non-negative.";
    Object v5 = 44;
    Object v6 = new java.text.ParsePosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.complex.ComplexFormat)v3).parse(((java.lang.String)v4),((java.text.ParsePosition)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = "";
    Object v2 = 44;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.complex.ComplexFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = "co|ariance: ";
    Object v6 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = 0.0D;
    Object v5 = 1.0D;
    Object v6 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = -14;
    Object v9 = new java.text.FieldPosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.complex.ComplexFormat)v3).format(((org.apache.commons.math.complex.Complex)v6),((java.lang.StringBuffer)v7),((java.text.FieldPosition)v9));
    Object v11 = "beta must be positive";
    Object v12 = ((org.apache.commons.math.complex.ComplexFormat)v3).parse(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = 0.0D;
    Object v5 = 1.0D;
    Object v6 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v8 = 0.0D;
    Object v9 = 1.0D;
    Object v10 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.lang.StringBuffer();
    Object v12 = -14;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math.complex.ComplexFormat)v7).format(((org.apache.commons.math.complex.Complex)v10),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
    Object v15 = -14;
    Object v16 = new java.text.FieldPosition((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.math.complex.ComplexFormat)v3).format(((org.apache.commons.math.complex.Complex)v6),((java.lang.StringBuffer)v14),((java.text.FieldPosition)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = new java.lang.StringBuffer();
    Object v6 = -14;
    Object v7 = new java.text.FieldPosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.complex.ComplexFormat)v3).format(((java.lang.Object)v4),((java.lang.StringBuffer)v5),((java.text.FieldPosition)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new java.lang.StringBuffer();
    Object v10 = -14;
    Object v11 = new java.text.FieldPosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.complex.ComplexFormat)v5).format(((org.apache.commons.math.complex.Complex)v8),((java.lang.StringBuffer)v9),((java.text.FieldPosition)v11));
    Object v13 = "Dormand-Prince 8 (5, 3)";
    ((org.apache.commons.math.complex.ComplexFormat)v5).setImaginaryCharacter(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v3 = ((org.apache.commons.math.complex.ComplexFormat)v2).getImaginaryFormat();
    Object v4 = ((java.text.Format)v3).clone();
    Object v5 = ((java.text.Format)v4).clone();
    Object v6 = false;
    ((java.text.NumberFormat)v5).setParseIntegerOnly((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = -14;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v8 = ((org.apache.commons.math.complex.ComplexFormat)v7).getImaginaryFormat();
    Object v9 = ((java.text.Format)v8).clone();
    Object v10 = ((java.text.FieldPosition)v6).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((org.apache.commons.math.complex.Complex)v3),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v3 = ((org.apache.commons.math.complex.ComplexFormat)v2).getImaginaryFormat();
    Object v4 = ((java.text.Format)v3).clone();
    Object v5 = ((java.text.Format)v4).clone();
    Object v6 = false;
    ((java.text.NumberFormat)v5).setParseIntegerOnly((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v5));
    Object v9 = ((org.apache.commons.math.complex.ComplexFormat)v8).getImaginaryCharacter();
    org.junit.Assert.assertEquals((Object)("i"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = "geometric";
    ((org.apache.commons.math.complex.ComplexFormat)v3).setImaginaryCharacter(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = "matrix is sEingular";
    ((org.apache.commons.math.complex.ComplexFormat)v3).setImaginaryCharacter(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "Polynomial degree must be positive: degr";
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = 6.0D;
    Object v4 = new org.apache.commons.math.complex.ComplexFormat();
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.lang.StringBuffer();
    Object v9 = -14;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.complex.ComplexFormat)v4).format(((org.apache.commons.math.complex.Complex)v7),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
    Object v12 = -14;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.NumberFormat)v2).format((((java.lang.Double)v3).doubleValue()),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
    Object v15 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v2));
    Object v16 = 0.0D;
    Object v17 = 1.0D;
    Object v18 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math.complex.Complex)v18).acos();
    Object v20 = new java.lang.StringBuffer();
    Object v21 = -14;
    Object v22 = new java.text.FieldPosition((((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.math.complex.ComplexFormat)v15).format(((org.apache.commons.math.complex.Complex)v18),((java.lang.StringBuffer)v20),((java.text.FieldPosition)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = -14;
    Object v5 = new java.text.FieldPosition((((java.lang.Integer)v4).intValue()));
    Object v6 = new java.lang.StringBuffer();
    Object v7 = -14;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = -50;
    ((java.text.FieldPosition)v8).setBeginIndex((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = ((org.apache.commons.math.complex.ComplexFormat)v3).format(((java.lang.Object)v5),((java.lang.StringBuffer)v6),((java.text.FieldPosition)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = "matrix is singula";
    Object v5 = ((java.text.Format)v3).parseObject(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = "o*erflow: can't negate";
    ((org.apache.commons.math.complex.ComplexFormat)v0).setImaginaryCharacter(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = "Dataset arrays must have same length.";
    Object v2 = 44;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.complex.ComplexFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v3 = ((org.apache.commons.math.complex.ComplexFormat)v2).getImaginaryFormat();
    Object v4 = ((java.text.Format)v3).clone();
    Object v5 = ((java.text.Format)v4).clone();
    Object v6 = false;
    ((java.text.NumberFormat)v5).setParseIntegerOnly((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v5));
    Object v9 = "dimensions mismatch: ODE problem has dimension {0}, initial state vector has dimension {1}";
    Object v10 = ((org.apache.commons.math.complex.ComplexFormat)v8).parse(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = " max=";
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = ((java.text.Format)v2).clone();
    Object v4 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v5 = ((org.apache.commons.math.complex.ComplexFormat)v4).getImaginaryFormat();
    Object v6 = ((java.text.Format)v5).clone();
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v3),((java.text.NumberFormat)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v4 = ((org.apache.commons.math.complex.ComplexFormat)v3).getImaginaryFormat();
    Object v5 = ((java.text.Format)v4).clone();
    Object v6 = ((java.text.Format)v5).clone();
    Object v7 = ((java.text.Format)v2).format(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = 0.0D;
    Object v5 = 1.0D;
    Object v6 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = -14;
    Object v9 = new java.text.FieldPosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.complex.ComplexFormat)v3).format(((org.apache.commons.math.complex.Complex)v6),((java.lang.StringBuffer)v7),((java.text.FieldPosition)v9));
    Object v11 = "Argument {0} outside domain";
    Object v12 = ((org.apache.commons.math.complex.ComplexFormat)v3).parse(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = "XZY";
    ((org.apache.commons.math.complex.ComplexFormat)v3).setImaginaryCharacter(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = " max=";
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = ((java.text.Format)v2).clone();
    Object v4 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v5 = ((org.apache.commons.math.complex.ComplexFormat)v4).getImaginaryFormat();
    Object v6 = ((java.text.Format)v5).clone();
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v3),((java.text.NumberFormat)v7));
    Object v9 = ((org.apache.commons.math.complex.ComplexFormat)v8).getImaginaryCharacter();
    org.junit.Assert.assertEquals((Object)(" max="), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = "constant vecto1 has wrong length";
    Object v7 = ((org.apache.commons.math.complex.ComplexFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = " - W";
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = ((java.text.Format)v2).clone();
    Object v4 = ((java.text.Format)v3).clone();
    Object v5 = ((java.text.NumberFormat)v4).getRoundingMode();
    Object v6 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v7 = ((org.apache.commons.math.complex.ComplexFormat)v6).getImaginaryFormat();
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v4),((java.text.NumberFormat)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = "lower bo";
    ((org.apache.commons.math.complex.ComplexFormat)v5).setImaginaryCharacter(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 44;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = new java.lang.StringBuffer();
    Object v11 = -14;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.math.complex.ComplexFormat)v5).format(((java.lang.Object)v9),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = " max=";
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = ((java.text.Format)v2).clone();
    Object v4 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v5 = ((org.apache.commons.math.complex.ComplexFormat)v4).getImaginaryFormat();
    Object v6 = ((java.text.Format)v5).clone();
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v3),((java.text.NumberFormat)v7));
    Object v9 = "]";
    Object v10 = 44;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.ParsePosition)v11).toString();
    Object v13 = ((org.apache.commons.math.complex.ComplexFormat)v8).parse(((java.lang.String)v9),((java.text.ParsePosition)v11));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = new java.lang.StringBuffer();
    Object v4 = -14;
    Object v5 = new java.text.FieldPosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v3),((java.text.FieldPosition)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v3 = ((org.apache.commons.math.complex.ComplexFormat)v2).getImaginaryFormat();
    Object v4 = ((java.text.Format)v3).clone();
    Object v5 = ((java.text.Format)v4).clone();
    Object v6 = false;
    ((java.text.NumberFormat)v5).setParseIntegerOnly((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v5));
    Object v9 = 0.0D;
    Object v10 = 1.0D;
    Object v11 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.complex.Complex)v11).sqrt();
    Object v13 = new java.lang.StringBuffer();
    Object v14 = -14;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.math.complex.ComplexFormat)v8).format(((org.apache.commons.math.complex.Complex)v11),((java.lang.StringBuffer)v13),((java.text.FieldPosition)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v5 = ((org.apache.commons.math.complex.ComplexFormat)v4).getImaginaryFormat();
    Object v6 = ((java.text.Format)v5).clone();
    Object v7 = ((java.text.Format)v6).clone();
    ((org.apache.commons.math.complex.ComplexFormat)v3).setRealFormat(((java.text.NumberFormat)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = "Iteration upper limit out of [0, 32] r}ange: ";
    ((org.apache.commons.math.complex.ComplexFormat)v5).setImaginaryCharacter(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = new java.lang.StringBuffer();
    Object v9 = new java.lang.StringBuffer();
    Object v10 = -14;
    Object v11 = new java.text.FieldPosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.complex.ComplexFormat)v5).format(((java.lang.Object)v8),((java.lang.StringBuffer)v9),((java.text.FieldPosition)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.complex.ComplexFormat();
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = ((java.text.Format)v2).clone();
    Object v4 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v3));
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v9 = 0.0D;
    Object v10 = 1.0D;
    Object v11 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new java.lang.StringBuffer();
    Object v13 = -14;
    Object v14 = new java.text.FieldPosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.math.complex.ComplexFormat)v8).format(((org.apache.commons.math.complex.Complex)v11),((java.lang.StringBuffer)v12),((java.text.FieldPosition)v14));
    Object v16 = -14;
    Object v17 = new java.text.FieldPosition((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.apache.commons.math.complex.ComplexFormat)v4).format(((org.apache.commons.math.complex.Complex)v7),((java.lang.StringBuffer)v15),((java.text.FieldPosition)v17));
    Object v19 = new java.lang.StringBuffer();
    Object v20 = -14;
    Object v21 = new java.text.FieldPosition((((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.math.complex.ComplexFormat)v0).format(((java.lang.Object)v18),((java.lang.StringBuffer)v19),((java.text.FieldPosition)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.text.NumberFormat.getNumberInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = "Illegal quantile value: ";
    Object v3 = ((java.text.Format)v0).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = ((java.text.Format)v3).clone();
    Object v5 = "number of trials must be non-negative.";
    Object v6 = ((java.text.Format)v3).parseObject(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v5 = ((org.apache.commons.math.complex.ComplexFormat)v4).getImaginaryFormat();
    ((org.apache.commons.math.complex.ComplexFormat)v3).setImaginaryFormat(((java.text.NumberFormat)v5));
    Object v6 = null;
    Object v7 = "illegal column argument";
    ((org.apache.commons.math.complex.ComplexFormat)v3).setImaginaryCharacter(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v0).getRealFormat();
    Object v3 = true;
    ((java.text.NumberFormat)v2).setParseIntegerOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v6 = "(";
    Object v7 = ((org.apache.commons.math.complex.ComplexFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "matrix is singular";
    Object v1 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = 0.0D;
    Object v5 = 1.0D;
    Object v6 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = -14;
    Object v9 = new java.text.FieldPosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.complex.ComplexFormat)v3).format(((org.apache.commons.math.complex.Complex)v6),((java.lang.StringBuffer)v7),((java.text.FieldPosition)v9));
    Object v11 = 0.0D;
    Object v12 = 1.0D;
    Object v13 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.apache.commons.math.complex.ComplexFormat();
    Object v15 = 0.0D;
    Object v16 = 1.0D;
    Object v17 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new java.lang.StringBuffer();
    Object v19 = -14;
    Object v20 = new java.text.FieldPosition((((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.math.complex.ComplexFormat)v14).format(((org.apache.commons.math.complex.Complex)v17),((java.lang.StringBuffer)v18),((java.text.FieldPosition)v20));
    ((java.lang.StringBuffer)v21).trimToSize();
    Object v22 = null;
    Object v23 = -14;
    Object v24 = new java.text.FieldPosition((((java.lang.Integer)v23).intValue()));
    Object v25 = 1;
    ((java.text.FieldPosition)v24).setEndIndex((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    Object v27 = ((org.apache.commons.math.complex.ComplexFormat)v3).format(((org.apache.commons.math.complex.Complex)v13),((java.lang.StringBuffer)v21),((java.text.FieldPosition)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "classical Runge-Kutta";
    Object v1 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "Polynomial degree must be positive: degr";
    Object v1 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v2 = ((org.apache.commons.math.complex.ComplexFormat)v1).getImaginaryFormat();
    Object v3 = 6.0D;
    Object v4 = new org.apache.commons.math.complex.ComplexFormat();
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.lang.StringBuffer();
    Object v9 = -14;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.complex.ComplexFormat)v4).format(((org.apache.commons.math.complex.Complex)v7),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
    Object v12 = -14;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.NumberFormat)v2).format((((java.lang.Double)v3).doubleValue()),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
    Object v15 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0),((java.text.NumberFormat)v2));
    Object v16 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v17 = ((org.apache.commons.math.complex.ComplexFormat)v16).getImaginaryFormat();
    Object v18 = ((java.text.Format)v17).clone();
    Object v19 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v18));
    Object v20 = new org.apache.commons.math.complex.ComplexFormat();
    Object v21 = 0.0D;
    Object v22 = 1.0D;
    Object v23 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()));
    Object v24 = new java.lang.StringBuffer();
    Object v25 = -14;
    Object v26 = new java.text.FieldPosition((((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.math.complex.ComplexFormat)v20).format(((org.apache.commons.math.complex.Complex)v23),((java.lang.StringBuffer)v24),((java.text.FieldPosition)v26));
    Object v28 = -14;
    Object v29 = new java.text.FieldPosition((((java.lang.Integer)v28).intValue()));
    Object v30 = ((org.apache.commons.math.complex.ComplexFormat)v15).format(((java.lang.Object)v19),((java.lang.StringBuffer)v27),((java.text.FieldPosition)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "classical Runge-Kutta";
    Object v1 = new org.apache.commons.math.complex.ComplexFormat(((java.lang.String)v0));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = org.apache.commons.math.complex.ComplexUtils.polar2Complex((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new java.lang.StringBuffer();
    Object v6 = -14;
    Object v7 = new java.text.FieldPosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.complex.ComplexFormat)v1).format(((org.apache.commons.math.complex.Complex)v4),((java.lang.StringBuffer)v5),((java.text.FieldPosition)v7));
    Object v9 = "i";
    Object v10 = ((org.apache.commons.math.complex.ComplexFormat)v1).parse(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.complex.ComplexFormat.getInstance();
    Object v1 = ((org.apache.commons.math.complex.ComplexFormat)v0).getImaginaryFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = new org.apache.commons.math.complex.ComplexFormat(((java.text.NumberFormat)v2));
    Object v4 = "Conversion Exception in Transformation: {0}";
    Object v5 = ((org.apache.commons.math.complex.ComplexFormat)v3).parse(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }
}
