package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "img";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "img";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.Tag)v5).isValidAncestor(((org.jsoup.parser.Tag)v7));
    Object v9 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v8));
    Object v10 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "img";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "img";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "img";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = ((org.jsoup.parser.Tag)v7).isValidAncestor(((org.jsoup.parser.Tag)v9));
    Object v11 = ((org.jsoup.parser.Tag)v5).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v13 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v12));
    Object v14 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "img";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "img";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "img";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = ((org.jsoup.parser.Tag)v7).isValidAncestor(((org.jsoup.parser.Tag)v9));
    Object v11 = ((org.jsoup.parser.Tag)v5).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v13 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v12));
    Object v14 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v15 = ((org.jsoup.parser.Tag)v14).isData();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "img";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "img";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "img";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = ((org.jsoup.parser.Tag)v7).isValidAncestor(((org.jsoup.parser.Tag)v9));
    Object v11 = ((org.jsoup.parser.Tag)v5).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v13 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v12));
    Object v14 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v15 = ((org.jsoup.parser.Tag)v14).requiresSpecificParent();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "img";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "img";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "img";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = ((org.jsoup.parser.Tag)v7).isValidAncestor(((org.jsoup.parser.Tag)v9));
    Object v11 = ((org.jsoup.parser.Tag)v5).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v13 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v12));
    Object v14 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v15 = "img";
    Object v16 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v15));
    Object v17 = "img";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = ((org.jsoup.parser.Tag)v16).isValidAncestor(((org.jsoup.parser.Tag)v18));
    Object v20 = ((org.jsoup.parser.Tag)v14).equals(((java.lang.Object)v19));
    Object v21 = "img";
    Object v22 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v21));
    Object v23 = "img";
    Object v24 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v23));
    Object v25 = "img";
    Object v26 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v25));
    Object v27 = "img";
    Object v28 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v27));
    Object v29 = "img";
    Object v30 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v29));
    Object v31 = ((org.jsoup.parser.Tag)v28).isValidAncestor(((org.jsoup.parser.Tag)v30));
    Object v32 = ((org.jsoup.parser.Tag)v26).equals(((java.lang.Object)v31));
    Object v33 = ((org.jsoup.parser.Tag)v24).isValidAncestor(((org.jsoup.parser.Tag)v26));
    Object v34 = ((org.jsoup.parser.Tag)v22).equals(((java.lang.Object)v33));
    Object v35 = ((org.jsoup.parser.Tag)v22).getImplicitParent();
    Object v36 = ((org.jsoup.parser.Tag)v14).canContain(((org.jsoup.parser.Tag)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "IMG";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "img";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "img";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "img";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = ((org.jsoup.parser.Tag)v7).isValidAncestor(((org.jsoup.parser.Tag)v9));
    Object v11 = ((org.jsoup.parser.Tag)v5).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v13 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v12));
    Object v14 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v15 = ((org.jsoup.parser.Tag)v14).isInline();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v7 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v6));
    Object v8 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).isInline();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).requiresSpecificParent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(2052520265), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).toString();
    org.junit.Assert.assertEquals((Object)("clas2"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v7 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v6));
    Object v8 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v9 = ((org.jsoup.parser.Tag)v8).isData();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).hashCode();
    Object v5 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isInline();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v7 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v6));
    Object v8 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v9 = "clas2";
    Object v10 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9));
    Object v11 = ((org.jsoup.parser.Tag)v8).isValidAncestor(((org.jsoup.parser.Tag)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "img";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "img";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "img";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "img";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "img";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = ((org.jsoup.parser.Tag)v7).isValidAncestor(((org.jsoup.parser.Tag)v9));
    Object v11 = ((org.jsoup.parser.Tag)v5).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v13 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v12));
    Object v14 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v15 = "clas2";
    Object v16 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v15));
    Object v17 = ((org.jsoup.parser.Tag)v16).requiresSpecificParent();
    Object v18 = ((org.jsoup.parser.Tag)v14).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "IMG";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).isValidParent(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v5).requiresSpecificParent();
    Object v7 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = ((org.jsoup.parser.Tag)v3).isData();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v7 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v6));
    Object v8 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v9 = ((org.jsoup.parser.Tag)v8).hashCode();
    Object v10 = ((org.jsoup.parser.Tag)v8).hashCode();
    org.junit.Assert.assertEquals((Object)(1162677055), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = "clas2";
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.Tag)v4).requiresSpecificParent();
    Object v6 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "clas2";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "clas2";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = ((org.jsoup.parser.Tag)v7).isValidAncestor(((org.jsoup.parser.Tag)v9));
    Object v11 = ((org.jsoup.parser.Tag)v5).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.parser.Tag)v5).getImplicitParent();
    Object v13 = ((org.jsoup.parser.Tag)v12).hashCode();
    Object v14 = ((org.jsoup.parser.Tag)v12).hashCode();
    Object v15 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v14));
    Object v16 = "clas2";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = ((org.jsoup.parser.Tag)v17).isData();
    Object v19 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = ((org.jsoup.parser.Tag)v3).requiresSpecificParent();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = ((org.jsoup.parser.Tag)v3).hashCode();
    Object v5 = "head";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.Tag)v6).hashCode();
    Object v8 = ((org.jsoup.parser.Tag)v6).getImplicitParent();
    Object v9 = "clas2";
    Object v10 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9));
    Object v11 = ((org.jsoup.parser.Tag)v10).requiresSpecificParent();
    Object v12 = ((org.jsoup.parser.Tag)v8).equals(((java.lang.Object)v11));
    Object v13 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = ((org.jsoup.parser.Tag)v3).isInline();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "clas2";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.Tag)v5).isValidAncestor(((org.jsoup.parser.Tag)v7));
    Object v9 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v8));
    Object v10 = ((org.jsoup.parser.Tag)v3).getImplicitParent();
    Object v11 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = "clas2";
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v5).requiresSpecificParent();
    Object v7 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v6));
    Object v8 = ((org.jsoup.parser.Tag)v3).canContainBlock();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = "head";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v5).hashCode();
    Object v7 = ((org.jsoup.parser.Tag)v5).getImplicitParent();
    Object v8 = ((org.jsoup.parser.Tag)v7).requiresSpecificParent();
    Object v9 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v8));
    Object v10 = "img";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "img";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "img";
    Object v15 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v14));
    Object v16 = "img";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "img";
    Object v19 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v18));
    Object v20 = ((org.jsoup.parser.Tag)v17).isValidAncestor(((org.jsoup.parser.Tag)v19));
    Object v21 = ((org.jsoup.parser.Tag)v15).equals(((java.lang.Object)v20));
    Object v22 = ((org.jsoup.parser.Tag)v13).isValidAncestor(((org.jsoup.parser.Tag)v15));
    Object v23 = ((org.jsoup.parser.Tag)v11).equals(((java.lang.Object)v22));
    Object v24 = ((org.jsoup.parser.Tag)v11).getImplicitParent();
    Object v25 = ((org.jsoup.parser.Tag)v3).canContain(((org.jsoup.parser.Tag)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = ((org.jsoup.parser.Tag)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(-1942578474), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).isBlock();
    Object v5 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v4));
    Object v6 = ((org.jsoup.parser.Tag)v1).isInline();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "clas2";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.Tag)v5).isValidAncestor(((org.jsoup.parser.Tag)v7));
    Object v9 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v8));
    Object v10 = ((org.jsoup.parser.Tag)v3).getImplicitParent();
    Object v11 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = ((org.jsoup.parser.Tag)v3).hashCode();
    Object v5 = ((org.jsoup.parser.Tag)v3).canContainBlock();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).toString();
    Object v5 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v4));
    Object v6 = "(";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isInline();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).requiresSpecificParent();
    Object v5 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v4));
    Object v6 = ((org.jsoup.parser.Tag)v1).isInline();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v5).hashCode();
    Object v7 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = ((org.jsoup.parser.Tag)v3).getImplicitParent();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "head";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = ((org.jsoup.parser.Tag)v2).isInline();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "V";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = "(";
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.Tag)v2).isValidAncestor(((org.jsoup.parser.Tag)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = ((org.jsoup.parser.Tag)v2).hashCode();
    Object v4 = ((org.jsoup.parser.Tag)v2).isInline();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "clas2";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = ((org.jsoup.parser.Tag)v5).isValidAncestor(((org.jsoup.parser.Tag)v7));
    Object v9 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v8));
    Object v10 = ((org.jsoup.parser.Tag)v3).getImplicitParent();
    Object v11 = "clas2";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = ((org.jsoup.parser.Tag)v12).requiresSpecificParent();
    Object v14 = ((org.jsoup.parser.Tag)v10).equals(((java.lang.Object)v13));
    Object v15 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v10));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "V";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isInline();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).getImplicitParent();
    Object v5 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "clas2";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Tag)v3).isValidAncestor(((org.jsoup.parser.Tag)v5));
    Object v7 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v6));
    Object v8 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v9 = ((org.jsoup.parser.Tag)v8).hashCode();
    Object v10 = "head";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = ((org.jsoup.parser.Tag)v11).hashCode();
    Object v13 = ((org.jsoup.parser.Tag)v11).getImplicitParent();
    Object v14 = ((org.jsoup.parser.Tag)v8).canContain(((org.jsoup.parser.Tag)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "(";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = ((org.jsoup.parser.Tag)v2).toString();
    org.junit.Assert.assertEquals((Object)("body"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = "(";
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.Tag)v2).canContain(((org.jsoup.parser.Tag)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = ((org.jsoup.parser.Tag)v2).requiresSpecificParent();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "V";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = "head";
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "OL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v4 = ((org.jsoup.parser.Tag)v3).hashCode();
    Object v5 = "clas2";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.Tag)v6).isBlock();
    Object v8 = ((org.jsoup.parser.Tag)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "`";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "V";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "OL";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "OL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "OL";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getName();
    org.junit.Assert.assertEquals((Object)("clas2"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "`";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "OL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "V";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getName();
    org.junit.Assert.assertEquals((Object)("v"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "V";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).requiresSpecificParent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = ((org.jsoup.parser.Tag)v2).isBlock();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = ",";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = "`";
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3));
    Object v5 = "clas2";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.Tag)v6).getImplicitParent();
    Object v8 = ((org.jsoup.parser.Tag)v7).isInline();
    Object v9 = ((org.jsoup.parser.Tag)v4).equals(((java.lang.Object)v8));
    Object v10 = ((org.jsoup.parser.Tag)v2).isValidAncestor(((org.jsoup.parser.Tag)v4));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "`";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "V";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(-916696726), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "head";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).hashCode();
    Object v5 = ((org.jsoup.parser.Tag)v3).getImplicitParent();
    Object v6 = ((org.jsoup.parser.Tag)v5).hashCode();
    Object v7 = ((org.jsoup.parser.Tag)v5).canContainBlock();
    Object v8 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = ",";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "clas2";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v3).getImplicitParent();
    Object v5 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "https";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "https";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).requiresSpecificParent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "clas2";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    Object v3 = ((org.jsoup.parser.Tag)v2).getImplicitParent();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "abs:href";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "htt";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "https";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).hashCode();
    Object v3 = "body";
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.Tag)v1).isValidAncestor(((org.jsoup.parser.Tag)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "`";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "abs:href";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).canContain(((org.jsoup.parser.Tag)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "OL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "https";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = ((org.jsoup.parser.Tag)v1).equals(((java.lang.Object)v3));
    Object v5 = ((org.jsoup.parser.Tag)v1).isData();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = ",";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = ">";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "abs:href";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = ((org.jsoup.parser.Tag)v1).getImplicitParent();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "\"";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }
}
