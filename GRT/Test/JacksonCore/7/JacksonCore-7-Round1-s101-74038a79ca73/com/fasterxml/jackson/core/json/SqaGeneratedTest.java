package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).getParent();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildObjectContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).getCurrentName();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.JsonStreamContext)v1).getCurrentName();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v1).inObject();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.JsonStreamContext)v1).inRoot();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).getCurrentIndex();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.JsonStreamContext)v1).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("ARRAY"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildArrayContext();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).setCurrentValue(((java.lang.Object)v4));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).writeValue();
    org.junit.Assert.assertEquals((Object)(5), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = new java.lang.StringBuilder();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).appendDesc(((java.lang.StringBuilder)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).inObject();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildArrayContext();
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).getCurrentName();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).inObject();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).setCurrentValue(((java.lang.Object)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildArrayContext();
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).getCurrentName();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).inObject();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).setCurrentValue(((java.lang.Object)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v9 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v10 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v9).createChildArrayContext();
    Object v11 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v10).createChildArrayContext();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v8).setCurrentValue(((java.lang.Object)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).writeValue();
    org.junit.Assert.assertEquals((Object)(5), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildArrayContext();
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).getCurrentName();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).inObject();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).setCurrentValue(((java.lang.Object)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v9 = ((com.fasterxml.jackson.core.JsonStreamContext)v8).inObject();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).inRoot();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).getCurrentName();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.JsonStreamContext)v1).inArray();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = new java.lang.StringBuilder();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).appendDesc(((java.lang.StringBuilder)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = "write a raw (unencoded) value";
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).writeFieldName(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = new java.lang.StringBuilder();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).appendDesc(((java.lang.StringBuilder)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).getParent();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).inRoot();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).getParent();
    Object v4 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).inArray();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).getCurrentName();
    Object v4 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).inArray();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = "Trying to call same allocYXxx() method second time";
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).writeFieldName(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).writeValue();
    Object v5 = 5;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.JsonStreamContext)v1).inObject();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildArrayContext();
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).getTypeDesc();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).setCurrentValue(((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).writeValue();
    Object v5 = 5;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.JsonStreamContext)v6).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("?"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).toString();
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v5).inArray();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = "UTF-16BE";
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).writeFieldName(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.JsonStreamContext)v3).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("ARRAY"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).toString();
    Object v6 = new java.lang.StringBuilder();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).appendDesc(((java.lang.StringBuilder)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.JsonStreamContext)v1).getEntryCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).inObject();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.JsonStreamContext)v3).getParent();
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v3).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("OBJECT"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v5).getCurrentName();
    Object v7 = ((com.fasterxml.jackson.core.JsonStreamContext)v5).getCurrentIndex();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v5).inRoot();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.JsonStreamContext)v3).getParent();
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v3).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("ARRAY"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = "Illeg";
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).writeFieldName(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v5).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("ARRAY"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildObjectContext();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).getCurrentName();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).getEntryCount();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).toString();
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).toString();
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).getParent();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildObjectContext();
    Object v5 = new java.lang.StringBuilder();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).appendDesc(((java.lang.StringBuilder)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = "tru#";
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).writeFieldName(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = -31;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = -31;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.core.JsonStreamContext)v7).getCurrentIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).writeValue();
    Object v5 = 5;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = "Unrecognized token ";
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).writeFieldName(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = -31;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.StringBuilder();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v7).appendDesc(((java.lang.StringBuilder)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = 64;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).reset((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).createChildArrayContext();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = 31;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).createChildObjectContext();
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).writeValue();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).writeValue();
    org.junit.Assert.assertEquals((Object)(5), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildObjectContext();
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).reset((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("ARRAY"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).toString();
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.JsonStreamContext)v6).inArray();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildObjectContext();
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).createChildObjectContext();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = 31;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.core.JsonStreamContext)v7).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("?"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).createChildArrayContext();
    Object v7 = ((com.fasterxml.jackson.core.JsonStreamContext)v6).getTypeDesc();
    org.junit.Assert.assertEquals((Object)("ARRAY"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = 31;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v7).writeValue();
    Object v9 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v7).createChildObjectContext();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).toString();
    org.junit.Assert.assertEquals((Object)("/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.JsonStreamContext)v3).getCurrentName();
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v3).inRoot();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).inArray();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildObjectContext();
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).createChildObjectContext();
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v10 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v9).createChildArrayContext();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v8),((java.lang.Object)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 3;
    Object v14 = null;
    Object v15 = new java.io.ByteArrayOutputStream();
    Object v16 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)65),Byte.valueOf((byte)18)};
    Object v17 = -36;
    Object v18 = false;
    Object v19 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v12),(((java.lang.Integer)v13).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v14),((java.io.OutputStream)v15),((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.fasterxml.jackson.core.json.DupDetector.rootDetector(((com.fasterxml.jackson.core.JsonGenerator)v19));
    Object v21 = "]";
    Object v22 = ((com.fasterxml.jackson.core.json.DupDetector)v20).isDup(((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v7).withDupDetector(((com.fasterxml.jackson.core.json.DupDetector)v20));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = "InputStream.read() rtturned 0 characters when trying to read ";
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).writeFieldName(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = 64;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.JsonStreamContext)v6).getCurrentIndex();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).toString();
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).toString();
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).getParent();
    Object v9 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v8).writeValue();
    org.junit.Assert.assertEquals((Object)(5), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = ((com.fasterxml.jackson.core.JsonStreamContext)v5).inRoot();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 3;
    Object v6 = null;
    Object v7 = new java.io.ByteArrayOutputStream();
    Object v8 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)65),Byte.valueOf((byte)18)};
    Object v9 = -36;
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v4),(((java.lang.Integer)v5).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v6),((java.io.OutputStream)v7),((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.fasterxml.jackson.core.json.DupDetector.rootDetector(((com.fasterxml.jackson.core.JsonGenerator)v11));
    Object v13 = ((com.fasterxml.jackson.core.json.DupDetector)v12).child();
    Object v14 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext(((com.fasterxml.jackson.core.json.DupDetector)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).getEntryCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = -31;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v9 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v10 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v9).createChildArrayContext();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v8),((java.lang.Object)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 3;
    Object v14 = null;
    Object v15 = new java.io.ByteArrayOutputStream();
    Object v16 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)65),Byte.valueOf((byte)18)};
    Object v17 = -36;
    Object v18 = false;
    Object v19 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v12),(((java.lang.Integer)v13).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v14),((java.io.OutputStream)v15),((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.fasterxml.jackson.core.json.DupDetector.rootDetector(((com.fasterxml.jackson.core.JsonGenerator)v19));
    ((com.fasterxml.jackson.core.json.DupDetector)v20).reset();
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v7).withDupDetector(((com.fasterxml.jackson.core.json.DupDetector)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).toString();
    Object v7 = new java.lang.StringBuilder();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).appendDesc(((java.lang.StringBuilder)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildObjectContext();
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).writeValue();
    org.junit.Assert.assertEquals((Object)(5), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).toString();
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).writeFieldName(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = -31;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v7).createChildObjectContext();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = " in a comment";
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).writeFieldName(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildObjectContext();
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).createChildObjectContext();
    Object v8 = ((com.fasterxml.jackson.core.JsonStreamContext)v7).getCurrentIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).createChildArrayContext();
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).createChildObjectContext();
    Object v8 = ((com.fasterxml.jackson.core.JsonStreamContext)v7).inObject();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).setCurrentValue(((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).writeFieldName(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 2;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildObjectContext();
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).createChildArrayContext();
    Object v7 = ((com.fasterxml.jackson.core.JsonStreamContext)v6).getParent();
    Object v8 = ((com.fasterxml.jackson.core.JsonStreamContext)v6).getCurrentIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildObjectContext();
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).createChildObjectContext();
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).createChildArrayContext();
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v6).writeValue();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = ((com.fasterxml.jackson.core.JsonStreamContext)v2).inRoot();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildArrayContext();
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v8 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v7).createChildArrayContext();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 3;
    Object v12 = null;
    Object v13 = new java.io.ByteArrayOutputStream();
    Object v14 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)65),Byte.valueOf((byte)18)};
    Object v15 = -36;
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v10),(((java.lang.Integer)v11).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v12),((java.io.OutputStream)v13),((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.core.json.DupDetector.rootDetector(((com.fasterxml.jackson.core.JsonGenerator)v17));
    Object v19 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).withDupDetector(((com.fasterxml.jackson.core.json.DupDetector)v18));
    Object v20 = new java.lang.StringBuilder();
    ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).appendDesc(((java.lang.StringBuilder)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).createChildArrayContext();
    Object v6 = 1;
    Object v7 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v5).reset((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).createChildArrayContext();
    Object v4 = 77;
    Object v5 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v3).reset((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.JsonStreamContext)v4).getCurrentIndex();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
    Object v1 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v0).createChildArrayContext();
    Object v2 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v1).createChildObjectContext();
    Object v3 = 8;
    Object v4 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v2).reset((((java.lang.Integer)v3).intValue()));
    Object v5 = 64;
    Object v6 = ((com.fasterxml.jackson.core.json.JsonWriteContext)v4).reset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.core.JsonStreamContext)v6).inArray();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }
}
