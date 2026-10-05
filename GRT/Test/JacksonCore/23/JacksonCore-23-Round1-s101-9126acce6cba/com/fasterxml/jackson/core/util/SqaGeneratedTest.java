package com.fasterxml.jackson.core.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = null;
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v1),(((java.lang.Boolean)v2).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).writeStartArray(((com.fasterxml.jackson.core.JsonGenerator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "': was expecting";
    Object v2 = "";
    Object v3 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v1),((java.lang.String)v2));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).indentObjectsWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.core.type.WritableTypeId();
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v5).writeTypeSuffix(((com.fasterxml.jackson.core.type.WritableTypeId)v6));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).writeRootValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.core.util.Separators();
    Object v4 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withSeparators(((com.fasterxml.jackson.core.util.Separators)v3));
    Object v5 = null;
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -97;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = "': was expecting";
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v3),((java.lang.String)v4));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).indentArraysWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v5));
    Object v6 = null;
    Object v7 = "': was expecting";
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v9).isInline();
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).indentObjectsWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = "string value";
    Object v4 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2)._withSpaces((((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = "string value";
    Object v4 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2)._withSpaces((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "': was expecting";
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).withArrayIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v10));
    Object v12 = null;
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v12),(((java.lang.Boolean)v13).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).writeObjectFieldValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    Object v4 = "write. a number";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).createInstance();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    Object v4 = "write. a number";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).createInstance();
    Object v7 = null;
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v7),(((java.lang.Boolean)v8).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6).writeStartArray(((com.fasterxml.jackson.core.JsonGenerator)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = "': was expecting";
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "': was expecting";
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "string value";
    Object v5 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v5));
    Object v7 = null;
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v7),(((java.lang.Boolean)v8).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).writeStartObject(((com.fasterxml.jackson.core.JsonGenerator)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "Invalid UTFu32 character 0x";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withRootSeparator(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "Invalid UTFu32 character 0x";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withRootSeparator(((java.lang.String)v4));
    Object v6 = "string value";
    Object v7 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v5).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "string value";
    Object v5 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = "': was expecting";
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v5));
    Object v7 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6).createInstance();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    Object v4 = "write. a number";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).createInstance();
    Object v7 = null;
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v7),(((java.lang.Boolean)v8).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6).writeRootValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = "': was expecting";
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v5));
    Object v7 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6).createInstance();
    Object v8 = null;
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).writeArrayValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = null;
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).writeEndObject(((com.fasterxml.jackson.core.JsonGenerator)v6),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    Object v4 = "write. a number";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).createInstance();
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    Object v4 = "write. a number";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).createInstance();
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6));
    Object v8 = null;
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).writeRootValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).createInstance();
    Object v5 = null;
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v5),(((java.lang.Boolean)v6).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).writeStartArray(((com.fasterxml.jackson.core.JsonGenerator)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "string value";
    Object v5 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v5));
    Object v7 = null;
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 6;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v9),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    Object v4 = "write. a number";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).createInstance();
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6));
    Object v8 = "string value";
    Object v9 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v9));
    Object v11 = null;
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v11),(((java.lang.Boolean)v12).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).writeObjectFieldValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = new com.fasterxml.jackson.core.util.Separators();
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withSeparators(((com.fasterxml.jackson.core.util.Separators)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "': was expecting";
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v6));
    Object v8 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).withoutSpacesInObjectEntries();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = null;
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).writeStartObject(((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "STRICT_DUPLICATE_bETECTION";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "': was expecting";
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v6));
    Object v8 = null;
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).writeStartObject(((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "string value";
    Object v3 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v2));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.SerializableString)v3).appendQuoted(((char[])v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1),((com.fasterxml.jackson.core.SerializableString)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "STRICT_DUPLICATE_bETECTION";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeRootValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withArrayIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    Object v6 = "': was expecting";
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "Illegal white space character (code x";
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).indentArraysWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "string value";
    Object v3 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v2));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.SerializableString)v3).appendQuoted(((char[])v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1),((com.fasterxml.jackson.core.SerializableString)v3));
    Object v8 = null;
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).writeStartArray(((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Can not write a field name, expecting a value";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    Object v4 = "write. a number";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).createInstance();
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6));
    Object v8 = "': was expecting";
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).withArrayIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "Can not write a field name, expecting a value";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeObjectFieldValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).indentArraysWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "': was expecting";
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v4),((java.lang.String)v5));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).indentArraysWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v6));
    Object v7 = null;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3)._withSpaces((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeObjectFieldValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "STRICT_DUPLICATE_bETECTION";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).indentArraysWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).indentObjectsWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "string value";
    Object v3 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v2));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.SerializableString)v3).appendQuoted(((char[])v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1),((com.fasterxml.jackson.core.SerializableString)v3));
    Object v8 = "': was expecting";
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Illegal character point (0x";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeEndObject(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -17;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "STRICT_DUPLICATE_bETECTION";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).beforeObjectEntries(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withSpacesInObjectEntries();
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeStartObject(((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "string value";
    Object v1 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.SerializableString)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "+Infinaity";
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withoutSpacesInObjectEntries();
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeEndObject(((com.fasterxml.jackson.core.JsonGenerator)v5),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeObjectFieldValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    Object v6 = "string value";
    Object v7 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "string value";
    Object v3 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v2));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.SerializableString)v3).appendQuoted(((char[])v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1),((com.fasterxml.jackson.core.SerializableString)v3));
    Object v8 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).createInstance();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).createInstance();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).createInstance();
    Object v4 = "string value";
    Object v5 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v5));
    Object v7 = "string value";
    Object v8 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v8));
    Object v10 = "': was expecting";
    Object v11 = "";
    Object v12 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v12).isInline();
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v6).indentArraysWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "string value";
    Object v1 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.SerializableString)v1));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.core.type.WritableTypeId();
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v5).writeTypeSuffix(((com.fasterxml.jackson.core.type.WritableTypeId)v6));
    Object v8 = 48;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v5),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 3;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).createInstance();
    Object v3 = "': was expecting";
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v3),((java.lang.String)v4));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).indentObjectsWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Can not write a field name, expecting a value";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withoutSpacesInObjectEntries();
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeRootValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "Illegal character point (0x";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.core.type.WritableTypeId();
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v4).writeTypeSuffix(((com.fasterxml.jackson.core.type.WritableTypeId)v5));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeStartObject(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = "string value";
    Object v4 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2)._withSpaces((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = null;
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 9;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withSpacesInObjectEntries();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v1 = "Didn't read enough from reade}";
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v0).withRootSeparator(((java.lang.String)v1));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).writeObjectEntrySeparator(((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "string value";
    Object v1 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)43),Byte.valueOf((byte)34)};
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.SerializableString)v1).appendQuotedUTF8(((byte[])v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.SerializableString)v1));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "string value";
    Object v3 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((com.fasterxml.jackson.core.SerializableString)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withArrayIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1)._withSpaces((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "mull";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Illegal character point (0x";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "\"";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "+Infinaity";
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "string value";
    Object v3 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v2));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.SerializableString)v3).appendQuoted(((char[])v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1),((com.fasterxml.jackson.core.SerializableString)v3));
    Object v8 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).withSpacesInObjectEntries();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeStartArray(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeEndObject(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withSpacesInObjectEntries();
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 53;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeEndObject(((com.fasterxml.jackson.core.JsonGenerator)v5),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "Illegal character point (0x";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "': was expecting";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withObjectIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v4));
    Object v6 = null;
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v6),(((java.lang.Boolean)v7).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v5).writeRootValueSeparator(((com.fasterxml.jackson.core.JsonGenerator)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "string value";
    Object v3 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v2));
    Object v4 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v5 = 0;
    Object v6 = ((com.fasterxml.jackson.core.SerializableString)v3).appendQuoted(((char[])v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1),((com.fasterxml.jackson.core.SerializableString)v3));
    Object v8 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v7).withSpacesInObjectEntries();
    Object v9 = "': was expecting";
    Object v10 = "";
    Object v11 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v8).withArrayIndenter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.core.type.WritableTypeId();
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v5).writeTypeSuffix(((com.fasterxml.jackson.core.type.WritableTypeId)v6));
    Object v8 = 0;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).writeEndObject(((com.fasterxml.jackson.core.JsonGenerator)v5),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "+Infinaity";
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((java.lang.String)v2));
    Object v4 = null;
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).writeStartArray(((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "NaN7";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "false";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "Illegal white space character (code x";
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((java.lang.String)v2));
    Object v4 = null;
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v6),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Current token (";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "mull";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 50;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "END_ARRAY";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withSpacesInObjectEntries();
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withoutSpacesInObjectEntries();
    Object v4 = "': was expecting";
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v4),((java.lang.String)v5));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).indentArraysWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = "+Infinaity";
    Object v3 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v3).withRootSeparator(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.core.type.WritableTypeId();
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v8).writeTypeSuffix(((com.fasterxml.jackson.core.type.WritableTypeId)v9));
    Object v11 = 1;
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v5).writeEndArray(((com.fasterxml.jackson.core.JsonGenerator)v8),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "string value";
    Object v1 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((com.fasterxml.jackson.core.SerializableString)v1));
    Object v3 = ")";
    Object v4 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).withRootSeparator(((java.lang.String)v3));
    Object v5 = "': was expecting";
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.core.util.DefaultIndenter(((java.lang.String)v5),((java.lang.String)v6));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v2).indentObjectsWith(((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "STRICT_DUPLICATE_bETECTION";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withoutSpacesInObjectEntries();
    Object v3 = "y";
    Object v4 = ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).withRootSeparator(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "Current token (";
    Object v1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.util.DefaultPrettyPrinter)v1).beforeArrayValues(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
