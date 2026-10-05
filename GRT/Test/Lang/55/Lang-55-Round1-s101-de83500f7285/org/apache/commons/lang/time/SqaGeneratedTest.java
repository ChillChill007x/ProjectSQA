package org.apache.commons.lang.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).stop();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).resume();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).suspend();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getSplitTime();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).split();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).unsplit();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).getSplitTime();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    ((org.apache.commons.lang.time.StopWatch)v0).unsplit();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).resume();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    ((org.apache.commons.lang.time.StopWatch)v0).stop();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).toSplitString();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).stop();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    ((org.apache.commons.lang.time.StopWatch)v0).resume();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    ((org.apache.commons.lang.time.StopWatch)v0).unsplit();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    ((org.apache.commons.lang.time.StopWatch)v0).resume();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).suspend();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).getSplitTime();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    ((org.apache.commons.lang.time.StopWatch)v0).suspend();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).toSplitString();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toSplitString();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).unsplit();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    ((org.apache.commons.lang.time.StopWatch)v0).suspend();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).split();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    ((org.apache.commons.lang.time.StopWatch)v0).split();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).split();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).getSplitTime();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).suspend();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    ((org.apache.commons.lang.time.StopWatch)v0).split();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).resume();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    ((org.apache.commons.lang.time.StopWatch)v0).stop();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).stop();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).getSplitTime();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).unsplit();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).toSplitString();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).toSplitString();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).start();
    Object v1 = null;
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v1 = null;
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).getTime();
    Object v2 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    org.junit.Assert.assertEquals((Object)("0:00:00.000"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.StopWatch();
    Object v1 = ((org.apache.commons.lang.time.StopWatch)v0).toString();
    ((org.apache.commons.lang.time.StopWatch)v0).reset();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }
}
