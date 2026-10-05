package org.jfree.chart.renderer;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = 1.0D;
    Object v2 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getPaint((((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getUpperBound();
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 19.75636778599376D;
    Object v1 = 2.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 15.752958470892708D;
    Object v1 = -38.467954304225366D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 16.868925491090017D;
    Object v1 = 13.642399484719714D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 16.009065370584043D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = 0.0D;
    Object v2 = 16.009065370584043D;
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -27.359835324657197D;
    Object v1 = 26.75291941118905D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = 0.0D;
    Object v2 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getPaint((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getLowerBound();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -42.417499036233416D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v4 = 0.0D;
    Object v5 = 16.009065370584043D;
    Object v6 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.renderer.GrayPaintScale)v3).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getUpperBound();
    org.junit.Assert.assertEquals((Object)(29.28263117573392D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -76.33220487171837D;
    Object v4 = -14.25215977021947D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getLowerBound();
    org.junit.Assert.assertEquals((Object)(-17.653601483195626D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 8.206078729482806D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = ((org.jfree.chart.renderer.GrayPaintScale)v0).clone();
    Object v2 = -17.653601483195626D;
    Object v3 = 29.28263117573392D;
    Object v4 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 46.76041519297863D;
    Object v1 = 25.94544760577108D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v2 = ((org.jfree.chart.renderer.GrayPaintScale)v1).getUpperBound();
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -3.7561311138592224D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = ((org.jfree.chart.renderer.GrayPaintScale)v0).clone();
    Object v2 = -17.653601483195626D;
    Object v3 = 29.28263117573392D;
    Object v4 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v4).getLowerBound();
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 16.009065370584043D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v3).clone();
    Object v5 = -17.653601483195626D;
    Object v6 = 29.28263117573392D;
    Object v7 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v7).getLowerBound();
    Object v9 = ((org.jfree.chart.renderer.GrayPaintScale)v3).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 55.04071251543197D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 2.4672735739315708D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 2.4672735739315708D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getUpperBound();
    org.junit.Assert.assertEquals((Object)(2.4672735739315708D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = 0.0D;
    Object v2 = 2.4672735739315708D;
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 4.323453995549326D;
    Object v1 = 20.44521940758946D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 22.77910034981141D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -25.206299984030274D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = -21.984085142580657D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -46.85472835860002D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = 31.584417611183635D;
    Object v2 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getPaint((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 6.203503032028113D;
    Object v1 = 1.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    Object v6 = 0.0D;
    Object v7 = 2.4672735739315708D;
    Object v8 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.jfree.chart.renderer.GrayPaintScale)v8).clone();
    Object v10 = ((org.jfree.chart.renderer.GrayPaintScale)v8).getUpperBound();
    Object v11 = ((org.jfree.chart.renderer.GrayPaintScale)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 26.388428937252538D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 13.16026893227841D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -2.922982158660167D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = -17.653601483195626D;
    Object v2 = 29.28263117573392D;
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -76.33220487171837D;
    Object v5 = -14.25215977021947D;
    Object v6 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.renderer.GrayPaintScale)v3).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    Object v4 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 55.04071251543197D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = -28.788471557608364D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 16.009065370584043D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -76.33220487171837D;
    Object v4 = -14.25215977021947D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 4.323453995549326D;
    Object v1 = 20.44521940758946D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v4 = 31.584417611183635D;
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v3).getPaint((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 45.031442271051205D;
    Object v1 = 45.93430594781731D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 55.04071251543197D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -9.094740533546625D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v5).getLowerBound();
    org.junit.Assert.assertEquals((Object)(-76.33220487171837D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 11.964185791669705D;
    Object v1 = 9.754609572075703D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -21.984085142580657D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    Object v4 = 0.0D;
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = -32.27093572762242D;
    Object v1 = -41.42397677071449D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -39.05305053946317D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getUpperBound();
    org.junit.Assert.assertEquals((Object)(-14.25215977021947D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -76.33220487171837D;
    Object v1 = -14.25215977021947D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = -1.3602377366334153D;
    Object v1 = -39.245295413751045D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 2.4672735739315708D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 4.323453995549326D;
    Object v1 = 20.44521940758946D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -6.290613189711397D;
    Object v1 = 30.102473692083063D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 17.527694434620074D;
    Object v1 = 10.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = -13.962658243522029D;
    Object v2 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getPaint((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getUpperBound();
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = -6.290613189711397D;
    Object v2 = 30.102473692083063D;
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = 1.0D;
    Object v2 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getPaint((((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v4 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v4).getUpperBound();
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v3).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.renderer.GrayPaintScale)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2.0D;
    Object v4 = 55.04071251543197D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 19.592131916392596D;
    Object v1 = -42.266744541674555D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 11.144864378079225D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v1 = ((org.jfree.chart.renderer.GrayPaintScale)v0).getLowerBound();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -6.7175346344264195D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -28.788471557608364D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 2.4672735739315708D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 16.009065370584043D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -13.963228247835142D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    Object v5 = -76.33220487171837D;
    Object v6 = -14.25215977021947D;
    Object v7 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 45.031442271051205D;
    Object v1 = 45.93430594781731D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -76.33220487171837D;
    Object v4 = -14.25215977021947D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v5).clone();
    Object v7 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v6).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 16.707672258337624D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 2.4672735739315708D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v4 = 31.584417611183635D;
    Object v5 = ((org.jfree.chart.renderer.GrayPaintScale)v3).getPaint((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 16.707672258337624D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 2.4672735739315708D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -28.788471557608364D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = ((org.jfree.chart.renderer.GrayPaintScale)v5).getPaint((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 3.170337905360191D;
    Object v1 = 34.71353797417631D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 3.170337905360191D;
    Object v1 = 34.71353797417631D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 16.009065370584043D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = -76.33220487171837D;
    Object v7 = -14.25215977021947D;
    Object v8 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.jfree.chart.renderer.GrayPaintScale)v5).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -21.984085142580657D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 3.170337905360191D;
    Object v4 = 34.71353797417631D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 16.009065370584043D;
    Object v8 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = -76.33220487171837D;
    Object v10 = -14.25215977021947D;
    Object v11 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.jfree.chart.renderer.GrayPaintScale)v8).equals(((java.lang.Object)v11));
    Object v13 = ((org.jfree.chart.renderer.GrayPaintScale)v5).equals(((java.lang.Object)v12));
    Object v14 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -50.584402780211D;
    Object v1 = -23.34863808930069D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.renderer.GrayPaintScale)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -4.240557538845608D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -28.788471557608364D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 16.707672258337624D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -47.670147786744636D;
    Object v1 = 1.7445507649608838D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 4.115151272508994D;
    Object v1 = 29.943802476560535D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -53.33733836310566D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 16.707672258337624D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.renderer.GrayPaintScale)v5).clone();
    Object v7 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 45.031442271051205D;
    Object v1 = 45.93430594781731D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -28.788471557608364D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = ((org.jfree.chart.renderer.GrayPaintScale)v5).getPaint((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -6.290613189711397D;
    Object v1 = 30.102473692083063D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    Object v5 = -28.788471557608364D;
    Object v6 = 0.0D;
    Object v7 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -39.23439949951576D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -17.653601483195626D;
    Object v1 = 29.28263117573392D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.jfree.chart.renderer.GrayPaintScale();
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v3).clone();
    Object v5 = -17.653601483195626D;
    Object v6 = 29.28263117573392D;
    Object v7 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = -4.240557538845608D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 46.46560302472234D;
    Object v4 = ((org.jfree.chart.renderer.GrayPaintScale)v2).getPaint((((java.lang.Double)v3).doubleValue()));
    Object v5 = -4.240557538845608D;
    Object v6 = 0.0D;
    Object v7 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.renderer.GrayPaintScale)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1.8371283130506004D;
    Object v1 = 9.318799787307531D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -107.50107432756708D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.chart.renderer.GrayPaintScale((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }
}
