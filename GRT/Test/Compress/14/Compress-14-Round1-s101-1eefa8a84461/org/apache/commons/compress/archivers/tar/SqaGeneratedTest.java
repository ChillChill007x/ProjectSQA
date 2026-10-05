package org.apache.commons.compress.archivers.tar;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = -7;
    Object v2 = -14;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Unknown mode. Full: ";
    Object v1 = new byte[]{Byte.valueOf((byte)-34),Byte.valueOf((byte)30)};
    Object v2 = -7;
    Object v3 = -10;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-17), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)-9),Byte.valueOf((byte)-24)};
    Object v1 = 11;
    Object v2 = -63;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = -1L;
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-27),Byte.valueOf((byte)3)};
    Object v2 = 19;
    Object v3 = 0;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)10)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = 7;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "This archive has already been finished";
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)84)};
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v2 = -57;
    Object v3 = -10;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{};
    Object v2 = 41;
    Object v3 = -41;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = -8;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 8;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-111),Byte.valueOf((byte)1)};
    Object v1 = -23;
    Object v2 = -3;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 38;
    Object v2 = -19;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-24),Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 7L;
    Object v1 = new byte[]{Byte.valueOf((byte)3)};
    Object v2 = 0;
    Object v3 = 4;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)4),Byte.valueOf((byte)0)};
    Object v1 = 50;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)0)};
    Object v1 = -76;
    Object v2 = 11;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-18),Byte.valueOf((byte)1)};
    Object v1 = -19;
    Object v2 = -23;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-29)};
    Object v1 = 4;
    Object v2 = -16;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)-40),Byte.valueOf((byte)-32)};
    Object v2 = 6;
    Object v3 = 17;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 31L;
    Object v1 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)2)};
    Object v2 = 0;
    Object v3 = 1;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 7;
    Object v2 = 37;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)-15)};
    Object v2 = 0;
    Object v3 = -23;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 38L;
    Object v1 = new byte[]{Byte.valueOf((byte)-1)};
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 50L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)8)};
    Object v2 = 0;
    Object v3 = -11;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)-32),Byte.valueOf((byte)2),Byte.valueOf((byte)-35)};
    Object v2 = 61;
    Object v3 = 9;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)31),Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = 21;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 16L;
    Object v1 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)-8)};
    Object v2 = -37;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 191L;
    Object v1 = new byte[]{Byte.valueOf((byte)-15),Byte.valueOf((byte)-96),Byte.valueOf((byte)0)};
    Object v2 = -9;
    Object v3 = 222;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-38)};
    Object v1 = -25;
    Object v2 = -32;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)25),Byte.valueOf((byte)10)};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)("\u00fd"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 30L;
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = 255;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 5;
    Object v2 = -19;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = -8L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 1;
    Object v3 = 8;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = -59;
    Object v2 = 3;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-8)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)48)};
    Object v2 = 0;
    Object v3 = 2;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)0)};
    Object v1 = -9;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 43;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-19),Byte.valueOf((byte)-66)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(427L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{};
    Object v2 = 2;
    Object v3 = -39;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = -12L;
    Object v1 = new byte[]{Byte.valueOf((byte)-21)};
    Object v2 = 0;
    Object v3 = -46;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)26)};
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 61L;
    Object v1 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)-11)};
    Object v2 = 1;
    Object v3 = -13;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)61),Byte.valueOf((byte)0),Byte.valueOf((byte)6)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "->0x";
    Object v1 = new byte[]{Byte.valueOf((byte)48)};
    Object v2 = 1;
    Object v3 = 12;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)68),Byte.valueOf((byte)0)};
    Object v1 = 18;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "RAILER!!!";
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v2 = 15;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)-21),Byte.valueOf((byte)0)};
    Object v2 = -25;
    Object v3 = 199;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)1)};
    Object v1 = 48;
    Object v2 = 257;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)-9)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 3;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)21)};
    Object v1 = 39;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "/";
    Object v1 = new byte[]{Byte.valueOf((byte)47)};
    Object v2 = 0;
    Object v3 = 12;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 27;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 20L;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-23)};
    Object v2 = 0;
    Object v3 = -46;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 254L;
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = 11;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(264L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 8L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1)};
    Object v2 = 43;
    Object v3 = 31;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = 261;
    Object v2 = 26;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)22),Byte.valueOf((byte)-54)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -71;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)66),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = -42;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v1 = -10;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = -1;
    Object v2 = -9;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)16)};
    Object v1 = 54;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)125),Byte.valueOf((byte)9)};
    Object v1 = -9;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)0)};
    Object v2 = -40;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)32)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(32L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)25),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = 19;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 2L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)33),Byte.valueOf((byte)8)};
    Object v2 = 8;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)23)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(23L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)8),Byte.valueOf((byte)89)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(97L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "././?@LongLink";
    Object v1 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)-62),Byte.valueOf((byte)3)};
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{};
    Object v2 = 13;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)0)};
    Object v1 = -26;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)50)};
    Object v2 = 15;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 8L;
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = -1;
    Object v3 = 39;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 13;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-21)};
    Object v2 = 53;
    Object v3 = 1;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)49)};
    Object v1 = -79;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = new byte[]{Byte.valueOf((byte)7)};
    Object v2 = -26;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-26), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)65)};
    Object v1 = 1015980063;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)48)};
    Object v2 = 1;
    Object v3 = 0;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = -37L;
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = -38;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)32),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Stream has already been finished";
    Object v1 = new byte[]{Byte.valueOf((byte)3)};
    Object v2 = 31;
    Object v3 = -27;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(4), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 17L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)4)};
    Object v2 = 1;
    Object v3 = 986;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)5),Byte.valueOf((byte)6)};
    Object v1 = 22;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)-32)};
    Object v1 = 0;
    Object v2 = 2;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "This archive has alr}eady been finished";
    Object v1 = new byte[]{};
    Object v2 = -34;
    Object v3 = 8168;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "offs(";
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)4),Byte.valueOf((byte)0)};
    Object v2 = -24;
    Object v3 = -68;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-92), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "arcbhive contains more than 65535 entries.";
    Object v1 = new byte[]{Byte.valueOf((byte)8)};
    Object v2 = -39;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }
}
