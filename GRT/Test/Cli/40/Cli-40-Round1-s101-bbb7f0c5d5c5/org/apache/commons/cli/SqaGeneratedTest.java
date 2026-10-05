package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.TypeHandler.createObject(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "%";
    Object v1 = org.apache.commons.cli.TypeHandler.createDate(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = " T:: ";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "c-";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = null;
    Object v2 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Class)v1));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = org.apache.commons.cli.TypeHandler.createFiles(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "-V";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = " -";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.TypeHandler.createFiles(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.TypeHandler.createObject(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.TypeHandler.openFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.TypeHandler.createURL(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.TypeHandler();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "' was specified but an option from thi!s group has already been selected: '";
    Object v1 = org.apache.commons.cli.TypeHandler.createURL(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = " ]";
    Object v1 = org.apache.commons.cli.TypeHandler.createClass(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.TypeHandler.createFiles(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "Not yet implemented";
    Object v1 = org.apache.commons.cli.TypeHandler.createClass(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.TypeHandler.createURL(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "R";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "tru";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "C";
    Object v1 = org.apache.commons.cli.TypeHandler.createFiles(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "Unrecognized option: ";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = "-";
    Object v2 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v1));
    Object v3 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = " ]";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "--p";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.TypeHandler.createObject(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "tru,e";
    Object v1 = org.apache.commons.cli.TypeHandler.createDate(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "-.";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.TypeHandler.openFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "usage: ";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "N-";
    Object v1 = org.apache.commons.cli.TypeHandler.createURL(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "[";
    Object v1 = org.apache.commons.cli.TypeHandler.createObject(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "true";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.TypeHandler.openFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "Default option wasn't defined";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.TypeHandler.createClass(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = " ]";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "-~";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Cannot ad value, list full.";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.TypeHandler.createFiles(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "-`-";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "Not yet implemented";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "-?";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "-d-";
    Object v1 = org.apache.commons.cli.TypeHandler.createClass(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "-u";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "usage: ";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "  ";
    Object v1 = org.apache.commons.cli.TypeHandler.createObject(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "g";
    Object v1 = org.apache.commons.cli.TypeHandler.createFiles(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "[";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "`--";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = org.apache.commons.cli.TypeHandler.createDate(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "--Q";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "true";
    Object v1 = null;
    Object v2 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Class)v1));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "-p";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "m";
    Object v1 = org.apache.commons.cli.TypeHandler.createDate(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "--E";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = "usage: ";
    Object v2 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v1));
    Object v3 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "-r";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "C";
    Object v1 = org.apache.commons.cli.TypeHandler.createClass(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.cli.TypeHandler.createClass(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "Unable to find file:";
    Object v1 = org.apache.commons.cli.TypeHandler.createFiles(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = ",: ";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = org.apache.commons.cli.TypeHandler.createURL(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "y";
    Object v1 = org.apache.commons.cli.TypeHandler.openFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "-1";
    Object v1 = org.apache.commons.cli.TypeHandler.createURL(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "tru";
    Object v1 = "-u";
    Object v2 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v1));
    Object v3 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "g";
    Object v1 = org.apache.commons.cli.TypeHandler.createDate(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "-I";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = "usage: ";
    Object v2 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v1));
    Object v3 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = org.apache.commons.cli.TypeHandler.createClass(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "UnTable to find the class: ";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "s";
    Object v1 = org.apache.commons.cli.TypeHandler.openFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = " o";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "-p";
    Object v1 = org.apache.commons.cli.TypeHandler.createDate(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "The opton '";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "Unable to find the class: ";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = "-u";
    Object v2 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v1));
    Object v3 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "1";
    Object v1 = org.apache.commons.cli.TypeHandler.openFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "U-";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "+";
    Object v1 = org.apache.commons.cli.TypeHandler.openFile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "1true";
    Object v1 = org.apache.commons.cli.TypeHandler.createObject(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "w";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "--";
    Object v1 = org.apache.commons.cli.TypeHandler.createDate(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = ",c ";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "6";
    Object v1 = org.apache.commons.cli.TypeHandler.createFile(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "must specify lon&opt";
    Object v1 = org.apache.commons.cli.TypeHandler.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "-C";
    Object v1 = new org.apache.commons.cli.TypeHandler();
    Object v2 = org.apache.commons.cli.TypeHandler.createValue(((java.lang.String)v0),((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = org.apache.commons.cli.TypeHandler.createObject(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.apache.commons.cli.ParseException");
    } catch (org.apache.commons.cli.ParseException expected) { }
  }
}
