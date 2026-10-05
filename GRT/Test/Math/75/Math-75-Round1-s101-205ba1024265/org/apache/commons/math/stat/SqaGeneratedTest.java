package org.apache.commons.math.stat;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getPct(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCumPct(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0L;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCumPct((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v1).getSumFreq();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0;
    Object v5 = 29;
    Object v6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v3).getCumFreq(((java.lang.Comparable)v6));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v1).getCumPct(((java.lang.Comparable)v7));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.math.stat.Frequency)v1).addValue(((java.lang.Comparable)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCount(((java.lang.Comparable)v4));
    Object v6 = 0;
    Object v7 = 29;
    Object v8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v1).getCount(((java.lang.Comparable)v8));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(31), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCount((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.math.stat.Frequency)v3).getCount((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.math.stat.Frequency)v1).addValue(((java.lang.Comparable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0;
    Object v5 = 29;
    Object v6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v3).getCumFreq(((java.lang.Comparable)v6));
    ((org.apache.commons.math.stat.Frequency)v1).addValue(((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0;
    Object v5 = 29;
    Object v6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v3).getCumPct(((java.lang.Comparable)v6));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 29;
    Object v11 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math.stat.Frequency)v1).addValue(((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCount((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v3).getCumPct((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v3).getSumFreq();
    Object v7 = ((org.apache.commons.math.stat.Frequency)v1).getCount(((java.lang.Comparable)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0;
    Object v5 = 29;
    Object v6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v3).getCumPct(((java.lang.Comparable)v6));
    ((org.apache.commons.math.stat.Frequency)v1).addValue(((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).toString();
    org.junit.Assert.assertEquals((Object)("Value \t Freq. \t Pct. \t Cum Pct. \n"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0L;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getPct((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).getSumFreq();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v3).getCount((((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.math.stat.Frequency)v1).addValue(((java.lang.Comparable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v3).getSumFreq();
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq(((java.lang.Comparable)v4));
    Object v6 = 1;
    ((org.apache.commons.math.stat.Frequency)v1).addValue((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = -21L;
    ((org.apache.commons.math.stat.Frequency)v1).addValue((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0;
    Object v5 = 29;
    Object v6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v3).getCumFreq(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v1).getPct(((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = 29;
    Object v11 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.stat.Frequency)v1).getPct(((java.lang.Comparable)v11));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.math.stat.Frequency)v1).addValue(((java.lang.Object)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v3).getSumFreq();
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCount(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 26;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v3).getSumFreq();
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCount(((java.lang.Object)v4));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.math.stat.Frequency)v7).getCount((((java.lang.Character)v8).charValue()));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq(((java.lang.Comparable)v9));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).toString();
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v4).getCount((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v1).getCount(((java.lang.Comparable)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v4));
    Object v6 = 0L;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCumPct((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v5).getSumFreq();
    Object v9 = ((org.apache.commons.math.stat.Frequency)v3).getCount(((java.lang.Comparable)v8));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v1).getCumPct(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 33L;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).valuesIterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 1L;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCount((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = Character.valueOf((char)0);
    ((org.apache.commons.math.stat.Frequency)v1).addValue((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(32), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = Character.valueOf((char)0);
    ((org.apache.commons.math.stat.Frequency)v1).addValue((((java.lang.Character)v2).charValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCumPct((((java.lang.Character)v2).charValue()));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v4));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v8 = 0;
    Object v9 = 29;
    Object v10 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v7).getCumFreq(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.math.stat.Frequency)v5).getPct(((java.lang.Object)v11));
    Object v13 = 0;
    Object v14 = 29;
    Object v15 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.math.stat.Frequency)v5).getPct(((java.lang.Comparable)v15));
    Object v17 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq(((java.lang.Comparable)v16));
    org.junit.Assert.assertEquals((Object)(0L), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0L;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCount((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 1;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCount((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 1L;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v1).getSumFreq();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0;
    Object v5 = 29;
    Object v6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v3).getCumPct(((java.lang.Comparable)v6));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq(((java.lang.Comparable)v7));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    ((org.apache.commons.math.stat.Frequency)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0;
    ((org.apache.commons.math.stat.Frequency)v1).addValue((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCumPct((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 0;
    Object v6 = 29;
    Object v7 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v4).getCumPct(((java.lang.Comparable)v7));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Comparable)v8));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v0).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Long)v3).longValue()));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Comparable)v4));
    Object v5 = null;
    ((org.apache.commons.math.stat.Frequency)v0).clear();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 0;
    Object v2 = 29;
    Object v3 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq(((java.lang.Comparable)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v4).getSumFreq();
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Comparable)v5));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Comparable)v6));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).equals(((java.lang.Object)v1));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(31), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = ((org.apache.commons.math.stat.Frequency)v0).toString();
    org.junit.Assert.assertEquals((Object)("Value \t Freq. \t Pct. \t Cum Pct. \n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 1;
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getPct((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = ((org.apache.commons.math.stat.Frequency)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(31), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = ((org.apache.commons.math.stat.Frequency)v0).getSumFreq();
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 0;
    Object v4 = 29;
    Object v5 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Comparable)v5));
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v7));
    Object v9 = 1L;
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getCumFreq((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v8).getSumFreq();
    Object v12 = ((java.lang.Comparable)v6).compareTo(((java.lang.Object)v11));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Comparable)v6));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = ((org.apache.commons.math.stat.Frequency)v0).hashCode();
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 1L;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v3).getCumFreq((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v3).getSumFreq();
    Object v7 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Comparable)v6));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 0L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Long)v3).longValue()));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Comparable)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = -42;
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Integer)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getPct((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 0L;
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getPct((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).getSumFreq();
    Object v3 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq(((java.lang.Comparable)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).hashCode();
    Object v3 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct(((java.lang.Comparable)v2));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 1;
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Integer)v1));
    Object v2 = null;
    Object v3 = -23L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct((((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 9L;
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = new org.apache.commons.math.stat.Frequency();
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    Object v4 = ((org.apache.commons.math.stat.Frequency)v1).getCumFreq(((java.lang.Comparable)v3));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 0L;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v4).getCumPct((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v4).getSumFreq();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Comparable)v7));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Comparable)v8));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 0L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    Object v6 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Comparable)v5));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    ((org.apache.commons.math.stat.Frequency)v0).clear();
    Object v1 = null;
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v3).getCount((((java.lang.Long)v4).longValue()));
    Object v6 = new org.apache.commons.math.stat.Frequency();
    Object v7 = 9L;
    Object v8 = ((org.apache.commons.math.stat.Frequency)v6).getCumFreq((((java.lang.Long)v7).longValue()));
    Object v9 = ((java.lang.Comparable)v5).compareTo(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Comparable)v5));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).hashCode();
    Object v3 = ((org.apache.commons.math.stat.Frequency)v0).getCount(((java.lang.Comparable)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 0;
    Object v2 = 29;
    Object v3 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Object)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getPct((((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq(((java.lang.Comparable)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v7 = 0;
    Object v8 = 29;
    Object v9 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v6).getCumFreq(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v0).getCount(((java.lang.Comparable)v10));
    org.junit.Assert.assertEquals((Object)(0L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = Character.valueOf((char)1);
    ((org.apache.commons.math.stat.Frequency)v0).addValue((((java.lang.Character)v1).charValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v4).getSumFreq();
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Comparable)v5));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Object)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v8));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v9).getSumFreq();
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Comparable)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 0;
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq((((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 0;
    Object v6 = 29;
    Object v7 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v4).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Comparable)v8));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 0L;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v4).getCumPct((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v4).getSumFreq();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Comparable)v7));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq(((java.lang.Comparable)v8));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = Character.valueOf((char)0);
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).hashCode();
    Object v6 = ((org.apache.commons.math.stat.Frequency)v0).getCount(((java.lang.Comparable)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).hashCode();
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 1L;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v4).getCumFreq((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v4).getSumFreq();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v1).getPct(((java.lang.Comparable)v7));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = ((org.apache.commons.math.stat.Frequency)v0).getSumFreq();
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v3).getCount((((java.lang.Long)v4).longValue()));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Comparable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 0;
    Object v4 = 29;
    Object v5 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).equals(((java.lang.Object)v5));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Object)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 26L;
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getCount((((java.lang.Long)v1).longValue()));
    Object v3 = 2L;
    ((org.apache.commons.math.stat.Frequency)v0).addValue((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 1;
    ((org.apache.commons.math.stat.Frequency)v0).addValue((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    Object v6 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct(((java.lang.Comparable)v5));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 0L;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v4).getCumPct((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v4).getSumFreq();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Comparable)v7));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.math.stat.Frequency();
    Object v11 = 1;
    Object v12 = ((org.apache.commons.math.stat.Frequency)v10).getPct((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Comparable)v12));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 0;
    Object v2 = 29;
    Object v3 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v0).getCount(((java.lang.Comparable)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = 1;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getPct((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct(((java.lang.Comparable)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v6).toString();
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v8));
    Object v10 = 0;
    Object v11 = ((org.apache.commons.math.stat.Frequency)v9).getCount((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.stat.Frequency)v6).getCount(((java.lang.Comparable)v11));
    Object v13 = ((java.lang.Comparable)v4).compareTo(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.math.stat.Frequency)v0).getCumFreq(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(0L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 22L;
    ((org.apache.commons.math.stat.Frequency)v0).addValue((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 0;
    Object v4 = 29;
    Object v5 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Comparable)v5));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v2));
    Object v4 = 0;
    Object v5 = 29;
    Object v6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v3).getCumPct(((java.lang.Comparable)v6));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v1).equals(((java.lang.Object)v7));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 12;
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).getCount((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = ((org.apache.commons.math.stat.Frequency)v0).getSumFreq();
    Object v2 = ((org.apache.commons.math.stat.Frequency)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(31), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = 0;
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Integer)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = ((org.apache.commons.math.stat.Frequency)v0).getSumFreq();
    Object v2 = -45;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = 0;
    Object v3 = 29;
    Object v4 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCount(((java.lang.Comparable)v4));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v0).getCumPct(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.math.stat.Frequency();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v7).getSumFreq();
    Object v9 = ((org.apache.commons.math.stat.Frequency)v0).getCount(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = new org.apache.commons.math.stat.Frequency();
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getPct((((java.lang.Character)v2).charValue()));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Comparable)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math.stat.Frequency();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v1));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.math.stat.Frequency)v0).addValue(((java.lang.Object)v4));
    Object v5 = null;
    Object v6 = 0;
    Object v7 = 29;
    Object v8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v0).getPct(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }
}
