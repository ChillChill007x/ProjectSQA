package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "undefiAned";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).getRegisteredGroups();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = " (";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "O";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "V";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = "%";
    Object v4 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v1),((com.google.javascript.jscomp.CheckLevel)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = 1;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setSummaryDetailLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "}";
    Object v5 = com.google.javascript.jscomp.CheckLevel.WARNING;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "3";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "w";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "N";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "$$S_a";
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "JSCompiler_renameProperty";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = "%";
    Object v4 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v1),((com.google.javascript.jscomp.CheckLevel)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "arguments";
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v3),((com.google.javascript.jscomp.CheckLevel)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "enum";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = "%";
    Object v4 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v1),((com.google.javascript.jscomp.CheckLevel)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "protoype";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "pro5otype";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "(";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "U";
    Object v1 = "V";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "]";
    Object v1 = "V";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "prototypH";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = ")";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "Infinity";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "!";
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "boolean";
    Object v1 = "V";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = "JSCompiler_renameProperty";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = "%";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v8),((com.google.javascript.jscomp.CheckLevel)v9),((java.lang.String)v10));
    Object v12 = ((com.google.javascript.jscomp.DiagnosticGroup)v7).matches(((com.google.javascript.jscomp.DiagnosticType)v11));
    Object v13 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "prototy$e";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "private";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "\\";
    Object v1 = "]";
    Object v2 = "V";
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = "%";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v3),((com.google.javascript.jscomp.CheckLevel)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v2),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    Object v9 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v8));
    Object v10 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "removeUnusedVars";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "Remove not supported.";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "U  ";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "prototype";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "])";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = "enum";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "!";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "inc";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = "%";
    Object v4 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v1),((com.google.javascript.jscomp.CheckLevel)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "inli";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "\n";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = "V";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "5";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "Parsing Source: ";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "constantPrope+rty";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v3 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup[])v2));
    Object v4 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Id generator call must be unconditional";
    Object v1 = "";
    Object v2 = "enum";
    Object v3 = "";
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = "%";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v3),((com.google.javascript.jscomp.CheckLevel)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v2),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    Object v9 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v8));
    Object v10 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "constantProperty";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "&";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "argumentT";
    Object v1 = "enum";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "\\";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "I";
    Object v1 = "";
    Object v2 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v3 = "%";
    Object v4 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v1),((com.google.javascript.jscomp.CheckLevel)v2),((java.lang.String)v3));
    Object v5 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "Q";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "evZal";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = "I";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "prototype";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = "JSCompiler_renameProperty";
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "%";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "JSCompier_ObjectPropertyString";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "A function call cannot be of the form: new Obje";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "\nh";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "]";
    Object v1 = "A function call cannot be of the form: new Obje";
    Object v2 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v3 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup[])v2));
    Object v4 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "G";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "conti\\ue";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "impo";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "";
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "argument4";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "wSndow";
    Object v1 = "";
    Object v2 = new com.google.javascript.jscomp.DiagnosticType[]{};
    Object v3 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticType[])v2));
    Object v4 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "\"";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "0sg.syntax";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "Y";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "Z";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "implements";
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "g";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = ": ";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "prototype";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "$";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = new com.google.javascript.jscomp.DiagnosticGroup[]{null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "`";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "prototype";
    Object v3 = com.google.javascript.jscomp.CheckLevel.ERROR;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "prototpe";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null,null,null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "{";
    Object v1 = "]";
    Object v2 = "A function call cannot be of the form: new Obje";
    Object v3 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v4 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v2),((com.google.javascript.jscomp.DiagnosticGroup[])v3));
    Object v5 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup)v4));
    Object v6 = ((com.google.javascript.jscomp.DiagnosticGroup)v5).toString();
    Object v7 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "?";
    Object v3 = com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType.INCLUDE;
    Object v4 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v2),((com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType)v3));
    ((com.google.javascript.jscomp.CompilerOptions)v1).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v4));
    Object v5 = null;
    Object v6 = "msg.j";
    Object v7 = com.google.javascript.jscomp.CheckLevel.ERROR;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = new com.google.javascript.jscomp.CompilerOptions();
    Object v2 = "T";
    Object v3 = com.google.javascript.jscomp.CheckLevel.WARNING;
    ((com.google.javascript.jscomp.DiagnosticGroups)v0).setWarningLevel(((com.google.javascript.jscomp.CompilerOptions)v1),((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "LEG6ACY";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "prototype";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "OFF";
    Object v1 = "prototype";
    Object v2 = new com.google.javascript.jscomp.DiagnosticGroup[]{};
    Object v3 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v1),((com.google.javascript.jscomp.DiagnosticGroup[])v2));
    Object v4 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticGroup)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "VAR with multiple children";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.DiagnosticGroups();
    Object v1 = "ARRAY_TYPE";
    Object v2 = ((com.google.javascript.jscomp.DiagnosticGroups)v0).forName(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "Infinity";
    Object v1 = new com.google.javascript.jscomp.DiagnosticType[]{null};
    Object v2 = com.google.javascript.jscomp.DiagnosticGroups.registerGroup(((java.lang.String)v0),((com.google.javascript.jscomp.DiagnosticType[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
