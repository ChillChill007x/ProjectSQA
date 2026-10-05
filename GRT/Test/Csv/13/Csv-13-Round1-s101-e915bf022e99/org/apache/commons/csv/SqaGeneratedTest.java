package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = 18L;
    Object v8 = 12L;
    Object v9 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v4),((org.apache.commons.csv.CSVFormat)v6),(((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = 18L;
    Object v8 = 12L;
    Object v9 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v4),((org.apache.commons.csv.CSVFormat)v6),(((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = 18L;
    Object v8 = 12L;
    Object v9 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v4),((org.apache.commons.csv.CSVFormat)v6),(((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v9));
    Object v10 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v5));
    Object v6 = null;
    Object v7 = "'_)";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = new java.io.StringWriter();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.io.StringWriter();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "The header contains a duplicate name: \"";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = new java.io.StringWriter();
    ((org.apache.commons.csv.CSVPrinter)v9).print(((java.lang.Object)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    ((org.apache.commons.csv.CSVPrinter)v9).flush();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.csv.CSVPrinter)v5).print(((java.lang.Object)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    ((org.apache.commons.csv.CSVPrinter)v9).println();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).println();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = java.io.Reader.nullReader();
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v11).charValue()));
    Object v13 = 18L;
    Object v14 = 12L;
    Object v15 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v10),((org.apache.commons.csv.CSVFormat)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()));
    Object v16 = ((java.lang.Iterable)v15).spliterator();
    ((org.apache.commons.csv.CSVPrinter)v9).printRecords(((java.lang.Iterable)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = "Delimi]er=<";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).print(((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).print(((java.lang.Object)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = new java.io.StringWriter();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = Character.valueOf((char)3);
    Object v10 = ((org.apache.commons.csv.CSVFormat)v8).withDelimiter((((java.lang.Character)v9).charValue()));
    Object v11 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v6),((org.apache.commons.csv.CSVFormat)v8));
    ((org.apache.commons.csv.CSVPrinter)v5).print(((java.lang.Object)v11));
    Object v12 = null;
    Object v13 = java.io.Reader.nullReader();
    Object v14 = Character.valueOf((char)0);
    Object v15 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v14).charValue()));
    Object v16 = 18L;
    Object v17 = 12L;
    Object v18 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v13),((org.apache.commons.csv.CSVFormat)v15),(((java.lang.Long)v16).longValue()),(((java.lang.Long)v17).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Iterable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = "\r\n";
    ((org.apache.commons.csv.CSVPrinter)v9).printComment(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).print(((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "De";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v9).printRecord(((java.lang.Object[])v10));
    Object v11 = null;
    Object v12 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v9).printRecords(((java.lang.Object[])v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v6 = null;
    ((org.apache.commons.csv.CSVPrinter)v5).println();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Iterable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    ((org.apache.commons.csv.CSVPrinter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = "NONE";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    ((org.apache.commons.csv.CSVPrinter)v5).println();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = "file";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v9).printRecord(((java.lang.Object[])v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.io.StringWriter();
    ((org.apache.commons.csv.CSVPrinter)v5).print(((java.lang.Object)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeader(((java.lang.String[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v6 = null;
    ((org.apache.commons.csv.CSVPrinter)v5).flush();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).print(((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = "TOKN";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeader(((java.lang.String[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).println();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Iterable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = java.io.Reader.nullReader();
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v11).charValue()));
    Object v13 = 18L;
    Object v14 = 12L;
    Object v15 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v10),((org.apache.commons.csv.CSVFormat)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()));
    Object v16 = ((java.lang.Iterable)v15).iterator();
    ((org.apache.commons.csv.CSVPrinter)v9).printRecord(((java.lang.Iterable)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeader(((java.lang.String[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = "Defaut";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = "G)";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = "form";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).flush();
    Object v6 = null;
    Object v7 = java.io.Reader.nullReader();
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = 18L;
    Object v11 = 12L;
    Object v12 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v7),((org.apache.commons.csv.CSVFormat)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = java.io.Reader.nullReader();
    Object v11 = Character.valueOf((char)0);
    Object v12 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v11).charValue()));
    Object v13 = 18L;
    Object v14 = 12L;
    Object v15 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v10),((org.apache.commons.csv.CSVFormat)v12),(((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v9).printRecords(((java.lang.Iterable)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v11));
    Object v12 = null;
    Object v13 = java.io.Reader.nullReader();
    Object v14 = Character.valueOf((char)0);
    Object v15 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v14).charValue()));
    Object v16 = 18L;
    Object v17 = 12L;
    Object v18 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v13),((org.apache.commons.csv.CSVFormat)v15),(((java.lang.Long)v16).longValue()),(((java.lang.Long)v17).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Iterable)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).println();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = "\rl\n";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).flush();
    Object v6 = null;
    ((org.apache.commons.csv.CSVPrinter)v5).println();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeader(((java.lang.String[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = "E&RECORD";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = "formaet";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    Object v8 = java.io.Reader.nullReader();
    Object v9 = Character.valueOf((char)0);
    Object v10 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v9).charValue()));
    Object v11 = 18L;
    Object v12 = 12L;
    Object v13 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v8),((org.apache.commons.csv.CSVFormat)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeader(((java.lang.String[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v11));
    Object v12 = null;
    Object v13 = "')";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeader(((java.lang.String[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = null;
    ((org.apache.commons.csv.CSVPrinter)v9).printRecords(((java.sql.ResultSet)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v6 = null;
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = "TOKEN";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeader(((java.lang.String[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Object[])v6));
    Object v7 = null;
    ((org.apache.commons.csv.CSVPrinter)v5).flush();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeaderComments(((java.lang.Object[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Iterable)v11));
    Object v12 = null;
    Object v13 = "')";
    ((org.apache.commons.csv.CSVPrinter)v5).printComment(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)3);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v5).close();
    Object v6 = null;
    Object v7 = java.io.Reader.nullReader();
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = 18L;
    Object v11 = 12L;
    Object v12 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v7),((org.apache.commons.csv.CSVFormat)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Iterable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    Object v5 = Character.valueOf((char)0);
    Object v6 = ((java.lang.Appendable)v4).append((((java.lang.Character)v5).charValue()));
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v8));
    ((org.apache.commons.csv.CSVPrinter)v9).println();
    Object v10 = null;
    ((org.apache.commons.csv.CSVPrinter)v9).close();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = ((java.lang.Iterable)v11).spliterator();
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Iterable)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).print(((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.lang.Appendable)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v4));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = ((java.lang.Iterable)v11).spliterator();
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withHeader(((java.lang.String[])v3));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v5).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)0);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = 18L;
    Object v10 = 12L;
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    ((org.apache.commons.csv.CSVPrinter)v5).printRecords(((java.lang.Iterable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }
}
