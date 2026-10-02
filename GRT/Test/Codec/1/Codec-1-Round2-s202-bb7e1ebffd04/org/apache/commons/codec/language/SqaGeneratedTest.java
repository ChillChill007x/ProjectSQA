package org.apache.commons.codec.language;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "y";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("Y"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("B"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "B";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("B"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "B";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("B"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "RFC 1522 violation: charset not spe2ified";
    Object v2 = "k";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "TCH";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("X"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "r";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "ET";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("ET"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "J";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("J"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "AE[IOU";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("E"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "y";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("Y"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "M";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("M"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("UTF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "B";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "SSCH";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("SK"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "&I";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 13;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "SIO";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("X"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 0;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "IB";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("IB"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 65;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "S";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "SI&";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("S"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SjA";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "&I";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "&I";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "ObjecWs of type ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("OBJK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "111111111";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "r";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = "ET";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("ET"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "IB";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("IB"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "ILLO";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("IL"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SIA";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("X"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "S-";
    Object v2 = "EIY";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "111111111";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "l2";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "J";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("J"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "3";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("3"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("UTF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "SIA";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("X"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "3";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("3"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "KN";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "B";
    Object v2 = "FX";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "B";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("B"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 1;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "A<";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("A"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "SIA";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).encode(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("X"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = ",H";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "TCH";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("X"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "HIM";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("HM"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "R";
    Object v2 = "BIY";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "ti?";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "kGY";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "B";
    Object v3 = "FX";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v1).isMetaphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "B";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("B"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "X";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("X"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "G=?";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "s";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = "N";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("N"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "tio";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("X"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = -60;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "B";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("B"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = -60;
    ((org.apache.commons.codec.language.Metaphone)v1).setMaxCodeLen((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = "B";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("B"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "ILLO";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "PS";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("PS"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "X";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("X"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "ObjecWs of type ";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("OBJK"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "KN";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("N"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SIA";
    Object v2 = "US-}ASCII";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = "IB";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("IB"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "S";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("S"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "2g";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 1;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " C%";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 61;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "I";
    Object v2 = "#";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 1;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "HIM";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("M"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = -61;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "O8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = " C%";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("K"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("UTF"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTF-";
    Object v2 = "OGGI";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v1).getMaxCodeLen();
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "X";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("X"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "k";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Y3";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "WITZ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("WTS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Parameter supplid to Base64 encode is not a byte[]";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PRMT"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = "AGG";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "w";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("W"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "B";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = "SSCH";
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("SK"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = ",H";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " cannot be decodd using BCodec";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "S";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = 1;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "pN";
    Object v2 = "WICZ";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " Q";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = "EWSK";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "B";
    Object v2 = "PS";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "E";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("E"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "s";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = "N";
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("N"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = 1;
    ((org.apache.commons.codec.language.Metaphone)v3).setMaxCodeLen((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = "A<";
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("A"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "01360240043788015936020505";
    Object v2 = "CIA";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 1;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "CZ";
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "^TF-8";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("TF"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UB";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "G";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("G"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "US-ASmCII";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "O8";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = new org.apache.commons.codec.language.Metaphone();
    Object v7 = " C%";
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v6).metaphone(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)("K"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "US-ASCII";
    Object v2 = "CIA";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = "AE[IOU";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).encode(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("E"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "WITZ";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("TS"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "s";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = "N";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("N"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "TGN";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "B";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("B"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "ORCHI]";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ORX"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = " Q";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("K"), v4);
  }
}
