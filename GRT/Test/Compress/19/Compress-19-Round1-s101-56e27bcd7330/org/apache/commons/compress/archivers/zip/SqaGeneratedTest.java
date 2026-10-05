package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)48)};
    Object v2 = 25;
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).parseFromLocalFileData(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)1)};
    Object v2 = 0;
    Object v3 = 20;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).parseFromCentralDirectoryData(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = 1L;
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v1).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).setCompressedSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v2));
    Object v3 = null;
    Object v4 = false;
    Object v5 = false;
    Object v6 = true;
    Object v7 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = true;
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getCentralDirectoryData();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = 1L;
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v2).getBytes();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).setCompressedSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = new byte[]{Byte.valueOf((byte)71),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v2 = 0;
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).parseFromCentralDirectoryData(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = -1;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).parseFromCentralDirectoryData(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = true;
    Object v2 = false;
    Object v3 = false;
    Object v4 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setCompressedSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-8)};
    Object v6 = -63;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 310;
    Object v6 = 48;
    Object v7 = 2;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v11));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setDiskStartNumber(((org.apache.commons.compress.archivers.zip.ZipLong)v12));
    Object v13 = null;
    Object v14 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getSize();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = true;
    Object v6 = true;
    Object v7 = false;
    Object v8 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 310;
    Object v11 = 48;
    Object v12 = 2;
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = new java.util.Date((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v16));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setDiskStartNumber(((org.apache.commons.compress.archivers.zip.ZipLong)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getRelativeHeaderOffset();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)50),Byte.valueOf((byte)0)};
    Object v6 = -76;
    Object v7 = 11;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)1)};
    Object v6 = 5;
    Object v7 = -23;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCentralDirectoryData();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)9)};
    Object v6 = 41;
    Object v7 = 5;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = 1L;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v4).longValue()));
    Object v6 = 310;
    Object v7 = 48;
    Object v8 = 2;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v12));
    Object v14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v5),((org.apache.commons.compress.archivers.zip.ZipLong)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-1)};
    Object v6 = 1;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    Object v7 = 1L;
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8));
    Object v10 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10));
    Object v11 = null;
    Object v12 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)-10),Byte.valueOf((byte)0)};
    Object v6 = -23;
    Object v7 = 3;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = false;
    Object v6 = false;
    Object v7 = true;
    Object v8 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v6 = 1;
    Object v7 = 1;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    Object v7 = 1L;
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8));
    Object v10 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setCompressedSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = 1L;
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v1).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getDiskStartNumber();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = false;
    Object v6 = true;
    Object v7 = true;
    Object v8 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v6 = 37;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = 1L;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v4).longValue()));
    Object v6 = 310;
    Object v7 = 48;
    Object v8 = 2;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v12));
    Object v14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v5),((org.apache.commons.compress.archivers.zip.ZipLong)v13));
    Object v15 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v14).getCentralDirectoryData();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = 1L;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v4).longValue()));
    Object v6 = 310;
    Object v7 = 48;
    Object v8 = 2;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v12));
    Object v14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v5),((org.apache.commons.compress.archivers.zip.ZipLong)v13));
    Object v15 = 1L;
    Object v16 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v15).longValue()));
    Object v17 = 1L;
    Object v18 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v17).longValue()));
    Object v19 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v16),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v18));
    Object v20 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v19).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v14).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v20));
    Object v21 = null;
    Object v22 = new byte[]{};
    Object v23 = -26;
    Object v24 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v14).parseFromCentralDirectoryData(((byte[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-32),Byte.valueOf((byte)-20)};
    Object v6 = 0;
    Object v7 = 29;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataData();
    Object v6 = true;
    Object v7 = true;
    Object v8 = true;
    Object v9 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataLength();
    Object v6 = new byte[]{};
    Object v7 = 17;
    Object v8 = 23;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = true;
    Object v2 = true;
    Object v3 = false;
    Object v4 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getDiskStartNumber();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = 1L;
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v3).longValue()));
    Object v5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v2),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v4));
    Object v6 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v5).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).setCompressedSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = -40;
    Object v7 = 16;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    Object v7 = 1L;
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8));
    Object v10 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).getSize();
    Object v11 = ((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10).getBytes();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCentralDirectoryLength();
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-20),Byte.valueOf((byte)-28)};
    Object v7 = 0;
    Object v8 = 2;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = true;
    Object v6 = true;
    Object v7 = false;
    Object v8 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCentralDirectoryLength();
    Object v6 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{};
    Object v6 = 29;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-66),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v6 = 1;
    Object v7 = -40;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = 1L;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v4).longValue()));
    Object v6 = 310;
    Object v7 = 48;
    Object v8 = 2;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v12));
    Object v14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v5),((org.apache.commons.compress.archivers.zip.ZipLong)v13));
    Object v15 = new byte[]{Byte.valueOf((byte)-43),Byte.valueOf((byte)12)};
    Object v16 = 4;
    Object v17 = 3;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v14).parseFromLocalFileData(((byte[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = true;
    Object v2 = false;
    Object v3 = true;
    Object v4 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-24),Byte.valueOf((byte)1),Byte.valueOf((byte)23)};
    Object v6 = 1;
    Object v7 = 8;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCompressedSize();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getSize();
    Object v6 = 1L;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v8).longValue()));
    Object v10 = 310;
    Object v11 = 48;
    Object v12 = 2;
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = new java.util.Date((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v16));
    Object v18 = ((org.apache.commons.compress.archivers.zip.ZipLong)v17).toString();
    Object v19 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v5),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v7),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v9),((org.apache.commons.compress.archivers.zip.ZipLong)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = true;
    Object v6 = false;
    Object v7 = true;
    Object v8 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getSize();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = 8;
    Object v7 = 39;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getSize();
    Object v9 = 1L;
    Object v10 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10).toString();
    Object v12 = 1L;
    Object v13 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v12).longValue()));
    Object v14 = 1L;
    Object v15 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v14).longValue()));
    Object v16 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v13),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v15));
    Object v17 = 1L;
    Object v18 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v17).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v16).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v18));
    Object v19 = null;
    Object v20 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v16).getSize();
    Object v21 = 310;
    Object v22 = 48;
    Object v23 = 2;
    Object v24 = 1;
    Object v25 = 0;
    Object v26 = 0;
    Object v27 = new java.util.Date((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v27));
    Object v29 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v20),((org.apache.commons.compress.archivers.zip.ZipLong)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 310;
    Object v6 = 48;
    Object v7 = 2;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v11));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setDiskStartNumber(((org.apache.commons.compress.archivers.zip.ZipLong)v12));
    Object v13 = null;
    Object v14 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCentralDirectoryData();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = false;
    Object v6 = false;
    Object v7 = false;
    Object v8 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setCompressedSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = false;
    Object v2 = false;
    Object v3 = true;
    Object v4 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getCentralDirectoryLength();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = true;
    Object v6 = true;
    Object v7 = true;
    Object v8 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)18)};
    Object v2 = 0;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).parseFromCentralDirectoryData(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getHeaderId();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getSize();
    Object v9 = 1L;
    Object v10 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10).toString();
    Object v12 = 1L;
    Object v13 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v12).longValue()));
    Object v14 = 1L;
    Object v15 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v14).longValue()));
    Object v16 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v13),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v15));
    Object v17 = 1L;
    Object v18 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v17).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v16).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v18));
    Object v19 = null;
    Object v20 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v16).getSize();
    Object v21 = 310;
    Object v22 = 48;
    Object v23 = 2;
    Object v24 = 1;
    Object v25 = 0;
    Object v26 = 0;
    Object v27 = new java.util.Date((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v27));
    Object v29 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v20),((org.apache.commons.compress.archivers.zip.ZipLong)v28));
    Object v30 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-13)};
    Object v31 = 9;
    Object v32 = -25;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v29).parseFromLocalFileData(((byte[])v30),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = false;
    Object v6 = false;
    Object v7 = true;
    Object v8 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-17)};
    Object v6 = 8;
    Object v7 = -13;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{};
    Object v6 = -87;
    Object v7 = 21;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getLocalFileDataLength();
    Object v2 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getCentralDirectoryData();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getCentralDirectoryLength();
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    Object v5 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = false;
    Object v6 = true;
    Object v7 = true;
    Object v8 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 1;
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).parseFromLocalFileData(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getSize();
    Object v9 = 1L;
    Object v10 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10).toString();
    Object v12 = 1L;
    Object v13 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v12).longValue()));
    Object v14 = 1L;
    Object v15 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v14).longValue()));
    Object v16 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v13),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v15));
    Object v17 = 1L;
    Object v18 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v17).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v16).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v18));
    Object v19 = null;
    Object v20 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v16).getSize();
    Object v21 = 310;
    Object v22 = 48;
    Object v23 = 2;
    Object v24 = 1;
    Object v25 = 0;
    Object v26 = 0;
    Object v27 = new java.util.Date((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v27));
    Object v29 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v20),((org.apache.commons.compress.archivers.zip.ZipLong)v28));
    Object v30 = false;
    Object v31 = true;
    Object v32 = true;
    Object v33 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v29).reparseCentralDirectoryData((((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()),(((java.lang.Boolean)v32).booleanValue()),(((java.lang.Boolean)v33).booleanValue()));
    Object v34 = null;
    Object v35 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v29).getCompressedSize();
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = true;
    Object v6 = false;
    Object v7 = false;
    Object v8 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    Object v7 = 1L;
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8));
    Object v10 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).getCompressedSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10));
    Object v11 = null;
    Object v12 = false;
    Object v13 = false;
    Object v14 = false;
    Object v15 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{};
    Object v6 = 40;
    Object v7 = -24;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    Object v7 = 1L;
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8));
    Object v10 = 1L;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v10).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v13));
    Object v14 = null;
    Object v15 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = 0;
    Object v7 = 31;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = false;
    Object v2 = true;
    Object v3 = false;
    Object v4 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)13),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v6 = 3;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    Object v7 = 1L;
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8));
    Object v10 = 1L;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v10).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setCompressedSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v13));
    Object v14 = null;
    Object v15 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataData();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    Object v7 = 1L;
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8));
    Object v10 = 1L;
    Object v11 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v10).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v11));
    Object v12 = null;
    Object v13 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v9).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = 1L;
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v3).longValue()));
    Object v5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v2),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v4));
    Object v6 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v5).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).setSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = 1L;
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v3).longValue()));
    Object v5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v2),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v4));
    Object v6 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v5).getSize();
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).setSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)68),Byte.valueOf((byte)0)};
    Object v6 = 2;
    Object v7 = 50;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
    Object v1 = false;
    Object v2 = false;
    Object v3 = false;
    Object v4 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v0).reparseCentralDirectoryData((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = false;
    Object v6 = false;
    Object v7 = false;
    Object v8 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-16)};
    Object v6 = 1;
    Object v7 = 1;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = false;
    Object v6 = true;
    Object v7 = false;
    Object v8 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = new byte[]{};
    Object v11 = -30;
    Object v12 = 85;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromCentralDirectoryData(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)6),Byte.valueOf((byte)0)};
    Object v6 = 0;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).parseFromLocalFileData(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getCentralDirectoryData();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getSize();
    Object v6 = 1L;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v8).longValue()));
    Object v10 = 310;
    Object v11 = 48;
    Object v12 = 2;
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = new java.util.Date((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v16));
    Object v18 = ((org.apache.commons.compress.archivers.zip.ZipLong)v17).toString();
    Object v19 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v5),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v7),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v9),((org.apache.commons.compress.archivers.zip.ZipLong)v17));
    Object v20 = true;
    Object v21 = true;
    Object v22 = true;
    Object v23 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v19).reparseCentralDirectoryData((((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getHeaderId();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = false;
    Object v6 = false;
    Object v7 = false;
    Object v8 = true;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 310;
    Object v11 = 48;
    Object v12 = 2;
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = new java.util.Date((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v16));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setDiskStartNumber(((org.apache.commons.compress.archivers.zip.ZipLong)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = false;
    Object v9 = false;
    Object v10 = true;
    Object v11 = false;
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).reparseCentralDirectoryData((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v1),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v3));
    Object v5 = 1L;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v5).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v4).getSize();
    Object v9 = 1L;
    Object v10 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10).toString();
    Object v12 = 1L;
    Object v13 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v12).longValue()));
    Object v14 = 1L;
    Object v15 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v14).longValue()));
    Object v16 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v13),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v15));
    Object v17 = 1L;
    Object v18 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v17).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v16).setRelativeHeaderOffset(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v18));
    Object v19 = null;
    Object v20 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v16).getSize();
    Object v21 = 310;
    Object v22 = 48;
    Object v23 = 2;
    Object v24 = 1;
    Object v25 = 0;
    Object v26 = 0;
    Object v27 = new java.util.Date((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(((java.util.Date)v27));
    Object v29 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v8),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v10),((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v20),((org.apache.commons.compress.archivers.zip.ZipLong)v28));
    Object v30 = 1L;
    Object v31 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((((java.lang.Long)v30).longValue()));
    ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v29).setCompressedSize(((org.apache.commons.compress.archivers.zip.ZipEightByteInteger)v31));
    Object v32 = null;
    Object v33 = ((org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField)v29).getLocalFileDataLength();
    org.junit.Assert.assertNotNull(v33);
  }
}
