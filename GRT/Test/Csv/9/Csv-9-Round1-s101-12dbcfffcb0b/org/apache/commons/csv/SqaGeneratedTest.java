package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.lang.String[]{"Unexpeceed Quote value: "};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "Escape=<";
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).toString();
    Object v7 = "The quoteChar cannot be a line break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v5).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Unexpeceed Quote value: "};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "Escape=<";
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "sring";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).get(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.lang.String[]{"Unexpeceed Quote value: "};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "Escape=<";
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).toMap();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.lang.String[]{"Unexpeceed Quote value: "};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "Escape=<";
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = java.util.Map.of();
    Object v7 = java.util.Map.copyOf(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v7).hashCode();
    Object v9 = ((org.apache.commons.csv.CSVRecord)v5).putIn(((java.util.Map)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.lang.String[]{"Unexpeceed Quote value: "};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "Escape=<";
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = null;
    ((java.lang.Iterable)v5).forEach(((java.util.function.Consumer)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "(sta-tline ";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isMapped(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.lang.String[]{"Unexpeceed Quote value: "};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "Escape=<";
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((java.lang.Iterable)v5).spliterator();
    Object v7 = ((java.lang.Iterable)v5).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).toMap();
    Object v7 = "The comment s";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v5).get(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.lang.String[]{"Unexpeceed Quote value: "};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "Escape=<";
    Object v4 = 1L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "NON_NUMERIC";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isSet(((java.lang.String)v6));
    Object v8 = "sItring";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v5).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).toMap();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toMap();
    Object v8 = "The comment start character cannot be aline break";
    Object v9 = -9L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).toString();
    Object v7 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v8 = java.util.Map.of();
    Object v9 = java.util.Map.copyOf(((java.util.Map)v8));
    Object v10 = "ALL";
    Object v11 = 42L;
    Object v12 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v7),((java.util.Map)v9),((java.lang.String)v10),(((java.lang.Long)v11).longValue()));
    Object v13 = ((org.apache.commons.csv.CSVRecord)v12).toMap();
    Object v14 = ((org.apache.commons.csv.CSVRecord)v5).putIn(((java.util.Map)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = " Em";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).get(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "(lineT";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isMapped(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).toString();
    org.junit.Assert.assertEquals((Object)("[Mapping for %s not found, expected one of %s]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "The escape character and the deli";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isSet(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toMap();
    Object v8 = "The comment start character cannot be aline break";
    Object v9 = -9L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.csv.CSVRecord)v10).iterator();
    Object v12 = java.util.Map.of();
    Object v13 = java.util.Map.copyOf(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.csv.CSVRecord)v10).putIn(((java.util.Map)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = " EmptyLines:ignored";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isSet(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = java.util.Map.of();
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).putIn(((java.util.Map)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "\u2029";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isSet(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((java.lang.Iterable)v5).spliterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).toString();
    Object v7 = 6;
    Object v8 = ((org.apache.commons.csv.CSVRecord)v5).get((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = java.util.Map.of();
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).putIn(((java.util.Map)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).iterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = java.util.Map.of();
    Object v7 = java.util.Map.copyOf(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v7).size();
    Object v9 = ((org.apache.commons.csv.CSVRecord)v5).putIn(((java.util.Map)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.lang.String[]{"The eader contains a duplicate entry: '","\r\n"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toString();
    Object v8 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v9 = java.util.Map.of();
    Object v10 = java.util.Map.copyOf(((java.util.Map)v9));
    Object v11 = "ALL";
    Object v12 = 42L;
    Object v13 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v8),((java.util.Map)v10),((java.lang.String)v11),(((java.lang.Long)v12).longValue()));
    Object v14 = ((org.apache.commons.csv.CSVRecord)v13).toMap();
    Object v15 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v14));
    Object v16 = "The header contains dupli/cate names: ";
    Object v17 = 0L;
    Object v18 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v15),((java.lang.String)v16),(((java.lang.Long)v17).longValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "ALL";
    Object v7 = org.apache.commons.csv.Quote.valueOf(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v5).get(((java.lang.Enum)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.lang.String[]{"The eader contains a duplicate entry: '","\r\n"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toString();
    Object v8 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v9 = java.util.Map.of();
    Object v10 = java.util.Map.copyOf(((java.util.Map)v9));
    Object v11 = "ALL";
    Object v12 = 42L;
    Object v13 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v8),((java.util.Map)v10),((java.lang.String)v11),(((java.lang.Long)v12).longValue()));
    Object v14 = ((org.apache.commons.csv.CSVRecord)v13).toMap();
    Object v15 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v14));
    Object v16 = "The header contains dupli/cate names: ";
    Object v17 = 0L;
    Object v18 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v15),((java.lang.String)v16),(((java.lang.Long)v17).longValue()));
    Object v19 = ((org.apache.commons.csv.CSVRecord)v18).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(0L), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "The comment start character and the quoteChar cannot bethe same ('";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).get(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.lang.String[]{"EOF whilst processinM escape sequence","","The delimiter cannot be a lin"};
    Object v1 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "\r\n";
    Object v5 = 23L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = java.util.Map.copyOf(((java.util.Map)v7));
    Object v9 = ((java.util.Map)v8).size();
    Object v10 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v8));
    Object v11 = "Escape";
    Object v12 = -1L;
    Object v13 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v10),((java.lang.String)v11),(((java.lang.Long)v12).longValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"EOF whilst processinM escape sequence","","The delimiter cannot be a lin"};
    Object v1 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "\r\n";
    Object v5 = 23L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = java.util.Map.copyOf(((java.util.Map)v7));
    Object v9 = ((java.util.Map)v8).size();
    Object v10 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v8));
    Object v11 = "Escape";
    Object v12 = -1L;
    Object v13 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v10),((java.lang.String)v11),(((java.lang.Long)v12).longValue()));
    Object v14 = "Nformat";
    Object v15 = ((org.apache.commons.csv.CSVRecord)v13).get(((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((java.lang.Iterable)v5).spliterator();
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).toString();
    org.junit.Assert.assertEquals((Object)("[The escape charater cannot be a line break, format]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.lang.String[]{"The delimiter cannot be a line break","format","COMMENT"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v7));
    Object v9 = "]";
    Object v10 = 0L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.lang.String[]{"EOF whilst processinM escape sequence","","The delimiter cannot be a lin"};
    Object v1 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "\r\n";
    Object v5 = 23L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = java.util.Map.copyOf(((java.util.Map)v7));
    Object v9 = ((java.util.Map)v8).size();
    Object v10 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v8));
    Object v11 = "Escape";
    Object v12 = -1L;
    Object v13 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v10),((java.lang.String)v11),(((java.lang.Long)v12).longValue()));
    Object v14 = "')";
    Object v15 = ((org.apache.commons.csv.CSVRecord)v13).isSet(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toMap();
    Object v8 = "The comment start character cannot be aline break";
    Object v9 = -9L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = "CyOMMENT";
    Object v12 = ((org.apache.commons.csv.CSVRecord)v10).isMapped(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "The delimiter can";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).toString();
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).size();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.lang.String[]{"QuoteChar=<","f"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = java.util.Map.of();
    Object v4 = ((java.util.Map)v2).equals(((java.lang.Object)v3));
    Object v5 = "Unexpected Token type: ";
    Object v6 = -3L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).size();
    org.junit.Assert.assertEquals((Object)(3), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "format";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "f}ormat";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "(lin";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toMap();
    Object v8 = "The comment start character cannot be aline break";
    Object v9 = -9L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = java.util.Map.of();
    Object v12 = ((org.apache.commons.csv.CSVRecord)v10).putIn(((java.util.Map)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.csv.CSVRecord)v5).isConsistent();
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "\u2028";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isSet(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.lang.String[]{"The delimiter cannot be a line break","format","COMMENT"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v7));
    Object v9 = "]";
    Object v10 = 0L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    Object v12 = "";
    Object v13 = ((org.apache.commons.csv.CSVRecord)v11).isSet(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "string";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isSet(((java.lang.String)v5));
    Object v7 = "The comment start character and the delimiter cannot be the same ('";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).toString();
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isConsistent();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).getComment();
    org.junit.Assert.assertEquals((Object)("charset"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "CSVParser has been closed";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isSet(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.String[]{"The delimiter cannot be a line break","format","COMMENT"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v7));
    Object v9 = "]";
    Object v10 = 0L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.csv.CSVRecord)v11).iterator();
    Object v13 = ((org.apache.commons.csv.CSVRecord)v11).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(0L), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "Mapping for %~s not found, expected one of %s";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isSet(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "Delimi\"er=<";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isSet(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "format";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "format";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s","The header contains a duplicate entry: '"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v3 = java.util.Map.of();
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "ALL";
    Object v6 = 42L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v2),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).toMap();
    Object v9 = "The comment start character cannot be aline break";
    Object v10 = -9L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    Object v12 = java.util.Map.of();
    Object v13 = ((org.apache.commons.csv.CSVRecord)v11).putIn(((java.util.Map)v12));
    Object v14 = ((java.util.Map)v13).entrySet();
    Object v15 = "EOFO whilst processing escape sequence";
    Object v16 = 1L;
    Object v17 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v13),((java.lang.String)v15),(((java.lang.Long)v16).longValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = java.util.Map.of();
    Object v6 = java.util.Map.copyOf(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v4).putIn(((java.util.Map)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).toString();
    org.junit.Assert.assertEquals((Object)("[reader, Unexpected Quote alue: , NO]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = java.util.Map.of();
    Object v6 = java.util.Map.copyOf(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v4).putIn(((java.util.Map)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "ALL";
    Object v4 = 42L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "INVALID";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).get(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = " SkipHead";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isMapped(((java.lang.String)v6));
    Object v8 = "file";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v5).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "'.";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "The comment start and the escape character cannot be the same ('";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isSet(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).toMap();
    Object v6 = "format";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v1 = java.util.Map.of();
    Object v2 = "\r\n";
    Object v3 = -49L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ") EOFreached before encapsulated token finished";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isSet(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.lang.String[]{"INVALID"};
    Object v1 = java.util.Map.of();
    Object v2 = "TOKEN";
    Object v3 = 13L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "BLL";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "Esca@pe=<";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.lang.String[]{"INVALID"};
    Object v1 = java.util.Map.of();
    Object v2 = "TOKEN";
    Object v3 = 13L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).toMap();
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toMap();
    Object v8 = "The comment start character cannot be aline break";
    Object v9 = -9L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = ((org.apache.commons.csv.CSVRecord)v10).iterator();
    Object v12 = ((org.apache.commons.csv.CSVRecord)v10).values();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((java.lang.Iterable)v4).spliterator();
    Object v6 = " EmptyLines:gnored";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v4).isSet(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = java.util.Map.of();
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).putIn(((java.util.Map)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).get((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)("formaQt"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).toString();
    Object v6 = "The quoteChr character and the delimiter cannot be the same ('";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v1 = java.util.Map.of();
    Object v2 = java.util.Map.copyOf(((java.util.Map)v1));
    Object v3 = "\r\n";
    Object v4 = 23L;
    Object v5 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v2),((java.lang.String)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = "format";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v5).isMapped(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).isConsistent();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v6 = java.util.Map.of();
    Object v7 = java.util.Map.copyOf(((java.util.Map)v6));
    Object v8 = "\r\n";
    Object v9 = 23L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v5),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = java.util.Map.of();
    Object v12 = ((org.apache.commons.csv.CSVRecord)v10).putIn(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.csv.CSVRecord)v4).putIn(((java.util.Map)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.lang.String[]{"EOF whilst processinM escape sequence","","The delimiter cannot be a lin"};
    Object v1 = new java.lang.String[]{"The escape charater cannot be a line break","format"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "\r\n";
    Object v5 = 23L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = java.util.Map.copyOf(((java.util.Map)v7));
    Object v9 = ((java.util.Map)v8).size();
    Object v10 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v8));
    Object v11 = "Escape";
    Object v12 = -1L;
    Object v13 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v10),((java.lang.String)v11),(((java.lang.Long)v12).longValue()));
    Object v14 = "Unexpected Quote value: ";
    Object v15 = ((org.apache.commons.csv.CSVRecord)v13).isSet(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.lang.String[]{"The quoteChar character and the delimiter cannot be the same ('","'`)","Index for header '%s' is %d but CSVRecord only has d values!"};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v3 = java.util.Map.of();
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "ALL";
    Object v6 = 42L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v2),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).toMap();
    Object v9 = "The comment start character cannot be aline break";
    Object v10 = -9L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.csv.CSVRecord)v11).iterator();
    Object v13 = java.util.Map.of();
    Object v14 = java.util.Map.copyOf(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.csv.CSVRecord)v11).putIn(((java.util.Map)v14));
    Object v16 = new java.lang.String[]{"reader","Unexpected Quote alue: ","NO"};
    Object v17 = java.util.Map.of();
    Object v18 = "\r\n";
    Object v19 = -49L;
    Object v20 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v16),((java.util.Map)v17),((java.lang.String)v18),(((java.lang.Long)v19).longValue()));
    Object v21 = ") EOFreached before encapsulated token finished";
    Object v22 = ((org.apache.commons.csv.CSVRecord)v20).isSet(((java.lang.String)v21));
    Object v23 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v24 = java.util.Map.of();
    Object v25 = "charset";
    Object v26 = 41L;
    Object v27 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v23),((java.util.Map)v24),((java.lang.String)v25),(((java.lang.Long)v26).longValue()));
    Object v28 = "CSVParser has been closed";
    Object v29 = ((org.apache.commons.csv.CSVRecord)v27).isSet(((java.lang.String)v28));
    Object v30 = ((java.util.Map)v15).getOrDefault(((java.lang.Object)v22),((java.lang.Object)v29));
    Object v31 = "XALL";
    Object v32 = -22L;
    Object v33 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v15),((java.lang.String)v31),(((java.lang.Long)v32).longValue()));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "f*ile";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "Heade";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "EOREORD";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.lang.String[]{"INVALID"};
    Object v1 = java.util.Map.of();
    Object v2 = "TOKEN";
    Object v3 = 13L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "N]ONE";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isSet(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v7));
    Object v9 = "Unexpected Token type: ";
    Object v10 = -39L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = java.util.Map.of();
    Object v2 = "The header contains duplicate names: ";
    Object v3 = 0L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = "The delimiter cannot be a line brea*";
    Object v6 = ((org.apache.commons.csv.CSVRecord)v4).isMapped(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = new java.lang.String[]{"Mapping for %s not found, expected one of %s"};
    Object v2 = java.util.Map.of();
    Object v3 = java.util.Map.copyOf(((java.util.Map)v2));
    Object v4 = "ALL";
    Object v5 = 42L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v1),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Map.of();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).putIn(((java.util.Map)v7));
    Object v9 = "Unexpected Token type: ";
    Object v10 = -39L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.csv.CSVRecord)v11).isConsistent();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"formaQt",") invalid parse Bequence"};
    Object v1 = java.util.Map.of();
    Object v2 = "charset";
    Object v3 = 41L;
    Object v4 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v1),((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.csv.CSVRecord)v4).toString();
    Object v6 = "ABL";
    Object v7 = ((org.apache.commons.csv.CSVRecord)v4).get(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
