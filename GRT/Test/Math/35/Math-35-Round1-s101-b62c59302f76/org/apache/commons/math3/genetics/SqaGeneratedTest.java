package org.apache.commons.math3.genetics;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v0).nextGeneration();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 15.832337001738324D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = 20120112;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v4));
    Object v5 = null;
    Object v6 = 1.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = 20120112;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).iterator();
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v4));
    Object v5 = null;
    Object v6 = -2.75963829253681D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationLimit();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = 20120112;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).iterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = 20120112;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.5D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v4).setElitismRate((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = -20;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = -33;
    Object v1 = -22.300849088532516D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationLimit();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v3).intValue()));
    Object v5 = 36;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((java.util.List)v4).equals(((java.lang.Object)v7));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v4));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).getElitismRate();
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = -3;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 28.772706018570236D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v3).toString();
    Object v5 = -0.07649935393961993D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).setElitismRate((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 52.51630253764957D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).iterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = 20120112;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v4).setElitismRate((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4.0995880682266534D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 45;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 13.506477914052498D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -39.05305053946317D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = 20120112;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = 20120112;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -2.3602377366334153D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -1.930616628969136D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 28;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -32.519456146453805D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 28;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v6 = ((java.lang.Iterable)v5).spliterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2.608570840308735D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = -16.967379724943758D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 28;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v6 = 1;
    ((org.apache.commons.math3.genetics.ListPopulation)v5).setPopulationLimit((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v5).iterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 11;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v7 = null;
    Object v8 = -65.07168395370266D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).toString();
    Object v4 = 1.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = -28.49181280400925D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).setElitismRate((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    ((java.lang.Iterable)v2).forEach(((java.util.function.Consumer)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomes();
    Object v4 = 0;
    Object v5 = 26.511216049912104D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = -67;
    ((org.apache.commons.math3.genetics.ListPopulation)v3).setPopulationLimit((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 36;
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v0).intValue()));
    Object v2 = 20120112;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 36;
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = 1.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).setElitismRate((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    Object v5 = -31.402301348828622D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v4).setElitismRate((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = 36;
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v3).setChromosomes(((java.util.List)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v3).getChromosomes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomes();
    Object v4 = -74;
    Object v5 = 30.176115068712512D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 28;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = 11;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v3).setChromosomes(((java.util.List)v7));
    Object v8 = null;
    Object v9 = 1.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).setElitismRate((((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v3).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 12;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v4).getElitismRate();
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v4).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v7).nextGeneration();
    Object v9 = ((org.apache.commons.math3.genetics.ListPopulation)v8).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 28;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).iterator();
    Object v7 = -8.526860779855275D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v5).setElitismRate((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getChromosomes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -8.880867096748787D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 28;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -21.357629171139862D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).setElitismRate((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = 22.337074240778154D;
    ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).setElitismRate((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 28;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v5).nextGeneration();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomes();
    Object v4 = 1;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v6).nextGeneration();
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v7).getChromosomes();
    Object v9 = ((java.util.List)v3).add(((java.lang.Object)v8));
    Object v10 = 22;
    Object v11 = 21.47967247934809D;
    Object v12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(((java.util.List)v3),(((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 36;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v3).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).iterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ElitisticListPopulation)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
