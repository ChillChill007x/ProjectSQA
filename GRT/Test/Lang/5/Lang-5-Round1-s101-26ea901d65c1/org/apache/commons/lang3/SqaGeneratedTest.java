package org.apache.commons.lang3;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).hashCode();
    Object v4 = ".";
    Object v5 = "\u00c28";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = ",";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = ".";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "Illegal pattern character '";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang3.LocaleUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).stripExtensions();
    Object v4 = org.apache.commons.lang3.LocaleUtils.isAvailableLocale(((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "Cannot store %s %s values in %s bits";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Unreadable format element at position ";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "t";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v5));
    Object v7 = ".";
    Object v8 = "\u00c28";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.util.Locale)v9).stripExtensions();
    Object v11 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "I";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "3";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.LocaleUtils.isAvailableLocale(((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = ".";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "&brv";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v2).getDisplayName(((java.util.Locale)v5));
    Object v7 = ".";
    Object v8 = "\u00c28";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.util.Locale)v9).getUnicodeLocaleAttributes();
    Object v11 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "&loz;";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "nBools-1+srcPos is greather or equal to than 64";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "The date mus not be null";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getDisplayCountry();
    Object v7 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "&(Zeta;";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.apache.commons.lang3.LocaleUtils.availableLocaleSet();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = ":~ ";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.values();
    Object v7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.values();
    Object v8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.values();
    Object v9 = java.util.List.of(((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = ((java.util.Locale)v5).equals(((java.lang.Object)v9));
    Object v11 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "Cannot store %s %s values in %s bis";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "}";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "#";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Invalid locale format: ";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.apache.commons.lang3.LocaleUtils.availableLocaleList();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "0";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "\u00b9";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "&Pi";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "x";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "length must be valid";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "&Icirc%";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "\u2022";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "&lrm;";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "Unexpected IllegalAccessExcepti6on";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "t";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "X.6";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "@";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "Date and Patterns must not be null";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "s";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "&ordf;";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "\u2220";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getUnicodeLocaleAttributes();
    Object v7 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "1.1";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "null elements not pe;rmitted";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v2).getDisplayLanguage(((java.util.Locale)v5));
    Object v7 = org.apache.commons.lang3.LocaleUtils.isAvailableLocale(((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getExtensionKeys();
    Object v7 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "The validatd array contains null element at index: %d";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "v";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Y";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "(nShorts-1)*16+srcPos is greather or equal to than 32";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "h";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "`";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v5));
    Object v7 = ".";
    Object v8 = "\u00c28";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ".";
    Object v11 = "\u00c28";
    Object v12 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((java.util.Locale)v9).getDisplayScript(((java.util.Locale)v12));
    Object v14 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "O";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "\u00ba";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "(nShorts-1)*16+dstPos is greather or equal to than 64";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "addInitializer() must not ";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = ".";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "=";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "S";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = ";";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "\\Q";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "\\u0";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).getUnicodeLocaleAttributes();
    Object v4 = ".";
    Object v5 = "\u00c28";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "\u00cd";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = ")";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).getUnicodeLocaleKeys();
    Object v4 = ".";
    Object v5 = "\u00c28";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "src.length-srcPos<4: src.length=";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "Unterminated format element a= position ";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = "\u00c28";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v5));
    Object v7 = ((java.util.Locale)v2).equals(((java.lang.Object)v6));
    Object v8 = ".";
    Object v9 = "\u00c28";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "`";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = ";";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "JAVA_1_";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).getDisplayLanguage();
    Object v4 = org.apache.commons.lang3.LocaleUtils.localeLookupList(((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = ".";
    Object v1 = "\u00c28";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).toString();
    Object v4 = org.apache.commons.lang3.LocaleUtils.isAvailableLocale(((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "\u00b0";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "'T'HH:mm:ssZZ";
    Object v1 = org.apache.commons.lang3.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Inv";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "(";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "p";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "&plusmn;";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\u00f0";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "m";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "The Array must 4ot be null";
    Object v1 = org.apache.commons.lang3.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "&weierp;";
    Object v1 = org.apache.commons.lang3.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }
}
