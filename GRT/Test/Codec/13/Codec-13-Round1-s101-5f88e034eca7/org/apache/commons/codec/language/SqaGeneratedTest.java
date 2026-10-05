package org.apache.commons.codec.language;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = 3;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "]";
    Object v1 = -6;
    Object v2 = -6;
    Object v3 = new java.lang.String[]{"","A"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Objects of type ";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("APJK"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Z";
    Object v2 = "UTF-8";
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "]";
    Object v2 = -6;
    Object v3 = -6;
    Object v4 = new java.lang.String[]{"","A"};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "Objects of type ";
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).doubleMetaphone(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)("APK"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "E";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "}";
    Object v1 = 19;
    Object v2 = 33;
    Object v3 = new java.lang.String[]{"A","de"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "_";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "A";
    Object v1 = 1;
    Object v2 = 6;
    Object v3 = new java.lang.String[]{"^cougth","cby"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = 1;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "_";
    Object v3 = 1;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).charAt(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "^tough";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("TF"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "(\\s+";
    Object v1 = -4;
    Object v2 = 4;
    Object v3 = new java.lang.String[]{"I",". But actually it was of the type ","ORCHID"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "tio";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    Object v3 = "ObjectsFof type ";
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("APJK"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "[aeiou]";
    Object v2 = "g";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v5 = "tio";
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v4).doubleMetaphone(((java.lang.String)v5));
    Object v7 = "ObjectsFof type ";
    Object v8 = ((org.apache.commons.codec.language.DoubleMetaphone)v4).encode(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)("APK"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "E";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "y";
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = new java.lang.String[]{"$5$","EWSKY"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "p";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "T";
    Object v5 = 0;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)84)), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Zp";
    Object v2 = "2";
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "//";
    Object v6 = false;
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "K";
    Object v1 = 61;
    Object v2 = 52;
    Object v3 = new java.lang.String[]{"TH","SH"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "(\\s+";
    Object v2 = -4;
    Object v3 = 4;
    Object v4 = new java.lang.String[]{"I",". But actually it was of the type ","ORCHID"};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Q";
    Object v2 = 35;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "UTF-8";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("ATF"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "RR";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "}";
    Object v5 = 19;
    Object v6 = 33;
    Object v7 = new java.lang.String[]{"A","de"};
    Object v8 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((java.lang.String[])v7));
    Object v9 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "322";
    Object v1 = 1;
    Object v2 = -20;
    Object v3 = new java.lang.String[]{"U6CES","A","$apr1$"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "y";
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = new java.lang.String[]{"$5$","EWSKY"};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = "gB";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "UTF8";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "LL";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("L"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "$";
    Object v2 = "|";
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).getMaxCodeLen();
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = " in ";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)105)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = 10;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "$5$";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v5 = " in ";
    Object v6 = 1;
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v4).charAt(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "'";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)39)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Malformed import stateme+nt '";
    Object v2 = 37;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "UTF8";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).doubleMetaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ATF"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "m+";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("M"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "#";
    Object v1 = 1;
    Object v2 = 2;
    Object v3 = new java.lang.String[]{"R\"le",""};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "A";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "p";
    Object v4 = true;
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("P"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "5";
    Object v2 = "9";
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "]";
    Object v6 = -6;
    Object v7 = -6;
    Object v8 = new java.lang.String[]{"","A"};
    Object v9 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((java.lang.String[])v8));
    Object v10 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Phoneme expression contains t '[' but does not end in ']'";
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = new java.lang.String[]{"UTFO-8","?"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "CT";
    Object v2 = -72;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "n+";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    Object v3 = "any";
    Object v4 = 1;
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)110)), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "The character is not mapped: ";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0XRK"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "de la";
    Object v1 = -55;
    Object v2 = -22;
    Object v3 = new java.lang.String[]{"SCH"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "/Z/";
    Object v1 = 41;
    Object v2 = 1;
    Object v3 = new java.lang.String[]{};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "$u";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "O\"O";
    Object v2 = "F";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "UTF-8";
    Object v2 = 57;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "./0123456789ABCDEF-HIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PKTF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "cy";
    Object v2 = "ME";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "O\"O";
    Object v3 = "F";
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).isDoubleMetaphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "SHA-1";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("X"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "S";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("S"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "D";
    Object v1 = 0;
    Object v2 = 27;
    Object v3 = new java.lang.String[]{"~","US-ASC9I"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "/";
    Object v2 = "EIS";
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v6 = "Malformed import stateme+nt '";
    Object v7 = 37;
    Object v8 = ((org.apache.commons.codec.language.DoubleMetaphone)v5).charAt(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "!";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "$";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "K";
    Object v1 = 17;
    Object v2 = -3;
    Object v3 = new java.lang.String[]{"P","Parameter supplied to Caverphone encode is not of type java.lang.String",""};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "~";
    Object v2 = -9;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = -92;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = 4;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "SCH";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)83)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "EIY";
    Object v1 = -14;
    Object v2 = 0;
    Object v3 = new java.lang.String[]{"Qde","2"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "\"";
    Object v1 = 59;
    Object v2 = 0;
    Object v3 = new java.lang.String[]{};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "L3";
    Object v2 = 31;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Parameter supplied to Base-N de";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("PRMT"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "d";
    Object v2 = " cannot be decoded using Q codec";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "mark/reset not supported";
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("MRKR"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "[#&]";
    Object v2 = -32;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "rouns=";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("RNS"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "TS";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("TS"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Parameter supplied tb Metaphone encode is not of type java.lang.String";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("PRMT"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "8";
    Object v2 = "E";
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "NeGgative skip length: ";
    Object v1 = 1;
    Object v2 = -23;
    Object v3 = new java.lang.String[]{""};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = ")";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "D";
    Object v2 = 0;
    Object v3 = 27;
    Object v4 = new java.lang.String[]{"~","US-ASC9I"};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "/*";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "K";
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("K"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = -21;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v4 = "Malformed import stateme+nt '";
    Object v5 = 37;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v3).charAt(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "*z";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("S"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "A|";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("A"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "E";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    Object v3 = "c";
    Object v4 = false;
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("K"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "s2";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)50)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "E";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).doubleMetaphone(((java.lang.String)v2));
    Object v4 = "c";
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).doubleMetaphone(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("K"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "SHA-256";
    Object v1 = 35;
    Object v2 = 0;
    Object v3 = new java.lang.String[]{"Ig","AU"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "3";
    Object v1 = 25;
    Object v2 = 1;
    Object v3 = new java.lang.String[]{""};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = 1;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "$1";
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v4 = "8";
    Object v5 = "E";
    Object v6 = false;
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v3).isDoubleMetaphoneEqual(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "O";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("A"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "^toug ";
    Object v2 = "d";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "MM";
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("M"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "n+";
    Object v2 = "d";
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "n";
    Object v6 = true;
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("N"), v7);
  }
}
