package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "(startQline ";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "(startQline ";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "(startQline ";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "(startQline ";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).iterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.util.TreeSet();
    Object v1 = ((java.lang.Iterable)v0).spliterator();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet(((java.util.SortedSet)v6));
    Object v8 = ((org.apache.commons.csv.CSVParser)v5).getRecords(((java.util.Collection)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).nextRecord();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getCurrentLineNumber();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.util.TreeSet();
    Object v7 = ((org.apache.commons.csv.CSVParser)v5).getRecords(((java.util.Collection)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.util.TreeSet();
    Object v7 = ((org.apache.commons.csv.CSVParser)v5).getRecords(((java.util.Collection)v6));
    Object v8 = ((org.apache.commons.csv.CSVParser)v5).nextRecord();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getHeaderMap();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet(((java.util.SortedSet)v6));
    Object v8 = ((org.apache.commons.csv.CSVParser)v5).getRecords(((java.util.Collection)v7));
    Object v9 = ((java.lang.Iterable)v8).spliterator();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = true;
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withIgnoreSurroundingSpaces((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v4),((org.apache.commons.csv.CSVFormat)v6));
    Object v10 = new java.util.TreeSet();
    Object v11 = new java.util.TreeSet(((java.util.SortedSet)v10));
    Object v12 = ((org.apache.commons.csv.CSVParser)v9).getRecords(((java.util.Collection)v11));
    Object v13 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = new java.util.TreeSet();
    Object v7 = java.io.Reader.nullReader();
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = true;
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withIgnoreSurroundingSpaces((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v7),((org.apache.commons.csv.CSVFormat)v9));
    Object v13 = new java.util.TreeSet();
    Object v14 = new java.util.TreeSet(((java.util.SortedSet)v13));
    Object v15 = ((org.apache.commons.csv.CSVParser)v12).getRecords(((java.util.Collection)v14));
    Object v16 = ((java.util.Collection)v6).removeAll(((java.util.Collection)v15));
    Object v17 = ((org.apache.commons.csv.CSVParser)v5).getRecords(((java.util.Collection)v6));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = true;
    Object v10 = ((org.apache.commons.csv.CSVFormat)v8).withIgnoreSurroundingSpaces((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v6),((org.apache.commons.csv.CSVFormat)v8));
    Object v12 = new java.util.TreeSet();
    Object v13 = ((org.apache.commons.csv.CSVParser)v11).getRecords(((java.util.Collection)v12));
    Object v14 = ((org.apache.commons.csv.CSVParser)v5).getRecords(((java.util.Collection)v13));
    Object v15 = ((org.apache.commons.csv.CSVParser)v5).nextRecord();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).iterator();
    Object v7 = ((org.apache.commons.csv.CSVParser)v5).nextRecord();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).iterator();
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).iterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = "The delimiter cannot be a line break";
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    Object v8 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v5),((org.apache.commons.csv.CSVFormat)v7));
    Object v9 = ((org.apache.commons.csv.CSVParser)v8).getRecords();
    Object v10 = ((org.apache.commons.csv.CSVParser)v4).getRecords(((java.util.Collection)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = ((org.apache.commons.csv.CSVParser)v4).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getCurrentLineNumber();
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).spliterator();
    Object v6 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "(startQline ";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).iterator();
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = ((org.apache.commons.csv.CSVParser)v4).nextRecord();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.TreeSet();
    ((java.util.Collection)v4).clear();
    Object v5 = null;
    Object v6 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = "The delimiter cannot be a line break";
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    Object v8 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v5),((org.apache.commons.csv.CSVFormat)v7));
    Object v9 = ((org.apache.commons.csv.CSVParser)v8).getRecords();
    Object v10 = ((org.apache.commons.csv.CSVParser)v4).getRecords(((java.util.Collection)v9));
    Object v11 = null;
    ((java.lang.Iterable)v10).forEach(((java.util.function.Consumer)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "(startQline ";
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v4),((org.apache.commons.csv.CSVFormat)v6));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getRecords();
    Object v9 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    ((org.apache.commons.csv.CSVParser)v4).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = ((org.apache.commons.csv.CSVParser)v4).getRecords(((java.util.Collection)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "The delimiter cannot be a line break";
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v4),((org.apache.commons.csv.CSVFormat)v6));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getRecords();
    Object v9 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "B\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((java.lang.Iterable)v3).spliterator();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = null;
    ((java.lang.Iterable)v5).forEach(((java.util.function.Consumer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = new java.util.TreeSet();
    Object v6 = ((org.apache.commons.csv.CSVParser)v4).getRecords(((java.util.Collection)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "B\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "B\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "B\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((java.lang.Iterable)v3).spliterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = ((java.io.Reader)v0).read();
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v2).charValue()));
    Object v4 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v3));
    Object v5 = ((org.apache.commons.csv.CSVParser)v4).getRecords();
    Object v6 = ((org.apache.commons.csv.CSVParser)v4).getHeaderMap();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "B\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "B\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "(startQline ";
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v4),((org.apache.commons.csv.CSVFormat)v6));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getRecords();
    Object v9 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v6 = ((org.apache.commons.csv.CSVParser)v5).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = true;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreSurroundingSpaces((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v6 = null;
    ((org.apache.commons.csv.CSVParser)v5).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "\u0085";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = java.nio.charset.Charset.defaultCharset();
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v3).charValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.io.File)v1),((java.nio.charset.Charset)v2),((org.apache.commons.csv.CSVFormat)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = ((java.io.Reader)v4).read();
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    Object v8 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v4),((org.apache.commons.csv.CSVFormat)v7));
    Object v9 = new java.util.TreeSet();
    Object v10 = new java.util.TreeSet(((java.util.SortedSet)v9));
    Object v11 = ((org.apache.commons.csv.CSVParser)v8).getRecords(((java.util.Collection)v10));
    Object v12 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v11));
    Object v13 = ((org.apache.commons.csv.CSVParser)v3).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = "(startQline ";
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v4),((org.apache.commons.csv.CSVFormat)v6));
    Object v8 = ((org.apache.commons.csv.CSVParser)v7).getRecords();
    Object v9 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    Object v5 = java.io.Reader.nullReader();
    Object v6 = ((java.io.Reader)v5).read();
    Object v7 = Character.valueOf((char)0);
    Object v8 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v7).charValue()));
    Object v9 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v5),((org.apache.commons.csv.CSVFormat)v8));
    Object v10 = new java.util.TreeSet();
    Object v11 = ((org.apache.commons.csv.CSVParser)v9).getRecords(((java.util.Collection)v10));
    Object v12 = ((java.util.Collection)v11).size();
    Object v13 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v11));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).iterator();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "B\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "The delimiter cannot be a line break";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = ((java.io.Reader)v4).read();
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    Object v8 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v4),((org.apache.commons.csv.CSVFormat)v7));
    Object v9 = new java.util.TreeSet();
    Object v10 = ((org.apache.commons.csv.CSVParser)v8).getRecords(((java.util.Collection)v9));
    Object v11 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    Object v5 = new java.util.TreeSet();
    Object v6 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getHeaderMap();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "(startQline ";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet(((java.util.SortedSet)v6));
    Object v8 = ((java.util.Collection)v5).addAll(((java.util.Collection)v7));
    Object v9 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "CSVPaHser has been closed";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = false;
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withIgnoreEmptyHeaders((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "B\r\n";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getRecords();
    ((org.apache.commons.csv.CSVParser)v3).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v5).charValue()));
    Object v7 = true;
    Object v8 = ((org.apache.commons.csv.CSVFormat)v6).withIgnoreSurroundingSpaces((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v4),((org.apache.commons.csv.CSVFormat)v6));
    Object v10 = new java.util.TreeSet();
    Object v11 = new java.util.TreeSet(((java.util.SortedSet)v10));
    Object v12 = ((org.apache.commons.csv.CSVParser)v9).getRecords(((java.util.Collection)v11));
    Object v13 = ((java.util.Collection)v12).iterator();
    Object v14 = ((org.apache.commons.csv.CSVParser)v3).getRecords(((java.util.Collection)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "')";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = null;
    ((java.lang.Iterable)v3).forEach(((java.util.function.Consumer)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "INVALID";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((java.lang.Iterable)v3).spliterator();
    Object v5 = ((org.apache.commons.csv.CSVParser)v3).nextRecord();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "format";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = org.apache.commons.csv.CSVParser.parse(((java.lang.String)v0),((org.apache.commons.csv.CSVFormat)v2));
    Object v4 = ((org.apache.commons.csv.CSVParser)v3).getCurrentLineNumber();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v1).charValue()));
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((org.apache.commons.csv.CSVFormat)v2).withDelimiter((((java.lang.Character)v3).charValue()));
    Object v5 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v2));
    org.junit.Assert.assertNotNull(v5);
  }
}
