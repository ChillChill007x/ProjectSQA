package org.apache.commons.compress.compressors;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "T";
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorOutputStream(((java.lang.String)v2),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((java.io.InputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "/";
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorOutputStream(((java.lang.String)v2),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).setDecompressConcatenated((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "././@LongLink";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "US-ASCII";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = ", fileType=";
    Object v4 = null;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v3),((java.io.OutputStream)v5));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = " CRCs, ";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "ustar\u0000";
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorOutputStream(((java.lang.String)v2),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "/";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "Archivername must not be null.";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).getDecompressConcatenated();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "code size mus";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "Q";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-9)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "UyTF-16";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "CACHED_AVAILABLE";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = ".";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "bad data";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).setDecompressConcatenated((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "Incomplete property of type ";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "ustaHr\u0000";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "]";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "0";
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorOutputStream(((java.lang.String)v2),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "Unsupported compression method ";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "UTFk";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "o";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "D";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "TUTF-16BE";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "'";
    Object v4 = null;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v3),((java.io.OutputStream)v5));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "Z";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = ", commeent=";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "US-mASCII";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = ", arjFlags2=";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = 86;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "UTF)8";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = " ";
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorOutputStream(((java.lang.String)v2),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "StreTam has already been finished";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "/";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "arj";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "Stream has already been finished";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = " not found.";
    Object v4 = null;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v3),((java.io.OutputStream)v5));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "ISO-8859-I1";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "00";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v4).readNBytes((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "";
    Object v4 = null;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v3),((java.io.OutputStream)v5));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorOutputStream(((java.lang.String)v2),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "mtime";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "u";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((java.io.InputStream)v4).readAllBytes();
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "US-ASCII";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = ") >9";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "' used in en.try ";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "k=";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "`";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "Invalid clear code subcode ";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "././@LongLink";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((java.io.InputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "bad";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "?";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v4));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "count must not be negative or greater than 63";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "Stream has already been finished";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = java.io.InputStream.nullInputStream();
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)16),Byte.valueOf((byte)-6)};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.io.InputStream)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "snappy-raw";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "g";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "TRAILER!!";
    Object v4 = null;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v4));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v3),((java.io.OutputStream)v5));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "US-ASCII";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "pack200n";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "US-ASCII";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "UMTF-8";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)-13),Byte.valueOf((byte)-1),Byte.valueOf((byte)1)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = 64;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).setDecompressConcatenated((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "070q01";
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v3),((java.io.InputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ";";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "n";
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorOutputStream(((java.lang.String)v1),((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = ")1";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "d";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
    Object v1 = "n";
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v0).createCompressorInputStream(((java.lang.String)v1),((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).setDecompressConcatenated((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).setDecompressConcatenated((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "V/";
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorOutputStream(((java.lang.String)v2),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = " not found.";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "WORLD_EXEC";
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorOutputStream(((java.lang.String)v2),((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.compress.compressors.CompressorStreamFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "IMPLODINH";
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.compressors.CompressorStreamFactory)v1).createCompressorInputStream(((java.lang.String)v2),((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected org.apache.commons.compress.compressors.CompressorException");
    } catch (org.apache.commons.compress.compressors.CompressorException expected) { }
  }
}
