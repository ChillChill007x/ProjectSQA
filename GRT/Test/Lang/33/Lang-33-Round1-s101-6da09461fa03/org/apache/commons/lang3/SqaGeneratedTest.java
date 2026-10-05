package org.apache.commons.lang3;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = "&xi;";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "Jdiams;";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = "&xi;";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "j";
    Object v5 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("String"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = org.apache.commons.lang3.ClassUtils.isInnerClass(((java.lang.Class)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = null;
    Object v1 = org.apache.commons.lang3.ClassUtils.getAllInterfaces(((java.lang.Class)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(((java.lang.Class)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "2";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = ((java.util.List)v0).toArray(((java.lang.Object[])v1));
    Object v3 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "\u00b2";
    Object v2 = new java.lang.Class[]{null,null,null};
    Object v3 = org.apache.commons.lang3.ClassUtils.getPublicMethod(((java.lang.Class)v0),((java.lang.String)v1),((java.lang.Class[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "S";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "S";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "S";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "FastDateFormat[";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "S";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "HH:m:ss";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "S";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "\u221e";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = "falkse";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "g";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Class)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "\u03b1";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Stopwatch must be split to get the split time. ";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Stopwatch must be split to get the split time"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    Object v2 = "s";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v0));
    Object v2 = "\u00b3";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.util"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = "Y";
    Object v4 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("ArrayList"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "5";
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("5"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "V";
    Object v5 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("String"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.lang.Class[]{};
    Object v1 = new java.lang.Class[]{null,null,null};
    Object v2 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "FastDateFormxt[";
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("FastDateFormxt["), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "The Array: must not be null";
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The Array: must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "5";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "S";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "&Alpha;";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Stopwatch must be split to get the split time. ";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "\u00dd";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.Class[]{};
    Object v1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    Object v2 = "java";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "&";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "V";
    Object v5 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    Object v6 = "\u00e4";
    Object v7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("String"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "&";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "\u2009";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    Object v2 = "/";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v1));
    Object v3 = "j";
    Object v4 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("java.util"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.lang3.ClassUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Stopwatch must be split to get the split time. ";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "\u00dd";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "ZZ";
    Object v5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("String"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "&";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "x";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "]";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = ((java.util.List)v2).hashCode();
    Object v4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    Object v6 = "g";
    Object v7 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("java.lang"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Class[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "&i;";
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("&i;"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "=";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "&";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Class)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = " 0 minutes";
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" 0 minutes"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "g";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "&Thetua;";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "The Array: must not be null";
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.String)v0));
    Object v2 = "The va";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.lang.Class[]{};
    Object v1 = new java.lang.Class[]{};
    Object v2 = false;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Stopwatch must be split to get the split time. ";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "&le";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("String"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.toClass(((java.lang.Object[])v0));
    Object v2 = "user.home";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v2));
    Object v4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "g";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "&Thetua;";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "Z";
    Object v5 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("String"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "Stopwatch must be split to get the split time. ";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "&le";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "(";
    Object v5 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("String"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "g";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "&Thetua;";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "Cannot locate declared field S";
    Object v5 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("String"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.lang.Class[]{};
    Object v1 = new java.lang.Class[]{null,null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v2));
    Object v4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v3));
    Object v5 = "";
    Object v6 = org.apache.commons.lang3.ClassUtils.getShortClassName(((java.lang.String)v5));
    Object v7 = ((java.util.List)v4).contains(((java.lang.Object)v6));
    Object v8 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = true;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "]";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    Object v6 = "Cannot locate declared field ";
    Object v7 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("java.lang"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(((java.lang.Class[])v0));
    Object v2 = "\u2009";
    Object v3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "\u2202";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Stopwatch must be split to get the split time. ";
    Object v1 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.String)v0));
    Object v2 = "\u00dd";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    Object v4 = "N";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.lang"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null,null};
    Object v1 = new java.lang.Class[]{null};
    Object v2 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1));
    Object v3 = "k";
    Object v4 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.Object)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("Boolean"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.lang.Class[]{null,null};
    Object v1 = new java.lang.Class[]{};
    Object v2 = true;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v0));
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("java.util"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.lang.Class[]{null};
    Object v1 = new java.lang.Class[]{null,null};
    Object v2 = false;
    Object v3 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v0),((java.lang.Class[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v2));
    Object v4 = new java.lang.Class[]{null,null};
    Object v5 = new java.lang.Class[]{null};
    Object v6 = true;
    Object v7 = org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class[])v4),((java.lang.Class[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "]";
    Object v9 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v7),((java.lang.String)v8));
    Object v10 = "Cannot locate declared field ";
    Object v11 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v9),((java.lang.String)v10));
    Object v12 = ((java.util.List)v3).equals(((java.lang.Object)v11));
    Object v13 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("TheArraymustnotbenull"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = ((java.util.List)v2).hashCode();
    Object v4 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(((java.util.List)v2));
    Object v5 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.util.ArrayList();
    Object v1 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v0));
    Object v2 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v1));
    Object v3 = org.apache.commons.lang3.ClassUtils.convertClassesToClassNames(((java.util.List)v2));
    Object v4 = "\u03d6";
    Object v5 = org.apache.commons.lang3.ClassUtils.getPackageName(((java.lang.Object)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("java.util"), v5);
  }
}
