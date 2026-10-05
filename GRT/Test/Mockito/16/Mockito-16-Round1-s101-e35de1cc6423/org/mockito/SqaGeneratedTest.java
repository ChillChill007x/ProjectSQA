package org.mockito;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{};
    Object v1 = org.mockito.Mockito.inOrder(((java.lang.Object[])v0));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.doubleThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.mockito.Matchers.anyObject();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.mockito.Matchers.anyVararg();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.mockito.Matchers.notNull();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = true;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.booleanThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.argThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.mockito.Matchers.anyShort();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.mockito.Matchers.anyInt();
    org.junit.Assert.assertEquals((Object)(0), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.same(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.mockito.Mockito.debug();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.shortThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = "";
    Object v4 = new java.io.StringReader(((java.lang.String)v3));
    Object v5 = ((org.hamcrest.Matcher)v2).matches(((java.lang.Object)v4));
    Object v6 = org.mockito.Matchers.shortThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "I, ";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.intThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    ((org.hamcrest.Matcher)v2)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v3 = null;
    Object v4 = org.mockito.Matchers.charThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.mockito.Mockito();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -21.479774120402684D;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = org.mockito.Mockito.times((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 9;
    Object v1 = org.mockito.Mockito.atMost((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.floatThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(0.0F), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = org.mockito.Mockito.times((((java.lang.Integer)v0).intValue()));
    Object v2 = org.mockito.Matchers.same(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.mockito.Mockito();
    Object v1 = 9;
    Object v2 = org.mockito.Mockito.atMost((((java.lang.Integer)v1).intValue()));
    Object v3 = org.mockito.Mockito.verify(((java.lang.Object)v0),((org.mockito.internal.verification.api.VerificationMode)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "null";
    Object v1 = org.mockito.Matchers.contains(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = org.mockito.Mockito.inOrder(((java.lang.Object[])v0));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 11L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "hashCode() is not implemented";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = ";";
    Object v1 = org.mockito.Matchers.matches(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.mockito.Mockito.withSettings();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 9.754609F;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.mockito.Matchers.anyFloat();
    org.junit.Assert.assertEquals((Object)(0.0F), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 30;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.mockito.Matchers.any();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null};
    org.mockito.Mockito.reset(((java.lang.Object[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null,null};
    org.mockito.Mockito.verifyZeroInteractions(((java.lang.Object[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NullInsteadOfMockException");
    } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.mockito.Matchers.anyByte();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.mockito.Matchers.anySet();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.mockito.Mockito.atLeastOnce();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    ((org.hamcrest.Matcher)v2)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v3 = null;
    Object v4 = org.mockito.Matchers.longThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = " times";
    Object v1 = org.mockito.Matchers.endsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.mockito.Matchers.anyMap();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Byte)v0).byteValue()));
    Object v2 = org.mockito.Matchers.eq(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.byteThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = true;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.lang.String[]{"iOngoingStubbing: ","Wanted but not invoked:"};
    Object v3 = org.mockito.Matchers.refEq(((java.lang.Object)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.mockito.Matchers.isNull();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 19;
    Object v1 = org.mockito.Mockito.times((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = false;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = org.mockito.Matchers.endsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.mockito.Mockito.withSettings();
    Object v1 = org.mockito.Mockito.verify(((java.lang.Object)v0));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.longThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = org.mockito.Matchers.charThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.mockito.Matchers.anyLong();
    org.junit.Assert.assertEquals((Object)(0L), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = org.mockito.Mockito.atLeastOnce();
    Object v1 = org.mockito.Mockito.stubVoid(((java.lang.Object)v0));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    org.mockito.Mockito.validateMockitoUsage();
    Object v0 = null;
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 16;
    Object v1 = org.mockito.Mockito.atLeast((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.mockito.Matchers.anyCollection();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = org.mockito.Mockito.debug();
    Object v1 = 19;
    Object v2 = org.mockito.Mockito.times((((java.lang.Integer)v1).intValue()));
    Object v3 = org.mockito.Mockito.verify(((java.lang.Object)v0),((org.mockito.internal.verification.api.VerificationMode)v2));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    ((org.hamcrest.Matcher)v2)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v3 = null;
    Object v4 = org.mockito.Matchers.argThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = -35;
    Object v1 = org.mockito.Mockito.atLeast((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.mockito.Matchers.anyBoolean();
    org.junit.Assert.assertEquals((Object)(false), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 9.124001F;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.mockito.Mockito.never();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -17L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 19;
    Object v1 = org.mockito.Mockito.times((((java.lang.Integer)v0).intValue()));
    Object v2 = org.mockito.Mockito.verify(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "Examples of correct {verifications:";
    Object v1 = org.mockito.Matchers.matches(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{};
    org.mockito.Mockito.verifyNoMoreInteractions(((java.lang.Object[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0;
    Object v1 = org.mockito.Mockito.atLeast((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.mockito.Matchers.anyChar();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    ((org.hamcrest.Matcher)v2)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v3 = null;
    Object v4 = org.mockito.Matchers.floatThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(0.0F), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.mockito.Matchers.anyList();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = org.mockito.Matchers.anyBoolean();
    Object v1 = org.mockito.Mockito.verify(((java.lang.Object)v0));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.NotAMockException");
    } catch (org.mockito.exceptions.misusing.NotAMockException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.mockito.Matchers.anyChar();
    Object v1 = new java.lang.String[]{":",".*?\n"};
    Object v2 = org.mockito.Matchers.refEq(((java.lang.Object)v0),((java.lang.String[])v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.mockito.Matchers.isNotNull();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.mockito.Matchers.anyCollection();
    Object v1 = org.mockito.Matchers.eq(((java.lang.Object)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    ((org.hamcrest.Matcher)v2)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v3 = null;
    Object v4 = org.mockito.Matchers.booleanThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.mockito.Matchers.anyString();
    org.junit.Assert.assertEquals((Object)(""), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = org.mockito.Mockito.times((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = ")";
    Object v1 = org.mockito.Matchers.endsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = org.mockito.Matchers.contains(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = org.mockito.Mockito.atMost((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected org.mockito.exceptions.base.MockitoException");
    } catch (org.mockito.exceptions.base.MockitoException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.mockito.Matchers.anyDouble();
    org.junit.Assert.assertEquals((Object)(0.0D), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.mockito.Mockito.only();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.mockito.Matchers.anyCollection();
    Object v1 = org.mockito.Mockito.stub(((java.lang.Object)v0));
      org.junit.Assert.fail("Expected org.mockito.exceptions.misusing.InvalidUseOfMatchersException");
    } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "  - anonymous classes";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new org.mockito.internal.matchers.LessThan(((java.lang.Comparable)v1));
    Object v3 = new org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls();
    Object v4 = ((org.hamcrest.Matcher)v2).matches(((java.lang.Object)v3));
    Object v5 = org.mockito.Matchers.byteThat(((org.hamcrest.Matcher)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Character)v0).charValue()));
    Object v2 = new java.lang.String[]{";","    verifyZeroInteractions(mockOne, mockTwo);"};
    Object v3 = org.mockito.Matchers.refEq(((java.lang.Object)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\\\\\\\\";
    Object v1 = org.mockito.Matchers.endsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = Short.valueOf((short)48);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "org.mockito.internal.runners.JUnit44RunnerImpl";
    Object v1 = true;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getNestMembers();
    Object v5 = org.mockito.Matchers.anyListOf(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "org.mockito.internal.runners.JUnit44RunnerImpl";
    Object v1 = true;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = org.mockito.Matchers.isA(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }
}
