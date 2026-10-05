package org.joda.time.format;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    ((org.joda.time.format.PeriodFormatterBuilder)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = "{";
    Object v4 = "Invald index: ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSuffix(((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "F";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSuffix(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = "Invalid index: ";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSuffix(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).toParser();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "millisOkSecond";
    Object v9 = "Field '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSuffix(((java.lang.String)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).toParser();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMillis3Digit();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = "UTC";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendPrefix(((java.lang.String)v11));
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroRarelyFirst();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = "Field '";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendPrefix(((java.lang.String)v7));
    Object v9 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v10 = "\n";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendSeparatorIfFieldsBefore(((java.lang.String)v10));
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).toParser();
    Object v13 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v14 = "\n";
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v13).appendSeparatorIfFieldsBefore(((java.lang.String)v14));
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v15).toParser();
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v6).append(((org.joda.time.format.PeriodPrinter)v12),((org.joda.time.format.PeriodParser)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = "Y";
    Object v12 = "The calendar must not be null";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v13));
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v10).append(((org.joda.time.format.PeriodFormatter)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "hurOfDay";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "Field '";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "hurOfDay";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).toPrinter();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = "resulting";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendLiteral(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "WEz";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "hurOfDay";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = -22;
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).maximumParsedDigits((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendLiteral(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMinutes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v12 = "\n";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendSeparatorIfFieldsBefore(((java.lang.String)v12));
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).toParser();
    Object v15 = org.joda.time.DateTimeZone.getDefault();
    Object v16 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)v15));
    Object v17 = org.joda.time.DateTimeZone.getDefault();
    Object v18 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)v17));
    Object v19 = org.joda.time.Months.monthsBetween(((org.joda.time.ReadableInstant)v16),((org.joda.time.ReadableInstant)v18));
    Object v20 = "Y";
    Object v21 = "The calendar must not be null";
    Object v22 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.joda.time.format.PeriodPrinter)v14).calculatePrintedLength(((org.joda.time.ReadablePeriod)v19),((java.util.Locale)v22));
    Object v24 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v25 = "\n";
    Object v26 = ((org.joda.time.format.PeriodFormatterBuilder)v24).appendSeparatorIfFieldsBefore(((java.lang.String)v25));
    Object v27 = ((org.joda.time.format.PeriodFormatterBuilder)v26).toParser();
    Object v28 = ((org.joda.time.format.PeriodFormatterBuilder)v10).append(((org.joda.time.format.PeriodPrinter)v14),((org.joda.time.format.PeriodParser)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendYears();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = "UTC";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendPrefix(((java.lang.String)v11));
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroRarelyFirst();
    Object v14 = "Y";
    Object v15 = "Invali";
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v13).appendSuffix(((java.lang.String)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSeconds();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).toFormatter();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "NoDays";
    Object v9 = "Field '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendDays();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "WEz";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "res/lting";
    Object v7 = "Th";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "ield '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSeconds();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendMonths();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = "UTC";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendPrefix(((java.lang.String)v11));
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroRarelyFirst();
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).toPrinter();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).toParser();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = "UTC";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendPrefix(((java.lang.String)v11));
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroRarelyFirst();
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).appendMillis3Digit();
    Object v15 = "Chronology must not be null";
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v13).appendLiteral(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v11 = "\n";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSeparatorIfFieldsBefore(((java.lang.String)v11));
    Object v13 = "No formatter supplied";
    Object v14 = "PT";
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendPrefix(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v15).printZeroNever();
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v16).printZeroAlways();
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v17).toParser();
    Object v19 = org.joda.time.DateTimeZone.getDefault();
    Object v20 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)v19));
    Object v21 = org.joda.time.DateTimeZone.getDefault();
    Object v22 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)v21));
    Object v23 = org.joda.time.Months.monthsBetween(((org.joda.time.ReadableInstant)v20),((org.joda.time.ReadableInstant)v22));
    Object v24 = "Y";
    Object v25 = "The calendar must not be null";
    Object v26 = new java.util.Locale(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.joda.time.format.PeriodPrinter)v18).calculatePrintedLength(((org.joda.time.ReadablePeriod)v23),((java.util.Locale)v26));
    Object v28 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v29 = "\n";
    Object v30 = ((org.joda.time.format.PeriodFormatterBuilder)v28).appendSeparatorIfFieldsBefore(((java.lang.String)v29));
    Object v31 = ((org.joda.time.format.PeriodFormatterBuilder)v30).toParser();
    Object v32 = ((org.joda.time.format.PeriodFormatterBuilder)v9).append(((org.joda.time.format.PeriodPrinter)v18),((org.joda.time.format.PeriodParser)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).toParser();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendMillis();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = "PeriodFormat.months";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparatorIfFieldsAfter(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSeconds();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendMonths();
    Object v5 = "No printer or parser supplied";
    Object v6 = "UQC";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendPrefix(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMillis3Digit();
    Object v9 = "ReadablePartial objeHcts must have the same set of fields";
    Object v10 = "Clone error";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendSuffix(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "WEz";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v7 = "\n";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparatorIfFieldsBefore(((java.lang.String)v7));
    Object v9 = "The calendar must not be null";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).toFormatter();
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v5).append(((org.joda.time.format.PeriodFormatter)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = "Chronology must not be null";
    Object v8 = "The date must not be null";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSuffix(((java.lang.String)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendYears();
    Object v6 = "weeky7ars";
    Object v7 = "' is not supported";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSuffix(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "WEz";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendHours();
    Object v7 = "Weeks";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSuffix(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "NoDays";
    Object v9 = "Field '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSecondsWithOptionalMillis();
    Object v12 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v13 = "\n";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendSeparatorIfFieldsBefore(((java.lang.String)v13));
    Object v15 = "The calendar must not be null";
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v14).appendPrefix(((java.lang.String)v15));
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v16).toFormatter();
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v10).append(((org.joda.time.format.PeriodFormatter)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v11 = "\n";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSeparatorIfFieldsBefore(((java.lang.String)v11));
    Object v13 = "No formatter supplied";
    Object v14 = "PT";
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendPrefix(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v15).printZeroNever();
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v16).printZeroAlways();
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v17).toParser();
    Object v19 = org.joda.time.DateTimeZone.getDefault();
    Object v20 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)v19));
    Object v21 = org.joda.time.DateTimeZone.getDefault();
    Object v22 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)v21));
    Object v23 = org.joda.time.Months.monthsBetween(((org.joda.time.ReadableInstant)v20),((org.joda.time.ReadableInstant)v22));
    Object v24 = "Y";
    Object v25 = "The calendar must not be null";
    Object v26 = new java.util.Locale(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.joda.time.format.PeriodPrinter)v18).calculatePrintedLength(((org.joda.time.ReadablePeriod)v23),((java.util.Locale)v26));
    Object v28 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v29 = "\n";
    Object v30 = ((org.joda.time.format.PeriodFormatterBuilder)v28).appendSeparatorIfFieldsBefore(((java.lang.String)v29));
    Object v31 = ((org.joda.time.format.PeriodFormatterBuilder)v30).toParser();
    Object v32 = ((org.joda.time.format.PeriodFormatterBuilder)v9).append(((org.joda.time.format.PeriodPrinter)v18),((org.joda.time.format.PeriodParser)v31));
    ((org.joda.time.format.PeriodFormatterBuilder)v32).clear();
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendMillis3Digit();
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendMillis();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendMillis();
    Object v6 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v7 = "\n";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparatorIfFieldsBefore(((java.lang.String)v7));
    Object v9 = "No formatter supplied";
    Object v10 = "PT";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).printZeroNever();
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v12).printZeroAlways();
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).toParser();
    Object v15 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v16 = "\n";
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v15).appendSeparatorIfFieldsBefore(((java.lang.String)v16));
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v17).toParser();
    Object v19 = ((org.joda.time.format.PeriodFormatterBuilder)v5).append(((org.joda.time.format.PeriodPrinter)v14),((org.joda.time.format.PeriodParser)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    ((org.joda.time.format.PeriodFormatterBuilder)v2).clear();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendYears();
    Object v6 = "weeky7ars";
    Object v7 = "' is not supported";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSuffix(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "]";
    Object v10 = "";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = " ";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendMillis();
    Object v6 = "Wrapped field's minumum value must be zer";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSeparatorIfFieldsAfter(((java.lang.String)v6));
    Object v8 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v9 = "\n";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendSeparatorIfFieldsBefore(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).toParser();
    Object v12 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v13 = "\n";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendSeparatorIfFieldsBefore(((java.lang.String)v13));
    Object v15 = "Y";
    Object v16 = "The calendar must not be null";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v17));
    Object v19 = ((org.joda.time.format.PeriodFormatterBuilder)v14).append(((org.joda.time.format.PeriodFormatter)v18));
    Object v20 = "hurOfDay";
    Object v21 = ((org.joda.time.format.PeriodFormatterBuilder)v19).appendLiteral(((java.lang.String)v20));
    Object v22 = ((org.joda.time.format.PeriodFormatterBuilder)v21).toPrinter();
    Object v23 = ((org.joda.time.format.PeriodFormatterBuilder)v5).append(((org.joda.time.format.PeriodPrinter)v11),((org.joda.time.format.PeriodParser)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "NoDays";
    Object v9 = "Field '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSecondsWithOptionalMillis();
    Object v12 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v13 = "\n";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendSeparatorIfFieldsBefore(((java.lang.String)v13));
    Object v15 = "The calendar must not be null";
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v14).appendPrefix(((java.lang.String)v15));
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v16).toFormatter();
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v10).append(((org.joda.time.format.PeriodFormatter)v17));
    Object v19 = ((org.joda.time.format.PeriodFormatterBuilder)v18).toFormatter();
    Object v20 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v21 = "\n";
    Object v22 = ((org.joda.time.format.PeriodFormatterBuilder)v20).appendSeparatorIfFieldsBefore(((java.lang.String)v21));
    Object v23 = "The calendar must not be null";
    Object v24 = ((org.joda.time.format.PeriodFormatterBuilder)v22).appendPrefix(((java.lang.String)v23));
    Object v25 = ((org.joda.time.format.PeriodFormatterBuilder)v24).toFormatter();
    Object v26 = ((org.joda.time.format.PeriodFormatterBuilder)v18).append(((org.joda.time.format.PeriodFormatter)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendWeeks();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = "UTC";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendPrefix(((java.lang.String)v11));
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroRarelyFirst();
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).appendMillis3Digit();
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v13).toPrinter();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "NoDays";
    Object v9 = "Field '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSecondsWithOptionalMillis();
    Object v12 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v13 = "\n";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendSeparatorIfFieldsBefore(((java.lang.String)v13));
    Object v15 = "The calendar must not be null";
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v14).appendPrefix(((java.lang.String)v15));
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v16).toFormatter();
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v10).append(((org.joda.time.format.PeriodFormatter)v17));
    Object v19 = ((org.joda.time.format.PeriodFormatterBuilder)v18).toFormatter();
    Object v20 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v21 = "\n";
    Object v22 = ((org.joda.time.format.PeriodFormatterBuilder)v20).appendSeparatorIfFieldsBefore(((java.lang.String)v21));
    Object v23 = "The calendar must not be null";
    Object v24 = ((org.joda.time.format.PeriodFormatterBuilder)v22).appendPrefix(((java.lang.String)v23));
    Object v25 = ((org.joda.time.format.PeriodFormatterBuilder)v24).toFormatter();
    Object v26 = ((org.joda.time.format.PeriodFormatterBuilder)v18).append(((org.joda.time.format.PeriodFormatter)v25));
    Object v27 = "MIN >";
    Object v28 = "ReadableParEtial objects must have the same set of fields";
    Object v29 = new java.lang.String[]{"ARJT"};
    Object v30 = ((org.joda.time.format.PeriodFormatterBuilder)v26).appendSeparator(((java.lang.String)v27),((java.lang.String)v28),((java.lang.String[])v29));
    Object v31 = "Minutes out of range: ";
    Object v32 = ((org.joda.time.format.PeriodFormatterBuilder)v26).appendPrefix(((java.lang.String)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v9 = "\n";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendSeparatorIfFieldsBefore(((java.lang.String)v9));
    Object v11 = "No formatter supplied";
    Object v12 = "PT";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendPrefix(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).printZeroNever();
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v14).printZeroAlways();
    Object v16 = -27;
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v15).maximumParsedDigits((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v15).printZeroIfSupported();
    Object v19 = "UTC";
    Object v20 = ((org.joda.time.format.PeriodFormatterBuilder)v18).appendPrefix(((java.lang.String)v19));
    Object v21 = ((org.joda.time.format.PeriodFormatterBuilder)v18).printZeroRarelyFirst();
    Object v22 = ((org.joda.time.format.PeriodFormatterBuilder)v21).appendMillis3Digit();
    Object v23 = ((org.joda.time.format.PeriodFormatterBuilder)v21).toPrinter();
    Object v24 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v25 = "No partial converter found for type: ";
    Object v26 = ((org.joda.time.format.PeriodFormatterBuilder)v24).appendLiteral(((java.lang.String)v25));
    Object v27 = ((org.joda.time.format.PeriodFormatterBuilder)v26).toParser();
    Object v28 = ((org.joda.time.format.PeriodFormatterBuilder)v7).append(((org.joda.time.format.PeriodPrinter)v23),((org.joda.time.format.PeriodParser)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "WEz";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "res/lting";
    Object v7 = "Th";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "ield '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroAlways();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "hurOfDay";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).toParser();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendMillis();
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendMinutes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendMillis();
    Object v6 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v7 = "\n";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparatorIfFieldsBefore(((java.lang.String)v7));
    Object v9 = "No formatter supplied";
    Object v10 = "PT";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).printZeroNever();
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v12).printZeroAlways();
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).toParser();
    Object v15 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v16 = "\n";
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v15).appendSeparatorIfFieldsBefore(((java.lang.String)v16));
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v17).toParser();
    Object v19 = ((org.joda.time.format.PeriodFormatterBuilder)v5).append(((org.joda.time.format.PeriodPrinter)v14),((org.joda.time.format.PeriodParser)v18));
    Object v20 = ((org.joda.time.format.PeriodFormatterBuilder)v19).printZeroIfSupported();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithOptionalMillis();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).toPrinter();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendYears();
    Object v6 = "'is not supported";
    Object v7 = "UTC";
    Object v8 = new java.lang.String[]{"minuend","Field '"};
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSeparator(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = "The calendar must not be nulY";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendLiteral(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendWeeks();
    Object v9 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v10 = "\n";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendSeparatorIfFieldsBefore(((java.lang.String)v10));
    Object v12 = "The calendar must not be null";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendPrefix(((java.lang.String)v12));
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).toFormatter();
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v8).append(((org.joda.time.format.PeriodFormatter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendWeeks();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendMillis();
    Object v6 = " ";
    Object v7 = "EE";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSuffix(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "WEz";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "res/lting";
    Object v7 = "Th";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "ield '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroAlways();
    ((org.joda.time.format.PeriodFormatterBuilder)v11).clear();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendDays();
    ((org.joda.time.format.PeriodFormatterBuilder)v5).clear();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = "A?frica/Harare";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSuffix(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = "Types 1rray must not be null";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSuffix(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "WEz";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "res/lting";
    Object v7 = "Th";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "ield '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroAlways();
    Object v12 = "FiGeld must not be null";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendLiteral(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "NoDays";
    Object v9 = "Field '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroAlways();
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSeconds();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = -39;
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).minimumPrintedDigits((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v6 = "\n";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSeparatorIfFieldsBefore(((java.lang.String)v6));
    Object v8 = "The calendar must not be null";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).toFormatter();
    Object v11 = 32L;
    Object v12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v13 = new org.joda.time.MutablePeriod((((java.lang.Long)v11).longValue()),((org.joda.time.Chronology)v12));
    Object v14 = "Field must not be nu";
    Object v15 = 1;
    Object v16 = ((org.joda.time.format.PeriodFormatter)v10).parseInto(((org.joda.time.ReadWritablePeriod)v13),((java.lang.String)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v10));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Invalid min dZays in first week: ";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = "America/Anchorage";
    Object v6 = "n";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSuffix(((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendWeeks();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendMillis();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "NoDays";
    Object v9 = "Field '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "' i` not supported";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSuffix(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendWeeks();
    Object v4 = "-o";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4));
    Object v6 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v7 = "\n";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparatorIfFieldsBefore(((java.lang.String)v7));
    Object v9 = "The calendar must not be null";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).toFormatter();
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v3).append(((org.joda.time.format.PeriodFormatter)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithOptionalMillis();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithOptionalMillis();
    Object v4 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v5 = "\n";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendSeparatorIfFieldsBefore(((java.lang.String)v5));
    Object v7 = "The calendar must not be null";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendPrefix(((java.lang.String)v7));
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v8).toFormatter();
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v3).append(((org.joda.time.format.PeriodFormatter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = false;
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).rejectSignedValues((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSeconds();
    Object v4 = "BE";
    Object v5 = "EA";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendSuffix(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "NoDays";
    Object v9 = "Field '";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroAlways();
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSeconds();
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v12).printZeroIfSupported();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "The calendar must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendMillis();
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendMinutes();
    Object v7 = "The date must not be null";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparatorIfFieldsBefore(((java.lang.String)v7));
    Object v9 = "DkyTime";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparator(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "WEz";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendHours();
    Object v7 = "Weeks";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSuffix(((java.lang.String)v7));
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendDays();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "The calendar must ot be null";
    Object v2 = "Cannot find tiNe zone '";
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendPrefix(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendWeeks();
    Object v9 = "-Summer";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendSuffix(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "No partial converter found for type: ";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithOptionalMillis();
    ((org.joda.time.format.PeriodFormatterBuilder)v3).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendMillis3Digit();
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendMillis();
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendHours();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "No formatter supplied";
    Object v4 = "PT";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendWeeks();
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendMonths();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = false;
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).rejectSignedValues((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSeconds();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSeconds();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendMonths();
    Object v5 = "Field must not be null";
    Object v6 = "UTC";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendPrefix(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Y";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v11 = "\n";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSeparatorIfFieldsBefore(((java.lang.String)v11));
    Object v13 = "The calendar must not be null";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendPrefix(((java.lang.String)v13));
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v14).toFormatter();
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v9).append(((org.joda.time.format.PeriodFormatter)v15));
    org.junit.Assert.assertNotNull(v16);
  }
}
