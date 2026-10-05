package org.apache.commons.compress.archivers.sevenz;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = -19;
    Object v3 = 8;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getAbsoluteFile();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).finish();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)38),Byte.valueOf((byte)1)};
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)1),Byte.valueOf((byte)-1)};
    Object v2 = 0;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = -22;
    Object v3 = -37;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).close();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).closeArchiveEntry();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)74),Byte.valueOf((byte)10)};
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)30),Byte.valueOf((byte)-67)};
    Object v2 = 0;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "/";
    Object v5 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 10;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-48)};
    Object v2 = -17;
    Object v3 = 3;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = -6;
    Object v3 = -13;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).setContentCompression(((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).setContentCompression(((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getTotalSpace();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).setContentCompression(((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 46;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)11)};
    Object v2 = 1;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = true;
    Object v4 = true;
    Object v5 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 12;
    Object v3 = 8;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 1;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)28)};
    Object v2 = 0;
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = -31;
    Object v3 = 10;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v2 = 45;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = -35;
    Object v3 = 59;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = -14;
    Object v3 = 44;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "TRAILER!!!";
    Object v5 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.io.File)v3).getAbsoluteFile();
    Object v5 = "premature end of stream";
    Object v6 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v2 = 1;
    Object v3 = 8;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)43),Byte.valueOf((byte)-20)};
    Object v2 = 12;
    Object v3 = 12;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getParent();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isFile();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 7;
    Object v3 = 58;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)-46)};
    Object v2 = -24;
    Object v3 = 1042;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = false;
    Object v4 = ((java.io.File)v2).setExecutable((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).exists();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)13),Byte.valueOf((byte)0)};
    Object v2 = 2;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "EXPANDING_LEVEL_4";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isAbsolute();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)-28),Byte.valueOf((byte)-3)};
    Object v2 = 6;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getUsableSpace();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).hashCode();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.io.File)v3).hashCode();
    Object v5 = "";
    Object v6 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)62)};
    Object v2 = -32;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)-39),Byte.valueOf((byte)-20),Byte.valueOf((byte)-36)};
    Object v2 = 0;
    Object v3 = 10;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ", dateTimeCreated=";
    Object v5 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = -10;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).setReadOnly();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).mkdir();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -3;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)-34),Byte.valueOf((byte)-9)};
    Object v2 = 50;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)21)};
    Object v2 = -31;
    Object v3 = -26;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ", arjFlags2=";
    Object v5 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = 1;
    Object v3 = 53;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 2;
    Object v3 = -26;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getAbsolutePath();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)65)};
    Object v2 = 4;
    Object v3 = -25;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 13;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)-11)};
    Object v2 = -16;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 7;
    Object v3 = 8;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1),Byte.valueOf((byte)0)};
    Object v2 = 32;
    Object v3 = 33;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = -1;
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-29),Byte.valueOf((byte)2)};
    Object v2 = 18;
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = null;
    Object v5 = ((java.io.File)v3).listFiles(((java.io.FileFilter)v4));
    Object v6 = "TRAILER!!!";
    Object v7 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).getCanonicalPath();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 82;
    Object v3 = -8;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "EXPANDING_LEVEL_4";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).isDirectory();
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = -23;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).delete();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 2;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "N";
    Object v5 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "rw";
    Object v5 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = -1;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)8)};
    Object v2 = -23;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isDirectory();
    Object v4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 1063;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)21),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 512;
    Object v3 = 2;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = 17;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 64;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "gnam";
    Object v1 = "USER_EXEC";
    Object v2 = new java.io.File(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 1L;
    Object v4 = ((java.io.File)v2).setLastModified((((java.lang.Long)v3).longValue()));
    Object v5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(((java.io.File)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)66),Byte.valueOf((byte)2)};
    Object v2 = 13;
    Object v3 = 1902;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)4)};
    Object v2 = -52;
    Object v3 = -22;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 30;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)-11)};
    Object v2 = 19;
    Object v3 = 49;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)3)};
    Object v2 = 4;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)8)};
    Object v2 = 2097159;
    Object v3 = 2;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1)};
    Object v2 = -42;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "gnam";
    Object v2 = "USER_EXEC";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "%ustar ";
    Object v5 = ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)4),Byte.valueOf((byte)2)};
    Object v2 = 868016066;
    Object v3 = 4;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = -2;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)-13)};
    Object v2 = 1;
    Object v3 = -18;
    ((org.apache.commons.compress.archivers.sevenz.SevenZOutputFile)v0).write(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
