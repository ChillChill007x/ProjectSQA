package org.apache.commons.compress.archivers.tar;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = -7;
    Object v2 = -14;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 148;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-9),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(248L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 2L;
    Object v1 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)-9)};
    Object v2 = 16;
    Object v3 = 15;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)31),Byte.valueOf((byte)10)};
    Object v1 = 0;
    Object v2 = 4;
    Object v3 = "i";
    Object v4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v3));
    Object v5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 7;
    Object v4 = "i";
    Object v5 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v4));
    Object v6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = -1;
    Object v2 = 22;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(32L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 20L;
    Object v1 = new byte[]{Byte.valueOf((byte)32)};
    Object v2 = 1;
    Object v3 = -13;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)37)};
    Object v1 = 22;
    Object v2 = -18;
    Object v3 = "i";
    Object v4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v3));
    Object v5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)15),Byte.valueOf((byte)0)};
    Object v1 = -27;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-50)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)-5)};
    Object v2 = 0;
    Object v3 = 11;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-12),Byte.valueOf((byte)28)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 16;
    Object v2 = 20;
    Object v3 = "i";
    Object v4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v3));
    Object v5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-45),Byte.valueOf((byte)-12),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(455L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new byte[]{Byte.valueOf((byte)50),Byte.valueOf((byte)56)};
    Object v2 = 4;
    Object v3 = -924188485;
    Object v4 = "i";
    Object v5 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v4));
    Object v6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)-16),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = -41;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-8)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(251L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-19),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = 1;
    Object v2 = -9;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)16)};
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)27)};
    Object v1 = 27;
    Object v2 = -35;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)26)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v2 = -34;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)-115),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = 14;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)4),Byte.valueOf((byte)-25)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)104),Byte.valueOf((byte)10),Byte.valueOf((byte)56)};
    Object v1 = -11;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)10)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(10L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 4L;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 958;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)17)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 156L;
    Object v1 = new byte[]{Byte.valueOf((byte)-49),Byte.valueOf((byte)-20)};
    Object v2 = 0;
    Object v3 = 46;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 16;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 3;
    Object v2 = -36;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 859;
    Object v2 = -26;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = 6;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-45),Byte.valueOf((byte)86)};
    Object v1 = 48;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)18)};
    Object v2 = 4;
    Object v3 = 39;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(6L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)7)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(25L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 4L;
    Object v1 = new byte[]{Byte.valueOf((byte)-21),Byte.valueOf((byte)0)};
    Object v2 = 17;
    Object v3 = 2;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)33)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = new byte[]{Byte.valueOf((byte)-22),Byte.valueOf((byte)-1)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-66),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = -39;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)-19),Byte.valueOf((byte)-20)};
    Object v2 = 8;
    Object v3 = 49;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = "i";
    Object v4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v3));
    Object v5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-29),Byte.valueOf((byte)-24)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(459L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)24),Byte.valueOf((byte)1),Byte.valueOf((byte)-1)};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "likpath";
    Object v1 = new byte[]{};
    Object v2 = -16;
    Object v3 = 22;
    Object v4 = "i";
    Object v5 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v4));
    Object v6 = "UTF-\"";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipEncoding)v5).canEncode(((java.lang.String)v6));
    Object v8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)32)};
    Object v1 = 0;
    Object v2 = 28;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = 167;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{};
    Object v2 = 31;
    Object v3 = 18;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "}";
    Object v1 = new byte[]{Byte.valueOf((byte)125),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 8;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v1 = -25;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 2L;
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = 14;
    Object v3 = 0;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30)};
    Object v1 = -15;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = 0;
    Object v3 = 12;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -6;
    Object v2 = -31;
    Object v3 = "i";
    Object v4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v3));
    Object v5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)45)};
    Object v1 = 28;
    Object v2 = -46;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
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
  public void test66() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)1),Byte.valueOf((byte)-9)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(264L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
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
  public void test68() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-13)};
    Object v1 = 9;
    Object v2 = -25;
    Object v3 = "i";
    Object v4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v3));
    Object v5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = -17;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)-13)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = -89;
    Object v2 = -29;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1),Byte.valueOf((byte)93)};
    Object v1 = 0;
    Object v2 = -29;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 12;
    Object v2 = 32;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)16)};
    Object v1 = 54;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)56),Byte.valueOf((byte)22),Byte.valueOf((byte)6)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 8L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-40)};
    Object v2 = 0;
    Object v3 = 0;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)16)};
    Object v1 = -16;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)2)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-12)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = -32;
    Object v3 = 0;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 40;
    Object v2 = 2;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-24)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(233L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-23),Byte.valueOf((byte)0),Byte.valueOf((byte)-59)};
    Object v1 = -18;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)40)};
    Object v1 = 36;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v1 = -16;
    Object v2 = 1;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-41),Byte.valueOf((byte)28)};
    Object v1 = 39;
    Object v2 = 4;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)8),Byte.valueOf((byte)-1)};
    Object v1 = -12;
    Object v2 = 125;
    Object v3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)6)};
    Object v1 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = -47;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "ustar ";
    Object v1 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)-23)};
    Object v2 = 101;
    Object v3 = 1;
    Object v4 = "i";
    Object v5 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipEncoding)v5).canEncode(((java.lang.String)v6));
    Object v8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = -26;
    Object v2 = 0;
    Object v3 = "i";
    Object v4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v3));
    Object v5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = new byte[]{Byte.valueOf((byte)72)};
    Object v2 = -10;
    Object v3 = -58;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = "i";
    Object v4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v3));
    Object v5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-37)};
    Object v2 = 1;
    Object v3 = 2;
    org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "7";
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = "i";
    Object v5 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(((java.lang.String)v4));
    Object v6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(((java.lang.String)v0),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((org.apache.commons.compress.archivers.zip.ZipEncoding)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = -10L;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-17),Byte.valueOf((byte)1)};
    Object v2 = 57;
    Object v3 = 1;
    Object v4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((((java.lang.Long)v0).longValue()),((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)4)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }
}
