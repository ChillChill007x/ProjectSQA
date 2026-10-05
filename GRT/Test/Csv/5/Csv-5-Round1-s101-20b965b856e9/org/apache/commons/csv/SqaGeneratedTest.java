package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
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
  public void test1() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "The delimiter cannot be a line break";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    Object v5 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.io.StringWriter();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v4));
    Object v5 = null;
    Object v6 = "(line ";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "The delimiter cannot be a line";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
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
  public void test13() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "Pa!rameter '";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
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
  public void test18() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "COMMENT";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "Null(String=<";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
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
  public void test24() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = new java.util.ArrayList();
    Object v6 = ((java.lang.Iterable)v5).spliterator();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.io.StringWriter();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v6));
    Object v8 = ((org.apache.commons.csv.CSVPrinter)v7).getOut();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
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
  public void test28() throws Throwable {
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
  public void test29() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "NON_NUMERIC";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "Header:";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "reader";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = "NON_NUMERIC";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "The comment start character and the quoteChar cannot be the same ('";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "format";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v5));
    Object v6 = null;
    Object v7 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "(lZine ";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    Object v7 = ((java.lang.Iterable)v6).iterator();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.sql.ResultSet)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v4 = null;
    Object v5 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.io.StringWriter();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v4));
    Object v5 = null;
    Object v6 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.sql.ResultSet)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ") EOF reached before encapsulated token finished";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v5));
    Object v6 = null;
    Object v7 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "NullString=<";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "MBNIMAL";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = ((java.lang.Iterable)v4).iterator();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "Delimite!=<";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    Object v5 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v4));
    Object v5 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = " EmptyLines:ignored";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = "frmat";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v4 = null;
    Object v5 = "MINBMAL";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.sql.ResultSet)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = "')";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    Object v5 = "No header mapping was specifie";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    Object v5 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "The escape character and the delimiter cannot be the same ('";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "cormat";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.sql.ResultSet)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).flush();
    Object v4 = null;
    Object v5 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "fmrmat";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v4 = null;
    Object v5 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.io.StringWriter();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v6));
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = "The commet start and the escape character cannot be the same ('";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "\u2029";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "9\r\n";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "=";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v4 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = ((java.lang.Iterable)v4).iterator();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
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
  public void test93() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVPrinter)v3).close();
    Object v4 = null;
    Object v5 = ((org.apache.commons.csv.CSVPrinter)v3).getOut();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = "\u0085";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.io.StringWriter();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v6));
    ((org.apache.commons.csv.CSVPrinter)v7).close();
    Object v8 = null;
    Object v9 = ((org.apache.commons.csv.CSVPrinter)v7).getOut();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.io.StringWriter();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v4),((org.apache.commons.csv.CSVFormat)v6));
    ((org.apache.commons.csv.CSVPrinter)v7).close();
    Object v8 = null;
    Object v9 = ((org.apache.commons.csv.CSVPrinter)v7).getOut();
    ((org.apache.commons.csv.CSVPrinter)v3).print(((java.lang.Object)v9));
    Object v10 = null;
    ((org.apache.commons.csv.CSVPrinter)v3).println();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = new java.lang.Object[]{null,null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.lang.Object[]{null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v4));
    Object v5 = null;
    Object v6 = new java.lang.Object[]{null,null};
    ((org.apache.commons.csv.CSVPrinter)v3).printRecord(((java.lang.Object[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.io.StringWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVPrinter(((java.lang.Appendable)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.ArrayList();
    ((org.apache.commons.csv.CSVPrinter)v3).printRecords(((java.lang.Iterable)v4));
    Object v5 = null;
    Object v6 = ") EOF reached before encapsulated token finished";
    ((org.apache.commons.csv.CSVPrinter)v3).printComment(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }
}
