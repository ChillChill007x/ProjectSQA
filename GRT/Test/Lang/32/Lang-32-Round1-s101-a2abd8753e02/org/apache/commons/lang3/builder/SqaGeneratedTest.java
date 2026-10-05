package org.apache.commons.lang3.builder;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry();
    org.junit.Assert.assertNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new double[]{};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = false;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    org.apache.commons.lang3.builder.HashCodeBuilder.register(((java.lang.Object)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new float[]{0.0F,1.0F};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((float[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Double)v1).doubleValue()));
    Object v3 = new int[]{15,1,38};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((int[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = -41;
    Object v1 = -23;
    Object v2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v3 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(-22523), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new double[]{0.0D};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Double)v1).doubleValue()));
    Object v3 = new int[]{15,1,38};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((int[])v3));
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = new java.lang.Object[]{null};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((java.lang.Object[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new long[]{1L,1L};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((long[])v3));
    Object v5 = 1.0F;
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Float)v5).floatValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = true;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Byte)v1).byteValue()));
    Object v3 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v3).append(((char[])v4));
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new long[]{1L,1L};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((long[])v3));
    Object v5 = 1.0F;
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Float)v5).floatValue()));
    Object v7 = new long[]{-30L};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((long[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = false;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Boolean)v1).booleanValue()));
    org.apache.commons.lang3.builder.HashCodeBuilder.register(((java.lang.Object)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    org.apache.commons.lang3.builder.HashCodeBuilder.unregister(((java.lang.Object)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Double)v1).doubleValue()));
    Object v3 = new int[]{15,1,38};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((int[])v3));
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = new java.lang.Object[]{null};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((java.lang.Object[])v7));
    Object v9 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v10 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v11 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v9).append(((short[])v10));
    Object v12 = new java.lang.Object[]{};
    Object v13 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v11).append(((java.lang.Object[])v12));
    Object v14 = Byte.valueOf((byte)1);
    Object v15 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v11).append((((java.lang.Byte)v14).byteValue()));
    Object v16 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((java.lang.Object)v15));
    Object v17 = new boolean[]{};
    Object v18 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((boolean[])v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)45),Byte.valueOf((byte)0)};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Byte)v1).byteValue()));
    Object v3 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v3).append(((char[])v4));
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((java.lang.Object)v5));
    Object v7 = new char[]{Character.valueOf((char)0)};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((char[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = new short[]{};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((short[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)45),Byte.valueOf((byte)0)};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((byte[])v7));
    Object v9 = new long[]{1L,-24L};
    Object v10 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((long[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = 15;
    Object v2 = new org.apache.commons.lang3.builder.HashCodeBuilder((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = java.util.function.Function.identity();
    Object v2 = java.util.Comparator.comparing(((java.util.function.Function)v1));
    Object v3 = new java.util.TreeSet(((java.util.Comparator)v2));
    Object v4 = new java.util.TreeSet(((java.util.SortedSet)v3));
    ((java.util.Collection)v4).clear();
    Object v5 = null;
    Object v6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(((java.lang.Object)v0),((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(24659), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new int[]{-17};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((int[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = false;
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new long[]{1L,1L};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((long[])v3));
    Object v5 = 1.0F;
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Float)v5).floatValue()));
    Object v7 = new long[]{0L,0L,0L};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((long[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Double)v1).doubleValue()));
    Object v3 = new int[]{15,1,38};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((int[])v3));
    Object v5 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v6 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v7 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v5).append(((short[])v6));
    Object v8 = new long[]{1L,1L};
    Object v9 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v7).append(((long[])v8));
    Object v10 = 1.0F;
    Object v11 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v7).append((((java.lang.Float)v10).floatValue()));
    Object v12 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = false;
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new char[]{Character.valueOf((char)0)};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((char[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = Byte.valueOf((byte)-66);
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Byte)v1).byteValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = true;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Boolean)v1).booleanValue()));
    org.apache.commons.lang3.builder.HashCodeBuilder.unregister(((java.lang.Object)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    org.apache.commons.lang3.builder.HashCodeBuilder.register(((java.lang.Object)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = 6.7367854F;
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Float)v5).floatValue()));
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((int[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = true;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(629), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true,false,true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new short[]{Short.valueOf((short)0),Short.valueOf((short)18),Short.valueOf((short)1)};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((short[])v3));
    Object v5 = new float[]{-4.695194F,1.0F};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((float[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = new int[]{1,-11};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((int[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = 6.7367854F;
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Float)v5).floatValue()));
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((int[])v7));
    Object v9 = new boolean[]{false,false};
    Object v10 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((boolean[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = 0;
    Object v2 = new org.apache.commons.lang3.builder.HashCodeBuilder((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)45),Byte.valueOf((byte)0)};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((byte[])v7));
    Object v9 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v10 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v11 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v9).append(((short[])v10));
    Object v12 = new java.lang.Object[]{};
    Object v13 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v11).append(((java.lang.Object[])v12));
    Object v14 = Byte.valueOf((byte)1);
    Object v15 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v11).append((((java.lang.Byte)v14).byteValue()));
    Object v16 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new double[]{0.0D};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((double[])v1));
    Object v3 = org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = new int[]{1};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((int[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).toHashCode();
    org.junit.Assert.assertEquals((Object)(861101), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)3)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v3 = true;
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true,false,true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    Object v5 = Short.valueOf((short)-52);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Short)v5).shortValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Double)v1).doubleValue()));
    Object v3 = new int[]{15,1,38};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((int[])v3));
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = new java.lang.Object[]{null};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((java.lang.Object[])v7));
    Object v9 = new int[]{-22};
    Object v10 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((int[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v8 = Byte.valueOf((byte)0);
    Object v9 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v7).append((((java.lang.Byte)v8).byteValue()));
    Object v10 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v11 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v12 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v10).append(((char[])v11));
    Object v13 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v7).append(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new float[]{0.0F,1.0F};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((float[])v3));
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Character)v5).charValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = 8.712357F;
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append((((java.lang.Float)v7).floatValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new boolean[]{true,true,false};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((boolean[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -13;
    Object v1 = 1;
    Object v2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v3 = new double[]{0.0D};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((double[])v3));
    Object v5 = true;
    Object v6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)(653), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = 6.7367854F;
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Float)v5).floatValue()));
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((int[])v7));
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append((((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeSet(((java.util.Comparator)v1));
    org.apache.commons.lang3.builder.HashCodeBuilder.unregister(((java.lang.Object)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new boolean[]{false,true};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((boolean[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((java.lang.Object[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).toHashCode();
    org.apache.commons.lang3.builder.HashCodeBuilder.unregister(((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = -12;
    Object v1 = 1;
    Object v2 = new org.apache.commons.lang3.builder.HashCodeBuilder((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new long[]{1L};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((long[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new double[]{0.0D,8.398827885347991D};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((double[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new short[]{Short.valueOf((short)5),Short.valueOf((short)-24)};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((short[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry();
    Object v1 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(((java.lang.Object)v0));
    org.junit.Assert.assertEquals((Object)(17), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((java.lang.Object[])v1));
    Object v3 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v4 = new boolean[]{true,true,false};
    Object v5 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v3).append(((boolean[])v4));
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object)v5));
    Object v7 = -16.93538106642285D;
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = false;
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = 8.712357F;
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append((((java.lang.Float)v7).floatValue()));
    Object v9 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v10 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v11 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v9).append(((short[])v10));
    Object v12 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = 24;
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).appendSuper((((java.lang.Integer)v3).intValue()));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((char[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new double[]{};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((double[])v1));
    Object v3 = org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = false;
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new boolean[]{false,true,true};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((boolean[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((java.lang.Object[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-42)};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((byte[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new char[]{Character.valueOf((char)0)};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((char[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((java.lang.Object[])v1));
    org.apache.commons.lang3.builder.HashCodeBuilder.register(((java.lang.Object)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    Object v5 = new float[]{0.0F,14.253897F};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((float[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    Object v5 = new double[]{0.0D,1.0D};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((double[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = 8.712357F;
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append((((java.lang.Float)v7).floatValue()));
    Object v9 = new float[]{};
    Object v10 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((float[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = 6.7367854F;
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append((((java.lang.Float)v5).floatValue()));
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((int[])v7));
    Object v9 = new boolean[]{false,false};
    Object v10 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((boolean[])v9));
    Object v11 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v12 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v10).append(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((char[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = new short[]{};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((short[])v5));
    Object v7 = 1;
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).appendSuper((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new int[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((int[])v3));
    Object v5 = new int[]{1,0,2};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((int[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new short[]{Short.valueOf((short)5),Short.valueOf((short)-24)};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((short[])v3));
    Object v5 = new java.lang.String[]{""," "};
    Object v6 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(((java.lang.Object)v4),((java.lang.String[])v5));
    org.junit.Assert.assertEquals((Object)(1180089113), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((java.lang.Object[])v1));
    Object v3 = new short[]{Short.valueOf((short)-43)};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((short[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((java.lang.Object[])v1));
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new boolean[]{false,true};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((boolean[])v1));
    Object v3 = org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = 24;
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).appendSuper((((java.lang.Integer)v3).intValue()));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((char[])v5));
    Object v7 = 0.0F;
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append((((java.lang.Float)v7).floatValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((java.lang.Object[])v3));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Byte)v5).byteValue()));
    Object v7 = 8.712357F;
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append((((java.lang.Float)v7).floatValue()));
    Object v9 = new int[]{0};
    Object v10 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v8).append(((int[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    Object v5 = new double[]{0.0D,1.0D};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((double[])v5));
    Object v7 = new short[]{};
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((short[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)-6),Short.valueOf((short)0)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true,false,true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    org.apache.commons.lang3.builder.HashCodeBuilder.unregister(((java.lang.Object)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = Byte.valueOf((byte)-53);
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Byte)v1).byteValue()));
    Object v3 = new long[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((long[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = Byte.valueOf((byte)-53);
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append((((java.lang.Byte)v1).byteValue()));
    Object v3 = new long[]{};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((long[])v3));
    Object v5 = new int[]{0};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((int[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-47)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new boolean[]{true};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((boolean[])v3));
    Object v5 = new float[]{0.0F,14.253897F};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((float[])v5));
    Object v7 = org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v1 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-13),Short.valueOf((short)1)};
    Object v2 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v0).append(((short[])v1));
    Object v3 = new double[]{0.0D,8.398827885347991D};
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((double[])v3));
    Object v5 = new float[]{-29.324074F,-21.95685F};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v4).append(((float[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new org.apache.commons.lang3.builder.HashCodeBuilder();
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append((((java.lang.Double)v3).doubleValue()));
    Object v5 = new int[]{15,1,38};
    Object v6 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v2).append(((int[])v5));
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append((((java.lang.Character)v7).charValue()));
    Object v9 = new java.lang.Object[]{null};
    Object v10 = ((org.apache.commons.lang3.builder.HashCodeBuilder)v6).append(((java.lang.Object[])v9));
    Object v11 = org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
