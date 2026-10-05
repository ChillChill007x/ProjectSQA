package org.apache.commons.math.analysis.solvers;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 0.0D;
    Object v4 = 4.09243598010663D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v2).solve((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(4.878563857205665E-7D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = -25.401002428003117D;
    Object v6 = 12.935061305406043D;
    Object v7 = -64.17849275371294D;
    Object v8 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v2).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.9983985484087746D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).setMaximalIterationCount((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = -39.50532335659224D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v2).setFunctionValueAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).resetAbsoluteAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = -38;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).setMaximalIterationCount((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v2).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).setRelativeAccuracy((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v2).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v2).resetFunctionValueAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v2).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(4.76837158203125E-7D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = -27.13699138353334D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolver)v2).solve((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v2).getResult();
    org.junit.Assert.assertEquals((Object)(-0.9962404433619707D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v2).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = -33.92352760034837D;
    Object v6 = 6.505651687389486D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v2).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.8509114220218552D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = -20.908944801752902D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -7.697364141725558D;
    Object v4 = 12.818079471656665D;
    Object v5 = -4.375480846905606D;
    Object v6 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 49;
    Object v8 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v7).intValue()));
    Object v9 = -27.788471557608364D;
    Object v10 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v8).value((((java.lang.Double)v9).doubleValue()));
    Object v11 = 0.0D;
    Object v12 = 44.031442271051205D;
    Object v13 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v8),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    org.junit.Assert.assertEquals((Object)(3.2805980943926576E-7D), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = -30.748102585568525D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0.0D;
    Object v2 = 72.955982950573D;
    Object v3 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = -47.199739879057816D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 19;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 55;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).resetFunctionValueAccuracy();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = -3;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = -25.09941913213286D;
    Object v4 = -20.880786511331344D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -29.88073908777519D;
    Object v4 = -9.139083993457696D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-9.139084302532442D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 11.508708411573878D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -25.766289415558585D;
    Object v4 = 81.6857359358446D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.7765125271307434D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = -33.200363917931156D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.12658551806278473D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 2.0D;
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = -5.511455833023255D;
    Object v6 = 4.152079546010852D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.9300138020636481D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    Object v2 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = 2.0D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(4.76837158203125E-7D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 17.12257816734043D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = -31;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -2.4870392065358358D;
    Object v4 = 100.0D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 49;
    Object v8 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v7).intValue()));
    Object v9 = 0.0D;
    Object v10 = 3.1999383130267356D;
    Object v11 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(3.814623729022426E-7D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.0D;
    Object v4 = 14.669627763644591D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 49;
    Object v8 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v7).intValue()));
    Object v9 = -31.316696011901662D;
    Object v10 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v8).value((((java.lang.Double)v9).doubleValue()));
    Object v11 = -51.26665038312493D;
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v8),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.2511348279360428D), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -1.1669410270303944D;
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = -26.893326317646395D;
    Object v6 = 25.28522192931486D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.8502282211628152D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = -22.37159897597234D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.48617197745697754D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 1.0D;
    Object v4 = 28.924892163875324D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0017206285759457D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.0D;
    Object v4 = 6.313134997821921D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(3.7629216896426206E-7D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.5D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.6427531242370605D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = -62.17679908582147D;
    Object v2 = 2.6473381573456485D;
    Object v3 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(4.76837158203125E-7D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = 49;
    Object v3 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v2).intValue()));
    Object v4 = -43.98520500341846D;
    Object v5 = -30.752173660900638D;
    Object v6 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-30.752174055275702D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 12.757700985841863D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 2;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 1;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -21.924758740994008D;
    Object v4 = 24.426362439772284D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.897677362286204D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 1;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = 1.9485737180129536D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -8.16248843952262D;
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.12658578483087973D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 35.789431538440894D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v4).value((((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = 39.90361762660274D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.97305119235834E-7D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = -36.42735182390328D;
    Object v6 = 40.00386265452815D;
    Object v7 = 22.384944547755328D;
    Object v8 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v2).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.12658609156772865D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 2.0D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).resetFunctionValueAccuracy();
    Object v1 = null;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).resetFunctionValueAccuracy();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = -0.1456880979169557D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = -2.0916298166191902D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 49;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = 18.29467831624666D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.726119505799809E-7D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 12.577936055876139D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 12.577936055876139D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 40.965677071911784D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).setFunctionValueAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 12.577936055876139D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 12.577936055876139D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 12.577936055876139D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 25.67326923082081D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -19.63000284751686D;
    Object v4 = 7.8717439224343915D;
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).getResult();
    org.junit.Assert.assertEquals((Object)(0.9997811720381757D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 49;
    Object v2 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v1).intValue()));
    Object v3 = -3.314552626755048D;
    Object v4 = 5.743756220232533D;
    Object v5 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v0).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.6900540709304315D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 12.577936055876139D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 0.0D;
    Object v6 = 0.8097680751182931D;
    Object v7 = -18.731385252051496D;
    Object v8 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v4).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(3.861275077430215E-7D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -30.56352119244594D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
    Object v1 = 8.644758562445974D;
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v0).setFunctionValueAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 12.577936055876139D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).resetRelativeAccuracy();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -30.56352119244594D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 1.0D;
    Object v6 = 6.1216990203957735D;
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v4).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0025243359327107D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 12.577936055876139D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = -14.39301924623527D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    ((org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl)v4).resetFunctionValueAccuracy();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -30.56352119244594D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 49;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 30.453356883471127D;
    Object v8 = 35.642648851098116D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v4).solve(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(35.64264854179221D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -30.56352119244594D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = -5.413038890579057D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v4).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.9042549438402561D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 49;
    Object v1 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v0).intValue()));
    Object v2 = -30.56352119244594D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.analysis.solvers.BisectionSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v1));
    Object v5 = 45;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v4).setMaximalIterationCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = -6.986903224310403D;
    Object v8 = 16.469953835614305D;
    Object v9 = 2.2003102574032987D;
    Object v10 = ((org.apache.commons.math.analysis.solvers.BisectionSolver)v4).solve((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.4861721323822741D), v10);
  }
}
