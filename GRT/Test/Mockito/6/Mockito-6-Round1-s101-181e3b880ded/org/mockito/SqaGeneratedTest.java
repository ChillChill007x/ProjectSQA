package org.mockito;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.floatThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(0.0F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -1.2307701F;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.String[]{};
    Object v3 = org.mockito.Matchers.refEq(((java.lang.Object)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.mockito.Matchers.notNull();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.mockito.Matchers.anyShort();
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.mockito.Matchers.anyChar();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.mockito.Matchers.anyVararg();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.mockito.Matchers.anyByte();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.mockito.Matchers.anyInt();
    org.junit.Assert.assertEquals((Object)(0), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.eq(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "7";
    Object v1 = org.mockito.Matchers.endsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.mockito.Matchers.anyShort();
    Object v1 = org.mockito.Matchers.eq(((java.lang.Object)v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.mockito.Matchers.anyCollection();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.byteThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    ((org.hamcrest.Matcher)v1)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v2 = null;
    Object v3 = org.mockito.Matchers.byteThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.longThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.mockito.Matchers.anyString();
    org.junit.Assert.assertEquals((Object)(""), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.mockito.Matchers.anyDouble();
    org.junit.Assert.assertEquals((Object)(0.0D), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = -27;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.mockito.Matchers.anyBoolean();
    org.junit.Assert.assertEquals((Object)(false), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.mockito.Matchers.anyObject();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1.2811345F;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.mockito.Matchers.any();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "    doThrow(new RuntimeException()).when(mVck).someVoidMethod(anyObject());";
    Object v1 = org.mockito.Matchers.matches(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.mockito.Matchers.isNotNull();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.mockito.Matchers.anyList();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -9L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.mockito.Matchers.isNull();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.mockito.Matchers.anyFloat();
    org.junit.Assert.assertEquals((Object)(0.0F), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.argThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = org.mockito.Matchers.matches(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.mockito.Matchers();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.mockito.Matchers.anyList();
    Object v1 = org.mockito.Matchers.same(((java.lang.Object)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 30L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.booleanThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -27;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.lang.String[]{};
    Object v3 = org.mockito.Matchers.refEq(((java.lang.Object)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    ((org.hamcrest.Matcher)v1)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v2 = null;
    Object v3 = org.mockito.Matchers.shortThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    ((org.hamcrest.Matcher)v1)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v2 = null;
    Object v3 = org.mockito.Matchers.floatThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(0.0F), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.mockito.Matchers.anyLong();
    org.junit.Assert.assertEquals((Object)(0L), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Character)v0).charValue()));
    Object v2 = org.mockito.Matchers.eq(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.intThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.charThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "stubbed with those args here  M";
    Object v1 = org.mockito.Matchers.contains(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.doubleThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = false;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.mockito.Matchers.anySet();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Ouch, it shouldn'ta happen, type '";
    Object v1 = org.mockito.Matchers.matches(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Due to the nature of the syntax above problem might occur because:";
    Object v1 = org.mockito.Matchers.contains(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.mockito.Matchers.anyMap();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "(";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Ouch, it shouldn't happen, type '";
    Object v1 = org.mockito.Matchers.endsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 25.872553F;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = Short.valueOf((short)59);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = org.mockito.Matchers.shortThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = org.mockito.Matchers.anyCollectionOf(((java.lang.Class)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 55.03759F;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "1";
    Object v1 = org.mockito.Matchers.contains(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "'/";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 17;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 17;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    Object v2 = org.mockito.Matchers.same(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "  //incorrect - types don't match:";
    Object v1 = org.mockito.Matchers.contains(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = org.mockito.Matchers.same(((java.lang.Object)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = ",#";
    Object v1 = org.mockito.Matchers.matches(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 17;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    Object v2 = org.mockito.Matchers.eq(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Short)v0).shortValue()));
    Object v2 = org.mockito.Matchers.same(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Actual invocation has different arguments:";
    Object v1 = org.mockito.Matchers.endsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -31L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = false;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new java.lang.String[]{"i.e. the top-most superclass has to implements Serializable.",")","c"};
    Object v3 = org.mockito.Matchers.refEq(((java.lang.Object)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "']";
    Object v1 = org.mockito.Matchers.contains(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 21L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    ((org.hamcrest.Matcher)v1)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v2 = null;
    Object v3 = org.mockito.Matchers.argThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 30L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    Object v2 = org.mockito.Matchers.eq(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.mockito.Matchers.anyChar();
    Object v1 = org.mockito.Matchers.eq(((java.lang.Object)v0));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "'";
    Object v1 = org.mockito.Matchers.matches(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Byte)v0).byteValue()));
    Object v2 = org.mockito.Matchers.same(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "x";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    ((org.hamcrest.Matcher)v1)._dont_implement_Matcher___instead_extend_BaseMatcher_();
    Object v2 = null;
    Object v3 = org.mockito.Matchers.charThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "d";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "\nHowever, there were other interactions";
    Object v1 = org.mockito.Matchers.endsWith(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "x";
    Object v1 = org.mockito.Matchers.startsWith(((java.lang.String)v0));
    Object v2 = new java.lang.String[]{", "};
    Object v3 = org.mockito.Matchers.refEq(((java.lang.Object)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = -53;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = org.mockito.Matchers.contains(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = Short.valueOf((short)0);
    Object v3 = org.mockito.Matchers.eq((((java.lang.Short)v2).shortValue()));
    Object v4 = ((org.hamcrest.Matcher)v1).matches(((java.lang.Object)v3));
    Object v5 = org.mockito.Matchers.doubleThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "'.";
    Object v1 = org.mockito.Matchers.matches(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = org.mockito.Matchers.eq((((java.lang.Short)v0).shortValue()));
    Object v2 = org.mockito.Matchers.same(((java.lang.Object)v1));
    Object v3 = org.mockito.Matchers.same(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 42;
    Object v1 = org.mockito.Matchers.eq((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "MockitoProxyMarker";
    Object v1 = new org.mockito.internal.matchers.Matches(((java.lang.String)v0));
    Object v2 = 55.03759F;
    Object v3 = org.mockito.Matchers.eq((((java.lang.Float)v2).floatValue()));
    Object v4 = ((org.hamcrest.Matcher)v1).matches(((java.lang.Object)v3));
    Object v5 = org.mockito.Matchers.argThat(((org.hamcrest.Matcher)v1));
    org.junit.Assert.assertNull(v5);
  }
}
