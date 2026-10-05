package org.apache.commons.math.analysis.solvers;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.5D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31.30903015198001D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(15.654515075990005D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -25.09941913213286D;
    Object v3 = -31.880786511331344D;
    Object v4 = 17.925365688374715D;
    Object v5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 60.78695631973314D;
    Object v5 = 17;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = Double.NaN;
    Object v3 = 0.0D;
    Object v4 = 22.907634134578842D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -14.224049903570505D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-6.612024951785252D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 65.63591725304238D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(33.31795862652119D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 2.0D;
    Object v5 = 12;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = -38.37749045439693D;
    Object v4 = 0.0D;
    Object v5 = 3;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -23.177130204566353D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-11.588565102283177D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = 31;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 28.682524749167495D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(14.841262374583748D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 8.891654320087355D;
    Object v5 = 55;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 3.1500362558130357D;
    Object v3 = -6.078135225961807D;
    Object v4 = 30.645012256736685D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 65.04256144735416D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(32.52128072367708D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 10.57835779318961D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(5.289178896594805D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 21.57876588880795D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -21.411268207403392D;
    Object v3 = -30.38459005626355D;
    Object v4 = -7.958163500142637D;
    Object v5 = 17;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = -7.310411933220314D;
    Object v4 = 18.07786466812245D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 10.185470010712498D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(5.092735005356249D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 62.68914938057693D;
    Object v1 = 9.5152811647872D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(36.102215272682066D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 29.311638324382642D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(14.655819162191321D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -7.819947416929905D;
    Object v3 = -18.51254608715026D;
    Object v4 = 1.0D;
    Object v5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -0.5879117634524302D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.2939558817262151D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -1.8755749250046398D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.4377874625023199D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = -18.15784892651935D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-8.078924463259675D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 38.102375418261644D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = -0.8541028381359352D;
    Object v6 = 1.6748294857991994D;
    Object v7 = 2;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.5D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 33.71609517332126D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(16.85804758666063D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 34.513576728084615D;
    Object v3 = -9.16201612021288D;
    Object v4 = 46.17442571420511D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = -26.362573918049883D;
    Object v6 = 52.0D;
    Object v7 = 2;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 4.0D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 43.35419042044236D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(21.67709521022118D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -31.353775508568255D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-15.676887754284127D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 8.988944270761555D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = -14.77597744032208D;
    Object v5 = -19.956656819503575D;
    Object v6 = 0.0D;
    Object v7 = 1;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 12.122340478775971D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(6.561170239387986D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 2.0D;
    Object v3 = 2.0D;
    Object v4 = 17.73589697569344D;
    Object v5 = 16;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 34.42998085435092D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 1.0D;
    Object v6 = 2.0D;
    Object v7 = 1;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 3.0D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.5D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = 2.0D;
    Object v5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = -1.680146169334356D;
    Object v4 = 19.97935726751511D;
    Object v5 = 2;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 57.33353809751788D;
    Object v1 = 41.57103389643278D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(49.452285996975334D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 59.19254532294445D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -12.202010160415409D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-6.101005080207704D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 74.96663989741518D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(37.98331994870759D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -32.62968387370394D;
    Object v1 = 12.108371504600418D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-10.26065618455176D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = -23.207501260291746D;
    Object v6 = 1.8485222839088005D;
    Object v7 = 2;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -38.77577808151442D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-19.38788904075721D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 18.785273489120883D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(9.892636744560441D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = 1.0D;
    Object v4 = 26.48002744462379D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 1.373046346051013D;
    Object v5 = 36;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -20.53593656765021D;
    Object v1 = 2.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-9.267968283825105D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 43.7290487786442D;
    Object v5 = 56;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -11.251674292724784D;
    Object v3 = -28.101581050441887D;
    Object v4 = 1.0D;
    Object v5 = 27;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 2.0D;
    Object v3 = 0.0D;
    Object v4 = 60.60545480669262D;
    Object v5 = 18;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = -3.578621849266905D;
    Object v4 = 24.036082736416386D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 43.25802417727806D;
    Object v3 = 0.0D;
    Object v4 = 74.12545307343986D;
    Object v5 = 15;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -20.642828868836116D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-10.321414434418058D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = 9.195028565112283D;
    Object v5 = 7;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = -19.45093552002348D;
    Object v4 = 50.132600096807145D;
    Object v5 = 29;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -40.510655226005696D;
    Object v1 = 88.58851136053849D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(24.038928067266397D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -3.370469207028748D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = -12.683877464040213D;
    Object v5 = -18.13173093521779D;
    Object v6 = 0.0D;
    Object v7 = 1;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 5.235710123731451D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = 46.33135157540823D;
    Object v7 = 20;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 3.0D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 13.375752204277278D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(6.687876102138639D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 15.520717617246696D;
    Object v5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 23.364961728587517D;
    Object v1 = -31.50644373280586D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-4.0707410021091714D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -25.689566241905997D;
    Object v1 = 52.193470014281516D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(13.25195188618776D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -22.770344345737477D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 20.79293136896295D;
    Object v1 = 8.229244355586136D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(14.511087862274543D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 3.0D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = -40.52788206872628D;
    Object v5 = -47.771162208955765D;
    Object v6 = 0.0D;
    Object v7 = 1;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 16.985851045907314D;
    Object v5 = 4;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 2.0D;
    Object v3 = 1.0D;
    Object v4 = 40.37419716266407D;
    Object v5 = 21;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 4.2484392428953885D;
    Object v1 = -14.523357942365154D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-5.137459349734883D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -9.501666001084173D;
    Object v1 = -22.238694974294294D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-15.870180487689233D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = -25.68967619518533D;
    Object v4 = 0.0D;
    Object v5 = 33;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -5.545922298905412D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-2.772961149452706D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -22.615296350461495D;
    Object v3 = -23.063834291758255D;
    Object v4 = 0.0D;
    Object v5 = 54;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = -25.164067145077095D;
    Object v4 = 1.0D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = -53.11086822511977D;
    Object v4 = 43.07781725839186D;
    Object v5 = 63;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -69.58768155374614D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-34.79384077687307D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -9.459821997022004D;
    Object v3 = -22.330292326224416D;
    Object v4 = 0.0D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = 11;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 31.66821895070583D;
    Object v5 = 2.0D;
    Object v6 = 38.87096663838274D;
    Object v7 = 1;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = -6.719228485926676D;
    Object v4 = 16.260925801132682D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 19.642802804317594D;
    Object v1 = 2.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.821401402158797D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 14.68871279403862D;
    Object v1 = 21.016457148419267D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(17.852584971228943D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 13.881678823615207D;
    Object v1 = 14.459248338032515D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(14.17046358082386D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 13.666258546757538D;
    Object v5 = 10;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 2.0D;
    Object v3 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = 1;
    Object v8 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = -27.808674570232082D;
    Object v4 = 1.378970800593572D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = -1.0419696756861854D;
    Object v3 = -74.85909235022885D;
    Object v4 = 21.003394326523683D;
    Object v5 = 16;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 12.516260941662718D;
    Object v3 = 1.0D;
    Object v4 = 17.038055949552067D;
    Object v5 = 1;
    Object v6 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 32.3848123179948D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(16.1924061589974D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new double[]{50.89112988483847D};
    Object v1 = new org.apache.commons.math.analysis.polynomials.PolynomialFunction(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 19.43497544417188D;
    Object v5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(((org.apache.commons.math.analysis.UnivariateRealFunction)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 44.6962484826542D;
    Object v2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(22.3481242413271D), v2);
  }
}
