package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.util.Comparator.reverseOrder();
    Object v1 = new java.util.TreeSet(((java.util.Comparator)v0));
    Object v2 = new java.util.HashSet(((java.util.Collection)v1));
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.Reader.nullReader();
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.csv.Quote.ALL;
    Object v4 = Character.valueOf((char)0);
    Object v5 = Character.valueOf((char)0);
    Object v6 = true;
    Object v7 = false;
    Object v8 = " SurroundingSpaces:ignore[";
    Object v9 = "\rS";
    Object v10 = new java.lang.String[]{};
    Object v11 = true;
    Object v12 = new org.apache.commons.csv.CSVFormat((((java.lang.Character)v1).charValue()),((java.lang.Character)v2),((org.apache.commons.csv.Quote)v3),((java.lang.Character)v4),((java.lang.Character)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()),((java.lang.String)v8),((java.lang.String)v9),((java.lang.String[])v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new org.apache.commons.csv.CSVParser(((java.io.Reader)v0),((org.apache.commons.csv.CSVFormat)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
