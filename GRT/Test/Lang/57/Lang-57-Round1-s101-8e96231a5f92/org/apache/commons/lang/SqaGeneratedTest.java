package org.apache.commons.lang;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Yuml";
    Object v4 = "UTF-16LE";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.apache.commons.lang.LocaleUtils.availableLocaleSet();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "[";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "K";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "7";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "}";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "]-";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "micro";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "ecirc";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "6!";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "nt";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "9";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).stripExtensions();
    Object v4 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "8593";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "0x";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "user.countr(y";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "Yzwnj";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).getExtensionKeys();
    Object v4 = "Yuml";
    Object v5 = "UTF-16LE";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "23";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = ";";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "0";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.lang.LocaleUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.apache.commons.lang.LocaleUtils.availableLocaleList();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "The Array must! not be null";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Range[";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Yuml";
    Object v4 = "UTF-16LE";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Yuml";
    Object v7 = "UTF-16LE";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((java.util.Locale)v5).getDisplayName(((java.util.Locale)v8));
    Object v10 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).clone();
    Object v4 = "Yuml";
    Object v5 = "UTF-16LE";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Array cannot be empty.";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "f";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "8249";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "Vup2";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Yuml";
    Object v4 = "UTF-16LE";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).hashCode();
    Object v7 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "U";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = ";";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Rethrown as: ";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Yuml";
    Object v4 = "UTF-16LE";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).stripExtensions();
    Object v7 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ";";
    Object v4 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v3));
    Object v5 = ((java.util.Locale)v2).equals(((java.lang.Object)v4));
    Object v6 = "Yuml";
    Object v7 = "UTF-16LE";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "!";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "t?ue";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "$";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "l";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "0";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "W";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = ";ser.home";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "Y";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Yuml";
    Object v4 = "UTF-16LE";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getDisplayScript();
    Object v7 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "8465";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "&";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "pound";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Yuml";
    Object v4 = "UTF-16LE";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getDisplayCountry();
    Object v7 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "I\"valid length: ";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "[F";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "I";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "5";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "up";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang.LocaleUtils.isAvailableLocale(((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Array cannot be emptyt";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Yuml";
    Object v1 = "UTF-16LE";
    Object v2 = new java.util.Locale(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "up";
    Object v4 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v2),((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Z";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "BetT";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "The Range must not be null";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "G";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "getEnumClass() must reVturn a superclass of this class";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "gaZmma";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "up";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
    Object v2 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "L";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "?";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "\"8201";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "java.home";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "uml]";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "Range[";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "936";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "1";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "S";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "up";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
    Object v2 = "Yuml";
    Object v3 = "UTF-16LE";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.LocaleUtils.localeLookupList(((java.util.Locale)v1),((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "842";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "@";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "StopwaTtch has not been split. ";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "'";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "gamm";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "HH:mi:ssZZ";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "A";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "o";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "x-9";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "E";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "J";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "1";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "{";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "X";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "9";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\\";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "java.ext.dirs";
    Object v1 = org.apache.commons.lang.LocaleUtils.languagesByCountry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "17Y";
    Object v1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "RanFe[";
    Object v1 = org.apache.commons.lang.LocaleUtils.toLocale(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
