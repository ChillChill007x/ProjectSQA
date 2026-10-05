package org.mockito.internal.verification;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 40L;
    Object v1 = -7L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = 0;
    Object v9 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -6L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -6L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -45L;
    Object v7 = 0L;
    Object v8 = -6L;
    Object v9 = 1L;
    Object v10 = 0;
    Object v11 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = null;
    ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).verify(((org.mockito.internal.verification.api.VerificationData)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = -6L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).getDelegate();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = -6L;
    Object v13 = 1L;
    Object v14 = 0;
    Object v15 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).getDelegate();
    Object v19 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = -6L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).getDuration();
    org.junit.Assert.assertEquals((Object)(1L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getPollingPeriod();
    org.junit.Assert.assertEquals((Object)(-45L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = -6L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 40L;
    Object v1 = -7L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = -6L;
    Object v9 = 1L;
    Object v10 = 0;
    Object v11 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -10L;
    Object v1 = 60L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).getDelegate();
    Object v9 = false;
    Object v10 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -10L;
    Object v1 = 60L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).getDelegate();
    Object v9 = false;
    Object v10 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0;
    Object v12 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v10).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).getDelegate();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = -10L;
    Object v1 = 60L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).getDelegate();
    Object v9 = false;
    Object v10 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = -6L;
    Object v12 = 1L;
    Object v13 = 0;
    Object v14 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v13).intValue()));
    Object v15 = true;
    Object v16 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),((org.mockito.verification.VerificationMode)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v10).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = 1L;
    Object v9 = 19L;
    Object v10 = 0;
    Object v11 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = 1L;
    Object v14 = new org.mockito.internal.util.Timer((((java.lang.Long)v13).longValue()));
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()),((org.mockito.internal.util.Timer)v14));
    Object v16 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 0;
    Object v11 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = -6L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).getPollingPeriod();
    org.junit.Assert.assertEquals((Object)(-6L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    ((org.mockito.internal.util.Timer)v6).start();
    Object v7 = null;
    Object v8 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = 0;
    Object v9 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -10L;
    Object v1 = 60L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).getDelegate();
    Object v9 = false;
    Object v10 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v10).getDelegate();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 40L;
    Object v1 = -7L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).getPollingPeriod();
    org.junit.Assert.assertEquals((Object)(40L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    ((org.mockito.internal.util.Timer)v6).start();
    Object v7 = null;
    Object v8 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v9 = -10L;
    Object v10 = 60L;
    Object v11 = -6L;
    Object v12 = 1L;
    Object v13 = 0;
    Object v14 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v13).intValue()));
    Object v15 = true;
    Object v16 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),((org.mockito.verification.VerificationMode)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v16).getDelegate();
    Object v18 = false;
    Object v19 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()),((org.mockito.verification.VerificationMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v8).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = -45L;
    Object v9 = 0L;
    Object v10 = -6L;
    Object v11 = 1L;
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = 1L;
    Object v18 = new org.mockito.internal.util.Timer((((java.lang.Long)v17).longValue()));
    Object v19 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()),((org.mockito.internal.util.Timer)v18));
    Object v20 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v19).getDelegate();
    Object v21 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -6L;
    Object v11 = 1L;
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v15).getDelegate();
    Object v17 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1L;
    Object v11 = 19L;
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = -45L;
    Object v14 = 0L;
    Object v15 = -6L;
    Object v16 = 1L;
    Object v17 = 0;
    Object v18 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v17).intValue()));
    Object v19 = true;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = 1L;
    Object v23 = new org.mockito.internal.util.Timer((((java.lang.Long)v22).longValue()));
    Object v24 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v20),(((java.lang.Boolean)v21).booleanValue()),((org.mockito.internal.util.Timer)v23));
    Object v25 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v24).getDelegate();
    Object v26 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 0L;
    Object v11 = -3L;
    Object v12 = -6L;
    Object v13 = 1L;
    Object v14 = 0;
    Object v15 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1L;
    Object v1 = -37L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = -10L;
    Object v9 = 60L;
    Object v10 = -6L;
    Object v11 = 1L;
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v15).getDelegate();
    Object v17 = false;
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = 0;
    Object v14 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1L;
    Object v1 = -37L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).getPollingPeriod();
    org.junit.Assert.assertEquals((Object)(1L), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -10L;
    Object v11 = 60L;
    Object v12 = -6L;
    Object v13 = 1L;
    Object v14 = 0;
    Object v15 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).getDelegate();
    Object v19 = false;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v20).getDelegate();
    Object v22 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = 1L;
    Object v15 = new org.mockito.internal.util.Timer((((java.lang.Long)v14).longValue()));
    Object v16 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()),((org.mockito.internal.util.Timer)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -10L;
    Object v1 = 0L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -10L;
    Object v1 = 0L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).getDelegate();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = 1L;
    Object v15 = new org.mockito.internal.util.Timer((((java.lang.Long)v14).longValue()));
    Object v16 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()),((org.mockito.internal.util.Timer)v15));
    Object v17 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v16).getDelegate();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = -10L;
    Object v14 = 60L;
    Object v15 = -6L;
    Object v16 = 1L;
    Object v17 = 0;
    Object v18 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v17).intValue()));
    Object v19 = true;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v20).getDelegate();
    Object v22 = false;
    Object v23 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v23).getDelegate();
    Object v25 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).getDuration();
    org.junit.Assert.assertEquals((Object)(19L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1L;
    Object v1 = -37L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v18 = -10L;
    Object v19 = 60L;
    Object v20 = -6L;
    Object v21 = 1L;
    Object v22 = 0;
    Object v23 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v22).intValue()));
    Object v24 = true;
    Object v25 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v20).longValue()),(((java.lang.Long)v21).longValue()),((org.mockito.verification.VerificationMode)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v25).getDelegate();
    Object v27 = false;
    Object v28 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),((org.mockito.verification.VerificationMode)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -10L;
    Object v11 = 0L;
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = 0L;
    Object v13 = 1L;
    Object v14 = 0;
    Object v15 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = 1L;
    Object v18 = new org.mockito.internal.util.Timer((((java.lang.Long)v17).longValue()));
    ((org.mockito.internal.util.Timer)v18).start();
    Object v19 = null;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()),((org.mockito.internal.util.Timer)v18));
    Object v21 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = -10L;
    Object v1 = 0L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = null;
    ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).verify(((org.mockito.internal.verification.api.VerificationData)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = 0L;
    Object v14 = -57L;
    Object v15 = -10L;
    Object v16 = 0L;
    Object v17 = 0;
    Object v18 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v17).intValue()));
    Object v19 = false;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = 1L;
    Object v23 = new org.mockito.internal.util.Timer((((java.lang.Long)v22).longValue()));
    Object v24 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v20),(((java.lang.Boolean)v21).booleanValue()),((org.mockito.internal.util.Timer)v23));
    Object v25 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = 1L;
    Object v14 = 19L;
    Object v15 = 0;
    Object v16 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v15).intValue()));
    Object v17 = false;
    Object v18 = 1L;
    Object v19 = new org.mockito.internal.util.Timer((((java.lang.Long)v18).longValue()));
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v16),(((java.lang.Boolean)v17).booleanValue()),((org.mockito.internal.util.Timer)v19));
    Object v21 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v20).getDelegate();
    Object v22 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = null;
    ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).verify(((org.mockito.internal.verification.api.VerificationData)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = -10L;
    Object v13 = 0L;
    Object v14 = 0;
    Object v15 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = 1L;
    Object v15 = new org.mockito.internal.util.Timer((((java.lang.Long)v14).longValue()));
    Object v16 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()),((org.mockito.internal.util.Timer)v15));
    Object v17 = -45L;
    Object v18 = 0L;
    Object v19 = -6L;
    Object v20 = 1L;
    Object v21 = 0;
    Object v22 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    Object v24 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v19).longValue()),(((java.lang.Long)v20).longValue()),((org.mockito.verification.VerificationMode)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = 1L;
    Object v27 = new org.mockito.internal.util.Timer((((java.lang.Long)v26).longValue()));
    Object v28 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v17).longValue()),(((java.lang.Long)v18).longValue()),((org.mockito.verification.VerificationMode)v24),(((java.lang.Boolean)v25).booleanValue()),((org.mockito.internal.util.Timer)v27));
    Object v29 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v28).getDelegate();
    Object v30 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v16).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 22L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = 0L;
    Object v4 = -10L;
    Object v5 = 60L;
    Object v6 = -6L;
    Object v7 = 1L;
    Object v8 = 0;
    Object v9 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = false;
    Object v14 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = 1L;
    Object v17 = new org.mockito.internal.util.Timer((((java.lang.Long)v16).longValue()));
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v14),(((java.lang.Boolean)v15).booleanValue()),((org.mockito.internal.util.Timer)v17));
    Object v19 = true;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = -45L;
    Object v14 = 0L;
    Object v15 = -6L;
    Object v16 = 1L;
    Object v17 = 0;
    Object v18 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v17).intValue()));
    Object v19 = true;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = 1L;
    Object v23 = new org.mockito.internal.util.Timer((((java.lang.Long)v22).longValue()));
    Object v24 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v20),(((java.lang.Boolean)v21).booleanValue()),((org.mockito.internal.util.Timer)v23));
    Object v25 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v24).getDelegate();
    Object v26 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 0L;
    Object v11 = -57L;
    Object v12 = -10L;
    Object v13 = 0L;
    Object v14 = 0;
    Object v15 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v14).intValue()));
    Object v16 = false;
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = 1L;
    Object v20 = new org.mockito.internal.util.Timer((((java.lang.Long)v19).longValue()));
    Object v21 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v17),(((java.lang.Boolean)v18).booleanValue()),((org.mockito.internal.util.Timer)v20));
    Object v22 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v21).getDelegate();
    Object v23 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = false;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = -10L;
    Object v9 = 60L;
    Object v10 = -6L;
    Object v11 = 1L;
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v15).getDelegate();
    Object v17 = false;
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v18).getDelegate();
    Object v20 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = -6L;
    Object v13 = 1L;
    Object v14 = 0;
    Object v15 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).getDelegate();
    Object v19 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = 0L;
    Object v14 = -57L;
    Object v15 = -10L;
    Object v16 = 0L;
    Object v17 = 0;
    Object v18 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v17).intValue()));
    Object v19 = false;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = 1L;
    Object v23 = new org.mockito.internal.util.Timer((((java.lang.Long)v22).longValue()));
    Object v24 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v20),(((java.lang.Boolean)v21).booleanValue()),((org.mockito.internal.util.Timer)v23));
    Object v25 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -10L;
    Object v1 = 0L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1L;
    Object v7 = -37L;
    Object v8 = -10L;
    Object v9 = 60L;
    Object v10 = -6L;
    Object v11 = 1L;
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v15).getDelegate();
    Object v17 = false;
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v18).getDelegate();
    Object v20 = true;
    Object v21 = 1L;
    Object v22 = new org.mockito.internal.util.Timer((((java.lang.Long)v21).longValue()));
    Object v23 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v19),(((java.lang.Boolean)v20).booleanValue()),((org.mockito.internal.util.Timer)v22));
    Object v24 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -10L;
    Object v1 = 0L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -10L;
    Object v7 = 60L;
    Object v8 = -6L;
    Object v9 = 1L;
    Object v10 = 0;
    Object v11 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v13).getDelegate();
    Object v15 = false;
    Object v16 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v16).getDelegate();
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = false;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v15).getDuration();
    org.junit.Assert.assertEquals((Object)(1L), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    ((org.mockito.internal.util.Timer)v6).start();
    Object v7 = null;
    Object v8 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v9 = -10L;
    Object v10 = 0L;
    Object v11 = 0;
    Object v12 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    Object v14 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v8).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDuration();
    org.junit.Assert.assertEquals((Object)(-57L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = false;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = -10L;
    Object v17 = 0L;
    Object v18 = 0;
    Object v19 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v18).intValue()));
    Object v20 = false;
    Object v21 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v16).longValue()),(((java.lang.Long)v17).longValue()),((org.mockito.verification.VerificationMode)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v15).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = -10L;
    Object v1 = 0L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -45L;
    Object v7 = 0L;
    Object v8 = -6L;
    Object v9 = 1L;
    Object v10 = 0;
    Object v11 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).getDelegate();
    Object v19 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = 1L;
    Object v15 = new org.mockito.internal.util.Timer((((java.lang.Long)v14).longValue()));
    Object v16 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()),((org.mockito.internal.util.Timer)v15));
    Object v17 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v16).getDelegate();
    Object v18 = 0L;
    Object v19 = -57L;
    Object v20 = -10L;
    Object v21 = 0L;
    Object v22 = 0;
    Object v23 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v22).intValue()));
    Object v24 = false;
    Object v25 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v20).longValue()),(((java.lang.Long)v21).longValue()),((org.mockito.verification.VerificationMode)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = 1L;
    Object v28 = new org.mockito.internal.util.Timer((((java.lang.Long)v27).longValue()));
    Object v29 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),((org.mockito.verification.VerificationMode)v25),(((java.lang.Boolean)v26).booleanValue()),((org.mockito.internal.util.Timer)v28));
    Object v30 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v29).getDelegate();
    Object v31 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1L;
    Object v1 = 19L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = -6L;
    Object v9 = 1L;
    Object v10 = 0;
    Object v11 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = false;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 0L;
    Object v17 = -57L;
    Object v18 = -10L;
    Object v19 = 0L;
    Object v20 = 0;
    Object v21 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v20).intValue()));
    Object v22 = false;
    Object v23 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),((org.mockito.verification.VerificationMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = 1L;
    Object v26 = new org.mockito.internal.util.Timer((((java.lang.Long)v25).longValue()));
    Object v27 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v16).longValue()),(((java.lang.Long)v17).longValue()),((org.mockito.verification.VerificationMode)v23),(((java.lang.Boolean)v24).booleanValue()),((org.mockito.internal.util.Timer)v26));
    Object v28 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v27).getDelegate();
    Object v29 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v28).getDelegate();
    Object v30 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v15).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1L;
    Object v1 = -37L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v18 = 0L;
    Object v19 = -3L;
    Object v20 = -6L;
    Object v21 = 1L;
    Object v22 = 0;
    Object v23 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v22).intValue()));
    Object v24 = true;
    Object v25 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v20).longValue()),(((java.lang.Long)v21).longValue()),((org.mockito.verification.VerificationMode)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),((org.mockito.verification.VerificationMode)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -10L;
    Object v1 = 0L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -10L;
    Object v7 = 0L;
    Object v8 = 0;
    Object v9 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = -57L;
    Object v4 = -10L;
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = false;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = 1L;
    Object v12 = new org.mockito.internal.util.Timer((((java.lang.Long)v11).longValue()));
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()),((org.mockito.internal.util.Timer)v12));
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    ((org.mockito.internal.util.Timer)v16).start();
    Object v17 = null;
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 26L;
    Object v1 = -21L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0L;
    Object v1 = -57L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = -10L;
    Object v14 = 0L;
    Object v15 = 0;
    Object v16 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v15).intValue()));
    Object v17 = false;
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    ((org.mockito.internal.util.Timer)v6).start();
    Object v7 = null;
    Object v8 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v9 = 26L;
    Object v10 = -21L;
    Object v11 = -10L;
    Object v12 = 60L;
    Object v13 = -6L;
    Object v14 = 1L;
    Object v15 = 0;
    Object v16 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v15).intValue()));
    Object v17 = true;
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v18).getDelegate();
    Object v20 = false;
    Object v21 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),((org.mockito.verification.VerificationMode)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()),((org.mockito.verification.VerificationMode)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v8).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -10L;
    Object v11 = 0L;
    Object v12 = 0;
    Object v13 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v12).intValue()));
    Object v14 = false;
    Object v15 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v15).getDelegate();
    Object v17 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 3L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = 0L;
    Object v4 = -10L;
    Object v5 = 60L;
    Object v6 = -6L;
    Object v7 = 1L;
    Object v8 = 0;
    Object v9 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = false;
    Object v14 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = 1L;
    Object v17 = new org.mockito.internal.util.Timer((((java.lang.Long)v16).longValue()));
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v14),(((java.lang.Boolean)v15).booleanValue()),((org.mockito.internal.util.Timer)v17));
    Object v19 = true;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -51L;
    Object v1 = 1L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.mockito.internal.util.Timer)v10).isCounting();
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = -3L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 3L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = 0L;
    Object v4 = -10L;
    Object v5 = 60L;
    Object v6 = -6L;
    Object v7 = 1L;
    Object v8 = 0;
    Object v9 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = false;
    Object v14 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = 1L;
    Object v17 = new org.mockito.internal.util.Timer((((java.lang.Long)v16).longValue()));
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v14),(((java.lang.Boolean)v15).booleanValue()),((org.mockito.internal.util.Timer)v17));
    Object v19 = true;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = 0L;
    Object v22 = -57L;
    Object v23 = -10L;
    Object v24 = 0L;
    Object v25 = 0;
    Object v26 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v25).intValue()));
    Object v27 = false;
    Object v28 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v23).longValue()),(((java.lang.Long)v24).longValue()),((org.mockito.verification.VerificationMode)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = true;
    Object v30 = 1L;
    Object v31 = new org.mockito.internal.util.Timer((((java.lang.Long)v30).longValue()));
    Object v32 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v21).longValue()),(((java.lang.Long)v22).longValue()),((org.mockito.verification.VerificationMode)v28),(((java.lang.Boolean)v29).booleanValue()),((org.mockito.internal.util.Timer)v31));
    Object v33 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v20).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v32));
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1L;
    Object v1 = -37L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).getDelegate();
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v18 = 0;
    Object v19 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 40L;
    Object v1 = -7L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v8 = 0L;
    Object v9 = 0L;
    Object v10 = -10L;
    Object v11 = 60L;
    Object v12 = -6L;
    Object v13 = 1L;
    Object v14 = 0;
    Object v15 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v17).getDelegate();
    Object v19 = false;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = 1L;
    Object v23 = new org.mockito.internal.util.Timer((((java.lang.Long)v22).longValue()));
    Object v24 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v20),(((java.lang.Boolean)v21).booleanValue()),((org.mockito.internal.util.Timer)v23));
    Object v25 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v7).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = -3L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v13).getDelegate();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1L;
    Object v11 = 1L;
    Object v12 = -10L;
    Object v13 = 60L;
    Object v14 = -6L;
    Object v15 = 1L;
    Object v16 = 0;
    Object v17 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    Object v19 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),((org.mockito.verification.VerificationMode)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v19).getDelegate();
    Object v21 = false;
    Object v22 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),((org.mockito.verification.VerificationMode)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v22).getDelegate();
    Object v24 = false;
    Object v25 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),((org.mockito.verification.VerificationMode)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = -3L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v13).getDelegate();
    Object v15 = -10L;
    Object v16 = 0L;
    Object v17 = 0;
    Object v18 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v17).intValue()));
    Object v19 = false;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v14).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = -57L;
    Object v4 = -10L;
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = false;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = 1L;
    Object v12 = new org.mockito.internal.util.Timer((((java.lang.Long)v11).longValue()));
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()),((org.mockito.internal.util.Timer)v12));
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    ((org.mockito.internal.util.Timer)v16).start();
    Object v17 = null;
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v19 = -45L;
    Object v20 = 0L;
    Object v21 = 0L;
    Object v22 = -3L;
    Object v23 = -6L;
    Object v24 = 1L;
    Object v25 = 0;
    Object v26 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v25).intValue()));
    Object v27 = true;
    Object v28 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v23).longValue()),(((java.lang.Long)v24).longValue()),((org.mockito.verification.VerificationMode)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = true;
    Object v30 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v21).longValue()),(((java.lang.Long)v22).longValue()),((org.mockito.verification.VerificationMode)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = false;
    Object v32 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v19).longValue()),(((java.lang.Long)v20).longValue()),((org.mockito.verification.VerificationMode)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v32).getDelegate();
    Object v34 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v18).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v33));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = -3L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = false;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1L;
    Object v15 = 19L;
    Object v16 = 0;
    Object v17 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v16).intValue()));
    Object v18 = false;
    Object v19 = 1L;
    Object v20 = new org.mockito.internal.util.Timer((((java.lang.Long)v19).longValue()));
    Object v21 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),((org.mockito.verification.VerificationMode)v17),(((java.lang.Boolean)v18).booleanValue()),((org.mockito.internal.util.Timer)v20));
    Object v22 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v13).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -51L;
    Object v1 = 1L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.mockito.internal.util.Timer)v10).isCounting();
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v13 = 0L;
    Object v14 = 1L;
    Object v15 = 0;
    Object v16 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v15).intValue()));
    Object v17 = true;
    Object v18 = 1L;
    Object v19 = new org.mockito.internal.util.Timer((((java.lang.Long)v18).longValue()));
    ((org.mockito.internal.util.Timer)v19).start();
    Object v20 = null;
    Object v21 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v16),(((java.lang.Boolean)v17).booleanValue()),((org.mockito.internal.util.Timer)v19));
    Object v22 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    ((org.mockito.internal.util.Timer)v6).start();
    Object v7 = null;
    Object v8 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v9 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v8).getPollingPeriod();
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 26L;
    Object v1 = -21L;
    Object v2 = -10L;
    Object v3 = 60L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v9).getDelegate();
    Object v11 = false;
    Object v12 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = false;
    Object v14 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v14).getDelegate();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -45L;
    Object v1 = 0L;
    Object v2 = -6L;
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = 1L;
    Object v10 = new org.mockito.internal.util.Timer((((java.lang.Long)v9).longValue()));
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()),((org.mockito.internal.util.Timer)v10));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = 22L;
    Object v14 = 0L;
    Object v15 = 0L;
    Object v16 = 0L;
    Object v17 = -10L;
    Object v18 = 60L;
    Object v19 = -6L;
    Object v20 = 1L;
    Object v21 = 0;
    Object v22 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    Object v24 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v19).longValue()),(((java.lang.Long)v20).longValue()),((org.mockito.verification.VerificationMode)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v24).getDelegate();
    Object v26 = false;
    Object v27 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v17).longValue()),(((java.lang.Long)v18).longValue()),((org.mockito.verification.VerificationMode)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = 1L;
    Object v30 = new org.mockito.internal.util.Timer((((java.lang.Long)v29).longValue()));
    Object v31 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),((org.mockito.verification.VerificationMode)v27),(((java.lang.Boolean)v28).booleanValue()),((org.mockito.internal.util.Timer)v30));
    Object v32 = true;
    Object v33 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v12).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v33));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -10L;
    Object v1 = 0L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0L;
    Object v7 = -57L;
    Object v8 = -10L;
    Object v9 = 0L;
    Object v10 = 0;
    Object v11 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = 1L;
    Object v16 = new org.mockito.internal.util.Timer((((java.lang.Long)v15).longValue()));
    Object v17 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v13),(((java.lang.Boolean)v14).booleanValue()),((org.mockito.internal.util.Timer)v16));
    Object v18 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v5).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = 0;
    Object v3 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = new org.mockito.internal.util.Timer((((java.lang.Long)v5).longValue()));
    ((org.mockito.internal.util.Timer)v6).start();
    Object v7 = null;
    Object v8 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v3),(((java.lang.Boolean)v4).booleanValue()),((org.mockito.internal.util.Timer)v6));
    Object v9 = -45L;
    Object v10 = 0L;
    Object v11 = 0L;
    Object v12 = -3L;
    Object v13 = -6L;
    Object v14 = 1L;
    Object v15 = 0;
    Object v16 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v15).intValue()));
    Object v17 = true;
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()),((org.mockito.verification.VerificationMode)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()),((org.mockito.verification.VerificationMode)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v8).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0L;
    Object v1 = -9L;
    Object v2 = -10L;
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1L;
    Object v1 = 17L;
    Object v2 = 0L;
    Object v3 = -3L;
    Object v4 = -6L;
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 3L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = 0L;
    Object v4 = -10L;
    Object v5 = 60L;
    Object v6 = -6L;
    Object v7 = 1L;
    Object v8 = 0;
    Object v9 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),((org.mockito.verification.VerificationMode)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v11).getDelegate();
    Object v13 = false;
    Object v14 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()),((org.mockito.verification.VerificationMode)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = false;
    Object v16 = 1L;
    Object v17 = new org.mockito.internal.util.Timer((((java.lang.Long)v16).longValue()));
    Object v18 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),((org.mockito.verification.VerificationMode)v14),(((java.lang.Boolean)v15).booleanValue()),((org.mockito.internal.util.Timer)v17));
    Object v19 = true;
    Object v20 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.mockito.verification.VerificationMode)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = 0L;
    Object v22 = -3L;
    Object v23 = -6L;
    Object v24 = 1L;
    Object v25 = 0;
    Object v26 = org.mockito.internal.verification.VerificationModeFactory.atMost((((java.lang.Integer)v25).intValue()));
    Object v27 = true;
    Object v28 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v23).longValue()),(((java.lang.Long)v24).longValue()),((org.mockito.verification.VerificationMode)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = true;
    Object v30 = new org.mockito.internal.verification.VerificationOverTimeImpl((((java.lang.Long)v21).longValue()),(((java.lang.Long)v22).longValue()),((org.mockito.verification.VerificationMode)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v30).getDelegate();
    Object v32 = ((org.mockito.internal.verification.VerificationOverTimeImpl)v20).canRecoverFromFailure(((org.mockito.verification.VerificationMode)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }
}
