package org.apache.commons.compress.archivers.sevenz;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = -7;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = ((java.io.File)v1).setReadable((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-10)};
    Object v1 = 15;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-86),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    ((org.apache.commons.compress.archivers.sevenz.SevenZFile)v0).close();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getAbsoluteFile();
    Object v3 = new byte[]{};
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-6),Byte.valueOf((byte)-36)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getName();
    Object v3 = new byte[]{};
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = false;
    Object v4 = ((java.io.File)v1).setReadable((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new byte[]{};
    Object v6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 5;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)26),Byte.valueOf((byte)24),Byte.valueOf((byte)1)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = true;
    Object v4 = ((java.io.File)v1).setExecutable((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new byte[]{};
    Object v6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -11;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)19),Byte.valueOf((byte)-32)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-35),Byte.valueOf((byte)11),Byte.valueOf((byte)28)};
    Object v1 = 19;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-26),Byte.valueOf((byte)8)};
    Object v1 = -18;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)32),Byte.valueOf((byte)0)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getParent();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-36)};
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = ((java.io.File)v1).setWritable((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)2)};
    Object v5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)13),Byte.valueOf((byte)0)};
    Object v1 = -9;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.apache.commons.compress.archivers.sevenz.SevenZFile)v0).getNextEntry();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)59),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = -3;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-27),Byte.valueOf((byte)1),Byte.valueOf((byte)6)};
    Object v1 = 12;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)51),Byte.valueOf((byte)32)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-106)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 9;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -19;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)53)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = ((java.io.File)v1).setExecutable((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)14)};
    Object v1 = 43;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = ((java.io.File)v1).setWritable((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 255;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1),Byte.valueOf((byte)23)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)-49)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)25),Byte.valueOf((byte)27)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    ((java.io.File)v1).deleteOnExit();
    Object v2 = null;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)14),Byte.valueOf((byte)22)};
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)22),Byte.valueOf((byte)113)};
    Object v1 = -22;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-1)};
    Object v1 = -2;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)33),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)0),Byte.valueOf((byte)-44)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = -9;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-7),Byte.valueOf((byte)35),Byte.valueOf((byte)-29)};
    Object v1 = -16;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)13)};
    Object v1 = 30;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getFreeSpace();
    Object v3 = new byte[]{};
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-20),Byte.valueOf((byte)4),Byte.valueOf((byte)25)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)-1)};
    Object v1 = -27;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = 3;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)45),Byte.valueOf((byte)3)};
    Object v1 = -4;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-4),Byte.valueOf((byte)22)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)46)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)8),Byte.valueOf((byte)0)};
    Object v1 = 940;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 7;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)0),Byte.valueOf((byte)-1)};
    Object v1 = 23;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)10)};
    Object v1 = 55;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)4)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).toURI();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)10)};
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-3)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -22;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)-18)};
    Object v1 = 12;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-8),Byte.valueOf((byte)9),Byte.valueOf((byte)8)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-10)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)24),Byte.valueOf((byte)8)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)-25)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)68),Byte.valueOf((byte)-24)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = true;
    Object v4 = ((java.io.File)v1).setReadable((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)29)};
    Object v6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v5));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-27),Byte.valueOf((byte)16)};
    Object v1 = 22;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = -6;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-1),Byte.valueOf((byte)-16)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)42),Byte.valueOf((byte)-5),Byte.valueOf((byte)14)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getParent();
    Object v3 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-39),Byte.valueOf((byte)67)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 36;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)50),Byte.valueOf((byte)25)};
    Object v1 = 11;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = -5;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)1)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 16;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)-13)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 2;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-48),Byte.valueOf((byte)47)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)101),Byte.valueOf((byte)-1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.apache.commons.compress.archivers.sevenz.SevenZFile)v0).getEntries();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)34),Byte.valueOf((byte)-1)};
    Object v1 = -47;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)34),Byte.valueOf((byte)28),Byte.valueOf((byte)8)};
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(((java.io.File)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = -22;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)-19),Byte.valueOf((byte)0)};
    Object v2 = -22;
    Object v3 = 1;
    Object v4 = ((org.apache.commons.compress.archivers.sevenz.SevenZFile)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)29)};
    Object v1 = 8;
    Object v2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }
}
