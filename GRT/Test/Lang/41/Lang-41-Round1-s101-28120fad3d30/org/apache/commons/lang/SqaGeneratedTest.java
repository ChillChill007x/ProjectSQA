package org.apache.commons.lang;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("Boolean"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "The ";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "Y\u00a5";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    Object v6 = "U";
    Object v7 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("java.lang"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Y\u00a5";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "The validated collection contains null element at index: ";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Class[]{null};
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = false;
    Object v7 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v4),((java.lang.Class[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.Class[]{null};
    Object v9 = new java.lang.Class[]{null,null,null};
    Object v10 = false;
    Object v11 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v8),((java.lang.Class[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Class[]{null};
    Object v13 = new java.lang.Class[]{null,null,null};
    Object v14 = false;
    Object v15 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v12),((java.lang.Class[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.lang.Class[]{null};
    Object v17 = new java.lang.Class[]{null,null,null};
    Object v18 = false;
    Object v19 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v16),((java.lang.Class[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = "The ";
    Object v21 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v20));
    Object v22 = new java.lang.Class[]{null};
    Object v23 = new java.lang.Class[]{null,null,null};
    Object v24 = false;
    Object v25 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v22),((java.lang.Class[])v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "";
    Object v27 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v26));
    Object v28 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v15),((java.lang.Object)v19),((java.lang.Object)v21),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses(((java.util.List)v28));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "&dagger;Z";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = ";";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(";"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    Object v2 = "double";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    Object v6 = "U";
    Object v7 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v5),((java.lang.String)v6));
    Object v8 = "";
    Object v9 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v7),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)("String"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "true";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = "\u2135i";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "yyyy-MMddZZ";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The Array must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.toClass(((java.lang.Object[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = org.apache.commons.lang.ClassUtils.toClass(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Class[]{null};
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = false;
    Object v7 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v4),((java.lang.Class[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.Class[]{null};
    Object v9 = new java.lang.Class[]{null,null,null};
    Object v10 = false;
    Object v11 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v8),((java.lang.Class[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Class[]{null};
    Object v13 = new java.lang.Class[]{null,null,null};
    Object v14 = false;
    Object v15 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v12),((java.lang.Class[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.lang.Class[]{null};
    Object v17 = new java.lang.Class[]{null,null,null};
    Object v18 = false;
    Object v19 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v16),((java.lang.Class[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = "The ";
    Object v21 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v20));
    Object v22 = new java.lang.Class[]{null};
    Object v23 = new java.lang.Class[]{null,null,null};
    Object v24 = false;
    Object v25 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v22),((java.lang.Class[])v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "";
    Object v27 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v26));
    Object v28 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v15),((java.lang.Object)v19),((java.lang.Object)v21),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = org.apache.commons.lang.ClassUtils.convertClassesToClassNames(((java.util.List)v28));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "&";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "yyyy-MMddZZ";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "yyyy-MMddZZ";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("String"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "&oplus;";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("&oplus;"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Class)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "end < start";
    Object v5 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("Boolean"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "l";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "c";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("c"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = org.apache.commons.lang.ClassUtils.toClass(((java.lang.Object[])v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Class[]{null};
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = false;
    Object v7 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v4),((java.lang.Class[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.Class[]{null};
    Object v9 = new java.lang.Class[]{null,null,null};
    Object v10 = false;
    Object v11 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v8),((java.lang.Class[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Class[]{null};
    Object v13 = new java.lang.Class[]{null,null,null};
    Object v14 = false;
    Object v15 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v12),((java.lang.Class[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.lang.Class[]{null};
    Object v17 = new java.lang.Class[]{null,null,null};
    Object v18 = false;
    Object v19 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v16),((java.lang.Class[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = "The ";
    Object v21 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v20));
    Object v22 = new java.lang.Class[]{null};
    Object v23 = new java.lang.Class[]{null,null,null};
    Object v24 = false;
    Object v25 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v22),((java.lang.Class[])v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "";
    Object v27 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v26));
    Object v28 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v15),((java.lang.Object)v19),((java.lang.Object)v21),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = ((java.util.List)v28).isEmpty();
    Object v30 = org.apache.commons.lang.ClassUtils.convertClassesToClassNames(((java.util.List)v28));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "true";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.String)v0));
    Object v2 = "tRange[";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.lang.ClassUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    Object v2 = "4";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.toClass(((java.lang.Object[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "l";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "&yacute;";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "getTargetException";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Class[]{null};
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = false;
    Object v7 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v4),((java.lang.Class[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.Class[]{null};
    Object v9 = new java.lang.Class[]{null,null,null};
    Object v10 = false;
    Object v11 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v8),((java.lang.Class[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Class[]{null};
    Object v13 = new java.lang.Class[]{null,null,null};
    Object v14 = false;
    Object v15 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v12),((java.lang.Class[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.lang.Class[]{null};
    Object v17 = new java.lang.Class[]{null,null,null};
    Object v18 = false;
    Object v19 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v16),((java.lang.Class[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = "The ";
    Object v21 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v20));
    Object v22 = new java.lang.Class[]{null};
    Object v23 = new java.lang.Class[]{null,null,null};
    Object v24 = false;
    Object v25 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v22),((java.lang.Class[])v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "";
    Object v27 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v26));
    Object v28 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v15),((java.lang.Object)v19),((java.lang.Object)v21),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = ((java.util.List)v28).iterator();
    Object v30 = org.apache.commons.lang.ClassUtils.convertClassesToClassNames(((java.util.List)v28));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.lang.Class[]{};
    Object v1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "&oplus;";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Class[]{null};
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = false;
    Object v7 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v4),((java.lang.Class[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.Class[]{null};
    Object v9 = new java.lang.Class[]{null,null,null};
    Object v10 = false;
    Object v11 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v8),((java.lang.Class[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Class[]{null};
    Object v13 = new java.lang.Class[]{null,null,null};
    Object v14 = false;
    Object v15 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v12),((java.lang.Class[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.lang.Class[]{null};
    Object v17 = new java.lang.Class[]{null,null,null};
    Object v18 = false;
    Object v19 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v16),((java.lang.Class[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = "The ";
    Object v21 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v20));
    Object v22 = new java.lang.Class[]{null};
    Object v23 = new java.lang.Class[]{null,null,null};
    Object v24 = false;
    Object v25 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v22),((java.lang.Class[])v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "";
    Object v27 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v26));
    Object v28 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v15),((java.lang.Object)v19),((java.lang.Object)v21),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = ((java.util.List)v28).spliterator();
    Object v30 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses(((java.util.List)v28));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ",";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "&oplus;";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "'";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "&Teta;";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Range[";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "[";
    Object v5 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("Boolean"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.lang.Class[]{};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "&Teta;";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "/";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1));
    Object v3 = "U";
    Object v4 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("Boolean"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = "'";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "l";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "]";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = ")";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = ": ";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.lang.Class[]{};
    Object v1 = new java.lang.Class[]{null,null};
    Object v2 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "&piv";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Class)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "/";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "/";
    Object v1 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v0));
    Object v2 = "*";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = ")";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new java.lang.Class[]{null};
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = false;
    Object v7 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v4),((java.lang.Class[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new java.lang.Class[]{null};
    Object v9 = new java.lang.Class[]{null,null,null};
    Object v10 = false;
    Object v11 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v8),((java.lang.Class[])v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Class[]{null};
    Object v13 = new java.lang.Class[]{null,null,null};
    Object v14 = false;
    Object v15 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v12),((java.lang.Class[])v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new java.lang.Class[]{null};
    Object v17 = new java.lang.Class[]{null,null,null};
    Object v18 = false;
    Object v19 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v16),((java.lang.Class[])v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = "The ";
    Object v21 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v20));
    Object v22 = new java.lang.Class[]{null};
    Object v23 = new java.lang.Class[]{null,null,null};
    Object v24 = false;
    Object v25 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v22),((java.lang.Class[])v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = "";
    Object v27 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.String)v26));
    Object v28 = java.util.List.of(((java.lang.Object)v3),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v15),((java.lang.Object)v19),((java.lang.Object)v21),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = ((java.util.List)v28).listIterator();
    Object v30 = org.apache.commons.lang.ClassUtils.convertClassesToClassNames(((java.util.List)v28));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = java.lang.ClassLoader.getSystemClassLoader();
    Object v5 = "double";
    Object v6 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v6));
    Object v8 = true;
    Object v9 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class)v3),((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = org.apache.commons.lang.ClassUtils.getShortCanonicalName(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)("Double"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "HashCodeBuildr requires an odd multiplier";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)("java.lang"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = org.apache.commons.lang.ClassUtils.getAllInterfaces(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingConstructor();
    Object v5 = org.apache.commons.lang.ClassUtils.getAllSuperclasses(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.lang.Class[]{};
    Object v1 = org.apache.commons.lang.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "p";
    Object v3 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = org.apache.commons.lang.ClassUtils.getShortClassName(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)("Double"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = org.apache.commons.lang.ClassUtils.getAllInterfaces(((java.lang.Class)v3));
    Object v5 = org.apache.commons.lang.ClassUtils.convertClassNamesToClasses(((java.util.List)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.getAllSuperclasses(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = "double";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "&dagger;Z";
    Object v1 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "!";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "The numbers must not be null";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = java.lang.ClassLoader.getSystemClassLoader();
    Object v5 = "double";
    Object v6 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v6));
    Object v8 = ((java.lang.Class)v3).getDeclaredAnnotation(((java.lang.Class)v7));
    Object v9 = org.apache.commons.lang.ClassUtils.getAllSuperclasses(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)("java.lang"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ",";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    Object v6 = "X";
    Object v7 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Object)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("java.lang"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Class)v2).toString();
    Object v4 = org.apache.commons.lang.ClassUtils.getAllSuperclasses(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Class)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredFields();
    Object v4 = java.lang.ClassLoader.getSystemClassLoader();
    Object v5 = "double";
    Object v6 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v6));
    Object v8 = false;
    Object v9 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class)v2),((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = true;
    Object v3 = org.apache.commons.lang.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "U";
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = "double";
    Object v2 = org.apache.commons.lang.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.ClassUtils.primitiveToWrapper(((java.lang.Class)v2));
    Object v4 = ((java.lang.Class)v3).getPackage();
    Object v5 = org.apache.commons.lang.ClassUtils.getPackageCanonicalName(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = "K";
    Object v3 = org.apache.commons.lang.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }
}
