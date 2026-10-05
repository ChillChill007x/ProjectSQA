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
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v8 = 0;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).indexOf(((org.apache.commons.lang.text.StrMatcher)v7),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v9);
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
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = Character.valueOf((char)0);
    Object v8 = 1;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).indexOf((((java.lang.Character)v7).charValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = Character.valueOf((char)1);
    Object v8 = 1;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).lastIndexOf((((java.lang.Character)v7).charValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    org.junit.Assert.assertNotNull(v9);
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
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = -1;
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Double)v8).doubleValue()));
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
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = "[";
    Object v8 = 7;
    Object v9 = -30;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = "Acirc";
    Object v7 = "Rmnge[";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v5).replaceAll(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).leftString((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v7);
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
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
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
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).deleteFirst((((java.lang.Character)v11).charValue()));
    Object v13 = 0;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v12).leftString((((java.lang.Integer)v13).intValue()));
    Object v15 = new java.lang.StringBuffer(((java.lang.CharSequence)v14));
    Object v16 = -54;
    Object v17 = 0;
    Object v18 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((java.lang.StringBuffer)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = 1;
    Object v11 = new char[]{Character.valueOf((char)117),Character.valueOf((char)1)};
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).insert((((java.lang.Integer)v10).intValue()),((char[])v11));
    Object v13 = -19;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v9).ensureCapacity((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = 32;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).midString((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v11 = -30;
    Object v12 = 0;
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((char[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = 16;
    Object v5 = new char[]{Character.valueOf((char)0)};
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).insert((((java.lang.Integer)v4).intValue()),((char[])v5));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = -56;
    Object v7 = 1;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadLeft((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = 3;
    Object v11 = new char[]{Character.valueOf((char)48),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v5).insert((((java.lang.Integer)v10).intValue()),((char[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = Character.valueOf((char)0);
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).contains((((java.lang.Character)v7).charValue()));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = 1;
    Object v11 = new char[]{Character.valueOf((char)117),Character.valueOf((char)1)};
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).insert((((java.lang.Integer)v10).intValue()),((char[])v11));
    Object v13 = -19;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v9).ensureCapacity((((java.lang.Integer)v13).intValue()));
    Object v15 = 4;
    Object v16 = -22;
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v14).delete((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteAll(((org.apache.commons.lang.text.StrMatcher)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    Object v6 = 3;
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).charAt((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).leftString((((java.lang.Integer)v4).intValue()));
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v3).append((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    Object v6 = "188";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteFirst(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = "[";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v5).replace((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "Omega";
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).endsWith(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).reverse();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v9).length();
    org.junit.Assert.assertEquals((Object)(7), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    Object v6 = "188";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteFirst(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = "[";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v5).replace((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).contains(((org.apache.commons.lang.text.StrMatcher)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).appendNewLine();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    Object v6 = "188";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteFirst(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = "[";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v5).replace((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = "}";
    Object v13 = "1";
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v11).replaceFirst(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
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
  public void test40() throws Throwable {
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
    Object v10 = "s";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v9).endsWith(((java.lang.String)v10));
    Object v12 = 2;
    Object v13 = 25;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v5).append(((org.apache.commons.lang.text.StrBuilder)v9),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = 1;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).lastIndexOf((((java.lang.Character)v4).charValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = new org.apache.commons.lang.text.StrBuilder();
    Object v11 = Character.valueOf((char)1);
    Object v12 = Character.valueOf((char)0);
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).replaceAll((((java.lang.Character)v11).charValue()),(((java.lang.Character)v12).charValue()));
    Object v14 = Character.valueOf((char)0);
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v13).deleteFirst((((java.lang.Character)v14).charValue()));
    Object v16 = 0;
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v15).leftString((((java.lang.Integer)v16).intValue()));
    Object v18 = new java.lang.StringBuffer(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang.text.StrBuilder)v9).append(((java.lang.StringBuffer)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v7).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).replaceAll((((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).replaceAll((((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()));
    Object v13 = "Array cannot be empty.";
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v12).deleteFirst(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.lang.text.StrBuilder();
    Object v5 = Character.valueOf((char)1);
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v4).replaceAll((((java.lang.Character)v5).charValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = 1;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).lastIndexOf((((java.lang.Character)v8).charValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -1;
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v3).appendFixedWidthPadRight(((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Character)v12).charValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = -18;
    Object v5 = 27;
    Object v6 = "java.ext.dirs";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v3).replace((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v8 = 0;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).lastIndexOf(((org.apache.commons.lang.text.StrMatcher)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = -14;
    ((org.apache.commons.lang.text.StrBuilder)v6).validateIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
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
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).reverse();
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = new char[]{Character.valueOf((char)10)};
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).getChars(((char[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = 0;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).leftString((((java.lang.Integer)v4).intValue()));
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v3).append((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.lang.text.StrBuilder();
    Object v9 = Character.valueOf((char)1);
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v8).replaceAll((((java.lang.Character)v9).charValue()),(((java.lang.Character)v10).charValue()));
    Object v12 = new java.util.ArrayList();
    Object v13 = "189";
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v11).appendWithSeparators(((java.util.Collection)v12),((java.lang.String)v13));
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v14).reverse();
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v7).equalsIgnoreCase(((org.apache.commons.lang.text.StrBuilder)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
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
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).deleteFirst((((java.lang.Character)v11).charValue()));
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v12).appendNewLine();
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((org.apache.commons.lang.text.StrBuilder)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = "";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v9).startsWith(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = 1;
    Object v11 = new char[]{Character.valueOf((char)117),Character.valueOf((char)1)};
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).insert((((java.lang.Integer)v10).intValue()),((char[])v11));
    Object v13 = -19;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v9).ensureCapacity((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v14).toCharArray();
    Object v16 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v14).contains(((org.apache.commons.lang.text.StrMatcher)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).reverse();
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v7).toCharArray();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).toCharArray();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = "";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).startsWith(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    Object v8 = 0;
    Object v9 = 27;
    Object v10 = new char[]{};
    Object v11 = 10;
    ((org.apache.commons.lang.text.StrBuilder)v7).getChars((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((char[])v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    Object v8 = 0;
    Object v9 = new java.util.ArrayList();
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).insert((((java.lang.Integer)v8).intValue()),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).toCharArray((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    Object v8 = "getBame";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).deleteAll(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "getTargetException";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).replaceAll((((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()));
    Object v13 = 0;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v12).rightString((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = -46;
    Object v17 = -25;
    Object v18 = ((org.apache.commons.lang.text.StrBuilder)v12).append(((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = "Omicron";
    Object v8 = "line.separator";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).replaceAll(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "The number m`st not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = 1;
    Object v11 = new char[]{Character.valueOf((char)117),Character.valueOf((char)1)};
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).insert((((java.lang.Integer)v10).intValue()),((char[])v11));
    Object v13 = -19;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v9).ensureCapacity((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v14).toCharArray();
    Object v16 = -44;
    ((org.apache.commons.lang.text.StrBuilder)v14).validateIndex((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).append((((java.lang.Integer)v7).intValue()));
    Object v9 = "[X";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteAll(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    Object v6 = "188";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteFirst(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = "[";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v5).replace((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = "9<01";
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).setNullText(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = "Omicron";
    Object v8 = "line.separator";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).replaceAll(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.apache.commons.lang.text.StrBuilder();
    Object v11 = Character.valueOf((char)1);
    Object v12 = Character.valueOf((char)0);
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).replaceAll((((java.lang.Character)v11).charValue()),(((java.lang.Character)v12).charValue()));
    Object v14 = Character.valueOf((char)0);
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v13).deleteFirst((((java.lang.Character)v14).charValue()));
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v9).equalsIgnoreCase(((org.apache.commons.lang.text.StrBuilder)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = "";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteFirst(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).reverse();
    Object v8 = "";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).contains(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    Object v8 = 6;
    Object v9 = -38;
    Object v10 = new char[]{};
    Object v11 = 3;
    ((org.apache.commons.lang.text.StrBuilder)v7).getChars((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((char[])v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "The number m`st not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = -15;
    Object v3 = 0;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).validateRange((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
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
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).deleteFirst((((java.lang.Character)v11).charValue()));
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v12).appendNewLine();
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((org.apache.commons.lang.text.StrBuilder)v13));
    Object v15 = 2147483647;
    Object v16 = 0;
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v14).midString((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    Object v8 = 1;
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendPadding((((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = "";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteFirst(((java.lang.String)v7));
    Object v9 = "Omicron";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).append(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = "Acirc";
    Object v7 = "Rmnge[";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v5).replaceAll(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = Character.valueOf((char)0);
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v8).replaceFirst((((java.lang.Character)v9).charValue()),(((java.lang.Character)v10).charValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    Object v6 = "188";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteFirst(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = "[";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v5).replace((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = "9<01";
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v11).setNullText(((java.lang.String)v12));
    Object v14 = -31;
    Object v15 = -56;
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v13).midString((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).minimizeCapacity();
    Object v8 = 20;
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new java.util.ArrayList();
    Object v7 = 7;
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).replaceAll((((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()));
    Object v13 = 0;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v12).setLength((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "[";
    Object v5 = "914";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceAll(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v6).appendNull();
    Object v8 = "";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).startsWith(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "The number must n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "The number must n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1310086143), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "The number must n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "The validated collection is empty";
    Object v3 = 8;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).lastIndexOf(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "";
    Object v5 = 4;
    Object v6 = -18;
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "The number must n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.ArrayList();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).append(((java.lang.Object)v2));
    Object v4 = new char[]{};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).getChars(((char[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    Object v6 = new char[]{};
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).append(((char[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "The number must n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "The number must n";
    Object v3 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).equals(((org.apache.commons.lang.text.StrBuilder)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = "";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteFirst(((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang.text.StrBuilder();
    Object v10 = Character.valueOf((char)1);
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).replaceAll((((java.lang.Character)v10).charValue()),(((java.lang.Character)v11).charValue()));
    Object v13 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v12).deleteAll(((org.apache.commons.lang.text.StrMatcher)v13));
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v8).append(((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "The number m`st not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 10;
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).rightString((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)("ot be null"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "The number must n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).minimizeCapacity();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).reverse();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
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
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).deleteFirst((((java.lang.Character)v11).charValue()));
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v12).appendNewLine();
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v6).append(((org.apache.commons.lang.text.StrBuilder)v13));
    Object v15 = -11;
    Object v16 = 0;
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v14).substring((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "The number must n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).minimizeCapacity();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).reverse();
    Object v4 = -11;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).validateRange((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.util.ArrayList();
    Object v5 = "189";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.util.Collection)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).contains(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).setNullText(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).appendNewLine();
    Object v7 = "";
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).deleteFirst(((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v8).insert((((java.lang.Integer)v9).intValue()),(((java.lang.Character)v10).charValue()));
    Object v12 = 0;
    Object v13 = -20;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v8).toCharArray((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "The number must n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).minimizeCapacity();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).reverse();
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)0);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).replaceAll((((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append(((char[])v4));
    Object v6 = "188";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteFirst(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = "[";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v5).replace((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
    Object v12 = "}";
    Object v13 = "1";
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v11).replaceFirst(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang.text.StrMatcher.trimMatcher();
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v14).contains(((org.apache.commons.lang.text.StrMatcher)v15));
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v14).trim();
    org.junit.Assert.assertNotNull(v17);
  }
}
