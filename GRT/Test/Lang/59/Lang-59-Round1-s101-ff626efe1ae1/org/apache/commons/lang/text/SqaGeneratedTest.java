package org.apache.commons.lang.text;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = ((org.apache.commons.lang.text.StrMatcher)v1).isMatch(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -14;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v0).lastIndexOf(((org.apache.commons.lang.text.StrMatcher)v1),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v2 = 44;
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).lastIndexOf(((org.apache.commons.lang.text.StrMatcher)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).indexOf(((org.apache.commons.lang.text.StrMatcher)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = 1;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).indexOf((((java.lang.Character)v4).charValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)1);
    Object v5 = 1;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).lastIndexOf((((java.lang.Character)v4).charValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = 7;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v3).appendFixedWidthPadRight(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = 27;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).ensureCapacity((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "174";
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).endsWith(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = -15;
    ((org.apache.commons.lang.text.StrBuilder)v3).validateIndex((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = -1;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).insert((((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).clear();
    Object v5 = "";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).endsWith(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).contains((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = 7;
    Object v6 = -30;
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).leftString((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = 5;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).rightString((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = 7;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v3).appendFixedWidthPadRight(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new java.util.ArrayList();
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new org.apache.commons.lang.text.StrBuilder();
    Object v7 = Character.valueOf((char)1);
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).replaceAll((((java.lang.Character)v7).charValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = "Acirc";
    Object v11 = "Rmnge[";
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).replaceAll(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = 0;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v12).leftString((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.lang.StringBuffer(((java.lang.CharSequence)v14));
    Object v16 = -54;
    Object v17 = 0;
    Object v18 = ((org.apache.commons.lang.text.StrBuilder)v5).append(((java.lang.StringBuffer)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = -4L;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = -22;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v6).ensureCapacity((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = -4L;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = -22;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v6).ensureCapacity((((java.lang.Integer)v10).intValue()));
    Object v12 = "gtNested";
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).deleteAll(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).trim();
    Object v12 = 0;
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).setLength((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v6).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v2 = "200";
    Object v3 = 33;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v0).replace(((org.apache.commons.lang.text.StrMatcher)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "";
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((java.lang.String)v4));
    Object v6 = -1;
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = -4L;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = -22;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v6).ensureCapacity((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v15 = -1;
    ((org.apache.commons.lang.text.StrBuilder)v11).getChars((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((char[])v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "c";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).setNullText(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = -50;
    Object v8 = 1;
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadRight((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = -50;
    Object v8 = 1;
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadRight((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).appendNull();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "c";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).setNullText(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).deleteFirst(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = 0L;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).append((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.lang.text.StrBuilder();
    Object v10 = Character.valueOf((char)1);
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).replaceAll((((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()));
    Object v13 = "Acirc";
    Object v14 = "Rmnge[";
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v12).replaceAll(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = 0;
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v15).leftString((((java.lang.Integer)v16).intValue()));
    Object v18 = new java.lang.StringBuffer(((java.lang.CharSequence)v17));
    Object v19 = 23;
    Object v20 = 0;
    Object v21 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((java.lang.StringBuffer)v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).contains((((java.lang.Character)v5).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = "@";
    Object v8 = "82X7";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).replaceFirst(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v4).trim();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    Object v8 = 1;
    Object v9 = "Could not iterate base& on ";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = "e";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteFirst(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).deleteAll(((org.apache.commons.lang.text.StrMatcher)v5));
    Object v7 = "!";
    Object v8 = 1;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v4).lastIndexOf(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).minimizeCapacity();
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).contains((((java.lang.Character)v12).charValue()));
    Object v14 = -1;
    Object v15 = Character.valueOf((char)1);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadLeft(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "c";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).setNullText(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).deleteFirst(((java.lang.String)v9));
    Object v11 = -11;
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v13 = 0;
    Object v14 = 5;
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v10).insert((((java.lang.Integer)v11).intValue()),((char[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "beta";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).appendWithSeparators(((java.util.Collection)v7),((java.lang.String)v8));
    Object v10 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v6).getChars(((char[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = -4L;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = -22;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v6).ensureCapacity((((java.lang.Integer)v10).intValue()));
    Object v12 = "D";
    Object v13 = 0;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v11).lastIndexOf(((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).deleteFirst(((org.apache.commons.lang.text.StrMatcher)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = 1;
    Object v8 = true;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).append((((java.lang.Character)v7).charValue()));
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).reverse();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).deleteFirst(((org.apache.commons.lang.text.StrMatcher)v5));
    Object v7 = 0;
    Object v8 = new java.util.ArrayList();
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).minimizeCapacity();
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).contains((((java.lang.Character)v12).charValue()));
    Object v14 = -1;
    Object v15 = Character.valueOf((char)1);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadLeft(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    Object v17 = new java.lang.Object[]{};
    Object v18 = "";
    Object v19 = ((org.apache.commons.lang.text.StrBuilder)v16).appendWithSeparators(((java.lang.Object[])v17),((java.lang.String)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).minimizeCapacity();
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).contains((((java.lang.Character)v12).charValue()));
    Object v14 = -1;
    Object v15 = Character.valueOf((char)1);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadLeft(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    Object v17 = false;
    Object v18 = ((org.apache.commons.lang.text.StrBuilder)v16).append((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 1;
    Object v20 = Character.valueOf((char)0);
    Object v21 = ((org.apache.commons.lang.text.StrBuilder)v16).appendPadding((((java.lang.Integer)v19).intValue()),(((java.lang.Character)v20).charValue()));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst(((org.apache.commons.lang.text.StrMatcher)v4));
    Object v6 = -1;
    Object v7 = new char[]{Character.valueOf((char)1),Character.valueOf((char)3)};
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v3).insert((((java.lang.Integer)v6).intValue()),((char[])v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).indexOf(((org.apache.commons.lang.text.StrMatcher)v4));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendNewLine();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceFirst((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceFirst((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = "Acirc";
    Object v12 = "Rmnge[";
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).replaceAll(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v13).leftString((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.lang.StringBuffer(((java.lang.CharSequence)v15));
    Object v17 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v18 = ((java.lang.StringBuffer)v16).append(((char[])v17));
    Object v19 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((java.lang.StringBuffer)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "c";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).setNullText(((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v8).substring((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v8).delete((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "The ";
    Object v5 = "";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceFirst(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).minimizeCapacity();
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).contains((((java.lang.Character)v12).charValue()));
    Object v14 = -1;
    Object v15 = Character.valueOf((char)1);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadLeft(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    Object v17 = new org.apache.commons.lang.text.StrBuilder();
    Object v18 = Character.valueOf((char)1);
    Object v19 = Character.valueOf((char)0);
    Object v20 = ((org.apache.commons.lang.text.StrBuilder)v17).replaceAll((((java.lang.Character)v18).charValue()),(((java.lang.Character)v19).charValue()));
    Object v21 = "Acirc";
    Object v22 = "Rmnge[";
    Object v23 = ((org.apache.commons.lang.text.StrBuilder)v20).replaceAll(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = 0;
    Object v25 = ((org.apache.commons.lang.text.StrBuilder)v23).leftString((((java.lang.Integer)v24).intValue()));
    Object v26 = new java.lang.StringBuffer(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang.text.StrBuilder)v16).append(((java.lang.StringBuffer)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).deleteFirst(((org.apache.commons.lang.text.StrMatcher)v5));
    Object v7 = Character.valueOf((char)0);
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteFirst((((java.lang.Character)v7).charValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "c";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).setNullText(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).deleteFirst(((java.lang.String)v9));
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).validateRange((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = "Gama";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).setNullText(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = new char[]{};
    Object v8 = 54;
    Object v9 = -1;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((char[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = new org.apache.commons.lang.text.StrBuilder();
    Object v6 = Character.valueOf((char)1);
    Object v7 = Character.valueOf((char)0);
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v5).replaceAll((((java.lang.Character)v6).charValue()),(((java.lang.Character)v7).charValue()));
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v8).trim();
    Object v10 = 0;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v8).setLength((((java.lang.Integer)v10).intValue()));
    Object v12 = -50;
    Object v13 = 1;
    Object v14 = Character.valueOf((char)1);
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v11).appendFixedWidthPadRight((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Character)v14).charValue()));
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v4).equals(((org.apache.commons.lang.text.StrBuilder)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = "path.svparator";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).append(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = -50;
    Object v8 = 1;
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadRight((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = 1;
    Object v12 = -4;
    Object v13 = new char[]{};
    Object v14 = -3;
    ((org.apache.commons.lang.text.StrBuilder)v10).getChars((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),((char[])v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).deleteFirst(((org.apache.commons.lang.text.StrMatcher)v5));
    Object v7 = 0;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).setCharAt((((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = "Gama";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).setNullText(((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).contains(((org.apache.commons.lang.text.StrMatcher)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = -50;
    Object v8 = 1;
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadRight((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = "897";
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).setNullText(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(45), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "The ";
    Object v5 = "";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceFirst(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = new char[]{Character.valueOf((char)1),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),((char[])v8));
    Object v10 = -50;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v6).substring((((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = -50;
    Object v8 = 1;
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadRight((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).appendNull();
    Object v12 = true;
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).append((((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = "The number must ot be null";
    Object v8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(((java.lang.String)v7));
    Object v9 = "\\X";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).appendWithSeparators(((java.util.Iterator)v8),((java.lang.String)v9));
    Object v11 = "The numbers must not be null";
    Object v12 = 2;
    Object v13 = 1;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).trim();
    Object v12 = 0;
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).setLength((((java.lang.Integer)v12).intValue()));
    Object v14 = -42;
    Object v15 = Character.valueOf((char)1);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadRight(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = "The number must ot be null";
    Object v6 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(((java.lang.String)v5));
    Object v7 = "pterp";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v4).appendWithSeparators(((java.util.Iterator)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = "t";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).setNullText(((java.lang.String)v6));
    Object v8 = Character.valueOf((char)65535);
    Object v9 = 0;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v5).lastIndexOf((((java.lang.Character)v8).charValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceFirst((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = -34;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteCharAt((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceFirst((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = 0;
    Object v8 = "UTF-16BE";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = -50;
    Object v8 = 1;
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadRight((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).appendNull();
    Object v12 = "]";
    Object v13 = "";
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v11).replaceAll(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = 0;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).setCharAt((((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v4).trim();
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).asTokenizer();
    Object v7 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v8 = "Range";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).replaceAll(((org.apache.commons.lang.text.StrMatcher)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).minimizeCapacity();
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((org.apache.commons.lang.text.StrBuilder)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 28;
    Object v1 = new org.apache.commons.lang.text.StrBuilder((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = "Gama";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).setNullText(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v9 = -28;
    Object v10 = 1;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),((char[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = "Ilnvalid startIndex: ";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).setNullText(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 28;
    Object v1 = new org.apache.commons.lang.text.StrBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "u";
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).deleteAll(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).minimizeCapacity();
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).contains((((java.lang.Character)v12).charValue()));
    Object v14 = -1;
    Object v15 = Character.valueOf((char)1);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v6).appendFixedWidthPadLeft(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    Object v17 = new org.apache.commons.lang.text.StrBuilder();
    Object v18 = Character.valueOf((char)1);
    Object v19 = Character.valueOf((char)0);
    Object v20 = ((org.apache.commons.lang.text.StrBuilder)v17).replaceAll((((java.lang.Character)v18).charValue()),(((java.lang.Character)v19).charValue()));
    Object v21 = ((org.apache.commons.lang.text.StrBuilder)v20).minimizeCapacity();
    Object v22 = "Ilnvalid startIndex: ";
    Object v23 = ((org.apache.commons.lang.text.StrBuilder)v21).setNullText(((java.lang.String)v22));
    Object v24 = -29;
    Object v25 = Character.valueOf((char)1);
    Object v26 = ((org.apache.commons.lang.text.StrBuilder)v16).appendFixedWidthPadRight(((java.lang.Object)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Character)v25).charValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 28;
    Object v1 = new org.apache.commons.lang.text.StrBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "u";
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).deleteAll(((java.lang.String)v2));
    Object v4 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = ((org.apache.commons.lang.text.StrMatcher)v4).isMatch(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -1;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v3).indexOf(((org.apache.commons.lang.text.StrMatcher)v4),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 28;
    Object v1 = new org.apache.commons.lang.text.StrBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "u";
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).deleteAll(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteAll((((java.lang.Character)v7).charValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 28;
    Object v1 = new org.apache.commons.lang.text.StrBuilder((((java.lang.Integer)v0).intValue()));
    Object v2 = "u";
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).deleteAll(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new char[]{};
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).insert((((java.lang.Integer)v4).intValue()),((char[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.lang.text.StrBuilder();
    Object v8 = Character.valueOf((char)1);
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).minimizeCapacity();
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((org.apache.commons.lang.text.StrBuilder)v11));
    Object v13 = Character.valueOf((char)2);
    Object v14 = Character.valueOf((char)0);
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v12).replaceFirst((((java.lang.Character)v13).charValue()),(((java.lang.Character)v14).charValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = "Ilnvalid startIndex: ";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).setNullText(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).toCharArray();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll((((java.lang.Character)v4).charValue()),(((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteAll((((java.lang.Character)v7).charValue()));
    Object v9 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).contains(((org.apache.commons.lang.text.StrMatcher)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setLength((((java.lang.Integer)v5).intValue()));
    Object v7 = new java.util.ArrayList();
    Object v8 = "959";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).appendWithSeparators(((java.util.Collection)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v7 = 0;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v5).lastIndexOf(((org.apache.commons.lang.text.StrMatcher)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "c";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).setNullText(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).deleteFirst(((java.lang.String)v9));
    Object v11 = "183";
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).startsWith(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "c";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).setNullText(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).deleteFirst(((java.lang.String)v9));
    Object v11 = " ";
    Object v12 = "}";
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).replaceFirst(((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).minimizeCapacity();
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Acirc";
    Object v5 = "Rmnge[";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = -4L;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = -22;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v6).ensureCapacity((((java.lang.Integer)v10).intValue()));
    Object v12 = -20;
    Object v13 = "The Array muht not be null";
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v11).insert((((java.lang.Integer)v12).intValue()),((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }
}
