package org.apache.commons.csv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getSkipHeaderRecord();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isQuoting();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).format(((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    ((org.apache.commons.csv.CSVFormat)v3).validate();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withRecordSeparator((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isEscaping();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withDelimiter((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withRecordSeparator((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> Escape=<\u0000> CommentStart=<\u0001> SkipHeaderRecord:false"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withDelimiter((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v10));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).isCommentingEnabled();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    ((org.apache.commons.csv.CSVFormat)v7).validate();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withIgnoreEmptyLines((((java.lang.Boolean)v6).booleanValue()));
    ((org.apache.commons.csv.CSVFormat)v5).validate();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).isQuoting();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getHeader();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).isCommentingEnabled();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isCommentingEnabled();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).isEscaping();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).isNullHandling();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withQuoteChar(((java.lang.Character)v10));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v9).getHeader();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withRecordSeparator((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).isEscaping();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).isCommentingEnabled();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).getQuotePolicy();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(1255377396), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)13);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withQuoteChar(((java.lang.Character)v8));
    Object v10 = Character.valueOf((char)1);
    Object v11 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v10).charValue()));
    Object v12 = Character.valueOf((char)1);
    Object v13 = ((org.apache.commons.csv.CSVFormat)v11).withQuoteChar(((java.lang.Character)v12));
    Object v14 = ((org.apache.commons.csv.CSVFormat)v7).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getNullString();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)1);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = Character.valueOf((char)1);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withQuoteChar(((java.lang.Character)v10));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v7).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).format(((java.lang.Object[])v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = "COM";
    Object v9 = new java.io.StringReader(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).parse(((java.io.Reader)v9));
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.csv.CSVFormat)v7).withQuoteChar((((java.lang.Character)v11).charValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).isNullHandling();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v3).withCommentStart(((java.lang.Character)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)1);
    Object v7 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    Object v10 = true;
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withIgnoreSurroundingSpaces((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).isQuoting();
    Object v13 = ((org.apache.commons.csv.CSVFormat)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = false;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar((((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getIgnoreSurroundingSpaces();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar((((java.lang.Character)v6).charValue()));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).getDelimiter();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).getQuotePolicy();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).hashCode();
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).isCommentingEnabled();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = org.apache.commons.csv.Quote.ALL;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).withQuotePolicy(((org.apache.commons.csv.Quote)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).getHeader();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).getQuotePolicy();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getDelimiter();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).isEscaping();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = org.apache.commons.csv.Quote.ALL;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).withQuotePolicy(((org.apache.commons.csv.Quote)v8));
    Object v11 = ((org.apache.commons.csv.CSVFormat)v10).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> Escape=<\u0000> CommentStart=<\t> SkipHeaderRecord:false"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = false;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> CommentStart=<\u0001> SkipHeaderRecord:false"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = new java.lang.String[]{"(startline "};
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withHeader(((java.lang.String[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withIgnoreEmptyLines((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withQuoteChar(((java.lang.Character)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v5).getIgnoreSurroundingSpaces();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isQuoting();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v3).withCommentStart(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v8).charValue()));
    Object v10 = new java.lang.String[]{"(startline "};
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withHeader(((java.lang.String[])v10));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v7).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)65535);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape((((java.lang.Character)v8).charValue()));
    Object v10 = true;
    Object v11 = ((org.apache.commons.csv.CSVFormat)v7).withSkipHeaderRecord((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = " SkipH|aderRecord:";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withRecordSeparator(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isCommentingEnabled();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = false;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)3);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).getHeader();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v3).isCommentingEnabled();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = false;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)3);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    Object v8 = Character.valueOf((char)32);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withDelimiter((((java.lang.Character)v8).charValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = true;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreSurroundingSpaces((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)10);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withIgnoreEmptyLines((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = Character.valueOf((char)3);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getEscape();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getHeader();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)65535);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = false;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).isNullHandling();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)65535);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).getDelimiter();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)1)), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    ((org.apache.commons.csv.CSVFormat)v5).validate();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withIgnoreEmptyLines((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = Character.valueOf((char)3);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withDelimiter((((java.lang.Character)v10).charValue()));
    Object v12 = ((org.apache.commons.csv.CSVFormat)v11).isEscaping();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withIgnoreSurroundingSpaces((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v3).withCommentStart(((java.lang.Character)v6));
    Object v8 = ((org.apache.commons.csv.CSVFormat)v7).toString();
    org.junit.Assert.assertEquals((Object)("Delimiter=<\u0001> CommentStart=<\u0001> SkipHeaderRecord:false"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = false;
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withIgnoreEmptyLines((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = ((org.apache.commons.csv.CSVFormat)v5).isCommentingEnabled();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    Object v10 = new java.lang.Object[]{};
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).format(((java.lang.Object[])v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getCommentStart();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withQuoteChar(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withDelimiter((((java.lang.Character)v6).charValue()));
    ((org.apache.commons.csv.CSVFormat)v7).validate();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).getIgnoreEmptyLines();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = "COM";
    Object v9 = new java.io.StringReader(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v7).parse(((java.io.Reader)v9));
    Object v11 = Character.valueOf((char)0);
    Object v12 = ((org.apache.commons.csv.CSVFormat)v7).withQuoteChar((((java.lang.Character)v11).charValue()));
    Object v13 = new java.lang.String[]{"format"};
    Object v14 = ((org.apache.commons.csv.CSVFormat)v12).withHeader(((java.lang.String[])v13));
    Object v15 = Character.valueOf((char)0);
    Object v16 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v15).charValue()));
    Object v17 = ((org.apache.commons.csv.CSVFormat)v16).getDelimiter();
    Object v18 = ((org.apache.commons.csv.CSVFormat)v12).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = " SkipH|aderRecord:";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withRecordSeparator(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withIgnoreSurroundingSpaces((((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "Unexpected Quote value: ";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withRecordSeparator(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.csv.CSVFormat)v1).isQuoting();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = "";
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withNullString(((java.lang.String)v2));
    Object v4 = " SkipH|aderRecord:";
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withRecordSeparator(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withIgnoreSurroundingSpaces((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withQuoteChar(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = Character.valueOf((char)0);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = ((org.apache.commons.csv.CSVFormat)v1).isNullHandling();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withEscape(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).getHeader();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withDelimiter((((java.lang.Character)v4).charValue()));
    Object v6 = Character.valueOf((char)1);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withEscape(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)1);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withQuoteChar(((java.lang.Character)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)65535);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    Object v10 = Character.valueOf((char)0);
    Object v11 = ((org.apache.commons.csv.CSVFormat)v9).withEscape(((java.lang.Character)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)0);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withQuoteChar(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)0);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).getSkipHeaderRecord();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = org.apache.commons.csv.CSVFormat.newFormat((((java.lang.Character)v0).charValue()));
    Object v2 = Character.valueOf((char)1);
    Object v3 = ((org.apache.commons.csv.CSVFormat)v1).withCommentStart(((java.lang.Character)v2));
    Object v4 = Character.valueOf((char)0);
    Object v5 = ((org.apache.commons.csv.CSVFormat)v3).withEscape(((java.lang.Character)v4));
    Object v6 = Character.valueOf((char)9);
    Object v7 = ((org.apache.commons.csv.CSVFormat)v5).withCommentStart(((java.lang.Character)v6));
    Object v8 = Character.valueOf((char)65535);
    Object v9 = ((org.apache.commons.csv.CSVFormat)v7).withCommentStart(((java.lang.Character)v8));
    Object v10 = ((org.apache.commons.csv.CSVFormat)v9).getCommentStart();
    org.junit.Assert.assertEquals((Object)(Character.valueOf((char)65535)), v10);
  }
}
