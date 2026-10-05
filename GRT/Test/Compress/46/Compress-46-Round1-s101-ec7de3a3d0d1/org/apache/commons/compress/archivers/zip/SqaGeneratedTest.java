package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v4));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).setCreateTime(((org.apache.commons.compress.archivers.zip.ZipLong)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getCentralDirectoryLength();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getModifyTime();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).parseFromLocalFileData(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getCentralDirectoryLength();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getModifyJavaTime();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getModifyJavaTime();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).toString();
    org.junit.Assert.assertEquals((Object)("0x5455 Zip Extra Field: Flags=0 "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getLocalFileDataLength();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v5));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).setAccessTime(((org.apache.commons.compress.archivers.zip.ZipLong)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = -18;
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).parseFromLocalFileData(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getCreateJavaTime();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setCreateJavaTime(((java.util.Date)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v4));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).setModifyTime(((org.apache.commons.compress.archivers.zip.ZipLong)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).getDay();
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setCreateJavaTime(((java.util.Date)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v5));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipLong)v6).clone();
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setAccessTime(((org.apache.commons.compress.archivers.zip.ZipLong)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = Byte.valueOf((byte)0);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v2).byteValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = -29;
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).parseFromLocalFileData(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = Byte.valueOf((byte)-22);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v6).byteValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getLocalFileDataData();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).toString();
    Object v3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v3).getLocalFileDataLength();
    Object v5 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getModifyJavaTime();
    Object v3 = Byte.valueOf((byte)2);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v3).byteValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).isBit2_createTimePresent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = Byte.valueOf((byte)1);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v2).byteValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v5));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setCreateTime(((org.apache.commons.compress.archivers.zip.ZipLong)v6));
    Object v7 = null;
    Object v8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v9 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v8).clone();
    Object v10 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v9).getLocalFileDataLength();
    Object v11 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getModifyJavaTime();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getCentralDirectoryLength();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getModifyJavaTime();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipLong)v7).clone();
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setModifyTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = Byte.valueOf((byte)-50);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v2).byteValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v5));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setAccessTime(((org.apache.commons.compress.archivers.zip.ZipLong)v6));
    Object v7 = null;
    Object v8 = Byte.valueOf((byte)0);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v8).byteValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getFlags();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getHeaderId();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getCreateJavaTime();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v4));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).setAccessTime(((org.apache.commons.compress.archivers.zip.ZipLong)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = Byte.valueOf((byte)66);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setFlags((((java.lang.Byte)v3).byteValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipLong)v7).toString();
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setModifyTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v3).getCentralDirectoryLength();
    Object v5 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getLocalFileDataLength();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).toString();
    org.junit.Assert.assertEquals((Object)("0x5455 Zip Extra Field: Flags=0 "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setAccessTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v5));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setAccessTime(((org.apache.commons.compress.archivers.zip.ZipLong)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipLong)v7).getBytes();
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setCreateTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setAccessTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipLong)v7).clone();
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setModifyTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).toString();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).toString();
    org.junit.Assert.assertEquals((Object)("0x5455 Zip Extra Field: Flags=0 "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getLocalFileDataData();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getFlags();
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getHeaderId();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = Byte.valueOf((byte)-34);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setFlags((((java.lang.Byte)v3).byteValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = new byte[]{Byte.valueOf((byte)38),Byte.valueOf((byte)4)};
    Object v3 = 0;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).parseFromLocalFileData(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getAccessJavaTime();
    Object v3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v3).clone();
    Object v5 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v4).clone();
    Object v6 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v5).toString();
    Object v7 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v5).getCentralDirectoryLength();
    Object v8 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).isBit0_modifyTimePresent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v4));
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipLong)v5).clone();
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).setCreateTime(((org.apache.commons.compress.archivers.zip.ZipLong)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setCreateTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getAccessJavaTime();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v5));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setCreateTime(((org.apache.commons.compress.archivers.zip.ZipLong)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(-1073742308), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).clone();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getModifyJavaTime();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setModifyJavaTime(((java.util.Date)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getAccessTime();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).toString();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).isBit1_accessTimePresent();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getAccessTime();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).getCreateTime();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = Byte.valueOf((byte)1);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v2).byteValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipLong)v7).toString();
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setCreateTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = Byte.valueOf((byte)-3);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v2).byteValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getModifyTime();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getCentralDirectoryLength();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getCreateJavaTime();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).clone();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v3).clone();
    Object v5 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v4).toString();
    Object v6 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v4).getCentralDirectoryLength();
    Object v7 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v5));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setAccessTime(((org.apache.commons.compress.archivers.zip.ZipLong)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getCentralDirectoryLength();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getModifyJavaTime();
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = new java.util.Date((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v7));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setModifyTime(((org.apache.commons.compress.archivers.zip.ZipLong)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setAccessJavaTime(((java.util.Date)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setModifyJavaTime(((java.util.Date)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = Byte.valueOf((byte)-4);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).setFlags((((java.lang.Byte)v2).byteValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setCreateJavaTime(((java.util.Date)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getCentralDirectoryLength();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).toString();
    org.junit.Assert.assertEquals((Object)("0x5455 Zip Extra Field: Flags=0 "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setModifyTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v8 = null;
    Object v9 = new byte[]{Byte.valueOf((byte)-10)};
    Object v10 = -11;
    Object v11 = 0;
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).parseFromLocalFileData(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v3).clone();
    Object v5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v6 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v5).clone();
    Object v7 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v6).clone();
    Object v8 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v7).toString();
    Object v9 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v7).getCentralDirectoryLength();
    Object v10 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v4).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getLocalFileDataLength();
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = new java.util.Date((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v7));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setCreateTime(((org.apache.commons.compress.archivers.zip.ZipLong)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getCreateJavaTime();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getCreateTime();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)-13)};
    Object v4 = 0;
    Object v5 = 1;
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).parseFromCentralDirectoryData(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).toString();
    org.junit.Assert.assertEquals((Object)("0x5455 Zip Extra Field: Flags=0 "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = Byte.valueOf((byte)1);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setFlags((((java.lang.Byte)v3).byteValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).getCentralDirectoryData();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v6));
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).setModifyTime(((org.apache.commons.compress.archivers.zip.ZipLong)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v4 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v3).clone();
    Object v5 = Byte.valueOf((byte)1);
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v4).setFlags((((java.lang.Byte)v5).byteValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v4).getLocalFileDataLength();
    Object v8 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = new byte[]{Byte.valueOf((byte)-87)};
    Object v3 = 31;
    Object v4 = 43;
    ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).parseFromLocalFileData(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
    Object v1 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v0).clone();
    Object v2 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp)v2).isBit1_accessTimePresent();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }
}
