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
    Object v1 = "The instant must not be null";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "The instant must not be null";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = "yearOfCentury{";
    Object v4 = "Th partial must not be null";
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
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "' is n";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSuffix(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Magnitude of add amount is too large: ";
    Object v4 = "Invalid index: ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "The instant must not be null";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = "Clone error";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSuffix(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
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
    Object v3 = "ce";
    Object v4 = "The date must not be null";
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
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "k";
    Object v9 = "' is not supported";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSuffix(((java.lang.String)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
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
    Object v3 = "ce";
    Object v4 = "The date must not be null";
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
    Object v3 = "ce";
    Object v4 = "The date must not be null";
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
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMillis3Digit();
    Object v9 = "GMT";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).printZeroRarelyFirst();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = "' is not supported";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendPrefix(((java.lang.String)v7));
    Object v9 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v10 = "\n";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendSeparatorIfFieldsBefore(((java.lang.String)v10));
    Object v12 = "ce";
    Object v13 = "The date must not be null";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendPrefix(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v14).printZeroNever();
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v15).printZeroAlways();
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v16).toParser();
    Object v18 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v19 = "\n";
    Object v20 = ((org.joda.time.format.PeriodFormatterBuilder)v18).appendSeparatorIfFieldsBefore(((java.lang.String)v19));
    Object v21 = "ce";
    Object v22 = "The date must not be null";
    Object v23 = ((org.joda.time.format.PeriodFormatterBuilder)v20).appendPrefix(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.joda.time.format.PeriodFormatterBuilder)v23).printZeroNever();
    Object v25 = ((org.joda.time.format.PeriodFormatterBuilder)v24).printZeroAlways();
    Object v26 = ((org.joda.time.format.PeriodFormatterBuilder)v25).toParser();
    Object v27 = ((org.joda.time.format.PeriodFormatterBuilder)v6).append(((org.joda.time.format.PeriodPrinter)v17),((org.joda.time.format.PeriodParser)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Magnitude of add amount is too large: ";
    Object v5 = "Invalid index: ";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v6));
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v3).append(((org.joda.time.format.PeriodFormatter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = "TC";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendLiteral(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).toPrinter();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMillis3Digit();
    Object v9 = "GMT";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).printZeroRarelyFirst();
    Object v12 = "ConverterManager.alterInstantConverters";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendLiteral(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "UT";
    Object v4 = "z";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = -22;
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).maximumParsedDigits((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Magnitude of add amount is too large: ";
    Object v4 = "Invalid index: ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "-";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = "h";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendLiteral(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMinutes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMillis3Digit();
    Object v9 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v10 = "\n";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendSeparatorIfFieldsBefore(((java.lang.String)v10));
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).printZeroRarelyFirst();
    Object v13 = "' is ";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendLiteral(((java.lang.String)v13));
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v14).toPrinter();
    Object v16 = 0;
    Object v17 = org.joda.time.Period.years((((java.lang.Integer)v16).intValue()));
    Object v18 = "Magnitude of add amount is too large: ";
    Object v19 = "Invalid index: ";
    Object v20 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.joda.time.format.PeriodPrinter)v15).calculatePrintedLength(((org.joda.time.ReadablePeriod)v17),((java.util.Locale)v20));
    Object v22 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v23 = "\n";
    Object v24 = ((org.joda.time.format.PeriodFormatterBuilder)v22).appendSeparatorIfFieldsBefore(((java.lang.String)v23));
    Object v25 = ((org.joda.time.format.PeriodFormatterBuilder)v24).printZeroRarelyFirst();
    Object v26 = "' is ";
    Object v27 = ((org.joda.time.format.PeriodFormatterBuilder)v25).appendLiteral(((java.lang.String)v26));
    Object v28 = ((org.joda.time.format.PeriodFormatterBuilder)v27).toPrinter();
    Object v29 = ((org.joda.time.format.PeriodFormatterBuilder)v8).append(((org.joda.time.format.PeriodPrinter)v15),((org.joda.time.format.PeriodParser)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "UT";
    Object v4 = "z";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = 3;
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).minimumPrintedDigits((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "-verbos";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSuffix(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMinutes();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).toPrinter();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Magnitude of add amount is too large: ";
    Object v4 = "Invalid index: ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "-";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = "Invalid index: ";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendPrefix(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Magnitude of add amount is too large: ";
    Object v5 = "Invalid index: ";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v6));
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v3).append(((org.joda.time.format.PeriodFormatter)v7));
    ((org.joda.time.format.PeriodFormatterBuilder)v8).clear();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).toFormatter();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "UT";
    Object v4 = "z";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "' is not supportev";
    Object v7 = "I";
    Object v8 = new java.lang.String[]{};
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSeparator(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String[])v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroRarelyLast();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v9 = "\n";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendSeparatorIfFieldsBefore(((java.lang.String)v9));
    Object v11 = "ce";
    Object v12 = "The date must not be null";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendPrefix(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).printZeroNever();
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v14).printZeroAlways();
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v15).toParser();
    Object v17 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v18 = "\n";
    Object v19 = ((org.joda.time.format.PeriodFormatterBuilder)v17).appendSeparatorIfFieldsBefore(((java.lang.String)v18));
    Object v20 = ((org.joda.time.format.PeriodFormatterBuilder)v19).toParser();
    Object v21 = ((org.joda.time.format.PeriodFormatterBuilder)v7).append(((org.joda.time.format.PeriodPrinter)v16),((org.joda.time.format.PeriodParser)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    ((org.joda.time.format.PeriodFormatterBuilder)v6).clear();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithMillis();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = false;
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).rejectSignedValues((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "/";
    Object v8 = "ReadablePartial objects must have the same set of fields";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendPrefix(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMillis3Digit();
    Object v9 = "GMT";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).printZeroRarelyFirst();
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).toParser();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "UT";
    Object v4 = "z";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v7 = "\n";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparatorIfFieldsBefore(((java.lang.String)v7));
    Object v9 = "ce";
    Object v10 = "The date must not be null";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "Invalid index: ";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendPrefix(((java.lang.String)v12));
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).toFormatter();
    Object v15 = org.joda.time.PeriodType.time();
    Object v16 = ((org.joda.time.format.PeriodFormatter)v14).withParseType(((org.joda.time.PeriodType)v15));
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v5).append(((org.joda.time.format.PeriodFormatter)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithMillis();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).toPrinter();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = "-TC";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSeparator(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    ((org.joda.time.format.PeriodFormatterBuilder)v6).clear();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "/";
    Object v8 = "ReadablePartial objects must have the same set of fields";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendPrefix(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendMinutes();
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).toPrinter();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v8 = "\n";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSeparatorIfFieldsBefore(((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).toParser();
    Object v11 = new java.lang.StringBuffer();
    Object v12 = 0;
    Object v13 = org.joda.time.Period.years((((java.lang.Integer)v12).intValue()));
    Object v14 = "Magnitude of add amount is too large: ";
    Object v15 = "Invalid index: ";
    Object v16 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15));
    ((org.joda.time.format.PeriodPrinter)v10).printTo(((java.lang.StringBuffer)v11),((org.joda.time.ReadablePeriod)v13),((java.util.Locale)v16));
    Object v17 = null;
    Object v18 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v19 = "\n";
    Object v20 = ((org.joda.time.format.PeriodFormatterBuilder)v18).appendSeparatorIfFieldsBefore(((java.lang.String)v19));
    Object v21 = ((org.joda.time.format.PeriodFormatterBuilder)v20).toParser();
    Object v22 = ((org.joda.time.format.PeriodFormatterBuilder)v6).append(((org.joda.time.format.PeriodPrinter)v10),((org.joda.time.format.PeriodParser)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSecondsWithOptionalMillis();
    Object v9 = "DayTime";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroAlways();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Field must not be null";
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSuffix(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMillis3Digit();
    Object v9 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v10 = "\n";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendSeparatorIfFieldsBefore(((java.lang.String)v10));
    Object v12 = "ce";
    Object v13 = "The date must not be null";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendPrefix(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "Invalid index: ";
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v14).appendPrefix(((java.lang.String)v15));
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v16).toFormatter();
    Object v18 = new java.lang.StringBuffer();
    Object v19 = 0;
    Object v20 = org.joda.time.Period.years((((java.lang.Integer)v19).intValue()));
    ((org.joda.time.format.PeriodFormatter)v17).printTo(((java.lang.StringBuffer)v18),((org.joda.time.ReadablePeriod)v20));
    Object v21 = null;
    Object v22 = ((org.joda.time.format.PeriodFormatterBuilder)v8).append(((org.joda.time.format.PeriodFormatter)v17));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithMillis();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendMillis();
    Object v5 = "Range duration field must be precise";
    Object v6 = "Field must not be null";
    Object v7 = new java.lang.String[]{"Field must ;ot be null","Invalid index: ","The partial must not be null"};
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendSeparator(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = false;
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).rejectSignedValues((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "-";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSuffix(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroAlways();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendHours();
    ((org.joda.time.format.PeriodFormatterBuilder)v6).clear();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMinutes();
    Object v8 = "Builder has created neither a printer nor a parser";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSuffix(((java.lang.String)v8));
    Object v10 = "The calendarKmust not be null";
    Object v11 = "";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSuffix(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendYears();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroRarelyLast();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithMillis();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendMinutes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "The instant must not be null";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    ((org.joda.time.format.PeriodFormatterBuilder)v2).clear();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroAlways();
    Object v7 = "No valid ISO860p format for fields: ";
    Object v8 = "Both printing and parsing notsupported";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparator(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithMillis();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendMillis();
    Object v5 = "Range duration field must be precise";
    Object v6 = "Field must not be null";
    Object v7 = new java.lang.String[]{"Field must ;ot be null","Invalid index: ","The partial must not be null"};
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendSeparator(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String[])v7));
    Object v9 = "The Da\"teTimeFieldType must not be null";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendLiteral(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSecondsWithOptionalMillis();
    Object v9 = "DayTime";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v9));
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = "The DateTimeFieldT";
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendSuffix(((java.lang.String)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = false;
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).rejectSignedValues((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v8).toPrinter();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeconds();
    Object v8 = "Pacific/HonoluluH";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendLiteral(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendYears();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroRarelyLast();
    Object v9 = "&";
    Object v10 = "UTC";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "String pool is too large";
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "UT";
    Object v4 = "z";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v7 = "\n";
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparatorIfFieldsBefore(((java.lang.String)v7));
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v8).printZeroRarelyFirst();
    Object v10 = "Invalid min days in first week: ";
    Object v11 = "' is not supported";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendPrefix(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "/";
    Object v14 = "ReadablePartial objects must have the same set of fields";
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendPrefix(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.joda.time.format.PeriodFormatterBuilder)v15).appendMinutes();
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v15).toPrinter();
    Object v18 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v19 = "\n";
    Object v20 = ((org.joda.time.format.PeriodFormatterBuilder)v18).appendSeparatorIfFieldsBefore(((java.lang.String)v19));
    Object v21 = "ce";
    Object v22 = "The date must not be null";
    Object v23 = ((org.joda.time.format.PeriodFormatterBuilder)v20).appendPrefix(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.joda.time.format.PeriodFormatterBuilder)v23).printZeroNever();
    Object v25 = ((org.joda.time.format.PeriodFormatterBuilder)v24).printZeroAlways();
    Object v26 = ((org.joda.time.format.PeriodFormatterBuilder)v25).toParser();
    Object v27 = ((org.joda.time.format.PeriodFormatterBuilder)v5).append(((org.joda.time.format.PeriodPrinter)v17),((org.joda.time.format.PeriodParser)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "/";
    Object v8 = "ReadablePartial objects must have the same set of fields";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendPrefix(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendHours();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroAlways();
    Object v7 = "No valid ISO860p format for fields: ";
    Object v8 = "Both printing and parsing notsupported";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparator(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).toPrinter();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = false;
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).rejectSignedValues((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v8).toFormatter();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroAlways();
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).minimumPrintedDigits((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendYears();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroRarelyLast();
    Object v9 = "&";
    Object v10 = "UTC";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendSeconds();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "Magnitude of add amount is too large: ";
    Object v4 = "Invalid index: ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v2).append(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = "-";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendLiteral(((java.lang.String)v8));
    Object v10 = "Invalid index: ";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendPrefix(((java.lang.String)v10));
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendSecondsWithOptionalMillis();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroAlways();
    Object v7 = "No valid ISO860p format for fields: ";
    Object v8 = "Both printing and parsing notsupported";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeparator(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendWeeks();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSecondsWithOptionalMillis();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Magnitude of add amount is too large: ";
    Object v5 = "Invalid index: ";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.joda.time.format.PeriodFormat.wordBased(((java.util.Locale)v6));
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v3).append(((org.joda.time.format.PeriodFormatter)v7));
    Object v9 = 27;
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).minimumPrintedDigits((((java.lang.Integer)v9).intValue()));
    Object v11 = "' toslink alias '";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendSuffix(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSecondsWithMillis();
    Object v4 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendMinutes();
    Object v5 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v6 = "\n";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendSeparatorIfFieldsBefore(((java.lang.String)v6));
    Object v8 = "ce";
    Object v9 = "The date must not be null";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).printZeroNever();
    Object v12 = false;
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v11).rejectSignedValues((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v13).toFormatter();
    Object v15 = org.joda.time.PeriodType.time();
    Object v16 = ((org.joda.time.format.PeriodFormatter)v14).withParseType(((org.joda.time.PeriodType)v15));
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v4).append(((org.joda.time.format.PeriodFormatter)v14));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = "The Cdate must not be null";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = -27;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).printZeroIfSupported();
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendMillis3Digit();
    Object v12 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v13 = "\n";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendSeparatorIfFieldsBefore(((java.lang.String)v13));
    Object v15 = "ce";
    Object v16 = "The date must not be null";
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v14).appendPrefix(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "Invalid index: ";
    Object v19 = ((org.joda.time.format.PeriodFormatterBuilder)v17).appendPrefix(((java.lang.String)v18));
    Object v20 = ((org.joda.time.format.PeriodFormatterBuilder)v19).toFormatter();
    Object v21 = ((org.joda.time.format.PeriodFormatterBuilder)v10).append(((org.joda.time.format.PeriodFormatter)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v5 = "\n";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v4).appendSeparatorIfFieldsBefore(((java.lang.String)v5));
    Object v7 = "ce";
    Object v8 = "The date must not be null";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendPrefix(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).printZeroNever();
    Object v11 = false;
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).rejectSignedValues((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v12).toFormatter();
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v3).append(((org.joda.time.format.PeriodFormatter)v13));
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendDays();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroAlways();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMillis3Digit();
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v8).toParser();
    Object v10 = "' is not supported";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendSeparatorIfFieldsAfter(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendYears();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroRarelyLast();
    Object v9 = "&";
    Object v10 = "UTC";
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v11).appendSeconds();
    ((org.joda.time.format.PeriodFormatterBuilder)v12).clear();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "UT";
    Object v4 = "z";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).toParser();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).maximumParsedDigits((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "String pool is too large";
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendMonths();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendYears();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroRarelyLast();
    Object v9 = "ReadablePartal objects must not be null";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendLiteral(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "String pool is too large";
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendMonths();
    Object v7 = "Vaue ";
    Object v8 = "Duration";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSuffix(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendMinutes();
    Object v8 = "Builder has created neither a printer nor a parser";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSuffix(((java.lang.String)v8));
    Object v10 = "The calendarKmust not be null";
    Object v11 = "";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSuffix(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.joda.time.format.PeriodFormatterBuilder)v12).toParser();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = "The Cdate must not be null";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v8));
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v9).toParser();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "F";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "' is ";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendLiteral(((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroAlways();
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).minimumPrintedDigits((((java.lang.Integer)v7).intValue()));
    Object v9 = "Field ust not be null";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendPrefix(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).toFormatter();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Invalid index: ";
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendPrefix(((java.lang.String)v6));
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendSecondsWithOptionalMillis();
    Object v9 = "DayTime";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v7).appendPrefix(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendMinutes();
    Object v12 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v13 = "\n";
    Object v14 = ((org.joda.time.format.PeriodFormatterBuilder)v12).appendSeparatorIfFieldsBefore(((java.lang.String)v13));
    Object v15 = "ce";
    Object v16 = "The date must not be null";
    Object v17 = ((org.joda.time.format.PeriodFormatterBuilder)v14).appendPrefix(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v17).printZeroNever();
    Object v19 = false;
    Object v20 = ((org.joda.time.format.PeriodFormatterBuilder)v18).rejectSignedValues((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((org.joda.time.format.PeriodFormatterBuilder)v20).toFormatter();
    Object v22 = ((org.joda.time.format.PeriodFormatterBuilder)v10).append(((org.joda.time.format.PeriodFormatter)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "UT";
    Object v4 = "z";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).appendDays();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = "ce";
    Object v4 = "The date must not be null";
    Object v5 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendPrefix(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v5).printZeroNever();
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendSeconds();
    Object v8 = "Pacific/HonoluluH";
    Object v9 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendLiteral(((java.lang.String)v8));
    Object v10 = "P";
    Object v11 = "AST";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v9).appendPrefix(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "\n";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendSeparatorIfFieldsBefore(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).printZeroRarelyFirst();
    Object v4 = "Invalid min days in first week: ";
    Object v5 = "' is not supported";
    Object v6 = ((org.joda.time.format.PeriodFormatterBuilder)v3).appendPrefix(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.format.PeriodFormatterBuilder)v6).appendYears();
    Object v8 = ((org.joda.time.format.PeriodFormatterBuilder)v6).printZeroRarelyLast();
    Object v9 = "ReadablePartal objects must not be null";
    Object v10 = ((org.joda.time.format.PeriodFormatterBuilder)v8).appendLiteral(((java.lang.String)v9));
    Object v11 = "UToC";
    Object v12 = ((org.joda.time.format.PeriodFormatterBuilder)v10).appendPrefix(((java.lang.String)v11));
    Object v13 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v14 = "\n";
    Object v15 = ((org.joda.time.format.PeriodFormatterBuilder)v13).appendSeparatorIfFieldsBefore(((java.lang.String)v14));
    Object v16 = "ce";
    Object v17 = "The date must not be null";
    Object v18 = ((org.joda.time.format.PeriodFormatterBuilder)v15).appendPrefix(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.joda.time.format.PeriodFormatterBuilder)v18).printZeroNever();
    Object v20 = false;
    Object v21 = ((org.joda.time.format.PeriodFormatterBuilder)v19).rejectSignedValues((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.joda.time.format.PeriodFormatterBuilder)v21).toFormatter();
    Object v23 = ((org.joda.time.format.PeriodFormatterBuilder)v10).append(((org.joda.time.format.PeriodFormatter)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.joda.time.format.PeriodFormatterBuilder();
    Object v1 = "The instant must not be null";
    Object v2 = ((org.joda.time.format.PeriodFormatterBuilder)v0).appendLiteral(((java.lang.String)v1));
    Object v3 = ((org.joda.time.format.PeriodFormatterBuilder)v2).appendSeconds();
    org.junit.Assert.assertNotNull(v3);
  }
}
