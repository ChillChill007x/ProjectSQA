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
    Object v0 = "TRAILER!!!";
    Object v1 = new byte[]{Byte.valueOf((byte)-34),Byte.valueOf((byte)30)};
    Object v2 = -7;
    Object v3 = -10;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-17), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)-9),Byte.valueOf((byte)-24)};
    Object v1 = 11;
    Object v2 = -63;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = -1L;
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-27),Byte.valueOf((byte)4)};
    Object v2 = 19;
    Object v3 = 0;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)3),Byte.valueOf((byte)0)};
    Object v2 = -10;
    Object v3 = 0;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = -40L;
    Object v1 = new byte[]{Byte.valueOf((byte)-57),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 4;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)43),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(45L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = -51;
    Object v2 = 43;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 10L;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 23L;
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = 23;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "unknown UnparseableExtraField key";
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-12)};
    Object v2 = 256;
    Object v3 = 48;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 255L;
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = 49;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)-22),Byte.valueOf((byte)1)};
    Object v1 = 55;
    Object v2 = 29;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-12),Byte.valueOf((byte)0)};
    Object v2 = 1;
    Object v3 = -2;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "stream closed";
    Object v1 = new byte[]{Byte.valueOf((byte)38),Byte.valueOf((byte)1)};
    Object v2 = -23;
    Object v3 = 2;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "`\nx";
    Object v1 = new byte[]{Byte.valueOf((byte)-30)};
    Object v2 = 4;
    Object v3 = -16;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
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
  public void test20() throws Throwable {
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
  public void test21() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 100;
    Object v2 = 1025;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
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
  public void test23() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)37),Byte.valueOf((byte)50)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(88L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)26)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(26L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = -70L;
    Object v1 = new byte[]{};
    Object v2 = -11;
    Object v3 = 64;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)45),Byte.valueOf((byte)4),Byte.valueOf((byte)18)};
    Object v2 = 0;
    Object v3 = -10;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)7),Byte.valueOf((byte)-4)};
    Object v1 = -21;
    Object v2 = 120;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v2 = -18;
    Object v3 = 17;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)102)};
    Object v1 = 0;
    Object v2 = -38;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-6)};
    Object v1 = 1;
    Object v2 = 36;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "0";
    Object v1 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 15;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 281;
    Object v2 = 24;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Cp85a0";
    Object v1 = new byte[]{Byte.valueOf((byte)-38)};
    Object v2 = 14;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(14), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-96),Byte.valueOf((byte)-5),Byte.valueOf((byte)19)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(430L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-6)};
    Object v1 = 17;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "07707";
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v2 = 40;
    Object v3 = 45;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{};
    Object v2 = 255;
    Object v3 = 8;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "s";
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 255;
    Object v3 = -26;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(229), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)81),Byte.valueOf((byte)67),Byte.valueOf((byte)-21)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(383L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v2 = -12;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-62)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(194L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 17L;
    Object v1 = new byte[]{Byte.valueOf((byte)6)};
    Object v2 = -7;
    Object v3 = 6;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-28),Byte.valueOf((byte)-8)};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17)};
    Object v1 = 368;
    Object v2 = 11;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 2L;
    Object v1 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)-48),Byte.valueOf((byte)1)};
    Object v2 = -5;
    Object v3 = -27;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -4L;
    Object v1 = new byte[]{Byte.valueOf((byte)-20),Byte.valueOf((byte)-30),Byte.valueOf((byte)51)};
    Object v2 = 6;
    Object v3 = 16;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)-36)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(236L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = -6L;
    Object v1 = new byte[]{Byte.valueOf((byte)52)};
    Object v2 = -8;
    Object v3 = 1;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = -41;
    Object v2 = -16;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-19)};
    Object v1 = 51;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 17;
    Object v2 = 133;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-9),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(248L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = -8L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-91),Byte.valueOf((byte)0)};
    Object v2 = -11;
    Object v3 = 24;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = 8;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "/";
    Object v1 = new byte[]{Byte.valueOf((byte)104),Byte.valueOf((byte)37),Byte.valueOf((byte)3)};
    Object v2 = 24;
    Object v3 = 20;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)61),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(62L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "linkpath";
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = 163;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(12L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)1)};
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)15)};
    Object v1 = 73;
    Object v2 = 21;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1),Byte.valueOf((byte)-2)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 22L;
    Object v1 = new byte[]{Byte.valueOf((byte)-54),Byte.valueOf((byte)41),Byte.valueOf((byte)-9)};
    Object v2 = 4;
    Object v3 = -34;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 4L;
    Object v1 = new byte[]{Byte.valueOf((byte)10)};
    Object v2 = 36;
    Object v3 = -15;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = -8;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 512;
    Object v2 = -9;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = -1L;
    Object v1 = new byte[]{Byte.valueOf((byte)54)};
    Object v2 = 0;
    Object v3 = 383;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 22;
    Object v2 = 6;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 12L;
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = -26;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)8)};
    Object v1 = -39;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)22)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(22L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)25),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = 19;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "ustar\u0000";
    Object v1 = new byte[]{Byte.valueOf((byte)117)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "070702";
    Object v1 = new byte[]{Byte.valueOf((byte)-123),Byte.valueOf((byte)30),Byte.valueOf((byte)2)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2),Byte.valueOf((byte)-71)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(187L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = " cha?rs, read ";
    Object v1 = new byte[]{Byte.valueOf((byte)-41),Byte.valueOf((byte)-62),Byte.valueOf((byte)3)};
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "failed to read entry trailer. Occured at byte: ";
    Object v1 = new byte[]{};
    Object v2 = 13;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(13), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)-35),Byte.valueOf((byte)2)};
    Object v2 = 1;
    Object v3 = 0;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 44L;
    Object v1 = new byte[]{Byte.valueOf((byte)77),Byte.valueOf((byte)1)};
    Object v2 = 2;
    Object v3 = 0;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = -2;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(10L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 35L;
    Object v1 = new byte[]{Byte.valueOf((byte)23)};
    Object v2 = 1;
    Object v3 = 1;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "Stream has already bee";
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 7L;
    Object v1 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 1;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = ":p";
    Object v1 = new byte[]{};
    Object v2 = 11;
    Object v3 = 65;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)14)};
    Object v1 = -71;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-90),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = 255;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = -67;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)32),Byte.valueOf((byte)18)};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)-20),Byte.valueOf((byte)36)};
    Object v1 = -22;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)26),Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = 11;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)-10),Byte.valueOf((byte)-23)};
    Object v1 = 1;
    Object v2 = 32;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 48L;
    Object v1 = new byte[]{Byte.valueOf((byte)9)};
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-37)};
    Object v1 = -6;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }
}
