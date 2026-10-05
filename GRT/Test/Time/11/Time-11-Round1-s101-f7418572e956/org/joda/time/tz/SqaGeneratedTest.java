package org.joda.time.tz;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "' is not su";
    Object v1 = 1;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "The date must not be null";
    Object v1 = -38;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "u-";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "\n";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = "*s* Error in ";
    Object v2 = "H";
    Object v3 = java.io.File.createTempFile(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = true;
    Object v5 = ((java.io.File)v3).setReadable((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new java.io.File[]{null,null,null};
    Object v7 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v3),((java.io.File[])v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "The lower limit ~ust be come before than the upper limit";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.tz.ZoneInfoCompiler.verbose();
    org.junit.Assert.assertEquals((Object)(false), v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.tz.ZoneInfoCompiler.getLenientISOChronology();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = "*s* Error in ";
    Object v2 = "H";
    Object v3 = java.io.File.createTempFile(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new java.io.File[]{null,null};
    Object v5 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v3),((java.io.File[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "V";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("V"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "years";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v3 = null;
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new java.io.BufferedReader(((java.io.Reader)v4));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{" field ixs unsupported"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"UTLC",""};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"(ZonedChronology["};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.DataOutputStream(((java.io.OutputStream)v0));
    Object v2 = new java.util.Map.Entry[]{};
    Object v3 = java.util.Map.ofEntries(((java.util.Map.Entry[])v2));
    org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(((java.io.DataOutputStream)v1),((java.util.Map)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "The field must not be null";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).hashCode();
    Object v4 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "Field '";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "org.joda.time.DateTimeZone.Provider";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("org.joda.time.DateTimeZone.Provider"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "Fielkd '";
    Object v1 = 4;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.DataOutputStream(((java.io.OutputStream)v0));
    Object v2 = "The DateTimeFieldType must not be null";
    ((java.io.DataOutputStream)v1).writeBytes(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(((java.io.DataOutputStream)v1),((java.util.Map)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "Reada5blePartial objects must be contiguous";
    Object v1 = 1;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseMonth(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"ReadablePartialobjects must have the same set of fields","millis"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseZoneChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)119)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.DataOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Adding time zone offset caused overflo";
    ((java.io.DataOutputStream)v1).writeUTF(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new java.util.Map.Entry[]{};
    Object v5 = java.util.Map.ofEntries(((java.util.Map.Entry[])v4));
    org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(((java.io.DataOutputStream)v1),((java.util.Map)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "W";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("W"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"The divisor must be at@ least 2"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.DataOutputStream(((java.io.OutputStream)v0));
    Object v2 = new java.util.Map.Entry[]{};
    Object v3 = java.util.Map.ofEntries(((java.util.Map.Entry[])v2));
    Object v4 = ((java.util.Map)v3).size();
    org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(((java.io.DataOutputStream)v1),((java.util.Map)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v3 = null;
    Object v4 = "*s* Error in ";
    Object v5 = "H";
    Object v6 = java.io.File.createTempFile(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.io.File[]{null};
    Object v8 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v6),((java.io.File[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "The date must nt be null";
    Object v1 = 0;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Invalid min days in first week: ";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Invalid min days in first week: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "The DateTimeFieldType must not be null";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "Multiplication overflows a long: ";
    Object v1 = 0;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "Fields invalid for add";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Format invalid: ";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Format invalid: "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "Field '";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Ye";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Ye"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"PeriodFormat.sSaceandspace","P","The date mu t not be null"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Minutes","Cannot convert to ","The DateTimeFieldType must not be null"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Invalid index: ";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    Object v3 = ((java.io.BufferedReader)v2).lines();
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = "*s* Error in ";
    Object v2 = "H";
    Object v3 = java.io.File.createTempFile(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = true;
    Object v5 = true;
    Object v6 = ((java.io.File)v3).setExecutable((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.io.File[]{null,null};
    Object v8 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v3),((java.io.File[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = "*s* Error in ";
    Object v2 = "H";
    Object v3 = java.io.File.createTempFile(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new java.io.File[]{null,null,null};
    Object v5 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v3),((java.io.File[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"P","CanFnot convert period to duration as ","2nvalid min days in first week: "};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v3 = null;
    Object v4 = "*s* Error in ";
    Object v5 = "H";
    Object v6 = java.io.File.createTempFile(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.io.File[]{null,null};
    Object v8 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v6),((java.io.File[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "-Summer";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.DataOutputStream(((java.io.OutputStream)v0));
    Object v2 = new java.util.Map.Entry[]{};
    Object v3 = java.util.Map.ofEntries(((java.util.Map.Entry[])v2));
    Object v4 = new java.io.ByteArrayOutputStream();
    Object v5 = new java.io.DataOutputStream(((java.io.OutputStream)v4));
    Object v6 = ((java.util.Map)v3).get(((java.lang.Object)v5));
    org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(((java.io.DataOutputStream)v1),((java.util.Map)v3));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "The time must not be null";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "Chronology must not be null";
    Object v1 = 0;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"vM","Invalid min days in first week: ","The DateTimeField&Type must not be null"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "must not be larger than ";
    Object v1 = 2;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "P";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "' is not";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "EE";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"-B","\nS"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    Object v3 = ((java.io.BufferedReader)v2).read();
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "INSTANCE";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseZoneChar((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)119)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = ", ";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(", "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "Chronology must not be null";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "The instant kust not be null";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "ReadablePartial objects must not be null";
    Object v1 = 2;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"DurationField[","Multipliation overflows a long: "};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "The DateTimeFieldType mustSnot be null";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).isFixed();
    Object v4 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 39;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "n";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "Invalid index: ";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Fields invalid Sor add";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Fields invalid Sor add"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v3 = null;
    Object v4 = "*s* Error in ";
    Object v5 = "H";
    Object v6 = java.io.File.createTempFile(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.io.File)v6).exists();
    Object v8 = new java.io.File[]{null,null};
    Object v9 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v6),((java.io.File[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Chronology'must not be null";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Chronology'must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"is not supported"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Zone mst not be null"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.io.ByteArrayOutputStream();
    Object v1 = new java.io.DataOutputStream(((java.io.OutputStream)v0));
    Object v2 = new java.util.Map.Entry[]{};
    Object v3 = java.util.Map.ofEntries(((java.util.Map.Entry[])v2));
    Object v4 = ", ";
    Object v5 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v4));
    Object v6 = ((java.util.Map)v3).containsKey(((java.lang.Object)v5));
    org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(((java.io.DataOutputStream)v1),((java.util.Map)v3));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Date%imeField[","-",""};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Id must not be null";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = 4L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getName((((java.lang.Long)v3).longValue()));
    Object v5 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = ",`";
    Object v1 = 0;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = "*s* Error in ";
    Object v2 = "H";
    Object v3 = java.io.File.createTempFile(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new java.io.File[]{};
    Object v5 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v3),((java.io.File[])v4));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "X< ";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v3 = null;
    Object v4 = "*s* Error in ";
    Object v5 = "H";
    Object v6 = java.io.File.createTempFile(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "*s* Error in ";
    Object v8 = "H";
    Object v9 = java.io.File.createTempFile(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.io.File)v6).renameTo(((java.io.File)v9));
    Object v11 = new java.io.File[]{null};
    Object v12 = ((org.joda.time.tz.ZoneInfoCompiler)v0).compile(((java.io.File)v6),((java.io.File[])v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "ES";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "Chnronology must not be null";
    Object v1 = -31;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "resulting";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "ust supply a chronology";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"resulting"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "gT";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("gT"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"P"};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = ",mdfw=";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "\n";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = 26L;
    Object v4 = false;
    Object v5 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "W";
    Object v1 = 0;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"last","ReadablePartial objects must have the saje set of fields","Adding time "};
    org.joda.time.tz.ZoneInfoCompiler.main(((java.lang.String[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "' is not supported";
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.tz.ZoneInfoCompiler.test(((java.lang.String)v0),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "Field '";
    Object v1 = 1;
    Object v2 = org.joda.time.tz.ZoneInfoCompiler.parseYear(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "The DateTimeFieldType must not be null";
    Object v1 = org.joda.time.tz.ZoneInfoCompiler.parseTime(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.joda.time.tz.ZoneInfoCompiler();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new java.io.BufferedReader(((java.io.Reader)v1));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v2));
    Object v3 = null;
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new java.io.BufferedReader(((java.io.Reader)v4));
    Object v6 = new char[]{Character.valueOf((char)0)};
    Object v7 = ((java.io.Reader)v5).read(((char[])v6));
    ((org.joda.time.tz.ZoneInfoCompiler)v0).parseDataFile(((java.io.BufferedReader)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }
}
