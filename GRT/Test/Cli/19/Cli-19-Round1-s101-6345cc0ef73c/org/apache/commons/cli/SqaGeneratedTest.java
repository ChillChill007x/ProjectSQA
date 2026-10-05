package org.apache.commons.cli;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "--{";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = "yqes";
    Object v7 = "arg2";
    Object v8 = false;
    Object v9 = "W";
    Object v10 = new org.apache.commons.cli.Option(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.cli.Options)v5).addOption(((org.apache.commons.cli.Option)v10));
    Object v12 = new java.lang.String[]{"","-","1"};
    Object v13 = 0;
    Object v14 = new java.util.Properties((((java.lang.Integer)v13).intValue()));
    Object v15 = "yqes";
    Object v16 = "arg2";
    Object v17 = false;
    Object v18 = "W";
    Object v19 = new org.apache.commons.cli.Option(((java.lang.String)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),((java.lang.String)v18));
    Object v20 = ((java.util.Properties)v14).equals(((java.lang.Object)v19));
    Object v21 = true;
    Object v22 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v12),((java.util.Properties)v14),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "trBe";
    Object v3 = ((org.apache.commons.cli.Options)v1).getOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{"?","--"," "};
    Object v5 = 0;
    Object v6 = new java.util.Properties((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" 8","-"," "};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","--"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = " ";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{};
    Object v8 = false;
    Object v9 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{};
    Object v8 = 0;
    Object v9 = new java.util.Properties((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--",""};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"--","true"};
    Object v8 = 0;
    Object v9 = new java.util.Properties((((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7),((java.util.Properties)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "yqes";
    Object v2 = "arg2";
    Object v3 = false;
    Object v4 = "W";
    Object v5 = new org.apache.commons.cli.Option(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.String)v4));
    Object v6 = null;
    ((org.apache.commons.cli.Parser)v0).processArgs(((org.apache.commons.cli.Option)v5),((java.util.ListIterator)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "A--";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).toString();
    Object v3 = new java.lang.String[]{};
    Object v4 = 0;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"," ] [ long"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"",", _"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "must specify longopt";
    Object v8 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-Q"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = " :";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-;","tru"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "-,-";
    Object v8 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"D-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"opt contains illegaltcharacter value '"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    Object v6 = "-";
    Object v7 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.Properties)v4).toString();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).toString();
    Object v3 = new java.lang.String[]{};
    Object v4 = 0;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"L"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "yqes";
    Object v3 = "arg2";
    Object v4 = false;
    Object v5 = "W";
    Object v6 = new org.apache.commons.cli.Option(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v6));
    Object v8 = new java.lang.String[]{"--","-"};
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"-"};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "s";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.Properties)v4).hashCode();
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "-o";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--"," "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--",""};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "-H";
    Object v6 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "t-";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--"," "};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{};
    Object v6 = 0;
    Object v7 = new java.util.Properties((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.cli.Options();
    Object v9 = new org.apache.commons.cli.PosixParser();
    Object v10 = new org.apache.commons.cli.Options();
    Object v11 = new java.lang.String[]{"-"};
    Object v12 = false;
    Object v13 = ((org.apache.commons.cli.PosixParser)v9).flatten(((org.apache.commons.cli.Options)v10),((java.lang.String[])v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((java.util.Properties)v7).putIfAbsent(((java.lang.Object)v8),((java.lang.Object)v13));
    Object v15 = true;
    Object v16 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),((java.util.Properties)v7),(((java.lang.Boolean)v15).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "-";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "arg";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","g","$"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","","-"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "illegalV option value '";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-."};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","R-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"'"};
    Object v7 = 0;
    Object v8 = new java.util.Properties((((java.lang.Integer)v7).intValue()));
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-%","true","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"; Unable to create an instance of: ","-`"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","-","-"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = new java.lang.String[]{"b"};
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "yqes";
    Object v3 = "arg2";
    Object v4 = false;
    Object v5 = "W";
    Object v6 = new org.apache.commons.cli.Option(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Options)v1).getOptionGroup(((org.apache.commons.cli.Option)v6));
    Object v8 = new java.lang.String[]{"7-","--"};
    Object v9 = true;
    Object v10 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","-T"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "-";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "[";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-",""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = 0;
    Object v8 = new java.util.Properties((((java.lang.Integer)v7).intValue()));
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" ",";Unable to create an instance of: "};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "-";
    Object v6 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.cli.Options();
    Object v8 = new java.lang.String[]{"Wtrue","&"};
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ","-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-","rg"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.cli.PosixParser();
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = ((org.apache.commons.cli.Options)v6).toString();
    Object v8 = new java.lang.String[]{};
    Object v9 = 0;
    Object v10 = new java.util.Properties((((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = ((org.apache.commons.cli.Parser)v5).parse(((org.apache.commons.cli.Options)v6),((java.lang.String[])v8),((java.util.Properties)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "yqes";
    Object v14 = "arg2";
    Object v15 = false;
    Object v16 = "W";
    Object v17 = new org.apache.commons.cli.Option(((java.lang.String)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.String)v16));
    Object v18 = ((java.util.Properties)v4).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v17));
    Object v19 = false;
    Object v20 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.apache.commons.cli.Options();
    Object v8 = new java.lang.String[]{"L-"};
    Object v9 = false;
    Object v10 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v7),((java.lang.String[])v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"arg",""};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-Y-","-"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"{]","The option '","--"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","--",">"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"y","--."};
    Object v4 = 0;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "yqes";
    Object v3 = "arg2";
    Object v4 = false;
    Object v5 = "W";
    Object v6 = new org.apache.commons.cli.Option(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.cli.Options)v1).addOption(((org.apache.commons.cli.Option)v6));
    Object v8 = new java.lang.String[]{"-@",""};
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v8));
      org.junit.Assert.fail("Expected org.apache.commons.cli.UnrecognizedOptionException");
    } catch (org.apache.commons.cli.UnrecognizedOptionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"7-","--","The option '"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"--","-#","--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    Object v6 = "#-";
    Object v7 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"Cannot add value, list f{ull."," ","\""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"B","-","--"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    Object v6 = "-";
    Object v7 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "--";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = "--";
    Object v3 = ((org.apache.commons.cli.Options)v1).hasOption(((java.lang.String)v2));
    Object v4 = new java.lang.String[]{};
    Object v5 = 0;
    Object v6 = new java.util.Properties((((java.lang.Integer)v5).intValue()));
    ((java.util.Properties)v6).clear();
    Object v7 = null;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"=","--"};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"opt contains ille","-T"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{};
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).getOptions();
    Object v3 = new java.lang.String[]{"true"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{" ","","-"};
    Object v3 = true;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "t";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.InputStream.nullInputStream();
    ((java.util.Properties)v4).load(((java.io.InputStream)v5));
    Object v6 = null;
    Object v7 = false;
    Object v8 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new org.apache.commons.cli.OptionGroup();
    Object v3 = ((org.apache.commons.cli.Options)v1).addOptionGroup(((org.apache.commons.cli.OptionGroup)v2));
    Object v4 = new java.lang.String[]{"-","}-"};
    Object v5 = 0;
    Object v6 = new java.util.Properties((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.Properties)v6).clone();
    Object v8 = true;
    Object v9 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v4),((java.util.Properties)v6),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"usage: ","-"};
    Object v7 = 0;
    Object v8 = new java.util.Properties((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.Properties)v8).stringPropertyNames();
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),((java.util.Properties)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "P ";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "n :: ";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","--"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "d-";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"]","u-","-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{""};
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.apache.commons.cli.Options();
    Object v6 = new java.lang.String[]{"--","arg","-"};
    Object v7 = true;
    Object v8 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v5),((java.lang.String[])v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"marg"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    Object v4 = new org.apache.commons.cli.Options();
    Object v5 = new java.lang.String[]{"Missing requiredoption","illegal option"};
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v4),((java.lang.String[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "illegal option valueq'";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "' was specified but aDn option from this group has already been selected: '";
    Object v2 = false;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).toString();
    Object v3 = new java.lang.String[]{"-","","]"};
    Object v4 = true;
    Object v5 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = ((org.apache.commons.cli.Options)v1).toString();
    Object v3 = new java.lang.String[]{"-","ar"};
    Object v4 = 0;
    Object v5 = new java.util.Properties((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v3),((java.util.Properties)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"","","Missing argument for option "};
    Object v3 = 0;
    Object v4 = new java.util.Properties((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),((java.util.Properties)v4));
    Object v6 = new org.apache.commons.cli.Options();
    Object v7 = "-";
    Object v8 = ((org.apache.commons.cli.Options)v6).getOption(((java.lang.String)v7));
    Object v9 = new java.lang.String[]{"truSe"};
    Object v10 = true;
    Object v11 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v6),((java.lang.String[])v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-","\"",",-"};
    Object v3 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"\""};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.PosixParser)v0).flatten(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = "--";
    Object v2 = true;
    ((org.apache.commons.cli.PosixParser)v0).burstToken(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.cli.PosixParser();
    Object v1 = new org.apache.commons.cli.Options();
    Object v2 = new java.lang.String[]{"-"};
    Object v3 = false;
    Object v4 = ((org.apache.commons.cli.Parser)v0).parse(((org.apache.commons.cli.Options)v1),((java.lang.String[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }
}
