package org.apache.commons.lang.text;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = Character.valueOf((char)48);
    Object v2 = 1;
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).lastIndexOf((((java.lang.Character)v1).charValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = -15;
    Object v2 = false;
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).insert((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new org.apache.commons.lang.text.StrBuilder();
    Object v2 = Character.valueOf((char)48);
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).lastIndexOf((((java.lang.Character)v2).charValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = false;
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v0).appendln((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = false;
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v0).appendln((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v2).append(((char[])v3));
    Object v5 = -36;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v2).setLength((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).reverse();
    Object v5 = "";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).contains(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).asTokenizer();
    Object v5 = "U";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteAll(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = true;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = "534";
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).startsWith(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = true;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).getChars(((char[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = true;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteAll((((java.lang.Character)v6).charValue()));
    Object v8 = "`";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendSeparator(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = ((java.util.Collection)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).appendAll(((java.util.Collection)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = ((java.util.Collection)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).appendAll(((java.util.Collection)v2));
    Object v6 = new org.apache.commons.lang.text.StrBuilder();
    Object v7 = new java.util.TreeSet();
    Object v8 = ((java.util.Collection)v7).size();
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).appendAll(((java.util.Collection)v7));
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v9).asTokenizer();
    Object v11 = "U";
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).deleteAll(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v5).equals(((org.apache.commons.lang.text.StrBuilder)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = ((java.util.Collection)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).appendAll(((java.util.Collection)v2));
    Object v6 = "fll";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).setNullText(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = true;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).append((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteAll((((java.lang.Character)v6).charValue()));
    Object v8 = "`";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v5).appendSeparator(((java.lang.String)v8));
    Object v10 = new char[]{Character.valueOf((char)36),Character.valueOf((char)0)};
    Object v11 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v12 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v11));
    Object v13 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v14 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v13));
    Object v15 = new org.apache.commons.lang.text.StrTokenizer(((char[])v10),((org.apache.commons.lang.text.StrMatcher)v12),((org.apache.commons.lang.text.StrMatcher)v14));
    Object v16 = " is missing the following items: ";
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v9).appendWithSeparators(((java.util.Iterator)v15),((java.lang.String)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).deleteAll((((java.lang.Character)v8).charValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).toCharArray((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)110)};
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).getChars(((char[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = ((java.util.Collection)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).appendAll(((java.util.Collection)v2));
    Object v6 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v7 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v6));
    Object v8 = new char[]{Character.valueOf((char)1)};
    Object v9 = 0;
    Object v10 = ((org.apache.commons.lang.text.StrMatcher)v7).isMatch(((char[])v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v5).contains(((org.apache.commons.lang.text.StrMatcher)v7));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).minimizeCapacity();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = 32;
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendPadding((((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = "]";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendWithSeparators(((java.util.Collection)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = false;
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v0).appendln((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = 6;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v2).lastIndexOf((((java.lang.Character)v3).charValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new org.apache.commons.lang.text.StrBuilder();
    Object v9 = false;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).appendln((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = Character.valueOf((char)0);
    Object v12 = 6;
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).lastIndexOf((((java.lang.Character)v11).charValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 18;
    Object v15 = Character.valueOf((char)0);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v7).appendFixedWidthPadLeft(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = "]";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendWithSeparators(((java.util.Collection)v8),((java.lang.String)v9));
    Object v11 = -10;
    Object v12 = "[";
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).insert((((java.lang.Integer)v11).intValue()),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v3 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v2));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).indexOf(((org.apache.commons.lang.text.StrMatcher)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).appendSeparator((((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new org.apache.commons.lang.text.StrBuilder();
    Object v7 = false;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).appendln((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = Character.valueOf((char)0);
    Object v10 = 6;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v8).lastIndexOf((((java.lang.Character)v9).charValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 46;
    Object v13 = Character.valueOf((char)1);
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Character)v13).charValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new org.apache.commons.lang.text.StrBuilder();
    Object v9 = false;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).appendln((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = Character.valueOf((char)0);
    Object v12 = 6;
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).lastIndexOf((((java.lang.Character)v11).charValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 18;
    Object v15 = Character.valueOf((char)0);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v7).appendFixedWidthPadLeft(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    Object v17 = "";
    Object v18 = new java.lang.StringBuffer(((java.lang.String)v17));
    Object v19 = ((org.apache.commons.lang.text.StrBuilder)v16).append(((java.lang.StringBuffer)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = 1;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).rightString((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)("\u0000"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).deleteFirst((((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "asymp";
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).replaceFirst(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = ((java.util.Collection)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).appendAll(((java.util.Collection)v2));
    Object v6 = false;
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).append((((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = 32;
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendPadding((((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = new char[]{Character.valueOf((char)36),Character.valueOf((char)0)};
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v13 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v12));
    Object v14 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v15 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v14));
    Object v16 = new org.apache.commons.lang.text.StrTokenizer(((char[])v11),((org.apache.commons.lang.text.StrMatcher)v13),((org.apache.commons.lang.text.StrMatcher)v15));
    Object v17 = "";
    Object v18 = ((org.apache.commons.lang.text.StrBuilder)v10).appendWithSeparators(((java.util.Iterator)v16),((java.lang.String)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "asymp";
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).replaceFirst(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = Character.valueOf((char)1);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v4).contains((((java.lang.Character)v5).charValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = 24;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendSeparator((((java.lang.Character)v4).charValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = 24;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendSeparator((((java.lang.Character)v4).charValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v8 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).replaceAll(((org.apache.commons.lang.text.StrMatcher)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v3).deleteFirst((((java.lang.Character)v4).charValue()));
    Object v6 = new org.apache.commons.lang.text.StrBuilder();
    Object v7 = false;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).appendln((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = Character.valueOf((char)0);
    Object v10 = 6;
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v8).lastIndexOf((((java.lang.Character)v9).charValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 46;
    Object v13 = Character.valueOf((char)1);
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v5).appendFixedWidthPadRight(((java.lang.Object)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Character)v13).charValue()));
    Object v15 = -1;
    Object v16 = -14;
    Object v17 = Character.valueOf((char)0);
    Object v18 = ((org.apache.commons.lang.text.StrBuilder)v14).appendFixedWidthPadRight((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Character)v17).charValue()));
    Object v19 = 0;
    Object v20 = ((org.apache.commons.lang.text.StrBuilder)v14).leftString((((java.lang.Integer)v19).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = 32;
    Object v9 = Character.valueOf((char)0);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendPadding((((java.lang.Integer)v8).intValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = 11;
    Object v9 = -10;
    Object v10 = "d";
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v7).replace((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = -12;
    Object v3 = new char[]{};
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).insert((((java.lang.Integer)v2).intValue()),((char[])v3));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new org.apache.commons.lang.text.StrBuilder();
    Object v9 = false;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v8).appendln((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = Character.valueOf((char)0);
    Object v12 = 6;
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v10).lastIndexOf((((java.lang.Character)v11).charValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 18;
    Object v15 = Character.valueOf((char)0);
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v7).appendFixedWidthPadLeft(((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Character)v15).charValue()));
    Object v17 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v18 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v17));
    Object v19 = 1;
    Object v20 = ((org.apache.commons.lang.text.StrBuilder)v16).indexOf(((org.apache.commons.lang.text.StrMatcher)v18),(((java.lang.Integer)v19).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 8;
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).insert((((java.lang.Integer)v2).intValue()),(((java.lang.Character)v3).charValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = "]";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendWithSeparators(((java.util.Collection)v8),((java.lang.String)v9));
    Object v11 = "start@ndex must be valid";
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).deleteAll(((java.lang.String)v11));
    Object v13 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v14 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v13));
    Object v15 = 1;
    Object v16 = ((org.apache.commons.lang.text.StrBuilder)v10).indexOf(((org.apache.commons.lang.text.StrMatcher)v14),(((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = "]";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendWithSeparators(((java.util.Collection)v8),((java.lang.String)v9));
    Object v11 = new char[]{Character.valueOf((char)36),Character.valueOf((char)0)};
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v13 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v12));
    Object v14 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v15 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v14));
    Object v16 = new org.apache.commons.lang.text.StrTokenizer(((char[])v11),((org.apache.commons.lang.text.StrMatcher)v13),((org.apache.commons.lang.text.StrMatcher)v15));
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v10).appendAll(((java.util.Iterator)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = 24;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendSeparator((((java.lang.Character)v4).charValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 7L;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v6).append((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = 60;
    ((org.apache.commons.lang.text.StrBuilder)v3).validateIndex((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v3 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v2));
    Object v4 = -7;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).indexOf(((org.apache.commons.lang.text.StrMatcher)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = "]";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendWithSeparators(((java.util.Collection)v8),((java.lang.String)v9));
    Object v11 = new char[]{Character.valueOf((char)36),Character.valueOf((char)0)};
    Object v12 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v13 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v12));
    Object v14 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v15 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v14));
    Object v16 = new org.apache.commons.lang.text.StrTokenizer(((char[])v11),((org.apache.commons.lang.text.StrMatcher)v13),((org.apache.commons.lang.text.StrMatcher)v15));
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v10).appendAll(((java.util.Iterator)v16));
    Object v18 = ":";
    Object v19 = ((org.apache.commons.lang.text.StrBuilder)v17).endsWith(((java.lang.String)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = ((java.util.Collection)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).appendAll(((java.util.Collection)v2));
    Object v6 = "fll";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v5).setNullText(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v7).toString();
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).appendNewLine();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v3 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v2));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).indexOf(((org.apache.commons.lang.text.StrMatcher)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).appendSeparator((((java.lang.Character)v6).charValue()));
    Object v8 = "x";
    Object v9 = 0;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).indexOf(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).reverse();
    Object v3 = "n";
    Object v4 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)60);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).appendFixedWidthPadRight(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = "";
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).appendWithSeparators(((java.lang.Object[])v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).trim();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "F";
    Object v3 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).equalsIgnoreCase(((org.apache.commons.lang.text.StrBuilder)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v3 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v2));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).indexOf(((org.apache.commons.lang.text.StrMatcher)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).appendSeparator((((java.lang.Character)v6).charValue()));
    Object v8 = "";
    Object v9 = -33;
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).appendSeparator(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v3 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v2));
    Object v4 = new char[]{Character.valueOf((char)0)};
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrMatcher)v3).isMatch(((char[])v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).contains(((org.apache.commons.lang.text.StrMatcher)v3));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = "";
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).appendWithSeparators(((java.lang.Object[])v2),((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = new char[]{Character.valueOf((char)0)};
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v4).insert((((java.lang.Integer)v5).intValue()),((char[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v3 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v2));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).indexOf(((org.apache.commons.lang.text.StrMatcher)v3));
    Object v5 = new java.util.TreeSet();
    Object v6 = "oacute";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).appendWithSeparators(((java.util.Collection)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.lang.text.StrBuilder();
    Object v1 = new java.util.TreeSet();
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v0).appendAll(((java.util.Collection)v1));
    Object v4 = Character.valueOf((char)0);
    Object v5 = 24;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendSeparator((((java.lang.Character)v4).charValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v8 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v7));
    Object v9 = "";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v6).replaceAll(((org.apache.commons.lang.text.StrMatcher)v8),((java.lang.String)v9));
    Object v11 = "pe";
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).deleteFirst(((java.lang.String)v11));
    Object v13 = Character.valueOf((char)1);
    Object v14 = 32;
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v10).appendSeparator((((java.lang.Character)v13).charValue()),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = "";
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).appendWithSeparators(((java.lang.Object[])v2),((java.lang.String)v3));
    Object v5 = "n";
    Object v6 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).toCharArray((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v6).setCharAt((((java.lang.Integer)v10).intValue()),(((java.lang.Character)v11).charValue()));
    Object v13 = new java.util.TreeSet();
    Object v14 = "]";
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v12).appendWithSeparators(((java.util.Collection)v13),((java.lang.String)v14));
    Object v16 = "start@ndex must be valid";
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v15).deleteAll(((java.lang.String)v16));
    Object v18 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v19 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v18));
    Object v20 = 1;
    Object v21 = ((org.apache.commons.lang.text.StrBuilder)v15).indexOf(((org.apache.commons.lang.text.StrMatcher)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = 4;
    Object v23 = Character.valueOf((char)1);
    Object v24 = ((org.apache.commons.lang.text.StrBuilder)v4).appendFixedWidthPadLeft(((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()),(((java.lang.Character)v23).charValue()));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "F";
    Object v3 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v3).trim();
    Object v5 = "F";
    Object v6 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v5));
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = "";
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).appendWithSeparators(((java.lang.Object[])v7),((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = new char[]{Character.valueOf((char)0)};
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v9).insert((((java.lang.Integer)v10).intValue()),((char[])v11));
    Object v13 = 22;
    Object v14 = Character.valueOf((char)1);
    Object v15 = ((org.apache.commons.lang.text.StrBuilder)v4).appendFixedWidthPadRight(((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Character)v14).charValue()));
    Object v16 = 10;
    Object v17 = -1;
    Object v18 = ((org.apache.commons.lang.text.StrBuilder)v1).appendln(((org.apache.commons.lang.text.StrBuilder)v4),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "F";
    Object v3 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v2));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = "";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.lang.Object[])v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = new char[]{Character.valueOf((char)0)};
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),((char[])v8));
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v1).append(((org.apache.commons.lang.text.StrBuilder)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v3 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v2));
    Object v4 = 1;
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).indexOf(((org.apache.commons.lang.text.StrMatcher)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).appendSeparator((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v7).trim();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.TreeSet();
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).append(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).appendPadding((((java.lang.Integer)v2).intValue()),(((java.lang.Character)v3).charValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).toString();
    org.junit.Assert.assertEquals((Object)("The number must not be null"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = "";
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).appendWithSeparators(((java.lang.Object[])v2),((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = new char[]{Character.valueOf((char)0)};
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v4).insert((((java.lang.Integer)v5).intValue()),((char[])v6));
    Object v8 = 1;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).rightString((((java.lang.Integer)v8).intValue()));
    Object v10 = "n";
    Object v11 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v10));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v11).toCharArray((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = Character.valueOf((char)0);
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v11).setCharAt((((java.lang.Integer)v15).intValue()),(((java.lang.Character)v16).charValue()));
    Object v18 = "The number must not be null";
    Object v19 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v18));
    Object v20 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v21 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v20));
    Object v22 = new char[]{Character.valueOf((char)0)};
    Object v23 = 0;
    Object v24 = ((org.apache.commons.lang.text.StrMatcher)v21).isMatch(((char[])v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.apache.commons.lang.text.StrBuilder)v19).contains(((org.apache.commons.lang.text.StrMatcher)v21));
    Object v26 = 0;
    Object v27 = Character.valueOf((char)0);
    Object v28 = ((org.apache.commons.lang.text.StrBuilder)v17).appendFixedWidthPadLeft(((java.lang.Object)v25),(((java.lang.Integer)v26).intValue()),(((java.lang.Character)v27).charValue()));
    Object v29 = ((org.apache.commons.lang.text.StrBuilder)v7).equals(((org.apache.commons.lang.text.StrBuilder)v17));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).appendln((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).reverse();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null};
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).appendAll(((java.lang.Object[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.lang.text.StrBuilder((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = 0.42811664817599904D;
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v7).append((((java.lang.Double)v8).doubleValue()));
    Object v10 = Character.valueOf((char)0);
    Object v11 = -23;
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v7).indexOf((((java.lang.Character)v10).charValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).deleteAll((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 6;
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)2),Character.valueOf((char)0)};
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).insert((((java.lang.Integer)v2).intValue()),((char[])v3));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = "";
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).appendWithSeparators(((java.lang.Object[])v2),((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = new char[]{Character.valueOf((char)0)};
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v4).insert((((java.lang.Integer)v5).intValue()),((char[])v6));
    Object v8 = "";
    Object v9 = new java.lang.StringBuffer(((java.lang.String)v8));
    Object v10 = -11;
    Object v11 = 14;
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v7).append(((java.lang.StringBuffer)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "i";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v3 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v2));
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).indexOf(((org.apache.commons.lang.text.StrMatcher)v3));
    Object v5 = new java.util.TreeSet();
    Object v6 = "oacute";
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).appendWithSeparators(((java.util.Collection)v5),((java.lang.String)v6));
    Object v8 = 4;
    Object v9 = "i";
    Object v10 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v7).insert((((java.lang.Integer)v8).intValue()),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "i";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).leftString((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = ((java.util.Collection)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.lang.text.StrBuilder)v1).appendAll(((java.util.Collection)v2));
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v5).toCharArray();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "i";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).appendSeparator((((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).append((((java.lang.Integer)v2).intValue()));
    Object v4 = "tim";
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v1).lastIndexOf(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).appendPadding((((java.lang.Integer)v2).intValue()),(((java.lang.Character)v3).charValue()));
    Object v5 = "Caused by: ";
    Object v6 = 0;
    Object v7 = 31;
    Object v8 = ((org.apache.commons.lang.text.StrBuilder)v4).append(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).appendNewLine();
    Object v3 = ":V";
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).indexOf(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "i";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).deleteAll(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = ((org.apache.commons.lang.text.StrBuilder)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "i";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).deleteAll(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).lastIndexOf(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    ((org.apache.commons.lang.text.StrBuilder)v1).validateIndex((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "i";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "n";
    Object v3 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "asymp";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).replaceFirst(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).equals(((org.apache.commons.lang.text.StrBuilder)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.lang.text.StrBuilder)v1).deleteAll((((java.lang.Character)v2).charValue()));
    Object v4 = 13;
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).setCharAt((((java.lang.Integer)v4).intValue()),(((java.lang.Character)v5).charValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "n";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.lang.text.StrBuilder)v1).toCharArray((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.lang.text.StrBuilder)v1).setCharAt((((java.lang.Integer)v5).intValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)0);
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v7).replaceAll((((java.lang.Character)v8).charValue()),(((java.lang.Character)v9).charValue()));
    Object v11 = 0;
    Object v12 = ((org.apache.commons.lang.text.StrBuilder)v10).rightString((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = "F";
    Object v3 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v2));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = "";
    Object v6 = ((org.apache.commons.lang.text.StrBuilder)v3).appendWithSeparators(((java.lang.Object[])v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = new char[]{Character.valueOf((char)0)};
    Object v9 = ((org.apache.commons.lang.text.StrBuilder)v6).insert((((java.lang.Integer)v7).intValue()),((char[])v8));
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v1).append(((org.apache.commons.lang.text.StrBuilder)v9));
    Object v11 = "F";
    Object v12 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang.text.StrBuilder)v12).trim();
    Object v14 = ((org.apache.commons.lang.text.StrBuilder)v10).equalsIgnoreCase(((org.apache.commons.lang.text.StrBuilder)v13));
    Object v15 = new java.lang.Object[]{null,null,null};
    Object v16 = "|";
    Object v17 = ((org.apache.commons.lang.text.StrBuilder)v10).appendWithSeparators(((java.lang.Object[])v15),((java.lang.String)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "i";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.StrBuilder)v1).trim();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = new org.apache.commons.lang.text.StrBuilder(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)36),Character.valueOf((char)0)};
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v4 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v3));
    Object v5 = new char[]{Character.valueOf((char)0),Character.valueOf((char)65535),Character.valueOf((char)0)};
    Object v6 = org.apache.commons.lang.text.StrMatcher.charSetMatcher(((char[])v5));
    Object v7 = new org.apache.commons.lang.text.StrTokenizer(((char[])v2),((org.apache.commons.lang.text.StrMatcher)v4),((org.apache.commons.lang.text.StrMatcher)v6));
    Object v8 = ((java.util.Iterator)v7).hasNext();
    Object v9 = "The number must not be NaN";
    Object v10 = ((org.apache.commons.lang.text.StrBuilder)v1).appendWithSeparators(((java.util.Iterator)v7),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }
}
