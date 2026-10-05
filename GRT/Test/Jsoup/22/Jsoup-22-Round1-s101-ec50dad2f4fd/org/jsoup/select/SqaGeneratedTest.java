package org.jsoup.select;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.select.Elements)v4).remove((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = ((org.jsoup.select.Elements)v4).hasText();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "option";
    Object v9 = ((org.jsoup.select.Elements)v7).after(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.select.Elements)v9).tagName(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xrarr";
    Object v9 = ((org.jsoup.select.Elements)v7).wrap(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).empty();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.select.Elements)v9).prepend(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).clone();
    Object v11 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v12 = "G";
    Object v13 = "a";
    Object v14 = org.jsoup.parser.Parser.parse(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v11),((org.jsoup.nodes.Element)v14));
    Object v16 = "li";
    Object v17 = "thead";
    Object v18 = ((org.jsoup.select.Elements)v15).attr(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.function.Predicate.isEqual(((java.lang.Object)v18));
    Object v20 = ((java.util.Collection)v10).removeIf(((java.util.function.Predicate)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).empty();
    Object v11 = "ttitle";
    Object v12 = ((org.jsoup.select.Elements)v10).before(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).hasText();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.select.Elements)v9).prepend(((java.lang.String)v10));
    Object v12 = new org.jsoup.select.Elements(((java.util.List)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.select.Elements)v9).attr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).last();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).listIterator();
    Object v3 = "colgroup";
    Object v4 = ((org.jsoup.select.Elements)v1).after(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((java.util.Collection)v1).stream();
    Object v3 = ((java.util.Collection)v1).parallelStream();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((java.util.List)v9).spliterator();
    Object v11 = "html";
    Object v12 = ((org.jsoup.select.Elements)v9).hasClass(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v3 = "G";
    Object v4 = "a";
    Object v5 = org.jsoup.parser.Parser.parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v2),((org.jsoup.nodes.Element)v5));
    Object v7 = "li";
    Object v8 = "thead";
    Object v9 = ((org.jsoup.select.Elements)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = java.util.function.Predicate.isEqual(((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v1).replaceAll(((java.util.function.UnaryOperator)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.nodes.Element[]{null};
    Object v3 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v2));
    Object v4 = ((org.jsoup.select.Elements)v1).retainAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((java.util.List)v1).spliterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.select.Elements)v9).prepend(((java.lang.String)v10));
    Object v12 = ((org.jsoup.select.Elements)v11).text();
    org.junit.Assert.assertEquals((Object)("G"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "brdy";
    Object v3 = ((org.jsoup.select.Elements)v1).prepend(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).html();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.select.Elements)v1).eq((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).last();
    Object v3 = ((org.jsoup.select.Elements)v1).outerHtml();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).iterator();
    Object v3 = "rmega";
    Object v4 = ((org.jsoup.select.Elements)v1).tagName(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(31), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.nodes.Element[]{null};
    Object v3 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v2));
    Object v4 = ((org.jsoup.select.Elements)v1).containsAll(((java.util.Collection)v3));
    Object v5 = "Must supply an even number of key value pairs";
    Object v6 = ((org.jsoup.select.Elements)v1).not(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "tfoo";
    Object v3 = ((org.jsoup.select.Elements)v1).wrap(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.nodes.Element[]{null};
    Object v3 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v2));
    Object v4 = new org.jsoup.nodes.Element[]{null};
    Object v5 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v4));
    Object v6 = ((org.jsoup.select.Elements)v3).retainAll(((java.util.Collection)v5));
    Object v7 = ((org.jsoup.select.Elements)v1).lastIndexOf(((java.lang.Object)v6));
    Object v8 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v9 = "G";
    Object v10 = "a";
    Object v11 = org.jsoup.parser.Parser.parse(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v8),((org.jsoup.nodes.Element)v11));
    Object v13 = "li";
    Object v14 = "thead";
    Object v15 = ((org.jsoup.select.Elements)v12).attr(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "table";
    Object v17 = ((org.jsoup.select.Elements)v15).tagName(((java.lang.String)v16));
    Object v18 = ((java.util.List)v17).spliterator();
    Object v19 = "html";
    Object v20 = ((org.jsoup.select.Elements)v17).hasClass(((java.lang.String)v19));
    Object v21 = ((org.jsoup.select.Elements)v1).remove(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = -39;
    Object v1 = new org.jsoup.select.Elements((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).clone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).remove();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.nodes.Element[]{null};
    Object v3 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v2));
    Object v4 = ((org.jsoup.select.Elements)v1).retainAll(((java.util.Collection)v3));
    Object v5 = 1;
    Object v6 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v7 = "G";
    Object v8 = "a";
    Object v9 = org.jsoup.parser.Parser.parse(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v6),((org.jsoup.nodes.Element)v9));
    Object v11 = "li";
    Object v12 = "thead";
    Object v13 = ((org.jsoup.select.Elements)v10).attr(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "table";
    Object v15 = ((org.jsoup.select.Elements)v13).tagName(((java.lang.String)v14));
    Object v16 = ((org.jsoup.select.Elements)v15).last();
    Object v17 = ((org.jsoup.nodes.Element)v16).html();
    ((org.jsoup.select.Elements)v1).add((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Element)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).last();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).parents();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "[d";
    Object v3 = ((org.jsoup.select.Elements)v1).is(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "</";
    Object v3 = ((org.jsoup.select.Elements)v1).attr(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "c1";
    Object v3 = ((org.jsoup.select.Elements)v1).toggleClass(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).empty();
    Object v11 = ((org.jsoup.select.Elements)v10).hasText();
    Object v12 = "meta";
    Object v13 = ((org.jsoup.select.Elements)v10).is(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.select.Elements)v7).last();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.select.Elements)v1).val(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "html";
    Object v3 = ((org.jsoup.select.Elements)v1).before(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    Object v7 = "bgsound";
    Object v8 = ((org.jsoup.select.Elements)v6).removeAttr(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "h1";
    Object v3 = ((org.jsoup.select.Elements)v1).before(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).clone();
    Object v11 = ((org.jsoup.select.Elements)v10).clone();
    Object v12 = "lbrack";
    Object v13 = ((org.jsoup.select.Elements)v10).is(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).first();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "iy";
    Object v3 = "htm!l";
    Object v4 = ((org.jsoup.select.Elements)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v3 = ((org.jsoup.select.Elements)v1).contains(((java.lang.Object)v2));
    Object v4 = "L";
    Object v5 = ((org.jsoup.select.Elements)v1).removeClass(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    Object v7 = "bgsound";
    Object v8 = ((org.jsoup.select.Elements)v6).removeAttr(((java.lang.String)v7));
    Object v9 = "tfoot";
    Object v10 = ((org.jsoup.select.Elements)v8).hasAttr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = ((org.jsoup.select.Elements)v4).val();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    Object v7 = "bgsound";
    Object v8 = ((org.jsoup.select.Elements)v6).removeAttr(((java.lang.String)v7));
    Object v9 = 13;
    Object v10 = ((org.jsoup.select.Elements)v8).get((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "aring";
    Object v3 = ((org.jsoup.select.Elements)v1).toggleClass(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).empty();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).empty();
    Object v11 = ((org.jsoup.select.Elements)v10).parents();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.select.Elements)v9).prepend(((java.lang.String)v10));
    Object v12 = ((org.jsoup.select.Elements)v11).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    Object v7 = "bgsound";
    Object v8 = ((org.jsoup.select.Elements)v6).removeAttr(((java.lang.String)v7));
    Object v9 = ":rdf";
    Object v10 = ((org.jsoup.select.Elements)v8).prepend(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new java.lang.Object[]{};
    Object v3 = ((org.jsoup.select.Elements)v1).toArray(((java.lang.Object[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "hX";
    Object v3 = ((org.jsoup.select.Elements)v1).val(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).isEmpty();
    Object v3 = "d";
    Object v4 = ((org.jsoup.select.Elements)v1).addClass(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v3 = ((org.jsoup.select.Elements)v1).lastIndexOf(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((java.util.List)v1).spliterator();
    Object v3 = "sacuteI";
    Object v4 = ((org.jsoup.select.Elements)v1).removeAttr(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "bo8dy";
    Object v3 = ((org.jsoup.select.Elements)v1).hasAttr(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v3 = "G";
    Object v4 = "a";
    Object v5 = org.jsoup.parser.Parser.parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v2),((org.jsoup.nodes.Element)v5));
    Object v7 = 0;
    Object v8 = ((org.jsoup.select.Elements)v6).remove((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.nodes.Element)v8).html();
    Object v10 = ((org.jsoup.select.Elements)v1).add(((org.jsoup.nodes.Element)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "lik";
    Object v3 = ((org.jsoup.select.Elements)v1).val(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).unwrap();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.select.Elements)v9).prepend(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.select.Elements)v11).addClass(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = new org.jsoup.nodes.Element[]{null};
    Object v11 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v10));
    Object v12 = ((org.jsoup.select.Elements)v9).remove(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((java.util.Collection)v1).toArray();
    Object v3 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v4 = "G";
    Object v5 = "a";
    Object v6 = org.jsoup.parser.Parser.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v3),((org.jsoup.nodes.Element)v6));
    Object v8 = "li";
    Object v9 = "thead";
    Object v10 = ((org.jsoup.select.Elements)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).outerHtml();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "bnody";
    Object v3 = ((org.jsoup.select.Elements)v1).toggleClass(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "djcy";
    Object v3 = ((org.jsoup.select.Elements)v1).append(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).empty();
    Object v11 = "html";
    Object v12 = ((org.jsoup.select.Elements)v10).attr(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((org.jsoup.select.Elements)v1).text();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    Object v7 = "bgsound";
    Object v8 = ((org.jsoup.select.Elements)v6).removeAttr(((java.lang.String)v7));
    Object v9 = 21;
    Object v10 = ((org.jsoup.select.Elements)v8).eq((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ((java.util.List)v1).isEmpty();
    Object v3 = java.util.Comparator.naturalOrder();
    ((java.util.List)v1).sort(((java.util.Comparator)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v3 = "G";
    Object v4 = "a";
    Object v5 = org.jsoup.parser.Parser.parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v2),((org.jsoup.nodes.Element)v5));
    Object v7 = "li";
    Object v8 = "thead";
    Object v9 = ((org.jsoup.select.Elements)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "table";
    Object v11 = ((org.jsoup.select.Elements)v9).tagName(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.select.Elements)v11).prepend(((java.lang.String)v12));
    Object v14 = ((org.jsoup.select.Elements)v1).containsAll(((java.util.Collection)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.nodes.Element[]{null};
    Object v3 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v2));
    Object v4 = ((org.jsoup.select.Elements)v1).containsAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    Object v7 = "bgsound";
    Object v8 = ((org.jsoup.select.Elements)v6).removeAttr(((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = ((org.jsoup.select.Elements)v8).subList((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = 3;
    Object v3 = ((org.jsoup.select.Elements)v1).eq((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = 3;
    Object v3 = ((org.jsoup.select.Elements)v1).eq((((java.lang.Integer)v2).intValue()));
    Object v4 = "ominus";
    Object v5 = "tLble";
    Object v6 = ((org.jsoup.select.Elements)v3).attr(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "   .     ";
    Object v3 = ((org.jsoup.select.Elements)v1).html(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.nodes.Element[]{null};
    Object v3 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v2));
    Object v4 = ((org.jsoup.select.Elements)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = "u";
    Object v3 = ((org.jsoup.select.Elements)v1).hasClass(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = ((org.jsoup.select.Elements)v9).prepend(((java.lang.String)v10));
    Object v12 = new org.jsoup.select.Elements(((java.util.List)v11));
    Object v13 = 1;
    Object v14 = -24;
    Object v15 = ((org.jsoup.select.Elements)v12).subList((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    Object v7 = "bgsound";
    Object v8 = ((org.jsoup.select.Elements)v6).removeAttr(((java.lang.String)v7));
    Object v9 = 21;
    Object v10 = ((org.jsoup.select.Elements)v8).eq((((java.lang.Integer)v9).intValue()));
    Object v11 = "li";
    Object v12 = ((org.jsoup.select.Elements)v10).append(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = 3;
    Object v3 = ((org.jsoup.select.Elements)v1).eq((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jsoup.select.Elements)v3).parents();
    Object v5 = 1;
    Object v6 = -21;
    Object v7 = ((org.jsoup.select.Elements)v3).subList((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "li";
    Object v6 = "thead";
    Object v7 = ((org.jsoup.select.Elements)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "table";
    Object v9 = ((org.jsoup.select.Elements)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.select.Elements)v9).empty();
    Object v11 = "html";
    Object v12 = ((org.jsoup.select.Elements)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.select.Elements)v10).html();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v3 = "G";
    Object v4 = "a";
    Object v5 = org.jsoup.parser.Parser.parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v2),((org.jsoup.nodes.Element)v5));
    Object v7 = "li";
    Object v8 = "thead";
    Object v9 = ((org.jsoup.select.Elements)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "table";
    Object v11 = ((org.jsoup.select.Elements)v9).tagName(((java.lang.String)v10));
    Object v12 = ((org.jsoup.select.Elements)v11).last();
    Object v13 = ((org.jsoup.select.Elements)v1).add(((org.jsoup.nodes.Element)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = 3;
    Object v3 = ((org.jsoup.select.Elements)v1).eq((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jsoup.select.Elements)v3).toArray();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v1 = "G";
    Object v2 = "a";
    Object v3 = org.jsoup.parser.Parser.parse(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v0),((org.jsoup.nodes.Element)v3));
    Object v5 = "t";
    Object v6 = ((org.jsoup.select.Elements)v4).html(((java.lang.String)v5));
    Object v7 = "bgsound";
    Object v8 = ((org.jsoup.select.Elements)v6).removeAttr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.select.Elements)v8).first();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = 3;
    Object v3 = ((org.jsoup.select.Elements)v1).eq((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jsoup.select.Elements)v3).outerHtml();
    Object v5 = "d";
    Object v6 = ((org.jsoup.select.Elements)v3).before(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = 30;
    Object v3 = new org.jsoup.select.StructuralEvaluator.Root();
    Object v4 = "G";
    Object v5 = "a";
    Object v6 = org.jsoup.parser.Parser.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.jsoup.select.Collector.collect(((org.jsoup.select.Evaluator)v3),((org.jsoup.nodes.Element)v6));
    Object v8 = "li";
    Object v9 = "thead";
    Object v10 = ((org.jsoup.select.Elements)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.select.Elements)v10).last();
    ((org.jsoup.select.Elements)v1).add((((java.lang.Integer)v2).intValue()),((org.jsoup.nodes.Element)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = 3;
    Object v3 = ((org.jsoup.select.Elements)v1).eq((((java.lang.Integer)v2).intValue()));
    Object v4 = "]head";
    Object v5 = ((org.jsoup.select.Elements)v3).addClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jsoup.nodes.Element[]{null};
    Object v1 = new org.jsoup.select.Elements(((org.jsoup.nodes.Element[])v0));
    Object v2 = ":containsO0n(";
    Object v3 = ((org.jsoup.select.Elements)v1).hasAttr(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
