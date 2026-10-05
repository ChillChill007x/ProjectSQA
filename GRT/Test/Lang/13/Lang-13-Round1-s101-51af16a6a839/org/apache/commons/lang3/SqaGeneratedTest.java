package org.apache.commons.lang3;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 2;
    Object v5 = org.apache.commons.lang3.time.DateUtils.setSeconds(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5),((java.io.OutputStream)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v3),((java.io.OutputStream)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v4),((java.io.OutputStream)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = 15;
    ((java.io.OutputStream)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5),((java.io.OutputStream)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-3),Byte.valueOf((byte)-38)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5),((java.io.OutputStream)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-7)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-6)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6),((java.io.OutputStream)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-13),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)0),Byte.valueOf((byte)-34)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v7),((java.io.OutputStream)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.lang3.SerializationUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = -33;
    ((java.io.OutputStream)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5),((java.io.OutputStream)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = -7;
    ((java.io.OutputStream)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5),((java.io.OutputStream)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)48)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = new java.io.ByteArrayOutputStream();
    Object v6 = new byte[]{};
    ((java.io.OutputStream)v5).write(((byte[])v6));
    Object v7 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v4),((java.io.OutputStream)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)16)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v8),((java.io.OutputStream)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-20),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    Object v3 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)6)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-10)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v9),((java.io.OutputStream)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)22)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)8)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v7),((java.io.OutputStream)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6),((java.io.OutputStream)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = new java.io.ByteArrayOutputStream();
    Object v9 = 1;
    ((java.io.OutputStream)v8).write((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v7),((java.io.OutputStream)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-15)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)8)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v8),((java.io.OutputStream)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = new java.io.ByteArrayOutputStream();
    Object v6 = 1;
    ((java.io.OutputStream)v5).write((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v4),((java.io.OutputStream)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v9),((java.io.OutputStream)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10),((java.io.OutputStream)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-40),Byte.valueOf((byte)33)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10),((java.io.OutputStream)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)44)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-26)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)22)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)13)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)29)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10));
    Object v12 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v11),((java.io.OutputStream)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-13)};
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10));
    Object v12 = new java.io.ByteArrayOutputStream();
    Object v13 = -1;
    ((java.io.OutputStream)v12).write((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v11),((java.io.OutputStream)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)55),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = new java.io.ByteArrayOutputStream();
    Object v7 = 0;
    ((java.io.OutputStream)v6).write((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5),((java.io.OutputStream)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-66)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = new byte[]{Byte.valueOf((byte)-7)};
    ((java.io.OutputStream)v11).write(((byte[])v12));
    Object v13 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10),((java.io.OutputStream)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-9),Byte.valueOf((byte)-9)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)35),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)43)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-32)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    Object v12 = 50;
    ((java.io.OutputStream)v11).write((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10),((java.io.OutputStream)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -23L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)1),Byte.valueOf((byte)31)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10));
    Object v12 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = new java.io.ByteArrayOutputStream();
    Object v10 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)6)};
    ((java.io.OutputStream)v9).write(((byte[])v10));
    Object v11 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v8),((java.io.OutputStream)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v10));
    Object v12 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)-44)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)12),Byte.valueOf((byte)-6)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v10));
    Object v12 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.io.ByteArrayOutputStream();
    Object v5 = 2;
    ((java.io.OutputStream)v4).write((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v3),((java.io.OutputStream)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)47)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v8));
    Object v10 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v9));
    Object v11 = new java.io.ByteArrayOutputStream();
    org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v10),((java.io.OutputStream)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -32L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.deserialize(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)22)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)33)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-9)};
    Object v1 = org.apache.commons.lang3.SerializationUtils.deserialize(((byte[])v0));
      org.junit.Assert.fail("Expected org.apache.commons.lang3.SerializationException");
    } catch (org.apache.commons.lang3.SerializationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1;
    Object v1 = -7;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v3));
    Object v5 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v4));
    Object v6 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v5));
    Object v7 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v6));
    Object v8 = org.apache.commons.lang3.SerializationUtils.clone(((java.io.Serializable)v7));
    Object v9 = org.apache.commons.lang3.SerializationUtils.serialize(((java.io.Serializable)v8));
    org.junit.Assert.assertNotNull(v9);
  }
}
