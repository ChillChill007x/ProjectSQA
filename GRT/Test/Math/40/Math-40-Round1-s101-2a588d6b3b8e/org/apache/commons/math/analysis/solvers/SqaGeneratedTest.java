package org.apache.commons.math.analysis.solvers;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 31.902282905771397D;
    Object v1 = 11;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 31.902282905771397D;
    Object v1 = 11;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v2).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 31.902282905771397D;
    Object v1 = 11;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.function.Acosh();
    Object v5 = 14.642399484719714D;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateFunction)v4).value((((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = 16.009065370584043D;
    Object v10 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).solve((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v4),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -9.951015299924936D;
    Object v1 = 14.570401158451869D;
    Object v2 = 15;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = -9.951015299924936D;
    Object v1 = 14.570401158451869D;
    Object v2 = 15;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v2).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -8.01209965774624D;
    Object v2 = -63;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 18;
    Object v4 = new org.apache.commons.math.analysis.function.Acosh();
    Object v5 = 1.0D;
    Object v6 = 44.92252329710116D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).solve((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(18), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -27.13699138353334D;
    Object v1 = 1.0D;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -31.903011827881166D;
    Object v1 = -14.906902650847318D;
    Object v2 = 28.352117581238296D;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = -12.12555844723884D;
    Object v1 = 0.0D;
    Object v2 = 1;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -13.132865935114854D;
    Object v1 = 22;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -23;
    Object v4 = new org.apache.commons.math.analysis.function.Acosh();
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).solve((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = -9.223372036854776E18D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 28.4961285836148D;
    Object v1 = 0.0D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 30.177013177447762D;
    Object v1 = 26.872553329763022D;
    Object v2 = 1;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).getMin();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = -9.251839831377055D;
    Object v1 = 0.0D;
    Object v2 = 1;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -9.951015299924936D;
    Object v1 = 14.570401158451869D;
    Object v2 = 15;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).getMaximalOrder();
    org.junit.Assert.assertEquals((Object)(15), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 18.004083444572956D;
    Object v1 = 1.0D;
    Object v2 = 5.423704490073212D;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 13;
    Object v4 = new org.apache.commons.math.analysis.function.Acosh();
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.solvers.AllowedSolution.LEFT_SIDE;
    Object v8 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v2).solve((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((org.apache.commons.math.analysis.solvers.AllowedSolution)v7));
    org.junit.Assert.assertEquals((Object)(1.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = -13.132865935114854D;
    Object v1 = 22;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.function.Acosh();
    Object v5 = -8.159944265373944D;
    Object v6 = -37.80852901539695D;
    Object v7 = 0.0D;
    Object v8 = org.apache.commons.math.analysis.solvers.AllowedSolution.BELOW_SIDE;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v2).solve((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),((org.apache.commons.math.analysis.solvers.AllowedSolution)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -15.647202187328878D;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = 179;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 72.48014658350743D;
    Object v1 = 1.0D;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = Double.NaN;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 28.4961285836148D;
    Object v1 = 0.0D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).getStartValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -15.647202187328878D;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = 179;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = 2;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = -9.223372036854776E18D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 54;
    Object v5 = new org.apache.commons.math.analysis.function.Acosh();
    Object v6 = 29.373813785400262D;
    Object v7 = 10.502968573259025D;
    Object v8 = org.apache.commons.math.analysis.solvers.AllowedSolution.ANY_SIDE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).solve((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),((org.apache.commons.math.analysis.solvers.AllowedSolution)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 15.0D;
    Object v2 = 18;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = 2;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 28.4961285836148D;
    Object v1 = 0.0D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).getStartValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 15.0D;
    Object v2 = 18;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 33;
    Object v5 = new org.apache.commons.math.analysis.function.Acosh();
    Object v6 = 0.0D;
    Object v7 = -21.558983129447878D;
    Object v8 = -28.231313973961498D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).solve((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 100.25055385008949D;
    Object v1 = 1.0D;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 24.89773960054345D;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).getMax();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 15.390385922408251D;
    Object v1 = -24;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -1.8420702810219276D;
    Object v1 = 25;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 5.0D;
    Object v1 = -20.527104541527528D;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = -9.223372036854776E18D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -39.63204231621261D;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = -9.223372036854776E18D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).getMaximalOrder();
    org.junit.Assert.assertEquals((Object)(26), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = -13.132865935114854D;
    Object v1 = 22;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 16;
    Object v4 = new org.apache.commons.math.analysis.function.Acosh();
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).solve((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = -1.8420702810219276D;
    Object v1 = 25;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.function.Acosh();
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateFunction)v4).value((((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = -53.05094647897695D;
    Object v9 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).solve((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v4),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = Double.NaN;
    Object v1 = 883.2541634220623D;
    Object v2 = 30;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = -36.243682349173916D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = -13.561620504996844D;
    Object v1 = -59.04705190556269D;
    Object v2 = 15.0D;
    Object v3 = -74;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 43.980568473501116D;
    Object v2 = 1.0D;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -1.8420702810219276D;
    Object v1 = 25;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).getMin();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 4.787856371327284D;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 23.87824645264836D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 15.0D;
    Object v2 = 18;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 39.29942442672663D;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -100.79503188150343D;
    Object v1 = 6.163891320889915D;
    Object v2 = 50.35382373798969D;
    Object v3 = 15;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0.0D;
    Object v2 = -2.551571863686856D;
    Object v3 = -12;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Double.NaN;
    Object v1 = 883.2541634220623D;
    Object v2 = 30;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(883.2541634220623D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = -1.8420702810219276D;
    Object v1 = 25;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v2).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 9.113836654465903D;
    Object v2 = -8;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = -13.132865935114854D;
    Object v1 = 22;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.function.Acosh();
    Object v5 = -9.678773877518497D;
    Object v6 = -13.439145849106856D;
    Object v7 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v2).solve((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = -13.132865935114854D;
    Object v1 = 22;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v2).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -14.97427906066194D;
    Object v2 = -22;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = -3.7567146512096703D;
    Object v1 = 0.0D;
    Object v2 = 4.275206117576477D;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = 2;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 21.20721973658181D;
    Object v2 = -67.3339970109774D;
    Object v3 = 37;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -32.94528513447014D;
    Object v1 = 0.0D;
    Object v2 = 5;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = -35.484548418267345D;
    Object v1 = 0.0D;
    Object v2 = -35.42189109273876D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = -13.20059497907063D;
    Object v1 = 0.0D;
    Object v2 = 2.0D;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 28.4961285836148D;
    Object v1 = 0.0D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(28.4961285836148D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 38;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = -9.223372036854776E18D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(2.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = -9.223372036854776E18D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(-9.223372036854776E18D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = 17;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 72.3264283102765D;
    Object v1 = 1.0D;
    Object v2 = 35;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = -2.095908756176593D;
    Object v1 = 11.111290113007845D;
    Object v2 = 1;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0.0625D;
    Object v2 = 0.0D;
    Object v3 = -7;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 21.20721973658181D;
    Object v2 = -67.3339970109774D;
    Object v3 = 37;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v4).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = Double.NaN;
    Object v1 = 883.2541634220623D;
    Object v2 = 30;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver)v3).doSolve();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = -9.223372036854776E18D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).getMax();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 19.35572979049478D;
    Object v1 = 21;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = -12.946117564719602D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -20.984088171348336D;
    Object v2 = -2;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 4.630804383952708D;
    Object v1 = 0.0D;
    Object v2 = 2.0D;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = -38.14550385474044D;
    Object v1 = 2.0D;
    Object v2 = -2;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -15.647202187328878D;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = 179;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v4).getMin();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver();
    Object v1 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v0).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = -9.223372036854776E18D;
    Object v2 = 26;
    Object v3 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Acosh();
    Object v6 = -11.472427109155705D;
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver)v3).solve((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.UnivariateFunction)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = -22.27674932838867D;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 14.007071521571186D;
    Object v1 = 23;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = 2.0D;
    Object v3 = 27;
    Object v4 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }
}
