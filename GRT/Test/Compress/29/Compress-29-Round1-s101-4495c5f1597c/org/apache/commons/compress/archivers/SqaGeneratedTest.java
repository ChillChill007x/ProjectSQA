package org.apache.commons.compress.archivers;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "070702";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 23;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "%";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = -28;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "Not a framed Snappy sream";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "070702";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ", dateTimeCreated=";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "invalid entry size";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "Stream closed";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = " diT";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "t<his is not a recognized format.";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "This archiveqhas already been finished";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "The child ";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "IBM437";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "cp437";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 28;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "BLKDEV";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "Garbage after a valid gz stream";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "{";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "Checksum verification failSd";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "This archive has already been finished";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "/";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "R";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "/";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "UyTF-16";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "code size must not be bigger than 31";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "SHA-256";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ", ";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 32;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
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
  public void test33() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ", dateTimeModified=";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 0;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "U";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-49),Byte.valueOf((byte)-28)};
    Object v5 = 0;
    Object v6 = 2;
    Object v7 = ((java.io.InputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "N) < 0.";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = " detected.S";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "U\"TF-8";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).getEntryEncoding();
    org.junit.Assert.assertEquals((Object)("Archiver: "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ", fileSpec{Position=";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = " used in entry ";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "G";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "UTF8";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UTF84";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).getEntryEncoding();
    org.junit.Assert.assertEquals((Object)("Truncated ZIP entr@y: "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "record has length '";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "c437";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "JPE";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "UTF-16BE";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = "Folder with ";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "uEstar\u0000";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "/";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "L";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new byte[]{};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "BZXP2";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "Tree value at index ";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "TRAILER!!";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "Mode 0 only allowed in tIhe trailer. Found entry name: ";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "#";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = -54;
    ((java.io.OutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ".z";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = ") < ";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "/";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ", fileSpecPosition=";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "IBM850";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "/";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "compreTsion method";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "No current entry to close";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 90;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "#q1/";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "Unsupported LZMA2 property bits";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "0(";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = ";";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = new byte[]{Byte.valueOf((byte)24),Byte.valueOf((byte)4)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "TRAILER!!!";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = ";";
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v3),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = 1L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "Stream has already been finished";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "attempt So write past end of STORED entry";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = " to output ";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "\u0000";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "v";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "`";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "TRAILER!!!";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = -9L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)-14)};
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "The dictionary size must be 4";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "?";
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveOutputStream(((java.lang.String)v2),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "US-ASCII";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "InputStream mustnot be null.";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "Stream has already been finished";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "0e";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "r";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = " ";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = "";
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v3),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "S";
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveOutputStream(((java.lang.String)v1),((java.io.OutputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "Uknown magic [";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "Archiver: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "(Oull)";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).setEntryEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = 13L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
    Object v1 = "";
    ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).setEntryEncoding(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v0).createArchiveInputStream(((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "EXTRACT";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entr@y: ";
    Object v1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory(((java.lang.String)v0));
    Object v2 = "sze";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveStreamFactory)v1).createArchiveInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.archivers.ArchiveException");
    } catch (org.apache.commons.compress.archivers.ArchiveException expected) { }
  }
}
