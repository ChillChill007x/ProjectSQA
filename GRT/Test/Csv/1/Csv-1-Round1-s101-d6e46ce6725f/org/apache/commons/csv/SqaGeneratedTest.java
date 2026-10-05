package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readLine();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 1L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).lookAhead();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 23;
    Object v3 = new java.io.StringWriter((((java.lang.Integer)v2).intValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((java.io.Writer)v3).append((((java.lang.Character)v4).charValue()));
    Object v6 = ((java.io.Reader)v1).transferTo(((java.io.Writer)v3));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 10;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 13L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 0;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).ready();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = ((java.io.Reader)v1).read(((char[])v2));
    ((java.io.BufferedReader)v1).reset();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 23;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.io.Reader)v0).transferTo(((java.io.Writer)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{};
    Object v3 = -11;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    ((java.io.BufferedReader)v1).reset();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).getLineNumber();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 3;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    ((java.io.BufferedReader)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new char[]{Character.valueOf((char)1)};
    Object v2 = java.nio.CharBuffer.wrap(((char[])v1));
    Object v3 = ((java.io.Reader)v0).read(((java.nio.CharBuffer)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 34L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = 1;
    Object v4 = 3;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).lines();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 0L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{};
    Object v3 = 23;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    ((java.io.BufferedReader)v1).close();
    Object v2 = null;
    Object v3 = 25;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = -1L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).markSupported();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readAgain();
    org.junit.Assert.assertEquals((Object)(-2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = 23;
    Object v2 = new java.io.StringWriter((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.io.Reader)v0).transferTo(((java.io.Writer)v2));
    Object v4 = 23;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.io.Reader)v0).transferTo(((java.io.Writer)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read();
    Object v3 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = java.nio.CharBuffer.wrap(((char[])v2));
    Object v4 = ((java.io.Reader)v1).read(((java.nio.CharBuffer)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 23;
    Object v3 = new java.io.StringWriter((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.Reader)v1).transferTo(((java.io.Writer)v3));
    Object v5 = new char[]{};
    Object v6 = 0;
    Object v7 = -20;
    Object v8 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = java.nio.CharBuffer.wrap(((char[])v2));
    Object v4 = ((java.io.Reader)v1).read(((java.nio.CharBuffer)v3));
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readAgain();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).readLine();
    ((java.io.BufferedReader)v1).reset();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = 23;
    Object v3 = new java.io.StringWriter((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((java.io.Writer)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((java.io.Reader)v0).transferTo(((java.io.Writer)v3));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).lines();
    Object v3 = ((java.io.BufferedReader)v1).lines();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readLine();
    Object v3 = new char[]{};
    Object v4 = -2;
    Object v5 = 1;
    Object v6 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 7L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new char[]{Character.valueOf((char)1)};
    Object v2 = java.nio.CharBuffer.wrap(((char[])v1));
    Object v3 = ((java.nio.CharBuffer)v2).rewind();
    Object v4 = ((java.io.Reader)v0).read(((java.nio.CharBuffer)v2));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 34;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{};
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)3),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = 0;
    Object v4 = 16;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readLine();
    Object v3 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readLine();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 65534L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 1;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).ready();
    Object v3 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = -3;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).ready();
    Object v3 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readLine();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new char[]{};
    Object v2 = ((java.io.Reader)v0).read(((char[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 0L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = 1;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)10),Character.valueOf((char)1)};
    Object v2 = ((java.io.Reader)v0).read(((char[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 1;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new char[]{};
    Object v5 = -49;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 23;
    Object v3 = new java.io.StringWriter((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.Reader)v1).transferTo(((java.io.Writer)v3));
    Object v5 = ((java.io.BufferedReader)v1).ready();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 0;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = -7L;
    Object v5 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 17L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0),Character.valueOf((char)10)};
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 38L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{};
    Object v3 = 22;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    ((java.io.BufferedReader)v1).close();
    Object v2 = null;
    Object v3 = ((java.io.BufferedReader)v1).ready();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).ready();
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v4 = -31;
    Object v5 = 61;
    Object v6 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).ready();
    Object v3 = 0L;
    Object v4 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)13),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{};
    Object v3 = ((java.io.Reader)v1).read(((char[])v2));
    Object v4 = 13L;
    Object v5 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = -48L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).lines();
    Object v3 = -1;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new char[]{Character.valueOf((char)1)};
    Object v2 = java.nio.CharBuffer.wrap(((char[])v1));
    Object v3 = ((java.nio.CharBuffer)v2).compact();
    Object v4 = ((java.io.Reader)v0).read(((java.nio.CharBuffer)v2));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = -29;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 99;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v3 = 13;
    Object v4 = 0;
    Object v5 = ((java.io.BufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0L;
    Object v7 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = java.nio.CharBuffer.wrap(((char[])v2));
    Object v4 = ((java.io.Reader)v1).read(((java.nio.CharBuffer)v3));
    Object v5 = ((java.io.BufferedReader)v1).ready();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    ((java.io.BufferedReader)v1).close();
    Object v2 = null;
    Object v3 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readLine();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 1L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new char[]{Character.valueOf((char)10),Character.valueOf((char)0)};
    Object v5 = 36;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 35L;
    Object v3 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)10)};
    Object v3 = -1;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = java.nio.CharBuffer.wrap(((char[])v2));
    Object v4 = ((java.io.Reader)v0).read(((java.nio.CharBuffer)v3));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readLine();
    Object v3 = new char[]{};
    Object v4 = -7;
    Object v5 = 1;
    Object v6 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)0)};
    Object v3 = 30;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)10)};
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = -15;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 24;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = java.nio.CharBuffer.wrap(((char[])v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v4));
    Object v6 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v7 = 13;
    Object v8 = 0;
    Object v9 = ((java.io.BufferedReader)v5).read(((char[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0L;
    Object v11 = ((java.io.BufferedReader)v5).skip((((java.lang.Long)v10).longValue()));
    Object v12 = ((java.nio.CharBuffer)v3).equals(((java.lang.Object)v11));
    Object v13 = ((java.io.Reader)v1).read(((java.nio.CharBuffer)v3));
    org.junit.Assert.assertEquals((Object)(-1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).readLine();
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)13)};
    Object v4 = -32;
    Object v5 = -38;
    Object v6 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1),Character.valueOf((char)2)};
    Object v3 = 1;
    Object v4 = -2;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = -1;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 1;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = ((java.io.BufferedReader)v1).readLine();
    Object v3 = 3;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 23;
    Object v3 = new java.io.StringWriter((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.Reader)v1).transferTo(((java.io.Writer)v3));
    Object v5 = -8L;
    Object v6 = ((java.io.BufferedReader)v1).skip((((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = 9;
    ((java.io.BufferedReader)v1).mark((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v3 = -46;
    Object v4 = 12;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v3 = ((java.io.BufferedReader)v2).lines();
    Object v4 = ((org.apache.commons.csv.ExtendedBufferedReader)v2).read();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    ((java.io.BufferedReader)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v3 = ((java.io.BufferedReader)v2).lines();
    Object v4 = 1;
    ((java.io.BufferedReader)v2).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    ((java.io.BufferedReader)v2).reset();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v3 = ((org.apache.commons.csv.ExtendedBufferedReader)v2).readLine();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v3 = ((java.io.BufferedReader)v2).ready();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v2 = new char[]{Character.valueOf((char)1)};
    Object v3 = -12;
    Object v4 = 38;
    Object v5 = ((org.apache.commons.csv.ExtendedBufferedReader)v1).read(((char[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v3 = -25L;
    Object v4 = ((java.io.BufferedReader)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v3 = ((org.apache.commons.csv.ExtendedBufferedReader)v2).readAgain();
    org.junit.Assert.assertEquals((Object)(-2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    ((java.io.Reader)v0).close();
    Object v1 = null;
    Object v2 = new org.apache.commons.csv.ExtendedBufferedReader(((java.io.Reader)v0));
    Object v3 = new char[]{};
    Object v4 = 32;
    Object v5 = 9;
    Object v6 = ((org.apache.commons.csv.ExtendedBufferedReader)v2).read(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
