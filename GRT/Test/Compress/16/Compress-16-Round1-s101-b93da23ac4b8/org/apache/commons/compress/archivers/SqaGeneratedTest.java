package org.apache.commons.compress.archivers;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = " byte.";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ".gz";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((java.io.InputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "/";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 1;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ") > buf.length(";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "FATAL: UTF-8 encoding not8 supported.";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "0707 1";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 264;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = new byte[]{};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 1;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "compress^on method";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "Unsupported compression method ";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "r";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "^#1/\\d+";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "0";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "Found unsupported compression method ";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)60),Byte.valueOf((byte)50),Byte.valueOf((byte)0)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = " bytes.";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ".ar";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "/";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)-12),Byte.valueOf((byte)37),Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "-";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ">";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ")";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "070702";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "no curren7 CPIO entry";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "Truncated IP file";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "failed to skip current tar entry";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "gZz";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = 0L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "0\u0000";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "The stream is close4d";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = " will not fit in octal number buffer of length ";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "invalid entry trailer. not read the content? Occured at byte: ";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UTFS";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ") + len(";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "record to write has length '";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -11;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "user.name";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "This archive has already been finished";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ":";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "`\n";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "unexpected end of stream";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "-1";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "Unsupported version [";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "LZO";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = 0;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UniCode path extra data must have at least 5 bytes.";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "offs(";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "A";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "0";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "TRAILER!!!";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "archive's ZIP64 end of central directory locator is corrupt.";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "GROUP_pWRITE";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "crc checksum is requiredf for STORED method when not writing to a file";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UTF8";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "US-ASCII";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "data descrip";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = " will not fit in octal number buffer of length ";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UTF-8";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((java.io.InputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "ent";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-30)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "stream closed";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "TAPE";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "request to write <";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UTF-8";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ":";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((java.io.InputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "SCHILY.devmajor";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "archive contains more than 65535 entries.";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ":/";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = " ";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "BZip2 block size is Snvalid";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "input buffer is closed";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "]. Occur(ed at byte: ";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "[%7d]: %s";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "TRAILER!!!";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "No InputSt>eam";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)-30)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "GROUP_RED";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "Stream has already been finished";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "/";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = -4L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "filemode too long";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 0;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "FIF";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 2;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "This archive has already been finished";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "U$TF8";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "I";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = 0;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UTF-";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)43),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = 22;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "jar";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
    Object v4 = "";
    Object v5 = java.io.InputStream.nullInputStream();
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v4),((java.io.InputStream)v5));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UTF";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "far";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "record to write has length '";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "netare";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "there was an error decoding a tape segment";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "bad CRC c\\hecksum for entry ";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UT";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "unexpected end of stream";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UiTF-8";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }
}
