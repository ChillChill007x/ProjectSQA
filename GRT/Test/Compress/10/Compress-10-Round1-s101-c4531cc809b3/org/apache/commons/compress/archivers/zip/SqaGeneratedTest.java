package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ASCII";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).createNewFile();
    Object v3 = "Gzip-coFpressed data is corrupt(uncompressed size mismatch)";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "/";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "070702";
    Object v1 = "of2fs(";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getTotalSpace();
    Object v3 = " bytes exceds remaining data of ";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "CP";
    Object v1 = "\"nsupported compression method ";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    ((org.apache.commons.compress.archivers.zip.ZipFile)v0).finalize();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getTotalSpace();
    Object v3 = "This archive has already Jbeen finished";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "UTF-";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "#1/";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Invalid compression level: ";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "UTF-8";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).isAbsolute();
    Object v3 = "u";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "^/\\d+";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "TRAILE";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "No current entry to clse";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = null;
    org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(((org.apache.commons.compress.archivers.zip.ZipFile)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "/";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "UTF8";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "Gzip-c";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "This archives contains unclosed entries.";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "encryption";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "UTFA";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = ((java.io.File)v1).renameTo(((java.io.File)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "writing to an input bNuffer";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "TRAILER!!";
    Object v1 = "Stream has already been finished";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "archive's ZIP64 end of cenutral directory locator is corrupt.";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).hashCode();
    Object v3 = " bytes exceeds remaining data of ";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Unsupported 3compression method ";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getAbsoluteFile();
    Object v3 = "GROUPEXEC";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "00";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "reading (via skip) from an output buffer";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Mark is not";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "Stream has already been finished";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "F";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.util.zip.ZipException");
    } catch (java.util.zip.ZipException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).getParentFile();
    Object v3 = "groupidn too long";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "Stream closed";
    Object v1 = "";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).lastModified();
    Object v3 = "input buffer is clsed";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ustar\u0000";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).delete();
    Object v3 = "TRAILER!!";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "U";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipFile)v0).getInputStream(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "tar";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "bad extra field >tarting at ";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "UTF";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "UTF8";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Stream has already been fi";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).isHidden();
    Object v3 = "all reads must be multiple of record size (";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "x";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).canWrite();
    Object v3 = "^/\\d+";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "invalid enty size (expected ";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "]. Occured at bye: ";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "7";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "TRAILER!!!";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "0u0";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "Stream has already been finishe";
    Object v1 = "ustar\u0000";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = " not fond.";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "zTF8";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Faile+ to read entry: ";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = " - ,";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "IBM850";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Truncated ZIP file";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).canExecute();
    Object v3 = "ustar\u0000";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "e";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "This archive has already been finished";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Stream has already been finished";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "TEMP_FILE";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "reading from an output buff";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Stream is not in the BZip2format";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).canRead();
    Object v3 = "#";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).list();
    Object v3 = "2";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "input buffer is closed";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "' with offset '";
    Object v1 = "failed to skip file name in local file header";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ") < 0.";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).mkdirs();
    Object v3 = "e";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "this file uses an unsupported compression algorithm: ";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).mkdir();
    Object v3 = "gz";
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "././@LngLink";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "T) + len(";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "/N";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Error parsing extra fields for entry: ";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).exists();
    Object v3 = "";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "UTF";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "l";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).lastModified();
    Object v3 = "";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "UTF-8";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = ((java.io.File)v1).setWritable((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = " byts.";
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ").";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "writ";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).canExecute();
    Object v3 = "";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "UTFA";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ar";
    Object v3 = false;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.io.File)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "J/";
    Object v1 = "070707";
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipFile(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }
}
