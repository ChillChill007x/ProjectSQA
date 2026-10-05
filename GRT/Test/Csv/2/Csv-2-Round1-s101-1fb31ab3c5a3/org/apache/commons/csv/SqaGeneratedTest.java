package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((java.lang.Iterable)v7).spliterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "(ine ";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).get(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).toString();
    org.junit.Assert.assertEquals((Object)("[e]"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "The delimiter cannot be a line break";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "B\n";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).get(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "The delimiter cannot be a line break";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "TOKEE";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "The comment start character and the delimiter cannot be the same ('";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "Escape=";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "EFRECORD";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((java.lang.Iterable)v7).spliterator();
    Object v9 = ") invalid char between encapsulated token and delimitjer";
    Object v10 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "No header mapping was specified, the record values can't be accessed by name";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).toString();
    Object v9 = "')";
    Object v10 = ((org.apache.commons.csv.CSVRecord)v7).get(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.lang.String[]{"Not impleamented yet","Index for header '%s' is %d but CSVRecord only has %d values!",")"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = ") invalid char between encapsulated token a+d delimiter";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.lang.String[]{"Not impleamented yet","Index for header '%s' is %d but CSVRecord only has %d values!",")"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = ") invalid char between encapsulated token a+d delimiter";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = " EmptyLinesignored";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = 13;
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).get((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "CommentStarz=<";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "No more CSV records availa'ble";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 32L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).iterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 32L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "]\n";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).get(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 32L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = -30;
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).get((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toString();
    org.junit.Assert.assertEquals((Object)("[, ) invalid parse sequence, The delimiter cannot be a line break]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).getComment();
    org.junit.Assert.assertEquals((Object)("The escape character and tfhe delimiter cannot be the same ('"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.lang.String[]{"e"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "'J)";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.lang.String[]{"Not impleamented yet","Index for header '%s' is %d but CSVRecord only has %d values!",")"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = ") invalid char between encapsulated token a+d delimiter";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).size();
    org.junit.Assert.assertEquals((Object)(3), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "CommentStar";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).values();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).toString();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).values();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "The comment start character and the quoteChar cannot be the sameN ('";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).get(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).iterator();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).size();
    org.junit.Assert.assertEquals((Object)(3), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "The delimiter cannot be a line break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "CommentStart=<";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.lang.String[]{"Not impleamented yet","Index for header '%s' is %d but CSVRecord only has %d values!",")"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = ") invalid char between encapsulated token a+d delimiter";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).iterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).getRecordNumber();
    org.junit.Assert.assertEquals((Object)(1L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The quoteCh";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "(l";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.lang.String[]{"Th","\r\n","Delimiter=<"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(linF ";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The quoteCh";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = null;
    ((java.lang.Iterable)v6).forEach(((java.util.function.Consumer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = null;
    ((java.lang.Iterable)v6).forEach(((java.util.function.Consumer)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.lang.String[]{"","(line "};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v6 = 1;
    Object v7 = 1.0F;
    Object v8 = new java.util.HashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = "(l#ne ";
    Object v10 = 1L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v5),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.csv.CSVRecord)v11).getRecordNumber();
    Object v13 = ((java.util.Map)v4).containsKey(((java.lang.Object)v12));
    Object v14 = "The delimiter annot be a line break";
    Object v15 = 4L;
    Object v16 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v14),(((java.lang.Long)v15).longValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).getComment();
    org.junit.Assert.assertEquals((Object)("INVALID"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "The delimiter cannot be &a line break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).values();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "The comment start character cannot be a line break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = " [";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.lang.String[]{"Not impleamented yet","Index for header '%s' is %d but CSVRecord only has %d values!",")"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = ") invalid char between encapsulated token a+d delimiter";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.csv.CSVRecord)v7).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).iterator();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The quoteCh";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "EORECOSRD";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).get(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "The delimiter cannot be a line break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).get(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.String[]{"NON_NUMERIC"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(line ";
    Object v5 = -14L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.lang.String[]{"NON_NUMERIC"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(line ";
    Object v5 = -14L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).iterator();
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "TOKEN";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = " EmptyLines:oignored";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).get(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "'1";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.lang.String[]{"NON_NUMERIC"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(line ";
    Object v5 = -14L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "The comment start `haracter cannot be a line break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.lang.String[]{"CommentStart=<","NON_NUMERI"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v5 = 1;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v9 = 0L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v4),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = " [";
    Object v12 = ((org.apache.commons.csv.CSVRecord)v10).isSet(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = 1.0F;
    Object v15 = new java.util.HashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v12),((java.lang.Object)v15));
    Object v17 = "The escape chara";
    Object v18 = 26L;
    Object v19 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v17),(((java.lang.Long)v18).longValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The quoteCh";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).values();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new java.lang.String[]{"The delimiter cannot be a line "};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "The quoteChar cannot be a line break";
    Object v6 = 13L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.lang.String[]{""};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "\r\n";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.String[]{"The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character cannot be a line break";
    Object v5 = 17L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).isConsistent();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The quoteCh";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).size();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.lang.String[]{"The delimiter cannot be a line "};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "The quoteChar cannot be a line break";
    Object v6 = 13L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "]";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.lang.String[]{"'F)"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "G)";
    Object v5 = -3L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.lang.String[]{"NON_NUMERIC"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(line ";
    Object v5 = -14L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "'a";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    Object v9 = "EOFdwhilst processing escape sequence";
    Object v10 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "The delimiter cannot be a line break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "INVALIQD";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.lang.String[]{"",") invalid parse sequence","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character and tfhe delimiter cannot be the same ('";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.csv.CSVRecord)v6).size();
    org.junit.Assert.assertEquals((Object)(3), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.lang.String[]{" B",""};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "The delim";
    Object v6 = 6L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.lang.String[]{"EOF whilst processing escape sequence","No quotes mode set but no escape character is","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v5 = 1;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = "(l#ne ";
    Object v9 = 1L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v4),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = "The delimiter cannot be &a line break";
    Object v12 = ((org.apache.commons.csv.CSVRecord)v10).isMapped(((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"Not impleamented yet","Index for header '%s' is %d but CSVRecord only has %d values!",")"};
    Object v14 = 1;
    Object v15 = 1.0F;
    Object v16 = new java.util.HashMap((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = java.util.Map.copyOf(((java.util.Map)v16));
    Object v18 = ") invalid char between encapsulated token a+d delimiter";
    Object v19 = 0L;
    Object v20 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v13),((java.util.Map)v17),((java.lang.String)v18),(((java.lang.Long)v19).longValue()));
    Object v21 = ((java.util.Map)v3).put(((java.lang.Object)v12),((java.lang.Object)v20));
    Object v22 = "The quoteChar cannot be a line break";
    Object v23 = -20L;
    Object v24 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v22),(((java.lang.Long)v23).longValue()));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.lang.String[]{"'F)"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "G)";
    Object v5 = -3L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "o";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.lang.String[]{"Th","\r\n","Delimiter=<"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(linF ";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "The delimiter cannot be a ine break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.lang.String[]{"EOF whilst processing escape sequence","No quotes mode set but no escape character is","The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v5 = 1;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = "(l#ne ";
    Object v9 = 1L;
    Object v10 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v4),((java.util.Map)v7),((java.lang.String)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = "The delimiter cannot be &a line break";
    Object v12 = ((org.apache.commons.csv.CSVRecord)v10).isMapped(((java.lang.String)v11));
    Object v13 = new java.lang.String[]{"Not impleamented yet","Index for header '%s' is %d but CSVRecord only has %d values!",")"};
    Object v14 = 1;
    Object v15 = 1.0F;
    Object v16 = new java.util.HashMap((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = java.util.Map.copyOf(((java.util.Map)v16));
    Object v18 = ") invalid char between encapsulated token a+d delimiter";
    Object v19 = 0L;
    Object v20 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v13),((java.util.Map)v17),((java.lang.String)v18),(((java.lang.Long)v19).longValue()));
    Object v21 = ((java.util.Map)v3).put(((java.lang.Object)v12),((java.lang.Object)v20));
    Object v22 = "The quoteChar cannot be a line break";
    Object v23 = -20L;
    Object v24 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v22),(((java.lang.Long)v23).longValue()));
    Object v25 = "Delimiter=<";
    Object v26 = ((org.apache.commons.csv.CSVRecord)v24).get(((java.lang.String)v25));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.lang.String[]{"Th","\r\n","Delimiter=<"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(linF ";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "The escape character cannot bge a line break";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.String[]{"","(line "};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v6 = 1;
    Object v7 = 1.0F;
    Object v8 = new java.util.HashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = "(l#ne ";
    Object v10 = 1L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v5),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.csv.CSVRecord)v11).getRecordNumber();
    Object v13 = ((java.util.Map)v4).containsKey(((java.lang.Object)v12));
    Object v14 = "The delimiter annot be a line break";
    Object v15 = 4L;
    Object v16 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v14),(((java.lang.Long)v15).longValue()));
    Object v17 = "(lgne ";
    Object v18 = ((org.apache.commons.csv.CSVRecord)v16).isSet(((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new java.lang.String[]{"The comment start character cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "";
    Object v5 = -11L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.lang.String[]{") invalid cha/r between encapsulated token and delimiter","No header mapping was specified, the record values can't be accessed by name","\\"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "INVALID";
    Object v6 = 16L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "')";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v8));
    Object v10 = "#";
    Object v11 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((java.lang.Iterable)v6).spliterator();
    Object v8 = "H";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.lang.String[]{"The comment start character cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "";
    Object v5 = -11L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "No header mapping was specified, the record values can't be accessed by name";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    Object v9 = "The .comment start character and the quoteChar cannot be the same ('";
    Object v10 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{" B",""};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "The delim";
    Object v6 = 6L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = -12;
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).get((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.lang.String[]{"The delimiter cannot be a line break"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "The escape character cannot be a line break";
    Object v5 = 17L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "ORECORD";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.lang.String[]{"NON_NUMERIC"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(line ";
    Object v5 = -14L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "INVALID";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.lang.String[]{"Not impleamented yet","Index for header '%s' is %d but CSVRecord only has %d values!",")"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = ") invalid char between encapsulated token a+d delimiter";
    Object v6 = 0L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = " EmptuyLines:ignored";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isMapped(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.lang.String[]{""};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "\r\n";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "\n";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).get(((java.lang.String)v7));
    Object v9 = "\r\n";
    Object v10 = ((org.apache.commons.csv.CSVRecord)v6).isMapped(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(l#ne ";
    Object v5 = 1L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "Not implemented yet";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).get(((java.lang.String)v7));
    Object v9 = "The delimiter cannot be a line break";
    Object v10 = ((org.apache.commons.csv.CSVRecord)v6).get(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.lang.String[]{"Th","\r\n","Delimiter=<"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = "(linF ";
    Object v5 = 0L;
    Object v6 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = "EOF whilst processing escTpe sequence";
    Object v8 = ((org.apache.commons.csv.CSVRecord)v6).isSet(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.lang.String[]{};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = "\r\n";
    Object v6 = 32L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = "The comment start characer and the delimiter cannot be the same ('";
    Object v9 = ((org.apache.commons.csv.CSVRecord)v7).isSet(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.lang.String[]{"EOF whilst processing escape sequence"};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = ((java.util.Map)v3).isEmpty();
    Object v5 = "";
    Object v6 = 1L;
    Object v7 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v3),((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.lang.String[]{"","(line "};
    Object v1 = 1;
    Object v2 = 1.0F;
    Object v3 = new java.util.HashMap((((java.lang.Integer)v1).intValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = java.util.Map.copyOf(((java.util.Map)v3));
    Object v5 = new java.lang.String[]{"The czmment start character cannot be a line break","The commen"};
    Object v6 = 1;
    Object v7 = 1.0F;
    Object v8 = new java.util.HashMap((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = "(l#ne ";
    Object v10 = 1L;
    Object v11 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v5),((java.util.Map)v8),((java.lang.String)v9),(((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.csv.CSVRecord)v11).getRecordNumber();
    Object v13 = ((java.util.Map)v4).containsKey(((java.lang.Object)v12));
    Object v14 = "The delimiter annot be a line break";
    Object v15 = 4L;
    Object v16 = new org.apache.commons.csv.CSVRecord(((java.lang.String[])v0),((java.util.Map)v4),((java.lang.String)v14),(((java.lang.Long)v15).longValue()));
    Object v17 = ((org.apache.commons.csv.CSVRecord)v16).iterator();
    Object v18 = ((org.apache.commons.csv.CSVRecord)v16).getComment();
    org.junit.Assert.assertEquals((Object)("The delimiter annot be a line break"), v18);
  }
}
