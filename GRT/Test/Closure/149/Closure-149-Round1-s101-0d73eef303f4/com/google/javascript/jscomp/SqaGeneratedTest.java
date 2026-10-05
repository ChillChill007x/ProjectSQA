package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v0).setCollapsePropertiesOnExternTypes((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = new com.google.javascript.jscomp.DefaultCodingConvention();
    ((com.google.javascript.jscomp.CompilerOptions)v0).setCodingConvention(((com.google.javascript.jscomp.CodingConvention)v1));
    Object v2 = null;
    Object v3 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v0).setNameAnonymousFunctionsOnly((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v0).setProcessObjectPropertyString((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = "START";
    Object v2 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v1));
    ((com.google.javascript.jscomp.CompilerOptions)v0).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v0).setLooseTypes((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = 1;
    ((com.google.javascript.jscomp.CompilerOptions)v0).setSummaryDetailLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).getDefineReplacements();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = "START";
    Object v2 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v1));
    Object v3 = "prototyp";
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v3),((com.google.javascript.jscomp.CheckLevel)v4),((java.lang.String)v5));
    Object v7 = new java.lang.String[]{")","protot"};
    Object v8 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v6),((java.lang.String[])v7));
    Object v9 = ((com.google.javascript.jscomp.WarningsGuard)v2).level(((com.google.javascript.jscomp.JSError)v8));
    ((com.google.javascript.jscomp.CompilerOptions)v0).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v2));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).getDefineReplacements();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).getDefineReplacements();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).shouldColorizeErrorOutput();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "";
    ((com.google.javascript.jscomp.CompilerOptions)v1).setOutputCharset(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).isExternExportsEnabled();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "prototyp";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = ((com.google.javascript.jscomp.CompilerOptions)v1).enables(((com.google.javascript.jscomp.DiagnosticGroup)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "prototyp";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = ((com.google.javascript.jscomp.CompilerOptions)v1).disables(((com.google.javascript.jscomp.DiagnosticGroup)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = 1;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setSummaryDetailLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "prototyp";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v7));
    Object v9 = ((com.google.javascript.jscomp.CompilerOptions)v1).disables(((com.google.javascript.jscomp.DiagnosticGroup)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v0).enableExternExports((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    ((com.google.javascript.jscomp.CompilerOptions)v0).disableRuntimeTypeCheck();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setNameAnonymousFunctionsOnly((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = "prototyp";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = new java.lang.String[]{")","protot"};
    Object v9 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v7),((java.lang.String[])v8));
    Object v10 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v11 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v12 = "prototyp";
    Object v13 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v14 = "";
    Object v15 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v12),((com.google.javascript.jscomp.CheckLevel)v13),((java.lang.String)v14));
    Object v16 = new java.lang.String[]{")","protot"};
    Object v17 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v15),((java.lang.String[])v16));
    Object v18 = "START";
    Object v19 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v18));
    Object v20 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v17),((java.lang.Object)v19));
    ((com.google.javascript.jscomp.CompilerOptions)v1).setIdGenerators(((java.util.Set)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "prototyp";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setWarningLevel(((com.google.javascript.jscomp.DiagnosticGroup)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "START";
    Object v3 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v2));
    ((com.google.javascript.jscomp.CompilerOptions)v1).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).getDefineReplacements();
    Object v3 = "";
    Object v4 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setDefineToBooleanLiteral(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "START";
    Object v3 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v2));
    ((com.google.javascript.jscomp.CompilerOptions)v1).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v3));
    Object v4 = null;
    Object v5 = "Q";
    ((com.google.javascript.jscomp.CompilerOptions)v1).enableRuntimeTypeCheck(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "prototyp";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = com.google.javascript.jscomp.CheckLevel.WARNING;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setWarningLevel(((com.google.javascript.jscomp.DiagnosticGroup)v6),((com.google.javascript.jscomp.CheckLevel)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "u";
    ((com.google.javascript.jscomp.CompilerOptions)v1).setOutputCharset(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = com.google.javascript.jscomp.VariableRenamingPolicy.UNSPECIFIED;
    Object v5 = com.google.javascript.jscomp.PropertyRenamingPolicy.OFF;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setRenamingPolicy(((com.google.javascript.jscomp.VariableRenamingPolicy)v4),((com.google.javascript.jscomp.PropertyRenamingPolicy)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).getCodingConvention();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "prototyp";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = new java.lang.String[]{")","protot"};
    Object v7 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v5),((java.lang.String[])v6));
    Object v8 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v9 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v10 = "prototyp";
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v10),((com.google.javascript.jscomp.CheckLevel)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{")","protot"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = "START";
    Object v17 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v16));
    Object v18 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v15),((java.lang.Object)v17));
    ((com.google.javascript.jscomp.CompilerOptions)v1).setIdGenerators(((java.util.Set)v18));
    Object v19 = null;
    ((com.google.javascript.jscomp.CompilerOptions)v1).disableRuntimeTypeCheck();
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = ((com.google.javascript.jscomp.CompilerOptions)v4).isExternExportsEnabled();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setProcessObjectPropertyString((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = "prototyp";
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v7),((com.google.javascript.jscomp.CheckLevel)v8),((java.lang.String)v9));
    Object v11 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v10));
    Object v12 = ((com.google.javascript.jscomp.CompilerOptions)v4).disables(((com.google.javascript.jscomp.DiagnosticGroup)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "prototyp";
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v5),((com.google.javascript.jscomp.CheckLevel)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v8));
    Object v10 = com.google.javascript.jscomp.CheckLevel.ERROR;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setWarningLevel(((com.google.javascript.jscomp.DiagnosticGroup)v9),((com.google.javascript.jscomp.CheckLevel)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setColorizeErrorOutput((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    ((com.google.javascript.jscomp.CompilerOptions)v0).skipAllCompilerPasses();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = ((com.google.javascript.jscomp.CompilerOptions)v4).getDefineReplacements();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = new com.google.javascript.jscomp.DefaultCodingConvention();
    ((com.google.javascript.jscomp.CompilerOptions)v1).setCodingConvention(((com.google.javascript.jscomp.CodingConvention)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "ambiguousFunctionDecl";
    Object v3 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setDefineToBooleanLiteral(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    ((com.google.javascript.jscomp.CompilerOptions)v1).skipAllCompilerPasses();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "START";
    Object v6 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v5));
    ((com.google.javascript.jscomp.CompilerOptions)v4).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setRemoveAbstractMethods((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v0).setProcessObjectPropertyString((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "prototyp";
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v5),((com.google.javascript.jscomp.CheckLevel)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v8));
    Object v10 = ((com.google.javascript.jscomp.CompilerOptions)v4).disables(((com.google.javascript.jscomp.DiagnosticGroup)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setManageClosureDependencies((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = "this";
    Object v5 = 0;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setDefineToNumberLiteral(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "prototyp";
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v5),((com.google.javascript.jscomp.CheckLevel)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{")","protot"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    Object v11 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v12 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v13 = "prototyp";
    Object v14 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v15 = "";
    Object v16 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v13),((com.google.javascript.jscomp.CheckLevel)v14),((java.lang.String)v15));
    Object v17 = new java.lang.String[]{")","protot"};
    Object v18 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v16),((java.lang.String[])v17));
    Object v19 = "START";
    Object v20 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v19));
    Object v21 = java.util.Set.of(((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v18),((java.lang.Object)v20));
    ((com.google.javascript.jscomp.CompilerOptions)v4).setIdGenerators(((java.util.Set)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "`";
    Object v6 = "prototyp";
    Object v7 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v8 = "";
    Object v9 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v6),((com.google.javascript.jscomp.CheckLevel)v7),((java.lang.String)v8));
    Object v10 = new java.lang.String[]{")","protot"};
    Object v11 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v9),((java.lang.String[])v10));
    Object v12 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v13 = new com.google.javascript.jscomp.DefaultCodingConvention();
    Object v14 = "prototyp";
    Object v15 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v16 = "";
    Object v17 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v14),((com.google.javascript.jscomp.CheckLevel)v15),((java.lang.String)v16));
    Object v18 = new java.lang.String[]{")","protot"};
    Object v19 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v17),((java.lang.String[])v18));
    Object v20 = "START";
    Object v21 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v20));
    Object v22 = java.util.Set.of(((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v19),((java.lang.Object)v21));
    Object v23 = new java.util.ArrayList(((java.util.Collection)v22));
    ((com.google.javascript.jscomp.CompilerOptions)v4).setReplaceStringsConfiguration(((java.lang.String)v5),((java.util.List)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "START";
    Object v6 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v5));
    Object v7 = "prototyp";
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v7),((com.google.javascript.jscomp.CheckLevel)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{")","protot"};
    Object v12 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = ((com.google.javascript.jscomp.WarningsGuard)v6).level(((com.google.javascript.jscomp.JSError)v12));
    ((com.google.javascript.jscomp.CompilerOptions)v4).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v6));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL;
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = com.google.javascript.jscomp.PropertyRenamingPolicy.HEURISTIC;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setRenamingPolicy(((com.google.javascript.jscomp.VariableRenamingPolicy)v5),((com.google.javascript.jscomp.PropertyRenamingPolicy)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setRewriteNewDateGoogNow((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setRewriteNewDateGoogNow((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v0).setNameAnonymousFunctionsOnly((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "prototyp";
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v5),((com.google.javascript.jscomp.CheckLevel)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v8));
    Object v10 = ((com.google.javascript.jscomp.CompilerOptions)v4).enables(((com.google.javascript.jscomp.DiagnosticGroup)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "prototyp";
    Object v3 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v4 = "";
    Object v5 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v2),((com.google.javascript.jscomp.CheckLevel)v3),((java.lang.String)v4));
    Object v6 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v5));
    Object v7 = "prototyp";
    Object v8 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v9 = "";
    Object v10 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v7),((com.google.javascript.jscomp.CheckLevel)v8),((java.lang.String)v9));
    Object v11 = new java.lang.String[]{")","protot"};
    Object v12 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v10),((java.lang.String[])v11));
    Object v13 = ((com.google.javascript.jscomp.DiagnosticGroup)v6).matches(((com.google.javascript.jscomp.JSError)v12));
    Object v14 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    ((com.google.javascript.jscomp.CompilerOptions)v1).setWarningLevel(((com.google.javascript.jscomp.DiagnosticGroup)v6),((com.google.javascript.jscomp.CheckLevel)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = ((com.google.javascript.jscomp.CompilerOptions)v4).getCodingConvention();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "n";
    Object v3 = 0.0D;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setDefineToDoubleLiteral(((java.lang.String)v2),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setManageClosureDependencies((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setRemoveAbstractMethods((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.CompilerOptions)v4).getDefineReplacements();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = 3;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setSummaryDetailLevel((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "<a href=\"#";
    Object v4 = 16;
    ((com.google.javascript.jscomp.CompilerOptions)v2).setDefineToNumberLiteral(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((com.google.javascript.jscomp.CompilerOptions)v2).getDefineReplacements();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v2).setChainCalls((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "P";
    Object v4 = "";
    ((com.google.javascript.jscomp.CompilerOptions)v2).setDefineToStringLiteral(((java.lang.String)v3),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "";
    ((com.google.javascript.jscomp.CompilerOptions)v4).setOutputCharset(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "prototyp";
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v3),((com.google.javascript.jscomp.CheckLevel)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v6));
    Object v8 = ((com.google.javascript.jscomp.CompilerOptions)v2).enables(((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setManageClosureDependencies((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ".~";
    Object v3 = "8";
    ((com.google.javascript.jscomp.CompilerOptions)v1).setDefineToStringLiteral(((java.lang.String)v2),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "START";
    Object v4 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v3));
    ((com.google.javascript.jscomp.CompilerOptions)v2).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setRemoveAbstractMethods((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v2).setLooseTypes((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v2).setManageClosureDependencies((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "FunctioOn";
    ((com.google.javascript.jscomp.CompilerOptions)v2).enableRuntimeTypeCheck(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v3).getDefineReplacements();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setCollapsePropertiesOnExternTypes((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = com.google.javascript.jscomp.VariableRenamingPolicy.LOCAL;
    Object v8 = com.google.javascript.jscomp.PropertyRenamingPolicy.HEURISTIC;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setRenamingPolicy(((com.google.javascript.jscomp.VariableRenamingPolicy)v7),((com.google.javascript.jscomp.PropertyRenamingPolicy)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "];\n";
    Object v4 = -19;
    ((com.google.javascript.jscomp.CompilerOptions)v2).setDefineToNumberLiteral(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = "START";
    Object v7 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v6));
    ((com.google.javascript.jscomp.CompilerOptions)v2).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = "return";
    Object v3 = 53.13431150530963D;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setDefineToDoubleLiteral(((java.lang.String)v2),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = ((com.google.javascript.jscomp.CompilerOptions)v1).isExternExportsEnabled();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).shouldColorizeErrorOutput();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "START";
    Object v4 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v3));
    Object v5 = "prototyp";
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v5),((com.google.javascript.jscomp.CheckLevel)v6),((java.lang.String)v7));
    Object v9 = new java.lang.String[]{")","protot"};
    Object v10 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v8),((java.lang.String[])v9));
    Object v11 = ((com.google.javascript.jscomp.WarningsGuard)v4).level(((com.google.javascript.jscomp.JSError)v10));
    ((com.google.javascript.jscomp.CompilerOptions)v2).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v4));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v3).enableExternExports((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "START";
    Object v7 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v6));
    ((com.google.javascript.jscomp.CompilerOptions)v3).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = "START";
    Object v5 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(((java.lang.String)v4));
    ((com.google.javascript.jscomp.CompilerOptions)v3).addWarningsGuard(((com.google.javascript.jscomp.WarningsGuard)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setCollapsePropertiesOnExternTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = "prototyp";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v7));
    Object v9 = ((com.google.javascript.jscomp.CompilerOptions)v3).enables(((com.google.javascript.jscomp.DiagnosticGroup)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = "";
    Object v5 = 34.38161212029391D;
    ((com.google.javascript.jscomp.CompilerOptions)v3).setDefineToDoubleLiteral(((java.lang.String)v4),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = "prototyp";
    Object v5 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v6 = "";
    Object v7 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v4),((com.google.javascript.jscomp.CheckLevel)v5),((java.lang.String)v6));
    Object v8 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v7));
    Object v9 = "prototyp";
    Object v10 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v11 = "";
    Object v12 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v9),((com.google.javascript.jscomp.CheckLevel)v10),((java.lang.String)v11));
    Object v13 = new java.lang.String[]{")","protot"};
    Object v14 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v12),((java.lang.String[])v13));
    Object v15 = ((com.google.javascript.jscomp.DiagnosticGroup)v8).matches(((com.google.javascript.jscomp.JSError)v14));
    Object v16 = ((com.google.javascript.jscomp.CompilerOptions)v3).enables(((com.google.javascript.jscomp.DiagnosticGroup)v8));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).getDefineReplacements();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "function";
    ((com.google.javascript.jscomp.CompilerOptions)v2).enableRuntimeTypeCheck(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((com.google.javascript.jscomp.CompilerOptions)v2).getDefineReplacements();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).getWarningsGuard();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = com.google.javascript.jscomp.VariableRenamingPolicy.OFF;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = com.google.javascript.jscomp.PropertyRenamingPolicy.HEURISTIC;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setRenamingPolicy(((com.google.javascript.jscomp.VariableRenamingPolicy)v2),((com.google.javascript.jscomp.PropertyRenamingPolicy)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "XSTRING or ADD node expected; found: ";
    ((com.google.javascript.jscomp.CompilerOptions)v1).enableRuntimeTypeCheck(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "prototyp";
    Object v6 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v7 = "";
    Object v8 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v5),((com.google.javascript.jscomp.CheckLevel)v6),((java.lang.String)v7));
    Object v9 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v8));
    Object v10 = "prototyp";
    Object v11 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v12 = "";
    Object v13 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v10),((com.google.javascript.jscomp.CheckLevel)v11),((java.lang.String)v12));
    Object v14 = new java.lang.String[]{")","protot"};
    Object v15 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v13),((java.lang.String[])v14));
    Object v16 = ((com.google.javascript.jscomp.DiagnosticGroup)v9).matches(((com.google.javascript.jscomp.JSError)v15));
    Object v17 = ((com.google.javascript.jscomp.CompilerOptions)v4).disables(((com.google.javascript.jscomp.DiagnosticGroup)v9));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v3).enableExternExports((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v3).enableExternExports((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v2).setCollapsePropertiesOnExternTypes((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = " ]=> ";
    Object v5 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v3).setDefineToBooleanLiteral(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = "prototyp";
    Object v4 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v5 = "";
    Object v6 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v3),((com.google.javascript.jscomp.CheckLevel)v4),((java.lang.String)v5));
    Object v7 = com.google.javascript.jscomp.DiagnosticGroup.forType(((com.google.javascript.jscomp.DiagnosticType)v6));
    Object v8 = "prototyp";
    Object v9 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v10 = "";
    Object v11 = com.google.javascript.jscomp.DiagnosticType.make(((java.lang.String)v8),((com.google.javascript.jscomp.CheckLevel)v9),((java.lang.String)v10));
    Object v12 = new java.lang.String[]{")","protot"};
    Object v13 = com.google.javascript.jscomp.JSError.make(((com.google.javascript.jscomp.DiagnosticType)v11),((java.lang.String[])v12));
    Object v14 = ((com.google.javascript.jscomp.DiagnosticGroup)v7).matches(((com.google.javascript.jscomp.JSError)v13));
    Object v15 = ((com.google.javascript.jscomp.CompilerOptions)v2).enables(((com.google.javascript.jscomp.DiagnosticGroup)v7));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = "ASSIGN_ADD";
    Object v6 = 1;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setDefineToNumberLiteral(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v3).setRewriteNewDateGoogNow((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).getDefineReplacements();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v1).getDefineReplacements();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v3 = ((com.google.javascript.jscomp.CompilerOptions)v2).clone();
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((com.google.javascript.jscomp.CompilerOptions)v1).clone();
    Object v5 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v4).setNameAnonymousFunctionsOnly((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = ((com.google.javascript.jscomp.CompilerOptions)v4).shouldColorizeErrorOutput();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = true;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setLooseTypes((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = ((com.google.javascript.jscomp.CompilerOptions)v1).getWarningsGuard();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.CompilerOptions();
    Object v1 = ((com.google.javascript.jscomp.CompilerOptions)v0).clone();
    Object v2 = false;
    ((com.google.javascript.jscomp.CompilerOptions)v1).setNameAnonymousFunctionsOnly((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }
}
