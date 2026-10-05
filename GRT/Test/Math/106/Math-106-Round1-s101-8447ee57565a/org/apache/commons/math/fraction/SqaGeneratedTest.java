package org.apache.commons.math.fraction;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = java.text.NumberFormat.getInstance();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = java.text.NumberFormat.getInstance();
    Object v2 = 24;
    Object v3 = new java.lang.StringBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((java.lang.StringBuffer)v3).append((((java.lang.Character)v4).charValue()));
    Object v6 = 1;
    Object v7 = new java.text.FieldPosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v1),((java.lang.StringBuffer)v3),((java.text.FieldPosition)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "must be a positive integer";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = 24;
    Object v6 = new java.lang.StringBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = 24;
    Object v8 = new java.lang.StringBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v6),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = 24;
    Object v2 = new java.lang.StringBuffer((((java.lang.Integer)v1).intValue()));
    Object v3 = 24;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.text.NumberFormat.getInstance();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.text.Format)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = 1;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.text.Format)v0).formatToCharacterIterator(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getAvailableLocales();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "org.apache.commons.math.stat.descriptive.SummaryStatixsticsImpl";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "geometric mean: ";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = "matrix is not square";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = 3;
    ((java.text.ParsePosition)v7).setErrorIndex((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = 0;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = 24;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 24;
    Object v6 = new java.lang.StringBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.lang.StringBuffer)v4).append(((java.lang.StringBuffer)v6));
    Object v8 = 1;
    Object v9 = new java.text.FieldPosition((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    ((java.text.FieldPosition)v9).setBeginIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = java.text.NumberFormat.getInstance();
    Object v2 = 2147483647;
    ((java.text.NumberFormat)v1).setMaximumFractionDigits((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = java.text.NumberFormat.getInstance();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = java.text.NumberFormat.getInstance();
    Object v2 = -33.757540988388016D;
    Object v3 = 24;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.text.NumberFormat)v1).format((((java.lang.Double)v2).doubleValue()),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
    ((org.apache.commons.math.fraction.FractionFormat)v0).setDenominatorFormat(((java.text.NumberFormat)v1));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "Maximum nmber of iterations exceeded.";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = " upperBound=";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = java.text.NumberFormat.getInstance();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setDenominatorFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = java.text.NumberFormat.getInstance();
    Object v2 = "matrix dimension mismatch";
    Object v3 = 0;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.NumberFormat)v1).parseObject(((java.lang.String)v2),((java.text.ParsePosition)v4));
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v1));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "standard deviation: ";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = ((org.apache.commons.math.fraction.FractionFormat)v0).getNumeratorFormat();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "Argument";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = ((org.apache.commons.math.fraction.FractionFormat)v0).getNumeratorFormat();
    Object v2 = ((java.text.Format)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "\n";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v0).getDenominatorFormat();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "row and column dimensions must be postive";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "\n";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v0).getDenominatorFormat();
    Object v6 = "overflow: su";
    Object v7 = ((java.text.Format)v5).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "insuffiient data";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = ((org.apache.commons.math.fraction.FractionFormat)v0).getDenominatorFormat();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = "Maximum number of itera";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = java.text.NumberFormat.getInstance();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.FractionFormat)v0).getNumeratorFormat();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = " maxK";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = "Datiaset arrays must have same length.";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = java.text.NumberFormat.getInstance();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v3).getNumeratorFormat();
    Object v5 = ((java.text.Format)v4).clone();
    Object v6 = "\n";
    Object v7 = 0;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.NumberFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v5));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    Object v3 = 24;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = "Matri must have at least one column.";
    Object v6 = ((java.lang.StringBuffer)v4).append(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = "matrix dimension. mismatch";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    Object v3 = ((java.text.Format)v2).clone();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getDenominatorFormat();
    Object v3 = ((java.text.NumberFormat)v2).clone();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v2 = ((org.apache.commons.math.fraction.ProperFractionFormat)v1).getWholeFormat();
    Object v3 = ((java.text.NumberFormat)v2).clone();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = java.text.NumberFormat.getInstance();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    Object v3 = "p must be beween 0 and 1.0 (inclusive)";
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "Funmction is not polynomial.";
    Object v2 = ((java.text.Format)v0).parseObject(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "matrix dimension mismatch";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = "mst have n > 0 for n!";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "Scale must be positive.";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v1 = ((org.apache.commons.math.fraction.FractionFormat)v0).getDenominatorFormat();
    Object v2 = "\n";
    Object v3 = 0;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.Format)v1).parseObject(((java.lang.String)v2),((java.text.ParsePosition)v4));
    Object v6 = "matrix is not square";
    Object v7 = ((java.text.Format)v1).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = ",";
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = "\n";
    Object v3 = 0;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v1).parseObject(((java.lang.String)v2),((java.text.ParsePosition)v4));
    Object v6 = ((org.apache.commons.math.fraction.FractionFormat)v1).getDenominatorFormat();
    Object v7 = 24;
    Object v8 = new java.lang.StringBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v6),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = "invalid row or column index selection";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = " + ";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = " initia =";
    Object v2 = ((java.text.Format)v0).parseObject(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.FractionFormat)v0).getNumeratorFormat();
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = " uppe/=";
    Object v4 = ((java.text.Format)v1).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setDenominatorFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = "must have n >= k for binomial coeff";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = "overflow: too lage to negate";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v6 = ((org.apache.commons.math.fraction.FractionFormat)v5).getNumeratorFormat();
    Object v7 = ((java.text.Format)v6).clone();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = 0;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.Format)v0).formatToCharacterIterator(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "overflow: add";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v2).getDenominatorFormat();
    Object v4 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v4).getNumeratorFormat();
    Object v6 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v3),((java.text.NumberFormat)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = "n ";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = 24;
    Object v2 = new java.lang.StringBuffer((((java.lang.Integer)v1).intValue()));
    Object v3 = 24;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = 24;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.lang.StringBuffer)v4).insert((((java.lang.Integer)v5).intValue()),((java.lang.CharSequence)v7));
    Object v9 = 1;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v3 = ((org.apache.commons.math.fraction.ProperFractionFormat)v2).getWholeFormat();
    Object v4 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v4).getNumeratorFormat();
    Object v6 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v7 = ((org.apache.commons.math.fraction.FractionFormat)v6).getNumeratorFormat();
    Object v8 = ((java.text.NumberFormat)v5).equals(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v3),((java.text.NumberFormat)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = ",";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v3 = 24;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v2).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v2).getDenominatorFormat();
    Object v4 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v4).getNumeratorFormat();
    Object v6 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v3),((java.text.NumberFormat)v5));
    Object v7 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v8 = ((org.apache.commons.math.fraction.FractionFormat)v7).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v6).setNumeratorFormat(((java.text.NumberFormat)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v3 = ((org.apache.commons.math.fraction.ProperFractionFormat)v2).getWholeFormat();
    Object v4 = -17.939739428691063D;
    Object v5 = 24;
    Object v6 = new java.lang.StringBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.NumberFormat)v3).format((((java.lang.Double)v4).doubleValue()),((java.lang.StringBuffer)v6),((java.text.FieldPosition)v8));
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v3));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v4).getNumeratorFormat();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v3 = ((org.apache.commons.math.fraction.ProperFractionFormat)v2).getWholeFormat();
    Object v4 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v4).getNumeratorFormat();
    Object v6 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v7 = ((org.apache.commons.math.fraction.FractionFormat)v6).getNumeratorFormat();
    Object v8 = ((java.text.NumberFormat)v5).equals(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v3),((java.text.NumberFormat)v5));
    Object v10 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v11 = ((org.apache.commons.math.fraction.FractionFormat)v10).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v9).setNumeratorFormat(((java.text.NumberFormat)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setDenominatorFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    Object v3 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v3).getNumeratorFormat();
    Object v5 = ((java.text.NumberFormat)v2).equals(((java.lang.Object)v4));
    ((org.apache.commons.math.fraction.FractionFormat)v0).setDenominatorFormat(((java.text.NumberFormat)v2));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1));
    Object v3 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v3).getNumeratorFormat();
    Object v5 = 24;
    Object v6 = new java.lang.StringBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.math.fraction.FractionFormat)v2).format(((java.lang.Object)v4),((java.lang.StringBuffer)v6),((java.text.FieldPosition)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v2).getDenominatorFormat();
    Object v4 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v4).getNumeratorFormat();
    Object v6 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v3),((java.text.NumberFormat)v5));
    Object v7 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v8 = ((org.apache.commons.math.fraction.ProperFractionFormat)v7).getWholeFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v6).setDenominatorFormat(((java.text.NumberFormat)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1));
    Object v3 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v3).getNumeratorFormat();
    Object v5 = ((java.text.Format)v4).clone();
    Object v6 = 1L;
    Object v7 = ((java.text.NumberFormat)v5).format((((java.lang.Long)v6).longValue()));
    ((org.apache.commons.math.fraction.ProperFractionFormat)v2).setWholeFormat(((java.text.NumberFormat)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v2 = ((org.apache.commons.math.fraction.ProperFractionFormat)v1).getWholeFormat();
    Object v3 = ((java.text.NumberFormat)v2).getRoundingMode();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setDenominatorFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1));
    Object v3 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v3).getNumeratorFormat();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v2).setWholeFormat(((java.text.NumberFormat)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "number of successes must be less than or equal to populatioZn size";
    Object v1 = " Evaluation failed for argument=";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "number of successes must be less than or equal to populatioZn size";
    Object v1 = " Evaluation failed for argument=";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(((java.util.Locale)v2));
    Object v4 = "}";
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v3).parse(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v2).getDenominatorFormat();
    Object v4 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v4).getNumeratorFormat();
    Object v6 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v3),((java.text.NumberFormat)v5));
    Object v7 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v8 = "\n";
    Object v9 = 0;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.fraction.FractionFormat)v7).parseObject(((java.lang.String)v8),((java.text.ParsePosition)v10));
    Object v12 = ((org.apache.commons.math.fraction.FractionFormat)v7).getDenominatorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v6).setDenominatorFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v15 = ((org.apache.commons.math.fraction.FractionFormat)v14).getNumeratorFormat();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v6).setWholeFormat(((java.text.NumberFormat)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = 0;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = 24;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.fraction.FractionFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1));
    Object v3 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v3).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v2).setNumeratorFormat(((java.text.NumberFormat)v4));
    Object v5 = null;
    Object v6 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v7 = ((org.apache.commons.math.fraction.FractionFormat)v6).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v2).setNumeratorFormat(((java.text.NumberFormat)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getNumeratorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    Object v4 = "]d";
    Object v5 = 0;
    Object v6 = new java.text.ParsePosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v4),((java.text.ParsePosition)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.FractionFormat)v0).getNumeratorFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v2).getNumeratorFormat();
    Object v4 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v5 = ((org.apache.commons.math.fraction.ProperFractionFormat)v4).getWholeFormat();
    Object v6 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v3),((java.text.NumberFormat)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v2 = ((org.apache.commons.math.fraction.ProperFractionFormat)v1).getWholeFormat();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "All input rows must have the same lenmth.";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "number of successes must be less than or equal to populatioZn size";
    Object v1 = " Evaluation failed for argument=";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.math.fraction.FractionFormat.getProperInstance(((java.util.Locale)v2));
    Object v4 = "function is nu0ll.";
    Object v5 = 0;
    Object v6 = new java.text.ParsePosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.fraction.ProperFractionFormat)v3).parse(((java.lang.String)v4),((java.text.ParsePosition)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "probabil";
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = "Maximum number of iterations exceeded.";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.text.ParsePosition)v3).toString();
    Object v5 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "matrix is";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = "selected row and collmn index arrays must be non-empty";
    Object v6 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "number of successes must be less than or equal to populatioZn size";
    Object v1 = " Evaluation failed for argument=";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance(((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).getWholeFormat();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v2).getDenominatorFormat();
    Object v4 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v4).getNumeratorFormat();
    Object v6 = new org.apache.commons.math.fraction.ProperFractionFormat(((java.text.NumberFormat)v1),((java.text.NumberFormat)v3),((java.text.NumberFormat)v5));
    Object v7 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v8 = ((org.apache.commons.math.fraction.FractionFormat)v7).getDenominatorFormat();
    Object v9 = 24;
    Object v10 = new java.lang.StringBuffer((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v14 = ((org.apache.commons.math.fraction.ProperFractionFormat)v13).getWholeFormat();
    Object v15 = ((java.text.FieldPosition)v12).equals(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.math.fraction.FractionFormat)v6).format(((java.lang.Object)v8),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getDenominatorFormat();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setDenominatorFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = "Maximum umber of iterations exceeded.";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = "<";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.fraction.ProperFractionFormat)v0).parse(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v2 = ((org.apache.commons.math.fraction.FractionFormat)v1).getDenominatorFormat();
    ((org.apache.commons.math.fraction.ProperFractionFormat)v0).setWholeFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getImproperInstance();
    Object v1 = "]";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = ((org.apache.commons.math.fraction.FractionFormat)v0).getDenominatorFormat();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ((java.text.Format)v0).clone();
    Object v2 = new org.apache.commons.math.fraction.ProperFractionFormat();
    Object v3 = ((org.apache.commons.math.fraction.FractionFormat)v2).getNumeratorFormat();
    Object v4 = ((java.text.NumberFormat)v3).getRoundingMode();
    ((org.apache.commons.math.fraction.FractionFormat)v0).setNumeratorFormat(((java.text.NumberFormat)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = org.apache.commons.math.fraction.FractionFormat.getProperInstance();
    Object v1 = ",";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.fraction.FractionFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    Object v5 = " is larger than the current number of eGements";
    Object v6 = ((org.apache.commons.math.fraction.FractionFormat)v0).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }
}
