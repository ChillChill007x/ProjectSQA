package org.apache.commons.compress.utils;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("I"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)71),Byte.valueOf((byte)-30)};
    Object v1 = 0;
    Object v2 = -18;
    Object v3 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)-7)};
    Object v4 = -10;
    Object v5 = 256;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "ms, meringElapsed=";
    Object v1 = 0L;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = org.apache.commons.compress.utils.ArchiveUtils.toString(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    org.junit.Assert.assertEquals((Object)("-       0 ms, meringElapsed="), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -9;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)36),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v1 = 309;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "7z";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("7z"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "i";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("i"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "AES_ENCRYPTED";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("AES_ENCRYPTED"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Archiver: ";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Archiver: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)21)};
    Object v1 = -16;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "/";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "pack.segent.limit";
    Object v1 = new byte[]{Byte.valueOf((byte)36)};
    Object v2 = 0;
    Object v3 = 2;
    Object v4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v1 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)41)};
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),((byte[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v1 = 8;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = -15;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)37)};
    Object v4 = 22;
    Object v5 = -18;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "invalid entry size (Iexpected ";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("invalid entry size (Iexpected "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)15),Byte.valueOf((byte)1)};
    Object v1 = 6;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 531;
    Object v2 = 7;
    Object v3 = new byte[]{};
    Object v4 = 4;
    Object v5 = 32;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "SCHILY.dev";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("SCHILY.dev"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)32)};
    Object v1 = -42;
    Object v2 = 0;
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = -46;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0001"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)0)};
    Object v4 = -41;
    Object v5 = 25;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "05";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("05"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "z";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("z"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new byte[]{Byte.valueOf((byte)-19),Byte.valueOf((byte)12),Byte.valueOf((byte)1)};
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(((java.lang.String)v0),((byte[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "U";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("U"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)14)};
    Object v4 = 512;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-53),Byte.valueOf((byte)50)};
    Object v1 = 25;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)67),Byte.valueOf((byte)0)};
    Object v1 = 8;
    Object v2 = 0;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)4)};
    Object v4 = -1;
    Object v5 = 0;
    Object v6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = ") S 9";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(") S 9"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)29)};
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u001d"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-95),Byte.valueOf((byte)49)};
    Object v1 = 803;
    Object v2 = 8;
    Object v3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)57)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = new byte[]{Byte.valueOf((byte)-7)};
    Object v4 = 0;
    Object v5 = 12;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 1403;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "L";
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-8)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-24),Byte.valueOf((byte)-32)};
    Object v1 = 24;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "#1/";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("#1/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "This archive has already been finished";
    Object v1 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)7)};
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(((java.lang.String)v0),((byte[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "ms, meringElapsed=";
    Object v1 = 0L;
    Object v2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveEntry)v2).getSize();
    Object v4 = org.apache.commons.compress.utils.ArchiveUtils.toString(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    org.junit.Assert.assertEquals((Object)("-       0 ms, meringElapsed="), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 4;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -22;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = 12;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-29)};
    Object v1 = -3;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)0)};
    Object v1 = -27;
    Object v2 = 0;
    Object v3 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-29)};
    Object v4 = 26;
    Object v5 = 9;
    Object v6 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "UTF@8";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("UTF@8"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 280;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = -33;
    Object v2 = 3;
    Object v3 = new byte[]{Byte.valueOf((byte)54)};
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "offs(";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("offs("), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "SHA384";
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16),Byte.valueOf((byte)1)};
    Object v2 = -27;
    Object v3 = 2;
    Object v4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)47)};
    Object v1 = -25;
    Object v2 = -11;
    Object v3 = new byte[]{};
    Object v4 = 31;
    Object v5 = 1;
    Object v6 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "/";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)16)};
    Object v2 = true;
    Object v3 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 25;
    Object v2 = 45;
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)16),Byte.valueOf((byte)-36)};
    Object v4 = 0;
    Object v5 = 21;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)38)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "`\n";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("`?"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)-3),Byte.valueOf((byte)19)};
    Object v1 = 3;
    Object v2 = -9;
    Object v3 = new byte[]{Byte.valueOf((byte)41)};
    Object v4 = 19;
    Object v5 = -14;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)9)};
    Object v1 = 38;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)8)};
    Object v1 = 0;
    Object v2 = 2;
    Object v3 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)86)};
    Object v4 = 32768;
    Object v5 = -13;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "#1/";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = ", date7TimeCreated=";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(", date7TimeCreated="), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "1";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-5)};
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = new byte[]{};
    Object v4 = 8;
    Object v5 = 15;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = 4;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)13)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "entry ize";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("entry ize"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-1)};
    Object v1 = 310;
    Object v2 = 1;
    Object v3 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1)};
    Object v4 = 0;
    Object v5 = 26;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = 8;
    Object v2 = 36;
    Object v3 = new byte[]{Byte.valueOf((byte)-15),Byte.valueOf((byte)1)};
    Object v4 = 27;
    Object v5 = 7;
    Object v6 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Found unsupported compression methoXd ";
    Object v1 = new byte[]{};
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(((java.lang.String)v0),((byte[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "/";
    Object v1 = new byte[]{};
    Object v2 = -1;
    Object v3 = 21;
    Object v4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-53)};
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "SCHILY.reaClsize";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("SCHILY.reaClsize"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = ", extendedHeaderBytes=";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(", extendedHeaderBytes="), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-7),Byte.valueOf((byte)1)};
    Object v1 = 17;
    Object v2 = -38;
    Object v3 = new byte[]{Byte.valueOf((byte)-7)};
    Object v4 = 1;
    Object v5 = 2;
    Object v6 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = -59;
    Object v3 = new byte[]{};
    Object v4 = 2;
    Object v5 = 33;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = 2;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)33),Byte.valueOf((byte)8)};
    Object v4 = 8;
    Object v5 = 1;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = ".xzp";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(".xzp"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "]K ";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("]K "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "o";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("o"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 43;
    Object v2 = 0;
    Object v3 = new byte[]{};
    Object v4 = 168;
    Object v5 = -16;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)5),Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-21)};
    Object v1 = new byte[]{Byte.valueOf((byte)-11),Byte.valueOf((byte)1),Byte.valueOf((byte)20)};
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),((byte[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)10)};
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0000\n"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-100)};
    Object v1 = 8;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "US-ASCI";
    Object v1 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = -43;
    Object v3 = -17;
    Object v4 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -21;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),((byte[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 35;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-17)};
    Object v1 = 33;
    Object v2 = -14;
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = -24;
    Object v5 = 0;
    Object v6 = true;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)3)};
    Object v1 = new byte[]{Byte.valueOf((byte)75)};
    Object v2 = true;
    Object v3 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "group id!";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("group id!"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "UTF-16LE";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("UTF-16LE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -61;
    Object v2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = false;
    Object v7 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "Stream has already been finished";
    Object v1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Stream has already been finished"), v1);
  }
}
