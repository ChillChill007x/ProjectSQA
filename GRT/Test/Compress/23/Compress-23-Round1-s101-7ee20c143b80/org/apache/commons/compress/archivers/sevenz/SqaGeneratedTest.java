package org.apache.commons.compress.archivers.sevenz;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-11)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)36)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)4)};
    Object v4 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-26),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -20L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v3),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v2 = new byte[]{Byte.valueOf((byte)26),Byte.valueOf((byte)23),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)18)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 3;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v4 = new byte[]{};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-2),Byte.valueOf((byte)0),Byte.valueOf((byte)11)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)0),Byte.valueOf((byte)16)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v2 = new byte[]{Byte.valueOf((byte)42),Byte.valueOf((byte)38)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-23),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)14)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v4 = new byte[]{Byte.valueOf((byte)8)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v3),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)30)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)24)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.sevenz.Coders();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-119)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v2 = new byte[]{Byte.valueOf((byte)-15),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-50),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v7 = new byte[]{Byte.valueOf((byte)1)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)72)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v2 = new byte[]{Byte.valueOf((byte)-48)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0),Byte.valueOf((byte)-5)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v2 = new byte[]{Byte.valueOf((byte)-17)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v7 = new byte[]{};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v4 = new byte[]{};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v3),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 44;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v1),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    Object v7 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v6));
    Object v8 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v9 = new byte[]{Byte.valueOf((byte)-8)};
    Object v10 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v8),((byte[])v9));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)45)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v7 = new byte[]{Byte.valueOf((byte)1)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)-34)};
    ((java.io.OutputStream)v5).write(((byte[])v6));
    Object v7 = null;
    Object v8 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2;
    Object v9 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v10 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v8),((byte[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)2)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new byte[]{};
    Object v4 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-61)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-14),Byte.valueOf((byte)3)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v3),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)52),Byte.valueOf((byte)4)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v4 = new byte[]{Byte.valueOf((byte)7),Byte.valueOf((byte)5)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = new byte[]{Byte.valueOf((byte)54)};
    Object v4 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
    Object v7 = new byte[]{Byte.valueOf((byte)1)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v2),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-11),Byte.valueOf((byte)7),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)-19)};
    Object v9 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = new byte[]{};
    Object v9 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)10)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
    Object v7 = new byte[]{Byte.valueOf((byte)-23),Byte.valueOf((byte)0)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v2 = new byte[]{Byte.valueOf((byte)40),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2;
    Object v7 = new byte[]{Byte.valueOf((byte)28)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
    Object v7 = new byte[]{Byte.valueOf((byte)39)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v3 = new byte[]{};
    Object v4 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v2),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = 1;
    ((java.io.OutputStream)v5).write((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v9 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v10 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v8),((byte[])v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)16)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = new byte[]{};
    ((java.io.OutputStream)v5).write(((byte[])v6));
    Object v7 = null;
    Object v8 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    Object v10 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v8),((byte[])v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)39),Byte.valueOf((byte)1),Byte.valueOf((byte)17)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2;
    Object v2 = new byte[]{Byte.valueOf((byte)-3),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-45),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-46),Byte.valueOf((byte)-1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-18),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v3 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)0),Byte.valueOf((byte)46)};
    Object v4 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v2),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v7 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-56)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-45),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = new byte[]{Byte.valueOf((byte)7)};
    Object v7 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = 1;
    ((java.io.OutputStream)v5).write((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v9 = new byte[]{Byte.valueOf((byte)22),Byte.valueOf((byte)39)};
    Object v10 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v8),((byte[])v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v2 = new byte[]{Byte.valueOf((byte)40),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v5 = new byte[]{};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-42)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v2 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)0),Byte.valueOf((byte)-41)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)3)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-16)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
    Object v7 = new byte[]{};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-45),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BZIP2;
    Object v5 = new byte[]{Byte.valueOf((byte)-107)};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-124),Byte.valueOf((byte)0)};
    Object v4 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v2),((byte[])v3));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)92),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)17)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-45),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v5 = new byte[]{Byte.valueOf((byte)1)};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)-54),Byte.valueOf((byte)3)};
    ((java.io.OutputStream)v8).write(((byte[])v9));
    Object v10 = null;
    Object v11 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v12 = new byte[]{Byte.valueOf((byte)-21)};
    Object v13 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v8),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v11),((byte[])v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-45),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = 27;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v7 = new byte[]{Byte.valueOf((byte)23)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)64),Byte.valueOf((byte)39)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-32),Byte.valueOf((byte)32)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)6)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-11)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v7 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v2 = new byte[]{Byte.valueOf((byte)40),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v5 = new byte[]{};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    Object v7 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v8 = new byte[]{Byte.valueOf((byte)-80),Byte.valueOf((byte)1),Byte.valueOf((byte)7)};
    Object v9 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v6),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v7),((byte[])v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    Object v9 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
    Object v10 = new byte[]{};
    Object v11 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v8),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v9),((byte[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v2 = new byte[]{Byte.valueOf((byte)40),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v5 = new byte[]{};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    Object v7 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v8 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)83)};
    Object v9 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v6),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v7),((byte[])v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = 44;
    ((java.io.OutputStream)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v3),((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v7 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v5),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)0)};
    ((java.io.OutputStream)v8).write(((byte[])v9));
    Object v10 = null;
    Object v11 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v12 = ((java.lang.Enum)v11).getDeclaringClass();
    Object v13 = new byte[]{Byte.valueOf((byte)1)};
    Object v14 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v8),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v11),((byte[])v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v4 = new byte[]{};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v3),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-2),Byte.valueOf((byte)16)};
    Object v4 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v3));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-78),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v3),((byte[])v4));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-45),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)12),Byte.valueOf((byte)-5)};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-2),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)45)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-32),Byte.valueOf((byte)32)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v5 = new byte[]{Byte.valueOf((byte)6)};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-45),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)12),Byte.valueOf((byte)-5)};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    Object v7 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v8 = new byte[]{};
    Object v9 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v6),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v7),((byte[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)4)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v2 = new byte[]{Byte.valueOf((byte)40),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-67),Byte.valueOf((byte)-39)};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
    Object v6 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v7 = new byte[]{};
    Object v8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v6),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-32),Byte.valueOf((byte)32)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v0),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v1),((byte[])v2));
    Object v4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE;
    Object v5 = new byte[]{Byte.valueOf((byte)6)};
    Object v6 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v3),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v4),((byte[])v5));
    Object v7 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)4)};
    Object v9 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(((java.io.OutputStream)v6),((org.apache.commons.compress.archivers.sevenz.SevenZMethod)v7),((byte[])v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.sevenz.Coder();
    Object v2 = new byte[]{Byte.valueOf((byte)-20)};
    Object v3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(((java.io.InputStream)v0),((org.apache.commons.compress.archivers.sevenz.Coder)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }
}
