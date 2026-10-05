package org.apache.commons.math.stat;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getPct(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = 0L;
    Object v3 = ((org.apache.commons.math.stat.Frequency)v1).getCumPct((((java.lang.Long)v2).longValue()));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = ((org.apache.commons.math.stat.Frequency)v1).getCount(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 10;
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Integer)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    org.junit.Assert.assertEquals((Object)(1L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    org.junit.Assert.assertEquals((Object)("Value \t Freq. \t Pct. \t Cum Pct. \n"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 10;
    ((org.apache.commons.math.stat.Frequency)v5).addValue(((java.lang.Integer)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.math.stat.Frequency)v5).getSumFreq();
    Object v9 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)1);
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCount((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Character)v3).charValue()));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v6).getPct(((java.lang.Object)v7));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 0;
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    ((org.apache.commons.math.stat.Frequency)v5).addValue((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    ((org.apache.commons.math.stat.Frequency)v5).addValue((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    ((org.apache.commons.math.stat.Frequency)v5).addValue((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq((((java.lang.Integer)v8).intValue()));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = ((java.util.Comparator)v4).reversed();
    Object v6 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v4));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 2;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Integer)v3).intValue()));
    Object v5 = -7L;
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = -26;
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Integer)v3));
    Object v4 = null;
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = ((java.util.Comparator)v5).reversed();
    Object v7 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v5).getSumFreq();
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v5).getSumFreq();
    Object v9 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v5).getSumFreq();
    Object v7 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 0L;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v4).getCumPct((((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v4).getCount(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v8));
    Object v10 = 0;
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Integer)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = ((java.util.Comparator)v4).reversed();
    Object v6 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v4));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getCumFreq((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v8).getSumFreq();
    Object v12 = ((org.apache.commons.math.stat.Frequency)v5).getPct(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getCumFreq((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v8).getSumFreq();
    Object v12 = ((org.apache.commons.math.stat.Frequency)v5).getPct(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v12));
    Object v14 = Character.valueOf((char)1);
    Object v15 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct((((java.lang.Character)v14).charValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 0;
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Integer)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = -22L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v5).toString();
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = ((java.util.Comparator)v7).reversed();
    Object v9 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v7));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v5).getCount(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(0L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getPct((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Integer)v3).intValue()));
    Object v5 = 0L;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getPct((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = -36L;
    Object v10 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCount((((java.lang.Integer)v6).intValue()));
    Object v8 = 0L;
    Object v9 = ((org.apache.commons.math.stat.Frequency)v5).getPct((((java.lang.Long)v8).longValue()));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    org.junit.Assert.assertEquals((Object)("Value \t Freq. \t Pct. \t Cum Pct. \n\u0000\t1\t100%\t100%\n"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = ((java.util.Comparator)v5).reversed();
    Object v7 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v7).toString();
    Object v9 = java.util.Comparator.reverseOrder();
    Object v10 = ((java.util.Comparator)v9).reversed();
    Object v11 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v9));
    Object v12 = ((org.apache.commons.math.stat.Frequency)v7).getCount(((java.lang.Object)v11));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Character)v3).charValue()));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = ((java.util.Comparator)v5).reversed();
    Object v7 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.math.stat.Frequency)v7).getCumPct((((java.lang.Character)v8).charValue()));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 4;
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    ((org.apache.commons.math.stat.Frequency)v2).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v5).getPct(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Character)v3).charValue()));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    org.junit.Assert.assertEquals((Object)("Value \t Freq. \t Pct. \t Cum Pct. \n"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 6L;
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = ((java.util.Comparator)v4).reversed();
    Object v6 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v4));
    Object v7 = ((org.apache.commons.math.stat.Frequency)v6).getSumFreq();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = ((org.apache.commons.math.stat.Frequency)v4).getPct(((java.lang.Object)v5));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = -35L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = 0;
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getCount((((java.lang.Integer)v9).intValue()));
    Object v11 = 0L;
    Object v12 = ((org.apache.commons.math.stat.Frequency)v8).getPct((((java.lang.Long)v11).longValue()));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v5).getCumPct(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = 0;
    ((org.apache.commons.math.stat.Frequency)v8).addValue((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = ((org.apache.commons.math.stat.Frequency)v8).getCumFreq((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v5).getCumPct(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCumPct((((java.lang.Character)v6).charValue()));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = ((java.util.Comparator)v8).reversed();
    Object v10 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v8));
    Object v11 = 0;
    Object v12 = ((org.apache.commons.math.stat.Frequency)v10).getPct((((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.lang.Comparable)v7).compareTo(((java.lang.Object)v12));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v7));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct((((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = ((java.util.Comparator)v5).reversed();
    Object v7 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v7).toString();
    Object v9 = java.util.Comparator.reverseOrder();
    Object v10 = ((java.util.Comparator)v9).reversed();
    Object v11 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v9));
    Object v12 = ((org.apache.commons.math.stat.Frequency)v7).getCumFreq(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 1;
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Integer)v3));
    Object v4 = null;
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = ((java.util.Comparator)v5).reversed();
    Object v7 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v7).getSumFreq();
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.math.stat.Frequency)v7).getPct((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(0.0D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)4);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    ((org.apache.commons.math.stat.Frequency)v5).addValue((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq((((java.lang.Integer)v8).intValue()));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    org.junit.Assert.assertEquals((Object)(1L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCount((((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 0L;
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).getSumFreq();
    org.junit.Assert.assertEquals((Object)(1L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 17L;
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getPct((((java.lang.Character)v9).charValue()));
    ((org.apache.commons.math.stat.Frequency)v5).addValue(((java.lang.Object)v10));
    Object v11 = null;
    Object v12 = -36L;
    Object v13 = ((org.apache.commons.math.stat.Frequency)v5).getCount((((java.lang.Long)v12).longValue()));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v5).toString();
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = ((java.util.Comparator)v7).reversed();
    Object v9 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v7));
    Object v10 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(0L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = -36L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = 0L;
    Object v6 = ((org.apache.commons.math.stat.Frequency)v4).getCumPct((((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = ((org.apache.commons.math.stat.Frequency)v4).getCount(((java.lang.Object)v7));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = 10;
    ((org.apache.commons.math.stat.Frequency)v8).addValue(((java.lang.Integer)v9));
    Object v10 = null;
    Object v11 = ((org.apache.commons.math.stat.Frequency)v8).getSumFreq();
    Object v12 = ((org.apache.commons.math.stat.Frequency)v5).getCumPct(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = -10L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 5;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    ((org.apache.commons.math.stat.Frequency)v2).clear();
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    org.junit.Assert.assertEquals((Object)("Value \t Freq. \t Pct. \t Cum Pct. \n"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = 0;
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getCount((((java.lang.Integer)v9).intValue()));
    Object v11 = 0L;
    Object v12 = ((org.apache.commons.math.stat.Frequency)v8).getPct((((java.lang.Long)v11).longValue()));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v5).getCumPct(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(0L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = 0;
    ((org.apache.commons.math.stat.Frequency)v8).addValue((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = ((org.apache.commons.math.stat.Frequency)v8).getCumFreq((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v13));
    Object v15 = java.util.Comparator.reverseOrder();
    Object v16 = ((java.util.Comparator)v15).reversed();
    Object v17 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v15));
    Object v18 = 0;
    Object v19 = ((org.apache.commons.math.stat.Frequency)v17).getCumFreq((((java.lang.Integer)v18).intValue()));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = 10;
    ((org.apache.commons.math.stat.Frequency)v8).addValue(((java.lang.Integer)v9));
    Object v10 = null;
    Object v11 = ((org.apache.commons.math.stat.Frequency)v8).getSumFreq();
    Object v12 = ((org.apache.commons.math.stat.Frequency)v5).getCumPct(((java.lang.Object)v11));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getPct((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = -10L;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getPct((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCumFreq((((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Character)v3).charValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = -35L;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getPct((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).valuesIterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCount((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getPct((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).toString();
    Object v4 = 1;
    ((org.apache.commons.math.stat.Frequency)v2).addValue((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq((((java.lang.Character)v3).charValue()));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = ((java.util.Comparator)v5).reversed();
    Object v7 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v5));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = ((java.util.Comparator)v8).reversed();
    Object v10 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v8));
    Object v11 = 0;
    Object v12 = ((org.apache.commons.math.stat.Frequency)v10).getPct((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.math.stat.Frequency)v7).getCumFreq(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCount((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = 0;
    ((org.apache.commons.math.stat.Frequency)v8).addValue((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = 1;
    Object v12 = ((org.apache.commons.math.stat.Frequency)v8).getCumFreq((((java.lang.Integer)v11).intValue()));
    ((org.apache.commons.math.stat.Frequency)v5).addValue(((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = ((org.apache.commons.math.stat.Frequency)v5).getSumFreq();
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Object)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = ((org.apache.commons.math.stat.Frequency)v5).getSumFreq();
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((org.apache.commons.math.stat.Frequency)v5).getPct((((java.lang.Character)v7).charValue()));
    Object v9 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = 0L;
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getCount((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v5).getCount(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getCount((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v8));
    Object v10 = 0L;
    Object v11 = ((org.apache.commons.math.stat.Frequency)v9).getCumPct((((java.lang.Long)v10).longValue()));
    Object v12 = java.util.Comparator.reverseOrder();
    Object v13 = ((org.apache.commons.math.stat.Frequency)v9).getCount(((java.lang.Object)v12));
    Object v14 = ((java.lang.Comparable)v7).compareTo(((java.lang.Object)v13));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v7));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getCount((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v5).getCumPct(((java.lang.Object)v10));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((java.util.Comparator)v6).reversed();
    Object v8 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v6));
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.math.stat.Frequency)v8).getCount((((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.math.stat.Frequency)v5).getCount(((java.lang.Object)v10));
    ((org.apache.commons.math.stat.Frequency)v2).addValue(((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 10;
    ((org.apache.commons.math.stat.Frequency)v5).addValue(((java.lang.Integer)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.math.stat.Frequency)v5).getSumFreq();
    Object v9 = ((org.apache.commons.math.stat.Frequency)v2).getCount(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = ((org.apache.commons.math.stat.Frequency)v2).valuesIterator();
    Object v4 = 4;
    Object v5 = ((org.apache.commons.math.stat.Frequency)v2).getCumPct((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v2 = ((org.apache.commons.math.stat.Frequency)v1).toString();
    org.junit.Assert.assertEquals((Object)("Value \t Freq. \t Pct. \t Cum Pct. \n"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v5 = ((org.apache.commons.math.stat.Frequency)v4).toString();
    Object v6 = ((org.apache.commons.math.stat.Frequency)v2).getPct(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((java.util.Comparator)v3).reversed();
    Object v5 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v3));
    Object v6 = 1;
    Object v7 = ((org.apache.commons.math.stat.Frequency)v5).getPct((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.stat.Frequency)v2).getCumFreq(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = ((java.util.Comparator)v0).reversed();
    Object v2 = new org.apache.commons.math.stat.Frequency(((java.util.Comparator)v0));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.math.stat.Frequency)v2).getCount((((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }
}
