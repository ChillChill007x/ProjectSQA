package org.apache.commons.codec.language;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = " cannot be encoded using Q codec";
    Object v2 = ((org.apache.commons.codec.language.Soundex)v0).soundex(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("C531"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = "\"";
    Object v2 = "UTF-8b";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v0).difference(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = new org.apache.commons.codec.language.Soundex();
    Object v2 = ((org.apache.commons.codec.language.Soundex)v0).encode(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = "Imp4ossible modulus ";
    Object v2 = ((org.apache.commons.codec.language.Soundex)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("I512"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = 0;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = "/*c";
    Object v2 = ((org.apache.commons.codec.language.Soundex)v0).soundex(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("C000"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = 15;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new org.apache.commons.codec.language.Soundex();
    Object v3 = "/*c";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v2).soundex(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = "DG";
    Object v2 = ((org.apache.commons.codec.language.Soundex)v0).soundex(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("D200"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = "common";
    Object v2 = ((org.apache.commons.codec.language.Soundex)v0).soundex(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("C550"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "2ch";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = "any";
    Object v2 = ((org.apache.commons.codec.language.Soundex)v0).soundex(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A500"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = -11;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).getMaxLength();
    org.junit.Assert.assertEquals((Object)(-11), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "W3";
    Object v3 = "\\s+";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).difference(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "sL";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new org.apache.commons.codec.language.Soundex();
    Object v3 = "any";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v2).soundex(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)("A000"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = -11;
    ((org.apache.commons.codec.language.Soundex)v3).setMaxLength((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.codec.language.Soundex)v3).getMaxLength();
    Object v7 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "s2";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "sia";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "]";
    Object v3 = "w3";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).difference(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = 9;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "UTF-t";
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "k";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = 59;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "H*LZ";
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "TF-8";
    Object v3 = "";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).difference(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "UT-8";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "";
    Object v3 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "This codec cannot";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "";
    Object v3 = "$";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).difference(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v6 = new org.apache.commons.codec.language.Soundex(((char[])v5));
    Object v7 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = ((org.apache.commons.codec.language.Soundex)v1).getMaxLength();
    org.junit.Assert.assertEquals((Object)(4), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "ZI";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "enou2f";
    Object v3 = "";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).difference(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "Z";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "=TK";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "SAHA-256";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "NN";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "MM";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = 1;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "(";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = "(";
    Object v5 = ((org.apache.commons.codec.language.Soundex)v3).soundex(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "MF";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.String)v2));
    Object v4 = "Objects of type ";
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = 34;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "^(PH|PF)";
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "SHA-R56";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = -2;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.codec.language.Soundex();
    Object v5 = "/*c";
    Object v6 = ((org.apache.commons.codec.language.Soundex)v4).soundex(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v5 = new org.apache.commons.codec.language.Soundex(((char[])v4));
    Object v6 = "(";
    Object v7 = ((org.apache.commons.codec.language.Soundex)v5).soundex(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Soundex)v3).encode(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Soundex();
    Object v1 = "de~a";
    Object v2 = ((org.apache.commons.codec.language.Soundex)v0).soundex(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("D000"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = " cannotKbe encoded using BCodec";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new org.apache.commons.codec.language.Soundex();
    Object v3 = "de~a";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v2).soundex(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "G0N";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "HMAC_5HA_256";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = " cannot be decoded using Q codec";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "G0N";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = 1;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new char[]{};
    Object v5 = new org.apache.commons.codec.language.Soundex(((char[])v4));
    Object v6 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "[+]";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = " cannotKbe encoded using BCodec";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v2));
    Object v4 = 1;
    ((org.apache.commons.codec.language.Soundex)v3).setMaxLength((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = "";
    Object v7 = ((org.apache.commons.codec.language.Soundex)v3).soundex(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Soundex)v3).soundex(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v5));
    Object v7 = "wh3";
    Object v8 = "Unable to resolve required resource:org/apache/commons/codec/language/bm/%s_lang.txt";
    Object v9 = ((org.apache.commons.codec.language.Soundex)v1).difference(((java.lang.String)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "ashN";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = " cannotKbe encoded using BCodec";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "ZA";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.String)v2));
    Object v4 = new char[]{};
    Object v5 = new org.apache.commons.codec.language.Soundex(((char[])v4));
    Object v6 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "UTF-16LE";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "0";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = " cannotKbe encoded using BCodec";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "WR";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Wd00"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "de";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "M";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "3{";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "G0N";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "HARAC";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = " cannotKbe encoded using BCodec";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "el";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("Ee00"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = " cannotKbe encoded using BCodec";
    Object v3 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = " in ";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)84),Character.valueOf((char)40)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "2";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    Object v4 = new char[]{Character.valueOf((char)0)};
    Object v5 = new org.apache.commons.codec.language.Soundex(((char[])v4));
    Object v6 = "3{";
    Object v7 = ((org.apache.commons.codec.language.Soundex)v5).soundex(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = " cannotKbe encoded using BCodec";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "TCH";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("TaK0"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = " cannotKbe encoded using BCodec";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = new org.apache.commons.codec.language.Soundex();
    Object v3 = "any";
    Object v4 = ((org.apache.commons.codec.language.Soundex)v2).soundex(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)("A000"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = 1;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "in ";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.codec.language.Soundex)v1).getMaxLength();
    org.junit.Assert.assertEquals((Object)(4), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = new org.apache.commons.codec.language.Soundex(((char[])v2));
    Object v4 = ((org.apache.commons.codec.language.Soundex)v3).getMaxLength();
    Object v5 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = 17;
    ((org.apache.commons.codec.language.Soundex)v1).setMaxLength((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = new org.apache.commons.codec.language.Soundex(((char[])v4));
    Object v6 = "";
    Object v7 = ((org.apache.commons.codec.language.Soundex)v5).soundex(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)54)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "d";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "The finalRules argument must not be null";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = new org.apache.commons.codec.language.Soundex(((char[])v0));
    Object v2 = "Z";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = " cannotKbe encoded using BCodec";
    Object v1 = new org.apache.commons.codec.language.Soundex(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Soundex)v1).soundex(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }
}
