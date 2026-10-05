package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Cannot remove a protocol that is not set.";
    Object v3 = ((org.jsoup.nodes.Node)v1).absUrl(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "frame";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsContainingText(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).dataNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).attributes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = -5;
    Object v6 = -35;
    Object v7 = new org.jsoup.select.Evaluator.IsNthOfType((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = "start";
    Object v9 = org.jsoup.nodes.Document.createShell(((java.lang.String)v8));
    Object v10 = "start";
    Object v11 = org.jsoup.nodes.Document.createShell(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "ta";
    Object v14 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v13));
    Object v15 = ((org.jsoup.select.Evaluator)v7).matches(((org.jsoup.nodes.Element)v9),((org.jsoup.nodes.Element)v14));
    Object v16 = ((org.jsoup.nodes.Element)v4).is(((org.jsoup.select.Evaluator)v7));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "html";
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Node)v5).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "hftml";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = "head";
    Object v10 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValue(((java.lang.String)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "hr";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).nodeName();
    org.junit.Assert.assertEquals((Object)("t"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = "htm";
    Object v9 = ((org.jsoup.nodes.Node)v7).before(((java.lang.String)v8));
    Object v10 = "start";
    Object v11 = org.jsoup.nodes.Document.createShell(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "ta";
    Object v14 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).childNodesCopy();
    Object v16 = ((org.jsoup.nodes.Node)v7).hasSameValue(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "start";
    Object v7 = org.jsoup.nodes.Document.createShell(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).clone();
    Object v9 = "ta";
    Object v10 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).shallowClone();
    Object v12 = "t";
    Object v13 = ((org.jsoup.nodes.Element)v11).prependElement(((java.lang.String)v12));
    ((org.jsoup.nodes.Node)v5).replaceWith(((org.jsoup.nodes.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = "th";
    Object v9 = ((org.jsoup.nodes.Element)v7).wrap(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "html";
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "start";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).clone();
    Object v12 = "ta";
    Object v13 = ((org.jsoup.nodes.Element)v10).toggleClass(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).shallowClone();
    Object v15 = "t";
    Object v16 = ((org.jsoup.nodes.Element)v14).prependElement(((java.lang.String)v15));
    ((org.jsoup.nodes.Node)v8).replaceWith(((org.jsoup.nodes.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).attributes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "html";
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    org.junit.Assert.assertEquals((Object)("<#root class=\"ta\" html=\"html\"></#root>"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = "start";
    Object v9 = org.jsoup.nodes.Document.createShell(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).clone();
    Object v11 = "ta";
    Object v12 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).shallowClone();
    Object v14 = ((org.jsoup.nodes.Node)v7).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).nextElementSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "ZScriptDataDoubleEscapedDash";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = "+u";
    Object v9 = "(ody";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "!";
    Object v12 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).nodeName();
    Object v9 = ((org.jsoup.nodes.Node)v7).nextSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "op8tgroup";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "'6";
    Object v3 = "start";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).clone();
    Object v6 = "ta";
    Object v7 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).attributes();
    Object v9 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).previousElementSibling();
    Object v11 = ((org.jsoup.nodes.FormElement)v9).submit();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).dataset();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = "comZmand";
    Object v9 = ((org.jsoup.nodes.Element)v7).addClass(((java.lang.String)v8));
    Object v10 = "aLdress";
    Object v11 = ((org.jsoup.nodes.Element)v7).selectFirst(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root.ta"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).baseUri();
    Object v5 = "tSable";
    Object v6 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "op8tgroup";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "'6";
    Object v3 = "start";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).clone();
    Object v6 = "ta";
    Object v7 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).attributes();
    Object v9 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).nextElementSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "tbody";
    Object v5 = ((org.jsoup.nodes.Element)v3).wrap(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).clone();
    Object v10 = "ta";
    Object v11 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).shallowClone();
    Object v13 = ((org.jsoup.nodes.Element)v12).clone();
    Object v14 = ((org.jsoup.nodes.Node)v13).childNodesCopy();
    Object v15 = ((org.jsoup.nodes.Element)v6).appendTo(((org.jsoup.nodes.Element)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "op8tgroup";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "'6";
    Object v3 = "start";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).clone();
    Object v6 = "ta";
    Object v7 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).attributes();
    Object v9 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.FormElement)v9).formData();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).classNames();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = "Xtitle";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = ((org.jsoup.nodes.Element)v6).html();
    Object v8 = ((org.jsoup.nodes.Element)v6).html();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).val();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "muted";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).hasText();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).textNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = ((org.jsoup.nodes.Element)v6).val();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = "bgsund";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).firstElementSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = 4;
    Object v8 = "start";
    Object v9 = org.jsoup.nodes.Document.createShell(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).clone();
    Object v11 = "ta";
    Object v12 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).childNodesCopy();
    ((java.util.Collection)v13).clear();
    Object v14 = null;
    Object v15 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = "#octype";
    Object v16 = ((org.jsoup.nodes.Element)v13).hasClass(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = ((org.jsoup.nodes.Element)v13).previousElementSibling();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsMatchingText(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    Object v9 = "ScriptDataEscapdLessthanSign";
    Object v10 = ((org.jsoup.nodes.Element)v7).prependElement(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "op8tgroup";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "'6";
    Object v3 = "start";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).clone();
    Object v6 = "ta";
    Object v7 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).attributes();
    Object v9 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.FormElement)v9).elements();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    Object v9 = "ScriptDataEscapdLessthanSign";
    Object v10 = ((org.jsoup.nodes.Element)v7).prependElement(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).unwrap();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    Object v9 = "ScriptDataEscapdLessthanSign";
    Object v10 = ((org.jsoup.nodes.Element)v7).prependElement(((java.lang.String)v9));
    Object v11 = "tr";
    Object v12 = ((org.jsoup.nodes.Element)v10).hasClass(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = 0;
    Object v8 = "op8tgroup";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "'6";
    Object v11 = "start";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).clone();
    Object v14 = "ta";
    Object v15 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).attributes();
    Object v17 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v16));
    Object v18 = ((org.jsoup.nodes.FormElement)v17).formData();
    Object v19 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = 41;
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementsByIndexGreaterThan((((java.lang.Integer)v14).intValue()));
    Object v16 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v17 = ((org.jsoup.nodes.Element)v13).html(((java.lang.Appendable)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).clone();
    Object v10 = "ta";
    Object v11 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).shallowClone();
    Object v13 = ((org.jsoup.nodes.Element)v12).clone();
    Object v14 = ((org.jsoup.nodes.Node)v13).childNodesCopy();
    Object v15 = ((org.jsoup.nodes.Element)v6).appendTo(((org.jsoup.nodes.Element)v13));
    Object v16 = "start";
    Object v17 = org.jsoup.nodes.Document.createShell(((java.lang.String)v16));
    Object v18 = "butto";
    Object v19 = ((org.jsoup.nodes.Element)v17).val(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v19).classNames();
    Object v21 = ((org.jsoup.nodes.Element)v15).classNames(((java.util.Set)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = ((org.jsoup.nodes.Element)v13).empty();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = 0;
    Object v15 = new org.jsoup.nodes.Node[]{null,null,null};
    Object v16 = ((org.jsoup.nodes.Element)v13).insertChildren((((java.lang.Integer)v14).intValue()),((org.jsoup.nodes.Node[])v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "html";
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).normalName();
    org.junit.Assert.assertEquals((Object)("#root"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = ((org.jsoup.nodes.Element)v13).nextElementSibling();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "t";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    Object v9 = "ScriptDataEscapdLessthanSign";
    Object v10 = ((org.jsoup.nodes.Element)v7).prependElement(((java.lang.String)v9));
    Object v11 = "h";
    Object v12 = ((org.jsoup.nodes.Element)v10).hasClass(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = 0;
    Object v8 = "op8tgroup";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "'6";
    Object v11 = "start";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).clone();
    Object v14 = "ta";
    Object v15 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).attributes();
    Object v17 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v16));
    Object v18 = ((org.jsoup.nodes.FormElement)v17).formData();
    Object v19 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v18));
    Object v20 = "ht#ps";
    Object v21 = ((org.jsoup.nodes.Element)v19).getElementById(((java.lang.String)v20));
    Object v22 = "D";
    Object v23 = ((org.jsoup.nodes.Element)v19).removeAttr(((java.lang.String)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = "p";
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementsByAttribute(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = 0;
    Object v8 = "op8tgroup";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "'6";
    Object v11 = "start";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).clone();
    Object v14 = "ta";
    Object v15 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).attributes();
    Object v17 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v16));
    Object v18 = ((org.jsoup.nodes.FormElement)v17).formData();
    Object v19 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v18));
    Object v20 = "ht#ps";
    Object v21 = ((org.jsoup.nodes.Element)v19).getElementById(((java.lang.String)v20));
    Object v22 = "D";
    Object v23 = ((org.jsoup.nodes.Element)v19).removeAttr(((java.lang.String)v22));
    Object v24 = "open";
    Object v25 = ((org.jsoup.nodes.Node)v23).attr(((java.lang.String)v24));
    org.junit.Assert.assertEquals((Object)(""), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v6).selectFirst(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "op8tgroup";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "'6";
    Object v3 = "start";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).clone();
    Object v6 = "ta";
    Object v7 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).attributes();
    Object v9 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.FormElement)v9).submit();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).siblingNodes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hasText();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = 2;
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementsByIndexLessThan((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = "br";
    Object v15 = "html";
    Object v16 = ((org.jsoup.nodes.Element)v13).attr(((java.lang.String)v14),((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "footer";
    Object v7 = "boXdy";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueContaining(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = 0;
    Object v8 = "op8tgroup";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "'6";
    Object v11 = "start";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).clone();
    Object v14 = "ta";
    Object v15 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).attributes();
    Object v17 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v16));
    Object v18 = ((org.jsoup.nodes.FormElement)v17).formData();
    Object v19 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v18));
    Object v20 = ((org.jsoup.nodes.Element)v19).siblingElements();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = 0;
    Object v11 = new org.jsoup.nodes.Node[]{null};
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Node[])v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = ((org.jsoup.nodes.Node)v13).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v11 = ((org.jsoup.nodes.Node)v9).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = "";
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementsByTag(((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = "start";
    Object v11 = org.jsoup.nodes.Document.createShell(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).clone();
    Object v13 = "ta";
    Object v14 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).shallowClone();
    Object v16 = ((org.jsoup.nodes.Element)v15).clone();
    Object v17 = "muted";
    Object v18 = ((org.jsoup.nodes.Node)v16).hasAttr(((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Node)v9).hasSameValue(((java.lang.Object)v18));
    Object v20 = ((org.jsoup.nodes.Element)v9).dataNodes();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Mozilla/5.0 (jsoup)";
    Object v3 = "colgroup";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueStarting(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = 0;
    Object v8 = "op8tgroup";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "'6";
    Object v11 = "start";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).clone();
    Object v14 = "ta";
    Object v15 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).attributes();
    Object v17 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v16));
    Object v18 = ((org.jsoup.nodes.FormElement)v17).formData();
    Object v19 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v18));
    Object v20 = 0;
    Object v21 = new org.jsoup.nodes.Node[]{null,null,null};
    Object v22 = ((org.jsoup.nodes.Element)v19).insertChildren((((java.lang.Integer)v20).intValue()),((org.jsoup.nodes.Node[])v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = "bKody";
    Object v15 = ((org.jsoup.nodes.Node)v13).attr(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "butto";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "butto";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).siblingElements();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "butto";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    ((java.util.Set)v11).clear();
    Object v12 = null;
    Object v13 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v11));
    Object v14 = "br";
    Object v15 = "html";
    Object v16 = ((org.jsoup.nodes.Element)v13).attr(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v16).previousElementSibling();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).clone();
    Object v10 = "ta";
    Object v11 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).shallowClone();
    Object v13 = ((org.jsoup.nodes.Element)v12).clone();
    Object v14 = ((org.jsoup.nodes.Element)v6).appendChild(((org.jsoup.nodes.Node)v13));
    Object v15 = ((org.jsoup.nodes.Element)v6).shallowClone();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "html";
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).shallowClone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).clone();
    Object v3 = "ta";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).shallowClone();
    Object v6 = "html";
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).shallowClone();
    Object v10 = ((org.jsoup.nodes.Element)v9).dataNodes();
    Object v11 = ((org.jsoup.nodes.Element)v9).previousElementSibling();
    org.junit.Assert.assertNull(v11);
  }
}
