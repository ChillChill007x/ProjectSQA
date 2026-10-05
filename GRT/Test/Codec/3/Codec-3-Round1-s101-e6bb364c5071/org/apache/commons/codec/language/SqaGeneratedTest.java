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
    Object v1 = 0;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "]";
    Object v1 = -6;
    Object v2 = -6;
    Object v3 = new java.lang.String[]{"UTF-","N"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Invalid quoted-printable encoding";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("ANFL"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Z";
    Object v2 = "UTF-16BE";
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
    Object v4 = new java.lang.String[]{"UTF-","N"};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "Z";
    Object v3 = "UTF-16BE";
    Object v4 = true;
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).isDoubleMetaphoneEqual(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("P"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "T}";
    Object v1 = 19;
    Object v2 = 15;
    Object v3 = new java.lang.String[]{"N","Objects of type "};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "2_n";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)95)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "w$";
    Object v1 = 1;
    Object v2 = 6;
    Object v3 = new java.lang.String[]{"3t","bS"};
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
    Object v2 = "2_n";
    Object v3 = 1;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).charAt(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "^y3";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "(ACH";
    Object v1 = 3;
    Object v2 = 3;
    Object v3 = new java.lang.String[]{"B","DANGER","TCH"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "K";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    Object v3 = " cannotFbe decoded using Q codec";
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("KNTF"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "w";
    Object v2 = "SHA-g512";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v5 = "K";
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v4).doubleMetaphone(((java.lang.String)v5));
    Object v7 = " cannotFbe decoded using Q codec";
    Object v8 = ((org.apache.commons.codec.language.DoubleMetaphone)v4).encode(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)("NTF"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "w$";
    Object v2 = 1;
    Object v3 = 6;
    Object v4 = new java.lang.String[]{"3t","bS"};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "T}";
    Object v2 = 19;
    Object v3 = 15;
    Object v4 = new java.lang.String[]{"N","Objects of type "};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = 2;
    Object v3 = new java.lang.String[]{"UTF-8","X"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "CI";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "CI";
    Object v5 = 0;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)67)), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "ZM";
    Object v2 = "UCCES";
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "AEIOU";
    Object v6 = false;
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("A"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "C";
    Object v1 = 58;
    Object v2 = 34;
    Object v3 = new java.lang.String[]{"UY",""};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "(ACH";
    Object v2 = 3;
    Object v3 = 3;
    Object v4 = new java.lang.String[]{"B","DANGER","TCH"};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Q";
    Object v2 = 97;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "UTF-16LE";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("ATFL"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "O";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "T}";
    Object v5 = 19;
    Object v6 = 15;
    Object v7 = new java.lang.String[]{"N","Objects of type "};
    Object v8 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((java.lang.String[])v7));
    Object v9 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "3l3";
    Object v1 = 1;
    Object v2 = -20;
    Object v3 = new java.lang.String[]{"6","Wh3","UTF-8"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "C";
    Object v2 = 58;
    Object v3 = 34;
    Object v4 = new java.lang.String[]{"UY",""};
    Object v5 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.String[])v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = "gSH";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "UTF-16E";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "ARCHIT";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("ARKT"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "f";
    Object v2 = "Objects of type ";
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "K";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).doubleMetaphone(((java.lang.String)v2));
    Object v4 = " cannotFbe decoded using Q codec";
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).encode(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("NTF"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Objects of type ";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)98)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "S";
    Object v2 = 72;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "UTF-";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v5 = "Objects of type ";
    Object v6 = 1;
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v4).charAt(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "EIY";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)69)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Objects o+f type ";
    Object v2 = 37;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "C";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("K"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "trouf";
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = new java.lang.String[]{"\"cannot be encoded using BCodec",""};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "N";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "2np";
    Object v4 = true;
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("NP"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Input array too big, the output array would be bigger5(";
    Object v2 = "[^";
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "]";
    Object v6 = -6;
    Object v7 = -6;
    Object v8 = new java.lang.String[]{"UTF-","N"};
    Object v9 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((java.lang.String[])v8));
    Object v10 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "m2";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)109)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Objects of ttpe ";
    Object v1 = 1;
    Object v2 = 2;
    Object v3 = new java.lang.String[]{"UTFO-16LE","?"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "VONT";
    Object v2 = -72;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "I";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    Object v3 = "TIO";
    Object v4 = 1;
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)73)), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "PN";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("N"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).getMaxCodeLen();
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Objects of type ";
    Object v1 = -55;
    Object v2 = -21;
    Object v3 = new java.lang.String[]{"SUGAR"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "AEIOZU";
    Object v1 = 103;
    Object v2 = 4;
    Object v3 = new java.lang.String[]{};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Input array too big,u the output array would be bigger (";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ANPT"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Z\"";
    Object v2 = " C";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "UTF-8";
    Object v2 = 57;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "-TF-8";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "S";
    Object v2 = "SIO";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "UTF-8";
    Object v3 = 57;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).charAt(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "S";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("S"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "IR";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AR"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "D";
    Object v1 = 0;
    Object v2 = 27;
    Object v3 = new java.lang.String[]{"A","ISO-8859-9"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "AEIO";
    Object v2 = "ALLS";
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "trouf";
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.lang.String[]{"\"cannot be encoded using BCodec",""};
    Object v9 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((java.lang.String[])v8));
    Object v10 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "^!gn";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("KN"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Parameter supplied to Base64 encode is not a byte[]";
    Object v2 = 1;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)97)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "p";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)112)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "CI";
    Object v1 = 17;
    Object v2 = -1;
    Object v3 = new java.lang.String[]{"CK","3","ph"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "~";
    Object v2 = -9;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = -92;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = 8;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "SUGAR";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)83)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "ALLE";
    Object v1 = -17;
    Object v2 = 0;
    Object v3 = new java.lang.String[]{"Objects oQf type ","UCCES"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = 59;
    Object v2 = 0;
    Object v3 = new java.lang.String[]{};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "EY";
    Object v2 = 0;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)69)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "U";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("A"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "F";
    Object v2 = "RFC 1522 violation: encoding token not found";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "UTF-8";
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("ATF"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Z#I";
    Object v2 = -32;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = ":";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "SK";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("SK"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Ab";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("AP"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "8";
    Object v2 = "B";
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "UTFG-8";
    Object v1 = 4;
    Object v2 = -23;
    Object v3 = new java.lang.String[]{""};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "01230120022455012623010202";
    Object v2 = false;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "^!gn";
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).doubleMetaphone(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)("N"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "IL";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "C";
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("K"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = -19;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "trouf";
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new java.lang.String[]{"\"cannot be encoded using BCodec",""};
    Object v7 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String[])v6));
    Object v8 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "*M";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("M"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "|";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = false;
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "M";
    Object v2 = 4;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).charAt(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v2 = "|";
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v1).doubleMetaphone(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "UTF-8";
    Object v1 = 36;
    Object v2 = 0;
    Object v3 = new java.lang.String[]{"Ig","SK"};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "^h";
    Object v1 = 25;
    Object v2 = 1;
    Object v3 = new java.lang.String[]{""};
    Object v4 = org.apache.commons.codec.language.DoubleMetaphone.contains(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.String[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = 1;
    ((org.apache.commons.codec.language.DoubleMetaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "UTF-";
    Object v4 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("A"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "e$";
    Object v2 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v4 = ":";
    Object v5 = true;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v3).doubleMetaphone(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "TCH";
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("X"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.DoubleMetaphone();
    Object v1 = "Y ";
    Object v2 = "f+";
    Object v3 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).isDoubleMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "ARCHIT";
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.language.DoubleMetaphone)v0).doubleMetaphone(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)("ARKT"), v6);
  }
}
