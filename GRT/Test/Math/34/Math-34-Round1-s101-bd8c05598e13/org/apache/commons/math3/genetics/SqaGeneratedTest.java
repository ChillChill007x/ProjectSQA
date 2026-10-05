package org.apache.commons.math3.genetics;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v0).addChromosomes(((java.util.Collection)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomeList();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomeList();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 3;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).iterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).addChromosomes(((java.util.Collection)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    Object v4 = 1;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    Object v4 = 4;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).addChromosomes(((java.util.Collection)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getChromosomes();
    Object v4 = ((java.lang.Iterable)v3).iterator();
    Object v5 = ((java.lang.Iterable)v3).spliterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationLimit();
    org.junit.Assert.assertEquals((Object)(4), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -13;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomeList();
    Object v7 = 0;
    Object v8 = ((java.util.List)v6).listIterator((((java.lang.Integer)v7).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 27;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -1;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 10;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setPopulationLimit((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).addChromosome(((org.apache.commons.math3.genetics.Chromosome)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v3).iterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationLimit();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationSize();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationLimit();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -10;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = 4;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v3).setChromosomes(((java.util.List)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setPopulationLimit((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -27;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationSize();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = 4;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v7).intValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.genetics.ListPopulation)v9).getChromosomeList();
    Object v11 = ((java.util.Collection)v10).size();
    ((org.apache.commons.math3.genetics.ListPopulation)v6).addChromosomes(((java.util.Collection)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    ((java.lang.Iterable)v2).forEach(((java.util.function.Consumer)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = 4;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v7).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setChromosomes(((java.util.List)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = -9;
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setPopulationLimit((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationLimit();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = 0;
    Object v8 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v7).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v6).addChromosomes(((java.util.Collection)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = 4;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getChromosomeList();
    Object v8 = ((java.util.List)v7).hashCode();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = 4;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 4;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v8).intValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math3.genetics.ListPopulation)v10).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v7).setChromosomes(((java.util.List)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.math3.genetics.ListPopulation)v7).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v4).addChromosomes(((java.util.Collection)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).addChromosomes(((java.util.Collection)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -18;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 4;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v6).intValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.genetics.ListPopulation)v8).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v5).setChromosomes(((java.util.List)v9));
    Object v10 = null;
    Object v11 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    Object v4 = 4;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).addChromosomes(((java.util.Collection)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationLimit();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getPopulationSize();
    Object v8 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v6).setPopulationLimit((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -16;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = 1;
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setPopulationLimit((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomes();
    Object v7 = 4;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v7).intValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.genetics.ListPopulation)v9).getChromosomeList();
    Object v11 = ((java.util.List)v6).indexOf(((java.lang.Object)v10));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 36;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomeList();
    Object v7 = 4;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v7).intValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.genetics.Population)v9).nextGeneration();
    Object v11 = ((org.apache.commons.math3.genetics.Population)v9).nextGeneration();
    Object v12 = ((org.apache.commons.math3.genetics.Population)v11).nextGeneration();
    Object v13 = java.util.function.Predicate.isEqual(((java.lang.Object)v12));
    Object v14 = ((java.util.Collection)v6).removeIf(((java.util.function.Predicate)v13));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getChromosomes();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = 4;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v7).intValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.genetics.ListPopulation)v9).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v6).setChromosomes(((java.util.List)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationLimit();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).iterator();
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    Object v8 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v6).setPopulationLimit((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 30;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = 12;
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setPopulationLimit((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = 1;
    ((org.apache.commons.math3.genetics.ListPopulation)v5).setPopulationLimit((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = -23;
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setPopulationLimit((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationLimit();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).iterator();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).iterator();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.Collection)v4).stream();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).iterator();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).iterator();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = 4;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v7).getChromosomeList();
    Object v9 = 0;
    Object v10 = ((java.util.List)v8).listIterator((((java.lang.Integer)v9).intValue()));
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setChromosomes(((java.util.List)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationSize();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getChromosomeList();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationLimit();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v6).nextGeneration();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v2).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v8 = ((org.apache.commons.math3.genetics.Population)v7).getPopulationSize();
    Object v9 = ((org.apache.commons.math3.genetics.Population)v7).nextGeneration();
    Object v10 = ((org.apache.commons.math3.genetics.ListPopulation)v9).getChromosomeList();
    Object v11 = ((java.util.Collection)v10).parallelStream();
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setChromosomes(((java.util.List)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v5).setPopulationLimit((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationLimit();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v6).nextGeneration();
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v7).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationSize();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v6).nextGeneration();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = 4;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v6).intValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.genetics.Population)v8).nextGeneration();
    Object v10 = ((org.apache.commons.math3.genetics.Population)v8).nextGeneration();
    Object v11 = ((org.apache.commons.math3.genetics.Population)v10).getPopulationSize();
    Object v12 = ((org.apache.commons.math3.genetics.Population)v10).nextGeneration();
    Object v13 = ((org.apache.commons.math3.genetics.ListPopulation)v12).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v5).addChromosomes(((java.util.Collection)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).iterator();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = 4;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math3.genetics.Population)v7).nextGeneration();
    Object v9 = ((org.apache.commons.math3.genetics.Population)v7).nextGeneration();
    Object v10 = ((org.apache.commons.math3.genetics.Population)v9).getPopulationSize();
    Object v11 = ((org.apache.commons.math3.genetics.Population)v9).nextGeneration();
    Object v12 = ((org.apache.commons.math3.genetics.ListPopulation)v11).getChromosomeList();
    ((java.util.List)v12).clear();
    Object v13 = null;
    ((org.apache.commons.math3.genetics.ListPopulation)v4).setChromosomes(((java.util.List)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).iterator();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.ListPopulation)v5).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -21;
    ((org.apache.commons.math3.genetics.ListPopulation)v2).setPopulationLimit((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v6).nextGeneration();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = 4;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v7).intValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.genetics.ListPopulation)v9).getChromosomeList();
    ((org.apache.commons.math3.genetics.ListPopulation)v6).addChromosomes(((java.util.Collection)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v6).nextGeneration();
    Object v8 = 5;
    ((org.apache.commons.math3.genetics.ListPopulation)v7).setPopulationLimit((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 4;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v8 = ((org.apache.commons.math3.genetics.Population)v7).getPopulationSize();
    Object v9 = ((org.apache.commons.math3.genetics.Population)v7).nextGeneration();
    Object v10 = ((org.apache.commons.math3.genetics.ListPopulation)v9).getChromosomeList();
    Object v11 = 4;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math3.genetics.ListPopulation)v13).getChromosomeList();
    Object v15 = ((java.util.Collection)v10).addAll(((java.util.Collection)v14));
    ((org.apache.commons.math3.genetics.ListPopulation)v2).addChromosomes(((java.util.Collection)v10));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v6).nextGeneration();
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v7).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.ListPopulation)v3).getChromosomes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v5).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.Population)v6).nextGeneration();
    Object v8 = 1;
    ((org.apache.commons.math3.genetics.ListPopulation)v7).setPopulationLimit((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((java.lang.Iterable)v2).iterator();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v6 = 0;
    ((org.apache.commons.math3.genetics.ListPopulation)v5).setPopulationLimit((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).getPopulationSize();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.ListPopulation)v4).getPopulationSize();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v4 = ((org.apache.commons.math3.genetics.Population)v2).nextGeneration();
    Object v5 = ((org.apache.commons.math3.genetics.Population)v4).getPopulationSize();
    Object v6 = ((org.apache.commons.math3.genetics.Population)v4).nextGeneration();
    Object v7 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getChromosomes();
    Object v8 = ((org.apache.commons.math3.genetics.ListPopulation)v6).getFittestChromosome();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
