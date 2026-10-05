package org.jsoup.safety;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "usage: supply url to fetch";
    Object v3 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v4 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "Ch";
    Object v6 = ((org.jsoup.nodes.Element)v4).hasClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v4));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "usage: supply url to fetch";
    Object v3 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v4 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = "usage: supply url to fetch";
    Object v3 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v4 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v7));
    Object v9 = org.jsoup.safety.Whitelist.none();
    Object v10 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v9));
    Object v11 = "usage: supply url to fetch";
    Object v12 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v13 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v10).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = "textarea";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsContainingOwnText(((java.lang.String)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = "dfn";
    Object v9 = ((org.jsoup.nodes.Element)v7).removeClass(((java.lang.String)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).className();
    Object v9 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.nodes.Element)v11).val();
    Object v13 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v7));
    Object v9 = org.jsoup.safety.Whitelist.none();
    Object v10 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v9));
    Object v11 = "usage: supply url to fetch";
    Object v12 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v13 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v10).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = org.jsoup.safety.Whitelist.none();
    Object v14 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v17 = "usage: supply url to fetch";
    Object v18 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v19 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v16).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.nodes.Element)v20).className();
    Object v22 = ((org.jsoup.safety.Cleaner)v14).clean(((org.jsoup.nodes.Document)v20));
    Object v23 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v11));
    Object v13 = org.jsoup.safety.Whitelist.none();
    Object v14 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v13));
    Object v15 = "usage: supply url to fetch";
    Object v16 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v17 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v14).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.nodes.Node)v11).ownerDocument();
    Object v13 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).children();
    Object v12 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = org.jsoup.safety.Whitelist.none();
    Object v15 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v14));
    Object v16 = "usage: supply url to fetch";
    Object v17 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v18 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v15).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = "textarea";
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementsContainingOwnText(((java.lang.String)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v13 = "tbody";
    Object v14 = ((org.jsoup.nodes.Element)v12).getElementsByAttributeStarting(((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v12));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.nodes.Document)v11).normalise();
    Object v13 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = "textarea";
    Object v13 = ((org.jsoup.nodes.Element)v11).getElementsContainingOwnText(((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v15 = "tbody";
    Object v16 = ((org.jsoup.nodes.Element)v14).getElementsByAttributeStarting(((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v14));
    Object v18 = "col";
    ((org.jsoup.nodes.Document)v17).title(((java.lang.String)v18));
    Object v19 = null;
    Object v20 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).siblingElements();
    Object v12 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = "tfoot";
    Object v12 = ((org.jsoup.nodes.Node)v10).hasAttr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = "textarea";
    Object v13 = ((org.jsoup.nodes.Element)v11).getElementsContainingOwnText(((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v15 = "tbody";
    Object v16 = ((org.jsoup.nodes.Element)v14).getElementsByAttributeStarting(((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v14));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).className();
    Object v15 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).hasText();
    Object v9 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = "textarea";
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementsContainingOwnText(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v17 = "tbody";
    Object v18 = ((org.jsoup.nodes.Element)v16).getElementsByAttributeStarting(((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v16));
    Object v20 = "col";
    ((org.jsoup.nodes.Document)v19).title(((java.lang.String)v20));
    Object v21 = null;
    Object v22 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v23 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v20));
    Object v22 = org.jsoup.safety.Whitelist.none();
    Object v23 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v22));
    Object v24 = org.jsoup.safety.Whitelist.none();
    Object v25 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v24));
    Object v26 = org.jsoup.safety.Whitelist.none();
    Object v27 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v26));
    Object v28 = org.jsoup.safety.Whitelist.none();
    Object v29 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v28));
    Object v30 = "usage: supply url to fetch";
    Object v31 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v32 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((org.jsoup.safety.Cleaner)v29).clean(((org.jsoup.nodes.Document)v32));
    Object v34 = ((org.jsoup.nodes.Element)v33).className();
    Object v35 = ((org.jsoup.safety.Cleaner)v27).clean(((org.jsoup.nodes.Document)v33));
    Object v36 = ((org.jsoup.safety.Cleaner)v25).clean(((org.jsoup.nodes.Document)v35));
    Object v37 = ((org.jsoup.safety.Cleaner)v23).clean(((org.jsoup.nodes.Document)v36));
    Object v38 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v37));
    org.junit.Assert.assertEquals((Object)(true), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = "dfn";
    Object v11 = ((org.jsoup.nodes.Element)v9).removeClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v13 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = "usage: supply url to fetch";
    Object v24 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v25 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = "textarea";
    Object v28 = ((org.jsoup.nodes.Element)v26).getElementsContainingOwnText(((java.lang.String)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v26));
    Object v30 = "tbody";
    Object v31 = ((org.jsoup.nodes.Element)v29).getElementsByAttributeStarting(((java.lang.String)v30));
    Object v32 = ((org.jsoup.safety.Cleaner)v18).clean(((org.jsoup.nodes.Document)v29));
    Object v33 = ((org.jsoup.safety.Cleaner)v16).clean(((org.jsoup.nodes.Document)v32));
    Object v34 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = "html";
    Object v13 = "bod";
    Object v14 = ((org.jsoup.nodes.Element)v11).getElementsByAttributeValueContaining(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = "usage: supply url to fetch";
    Object v24 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v25 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = "textarea";
    Object v28 = ((org.jsoup.nodes.Element)v26).getElementsContainingOwnText(((java.lang.String)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v26));
    Object v30 = "tbody";
    Object v31 = ((org.jsoup.nodes.Element)v29).getElementsByAttributeStarting(((java.lang.String)v30));
    Object v32 = ((org.jsoup.safety.Cleaner)v18).clean(((org.jsoup.nodes.Document)v29));
    Object v33 = "col";
    ((org.jsoup.nodes.Document)v32).title(((java.lang.String)v33));
    Object v34 = null;
    Object v35 = ((org.jsoup.safety.Cleaner)v16).clean(((org.jsoup.nodes.Document)v32));
    Object v36 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v20));
    Object v22 = org.jsoup.safety.Whitelist.none();
    Object v23 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v22));
    Object v24 = org.jsoup.safety.Whitelist.none();
    Object v25 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v24));
    Object v26 = org.jsoup.safety.Whitelist.none();
    Object v27 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v26));
    Object v28 = "usage: supply url to fetch";
    Object v29 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v30 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((org.jsoup.safety.Cleaner)v27).clean(((org.jsoup.nodes.Document)v30));
    Object v32 = ((org.jsoup.nodes.Element)v31).className();
    Object v33 = ((org.jsoup.safety.Cleaner)v25).clean(((org.jsoup.nodes.Document)v31));
    Object v34 = "html";
    Object v35 = "bod";
    Object v36 = ((org.jsoup.nodes.Element)v33).getElementsByAttributeValueContaining(((java.lang.String)v34),((java.lang.String)v35));
    Object v37 = ((org.jsoup.safety.Cleaner)v23).clean(((org.jsoup.nodes.Document)v33));
    Object v38 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v37));
    org.junit.Assert.assertEquals((Object)(true), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = "textarea";
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementsContainingOwnText(((java.lang.String)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v13 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v12));
    Object v14 = org.jsoup.safety.Whitelist.none();
    Object v15 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v14));
    Object v16 = org.jsoup.safety.Whitelist.none();
    Object v17 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v16));
    Object v18 = "usage: supply url to fetch";
    Object v19 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v20 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v17).clean(((org.jsoup.nodes.Document)v20));
    Object v22 = ((org.jsoup.safety.Cleaner)v15).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = org.jsoup.safety.Whitelist.none();
    Object v15 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v14));
    Object v16 = org.jsoup.safety.Whitelist.none();
    Object v17 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v16));
    Object v18 = org.jsoup.safety.Whitelist.none();
    Object v19 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v18));
    Object v20 = org.jsoup.safety.Whitelist.none();
    Object v21 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v20));
    Object v22 = "usage: supply url to fetch";
    Object v23 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v24 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v21).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = ((org.jsoup.nodes.Element)v25).className();
    Object v27 = ((org.jsoup.safety.Cleaner)v19).clean(((org.jsoup.nodes.Document)v25));
    Object v28 = ((org.jsoup.safety.Cleaner)v17).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v15).clean(((org.jsoup.nodes.Document)v28));
    Object v30 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v29));
    Object v31 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).className();
    Object v15 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = "textarea";
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementsContainingOwnText(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v17 = "tbody";
    Object v18 = ((org.jsoup.nodes.Element)v16).getElementsByAttributeStarting(((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v16));
    Object v20 = "col";
    ((org.jsoup.nodes.Document)v19).title(((java.lang.String)v20));
    Object v21 = null;
    Object v22 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v23 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v22));
    Object v24 = org.jsoup.safety.Whitelist.none();
    Object v25 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v24));
    Object v26 = org.jsoup.safety.Whitelist.none();
    Object v27 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v26));
    Object v28 = org.jsoup.safety.Whitelist.none();
    Object v29 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v28));
    Object v30 = "usage: supply url to fetch";
    Object v31 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v32 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((org.jsoup.safety.Cleaner)v29).clean(((org.jsoup.nodes.Document)v32));
    Object v34 = ((org.jsoup.safety.Cleaner)v27).clean(((org.jsoup.nodes.Document)v33));
    Object v35 = ((org.jsoup.safety.Cleaner)v25).clean(((org.jsoup.nodes.Document)v34));
    Object v36 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = "script";
    Object v22 = ((org.jsoup.nodes.Element)v20).getElementsContainingText(((java.lang.String)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = "html";
    Object v15 = "bod";
    Object v16 = ((org.jsoup.nodes.Element)v13).getElementsByAttributeValueContaining(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v18 = ((org.jsoup.nodes.Element)v17).ownText();
    Object v19 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = "html";
    Object v15 = "bod";
    Object v16 = ((org.jsoup.nodes.Element)v13).getElementsByAttributeValueContaining(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = org.jsoup.safety.Whitelist.none();
    Object v24 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v23));
    Object v25 = org.jsoup.safety.Whitelist.none();
    Object v26 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v25));
    Object v27 = org.jsoup.safety.Whitelist.none();
    Object v28 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v27));
    Object v29 = "usage: supply url to fetch";
    Object v30 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v31 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = ((org.jsoup.safety.Cleaner)v28).clean(((org.jsoup.nodes.Document)v31));
    Object v33 = ((org.jsoup.nodes.Element)v32).className();
    Object v34 = ((org.jsoup.safety.Cleaner)v26).clean(((org.jsoup.nodes.Document)v32));
    Object v35 = ((org.jsoup.safety.Cleaner)v24).clean(((org.jsoup.nodes.Document)v34));
    Object v36 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v35));
    Object v37 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v36));
    Object v38 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = "textarea";
    Object v13 = ((org.jsoup.nodes.Element)v11).getElementsContainingOwnText(((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v15 = "tbody";
    Object v16 = ((org.jsoup.nodes.Element)v14).getElementsByAttributeStarting(((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v14));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = "html";
    Object v15 = "bod";
    Object v16 = ((org.jsoup.nodes.Element)v13).getElementsByAttributeValueContaining(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).className();
    Object v15 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = "html";
    Object v17 = "bod";
    Object v18 = ((org.jsoup.nodes.Element)v15).getElementsByAttributeValueContaining(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = "html";
    Object v19 = "bod";
    Object v20 = ((org.jsoup.nodes.Element)v17).getElementsByAttributeValueContaining(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v22 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v22));
    Object v24 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).className();
    Object v15 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = "html";
    Object v17 = "bod";
    Object v18 = ((org.jsoup.nodes.Element)v15).getElementsByAttributeValueContaining(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v20));
    Object v22 = org.jsoup.safety.Whitelist.none();
    Object v23 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v22));
    Object v24 = "usage: supply url to fetch";
    Object v25 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v26 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v23).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = org.jsoup.safety.Whitelist.none();
    Object v17 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v16));
    Object v18 = org.jsoup.safety.Whitelist.none();
    Object v19 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v18));
    Object v20 = org.jsoup.safety.Whitelist.none();
    Object v21 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v20));
    Object v22 = org.jsoup.safety.Whitelist.none();
    Object v23 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v22));
    Object v24 = "usage: supply url to fetch";
    Object v25 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v26 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v23).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.nodes.Element)v27).className();
    Object v29 = ((org.jsoup.safety.Cleaner)v21).clean(((org.jsoup.nodes.Document)v27));
    Object v30 = "html";
    Object v31 = "bod";
    Object v32 = ((org.jsoup.nodes.Element)v29).getElementsByAttributeValueContaining(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((org.jsoup.safety.Cleaner)v19).clean(((org.jsoup.nodes.Document)v29));
    Object v34 = ((org.jsoup.safety.Cleaner)v17).clean(((org.jsoup.nodes.Document)v33));
    Object v35 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = "usage: supply url to fetch";
    Object v22 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v23 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v18).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v16).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = "boGy";
    Object v13 = java.util.regex.Pattern.compile(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v11).getElementsMatchingOwnText(((java.util.regex.Pattern)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v3).isValid(((org.jsoup.nodes.Document)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = "usage: supply url to fetch";
    Object v24 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v25 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v18).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v28));
    Object v30 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = "tbody";
    Object v18 = ((org.jsoup.nodes.Element)v16).getElementsContainingOwnText(((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v16));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = "html";
    Object v19 = "bod";
    Object v20 = ((org.jsoup.nodes.Element)v17).getElementsByAttributeValueContaining(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v22 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v22));
    Object v24 = "capion";
    Object v25 = ((org.jsoup.nodes.Document)v23).createElement(((java.lang.String)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = "usage: supply url to fetch";
    Object v15 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v16 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.nodes.Element)v17).className();
    Object v19 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v17));
    Object v20 = "html";
    Object v21 = "bod";
    Object v22 = ((org.jsoup.nodes.Element)v19).getElementsByAttributeValueContaining(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v19));
    Object v24 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = "capion";
    Object v27 = ((org.jsoup.nodes.Document)v25).createElement(((java.lang.String)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v25));
    Object v29 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = org.jsoup.safety.Whitelist.none();
    Object v24 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v23));
    Object v25 = "usage: supply url to fetch";
    Object v26 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v27 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v24).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v28));
    Object v30 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v29));
    Object v31 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v30));
    Object v32 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v31));
    Object v33 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v32));
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).className();
    Object v15 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = "html";
    Object v17 = "bod";
    Object v18 = ((org.jsoup.nodes.Element)v15).getElementsByAttributeValueContaining(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = "td";
    Object v22 = ((org.jsoup.nodes.Element)v20).appendElement(((java.lang.String)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v16));
    Object v18 = org.jsoup.safety.Whitelist.none();
    Object v19 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v18));
    Object v20 = org.jsoup.safety.Whitelist.none();
    Object v21 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v20));
    Object v22 = "usage: supply url to fetch";
    Object v23 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v24 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v21).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = ((org.jsoup.nodes.Element)v25).className();
    Object v27 = ((org.jsoup.safety.Cleaner)v19).clean(((org.jsoup.nodes.Document)v25));
    Object v28 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v7));
    Object v9 = org.jsoup.safety.Whitelist.none();
    Object v10 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v9));
    Object v11 = org.jsoup.safety.Whitelist.none();
    Object v12 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v11));
    Object v13 = org.jsoup.safety.Whitelist.none();
    Object v14 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v19 = "usage: supply url to fetch";
    Object v20 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v21 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((org.jsoup.safety.Cleaner)v18).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v16).clean(((org.jsoup.nodes.Document)v22));
    Object v24 = ((org.jsoup.safety.Cleaner)v14).clean(((org.jsoup.nodes.Document)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v12).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = "tbody";
    Object v27 = ((org.jsoup.nodes.Element)v25).getElementsContainingOwnText(((java.lang.String)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v10).clean(((org.jsoup.nodes.Document)v25));
    Object v29 = "base";
    Object v30 = ((org.jsoup.nodes.Element)v28).tagName(((java.lang.String)v29));
    Object v31 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v28));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v15 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = "opt\"ion";
    Object v17 = ((org.jsoup.nodes.Element)v15).getElementsByClass(((java.lang.String)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v15));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = "textarea";
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementsContainingOwnText(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v17 = "tbody";
    Object v18 = ((org.jsoup.nodes.Element)v16).getElementsByAttributeStarting(((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v16));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).classNames();
    Object v15 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v13));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = "html";
    Object v19 = "bod";
    Object v20 = ((org.jsoup.nodes.Element)v17).getElementsByAttributeValueContaining(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v22 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v22));
    Object v24 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v3).isValid(((org.jsoup.nodes.Document)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = "usage: supply url to fetch";
    Object v24 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v25 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v18).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v28));
    Object v30 = "thad";
    Object v31 = "pr";
    Object v32 = ((org.jsoup.nodes.Element)v29).getElementsByAttributeValueMatching(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v29));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = "html";
    Object v19 = "bod";
    Object v20 = ((org.jsoup.nodes.Element)v17).getElementsByAttributeValueContaining(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v22 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = "td";
    Object v24 = ((org.jsoup.nodes.Element)v22).appendElement(((java.lang.String)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v22));
    Object v26 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).className();
    Object v15 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = "html";
    Object v17 = "bod";
    Object v18 = ((org.jsoup.nodes.Element)v15).getElementsByAttributeValueContaining(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = -17;
    Object v22 = ((org.jsoup.nodes.Element)v20).getElementsByIndexGreaterThan((((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v20));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).id();
    Object v12 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = "th";
    Object v15 = ((org.jsoup.nodes.Document)v13).createElement(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v13));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).className();
    Object v15 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = org.jsoup.safety.Whitelist.none();
    Object v24 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v23));
    Object v25 = org.jsoup.safety.Whitelist.none();
    Object v26 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v25));
    Object v27 = "usage: supply url to fetch";
    Object v28 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v29 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = ((org.jsoup.safety.Cleaner)v26).clean(((org.jsoup.nodes.Document)v29));
    Object v31 = ((org.jsoup.nodes.Element)v30).className();
    Object v32 = ((org.jsoup.safety.Cleaner)v24).clean(((org.jsoup.nodes.Document)v30));
    Object v33 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v32));
    Object v34 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v33));
    Object v35 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).id();
    Object v14 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).getAllElements();
    Object v12 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).id();
    Object v14 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v3).isValid(((org.jsoup.nodes.Document)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = "usage: supply url to fetch";
    Object v24 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v25 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v18).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v28));
    Object v30 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = "textarea";
    Object v17 = ((org.jsoup.nodes.Element)v15).getElementsContainingOwnText(((java.lang.String)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v19 = "tbody";
    Object v20 = ((org.jsoup.nodes.Element)v18).getElementsByAttributeStarting(((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v18));
    Object v22 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v22));
    Object v24 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v23));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = "usage: supply url to fetch";
    Object v5 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v6 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v7));
    Object v9 = org.jsoup.safety.Whitelist.none();
    Object v10 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v9));
    Object v11 = org.jsoup.safety.Whitelist.none();
    Object v12 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v11));
    Object v13 = org.jsoup.safety.Whitelist.none();
    Object v14 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v17 = "usage: supply url to fetch";
    Object v18 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v19 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((org.jsoup.safety.Cleaner)v16).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.nodes.Element)v20).className();
    Object v22 = ((org.jsoup.safety.Cleaner)v14).clean(((org.jsoup.nodes.Document)v20));
    Object v23 = "html";
    Object v24 = "bod";
    Object v25 = ((org.jsoup.nodes.Element)v22).getElementsByAttributeValueContaining(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v12).clean(((org.jsoup.nodes.Document)v22));
    Object v27 = ((org.jsoup.safety.Cleaner)v10).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).getAllElements();
    Object v15 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v13));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = "html";
    Object v15 = "bod";
    Object v16 = ((org.jsoup.nodes.Element)v13).getElementsByAttributeValueContaining(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = "usage: supply url to fetch";
    Object v15 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v16 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.nodes.Element)v17).className();
    Object v19 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v17));
    Object v20 = "html";
    Object v21 = "bod";
    Object v22 = ((org.jsoup.nodes.Element)v19).getElementsByAttributeValueContaining(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v19));
    Object v24 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.nodes.Element)v26).previousElementSibling();
    Object v28 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v26));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = "usage: supply url to fetch";
    Object v11 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).className();
    Object v15 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v13));
    Object v16 = "html";
    Object v17 = "bod";
    Object v18 = ((org.jsoup.nodes.Element)v15).getElementsByAttributeValueContaining(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v15));
    Object v20 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v20));
    Object v22 = org.jsoup.safety.Whitelist.none();
    Object v23 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v22));
    Object v24 = org.jsoup.safety.Whitelist.none();
    Object v25 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v24));
    Object v26 = org.jsoup.safety.Whitelist.none();
    Object v27 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v26));
    Object v28 = "usage: supply url to fetch";
    Object v29 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v30 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((org.jsoup.safety.Cleaner)v27).clean(((org.jsoup.nodes.Document)v30));
    Object v32 = ((org.jsoup.nodes.Element)v31).className();
    Object v33 = ((org.jsoup.safety.Cleaner)v25).clean(((org.jsoup.nodes.Document)v31));
    Object v34 = "html";
    Object v35 = "bod";
    Object v36 = ((org.jsoup.nodes.Element)v33).getElementsByAttributeValueContaining(((java.lang.String)v34),((java.lang.String)v35));
    Object v37 = ((org.jsoup.safety.Cleaner)v23).clean(((org.jsoup.nodes.Document)v33));
    Object v38 = ((org.jsoup.nodes.Element)v37).empty();
    Object v39 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v37));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v18 = "html";
    Object v19 = "bod";
    Object v20 = ((org.jsoup.nodes.Element)v17).getElementsByAttributeValueContaining(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v17));
    Object v22 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v21));
    Object v23 = "td";
    Object v24 = ((org.jsoup.nodes.Element)v22).appendElement(((java.lang.String)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v22));
    Object v26 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = "usage: supply url to fetch";
    Object v15 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v16 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.nodes.Element)v17).className();
    Object v19 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v17));
    Object v20 = "html";
    Object v21 = "bod";
    Object v22 = ((org.jsoup.nodes.Element)v19).getElementsByAttributeValueContaining(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v19));
    Object v24 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).id();
    Object v14 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v14));
    Object v16 = org.jsoup.safety.Whitelist.none();
    Object v17 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v16));
    Object v18 = org.jsoup.safety.Whitelist.none();
    Object v19 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v18));
    Object v20 = org.jsoup.safety.Whitelist.none();
    Object v21 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v20));
    Object v22 = org.jsoup.safety.Whitelist.none();
    Object v23 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v22));
    Object v24 = "usage: supply url to fetch";
    Object v25 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v26 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v23).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = ((org.jsoup.nodes.Element)v27).className();
    Object v29 = ((org.jsoup.safety.Cleaner)v21).clean(((org.jsoup.nodes.Document)v27));
    Object v30 = "html";
    Object v31 = "bod";
    Object v32 = ((org.jsoup.nodes.Element)v29).getElementsByAttributeValueContaining(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((org.jsoup.safety.Cleaner)v19).clean(((org.jsoup.nodes.Document)v29));
    Object v34 = ((org.jsoup.safety.Cleaner)v17).clean(((org.jsoup.nodes.Document)v33));
    Object v35 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v9));
    Object v12 = "nyscript";
    Object v13 = ((org.jsoup.nodes.Document)v11).createElement(((java.lang.String)v12));
    Object v14 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v14 = "rh1";
    Object v15 = ((org.jsoup.nodes.Element)v13).appendText(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v13));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).getAllElements();
    Object v14 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v15 = "t";
    Object v16 = ((org.jsoup.nodes.Element)v14).appendElement(((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = org.jsoup.safety.Whitelist.none();
    Object v13 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v12));
    Object v14 = "usage: supply url to fetch";
    Object v15 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v16 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v13).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.nodes.Element)v17).className();
    Object v19 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v17));
    Object v20 = "html";
    Object v21 = "bod";
    Object v22 = ((org.jsoup.nodes.Element)v19).getElementsByAttributeValueContaining(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v19));
    Object v24 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v23));
    Object v25 = "td";
    Object v26 = ((org.jsoup.nodes.Element)v24).appendElement(((java.lang.String)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v24));
    Object v28 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = "boGy";
    Object v15 = java.util.regex.Pattern.compile(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v13).getElementsMatchingOwnText(((java.util.regex.Pattern)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v18 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = "usage: supply url to fetch";
    Object v7 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.safety.Cleaner)v3).isValid(((org.jsoup.nodes.Document)v9));
    Object v11 = org.jsoup.safety.Whitelist.none();
    Object v12 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v11));
    Object v13 = org.jsoup.safety.Whitelist.none();
    Object v14 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v13));
    Object v15 = org.jsoup.safety.Whitelist.none();
    Object v16 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v15));
    Object v17 = org.jsoup.safety.Whitelist.none();
    Object v18 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = "usage: supply url to fetch";
    Object v22 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v23 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v23));
    Object v25 = ((org.jsoup.safety.Cleaner)v18).clean(((org.jsoup.nodes.Document)v24));
    Object v26 = ((org.jsoup.safety.Cleaner)v16).clean(((org.jsoup.nodes.Document)v25));
    Object v27 = ((org.jsoup.safety.Cleaner)v14).clean(((org.jsoup.nodes.Document)v26));
    Object v28 = "tbody";
    Object v29 = ((org.jsoup.nodes.Element)v27).getElementsContainingOwnText(((java.lang.String)v28));
    Object v30 = ((org.jsoup.safety.Cleaner)v12).clean(((org.jsoup.nodes.Document)v27));
    Object v31 = "base";
    Object v32 = ((org.jsoup.nodes.Element)v30).tagName(((java.lang.String)v31));
    Object v33 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v30));
    Object v34 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).getAllElements();
    Object v14 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v12));
    Object v15 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = org.jsoup.safety.Whitelist.none();
    Object v9 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v8));
    Object v10 = org.jsoup.safety.Whitelist.none();
    Object v11 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v10));
    Object v12 = "usage: supply url to fetch";
    Object v13 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.safety.Cleaner)v11).clean(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v9).clean(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.jsoup.safety.Cleaner)v5).isValid(((org.jsoup.nodes.Document)v17));
    Object v19 = org.jsoup.safety.Whitelist.none();
    Object v20 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v19));
    Object v21 = org.jsoup.safety.Whitelist.none();
    Object v22 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v21));
    Object v23 = org.jsoup.safety.Whitelist.none();
    Object v24 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v23));
    Object v25 = "usage: supply url to fetch";
    Object v26 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v27 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((org.jsoup.safety.Cleaner)v24).clean(((org.jsoup.nodes.Document)v27));
    Object v29 = ((org.jsoup.safety.Cleaner)v22).clean(((org.jsoup.nodes.Document)v28));
    Object v30 = ((org.jsoup.safety.Cleaner)v20).clean(((org.jsoup.nodes.Document)v29));
    Object v31 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v30));
    Object v32 = "thad";
    Object v33 = "pr";
    Object v34 = ((org.jsoup.nodes.Element)v31).getElementsByAttributeValueMatching(((java.lang.String)v32),((java.lang.String)v33));
    Object v35 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v31));
    Object v36 = ((org.jsoup.safety.Cleaner)v1).clean(((org.jsoup.nodes.Document)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.jsoup.safety.Whitelist.none();
    Object v1 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v0));
    Object v2 = org.jsoup.safety.Whitelist.none();
    Object v3 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v2));
    Object v4 = org.jsoup.safety.Whitelist.none();
    Object v5 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v4));
    Object v6 = org.jsoup.safety.Whitelist.none();
    Object v7 = new org.jsoup.safety.Cleaner(((org.jsoup.safety.Whitelist)v6));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "DoctypeSystemIdentifier_doubleQuoted";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.safety.Cleaner)v7).clean(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).className();
    Object v13 = ((org.jsoup.safety.Cleaner)v5).clean(((org.jsoup.nodes.Document)v11));
    Object v14 = "nyscript";
    Object v15 = ((org.jsoup.nodes.Document)v13).createElement(((java.lang.String)v14));
    Object v16 = ((org.jsoup.safety.Cleaner)v3).clean(((org.jsoup.nodes.Document)v13));
    Object v17 = java.util.Set.of();
    Object v18 = ((org.jsoup.nodes.Element)v16).classNames(((java.util.Set)v17));
    Object v19 = ((org.jsoup.safety.Cleaner)v1).isValid(((org.jsoup.nodes.Document)v16));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }
}
