package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -17.653601483195626D;
    Object v23 = 20;
    Object v24 = -11;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).hasScope();
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -17.653601483195626D;
    Object v23 = 20;
    Object v24 = -11;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getEnclosingFunction();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.util.logging.Logger.getAnonymousLogger();
    Object v1 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).getStaticSourceFile();
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ".";
    Object v23 = "o";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{"It is illegal to call PureFunctionIdentifier.process twice the same instance.  Please use a new PureFunctionIdentifier instance each time.",""};
    Object v26 = ((com.google.javascript.jscomp.NodeTraversal)v17).makeError(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v27 = -17.653601483195626D;
    Object v28 = 20;
    Object v29 = -11;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = -17.653601483195626D;
    Object v32 = 20;
    Object v33 = -11;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v23 = ".";
    Object v24 = "o";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"4","","$"};
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v17).makeError(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.CheckLevel)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v28 = -17.653601483195626D;
    Object v29 = 20;
    Object v30 = -11;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = -17.653601483195626D;
    Object v33 = 20;
    Object v34 = -11;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    Object v19 = java.util.logging.Logger.getAnonymousLogger();
    Object v20 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v20));
    Object v22 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v23 = "T";
    Object v24 = true;
    Object v25 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v22),((java.lang.String)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v25));
    Object v27 = java.util.logging.Logger.getAnonymousLogger();
    Object v28 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v28));
    Object v30 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v26),((com.google.javascript.jscomp.ScopeCreator)v30));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = java.util.logging.Logger.getAnonymousLogger();
    Object v2 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = "T";
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = java.util.logging.Logger.getAnonymousLogger();
    Object v10 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v10));
    Object v12 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v12));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v18 = null;
    Object v19 = java.util.logging.Logger.getAnonymousLogger();
    Object v20 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v19));
    Object v21 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v20));
    Object v22 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v23 = "T";
    Object v24 = true;
    Object v25 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v22),((java.lang.String)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v25));
    Object v27 = java.util.logging.Logger.getAnonymousLogger();
    Object v28 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v27));
    Object v29 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v28));
    Object v30 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v29));
    Object v31 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v21),((com.google.javascript.jscomp.NodeTraversal.Callback)v26),((com.google.javascript.jscomp.ScopeCreator)v30));
    Object v32 = ((com.google.javascript.jscomp.NodeTraversal)v31).getScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v31));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = java.util.logging.Logger.getAnonymousLogger();
    Object v2 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = "T";
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = java.util.logging.Logger.getAnonymousLogger();
    Object v10 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v10));
    Object v12 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v12));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v13));
    Object v14 = null;
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v19 = "T";
    Object v20 = true;
    Object v21 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v21));
    Object v23 = java.util.logging.Logger.getAnonymousLogger();
    Object v24 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v23));
    Object v25 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v24));
    Object v26 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v25));
    Object v27 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v17),((com.google.javascript.jscomp.NodeTraversal.Callback)v22),((com.google.javascript.jscomp.ScopeCreator)v26));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).exitScope(((com.google.javascript.jscomp.NodeTraversal)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
    Object v1 = java.util.logging.Logger.getAnonymousLogger();
    Object v2 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v1));
    Object v3 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v2));
    Object v4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v5 = "T";
    Object v6 = true;
    Object v7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v7));
    Object v9 = java.util.logging.Logger.getAnonymousLogger();
    Object v10 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v9));
    Object v11 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v10));
    Object v12 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v11));
    Object v13 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v3),((com.google.javascript.jscomp.NodeTraversal.Callback)v8),((com.google.javascript.jscomp.ScopeCreator)v12));
    Object v14 = -17.653601483195626D;
    Object v15 = 20;
    Object v16 = -11;
    Object v17 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v0).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v13),((com.google.javascript.rhino.Node)v17),((com.google.javascript.rhino.Node)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ".";
    Object v23 = "o";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{"JSC_CONSTANT_PROPERTY_DELETED"};
    ((com.google.javascript.jscomp.NodeTraversal)v17).report(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v26 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    ((com.google.javascript.jscomp.NodeTraversal)v17).traverse(((com.google.javascript.rhino.Node)v21));
    Object v22 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).exitScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.google.javascript.rhino.Node)v21).removeFirstChild();
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).enterScope(((com.google.javascript.jscomp.NodeTraversal)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v17).traverseRoots(((com.google.javascript.rhino.Node[])v18));
    Object v19 = null;
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 1;
    Object v25 = ((com.google.javascript.rhino.Node)v23).getProp((((java.lang.Integer)v24).intValue()));
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = ((com.google.javascript.jscomp.NodeTraversal)v17).getEnclosingFunction();
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ".";
    Object v23 = "o";
    Object v24 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new java.lang.String[]{"\\","\\n"};
    ((com.google.javascript.jscomp.NodeTraversal)v17).report(((com.google.javascript.rhino.Node)v21),((com.google.javascript.jscomp.DiagnosticType)v24),((java.lang.String[])v25));
    Object v26 = null;
    Object v27 = -17.653601483195626D;
    Object v28 = 20;
    Object v29 = -11;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = -17.653601483195626D;
    Object v32 = 20;
    Object v33 = -11;
    Object v34 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v31).doubleValue()),(((java.lang.Integer)v32).intValue()),(((java.lang.Integer)v33).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v30),((com.google.javascript.rhino.Node)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -17.653601483195626D;
    Object v23 = 20;
    Object v24 = -11;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.rhino.Node)v25).addChildrenToFront(((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).visit(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -17.653601483195626D;
    Object v23 = 20;
    Object v24 = -11;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v25).isEquivalentToTyped(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -17.653601483195626D;
    Object v23 = 20;
    Object v24 = -11;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 1;
    Object v27 = 0;
    ((com.google.javascript.rhino.Node)v25).putIntProp((((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v28 = null;
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.util.logging.Logger.getAnonymousLogger();
    Object v1 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "";
    Object v4 = -7;
    Object v5 = ((com.google.javascript.jscomp.SourceExcerptProvider)v2).getSourceLine(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ".";
    Object v25 = "o";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{};
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v19).makeError(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getEnclosingFunction();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).removeFirstChild();
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v28));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getEnclosingFunction();
    Object v21 = -17.653601483195626D;
    Object v22 = 20;
    Object v23 = -11;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).hasScope();
    Object v21 = -17.653601483195626D;
    Object v22 = 20;
    Object v23 = -11;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ".";
    Object v25 = "o";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{"M","DEPS_NEVER_PROVIDED","JSC_MTYPE_MISMATCH"};
    ((com.google.javascript.jscomp.NodeTraversal)v19).report(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    Object v28 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).enterScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).hasScope();
    Object v21 = -17.653601483195626D;
    Object v22 = 20;
    Object v23 = -11;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.google.javascript.rhino.Node)v24).toStringTree();
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getEnclosingFunction();
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).getSourceOffset();
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.rhino.Node)v28).removeChildren();
    Object v30 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = true;
    ((com.google.javascript.rhino.Node)v27).setOptionalArg((((java.lang.Boolean)v28).booleanValue()));
    Object v29 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).hasScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).exitScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).exitScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = true;
    Object v28 = false;
    Object v29 = true;
    Object v30 = ((com.google.javascript.rhino.Node)v26).toString((((java.lang.Boolean)v27).booleanValue()),(((java.lang.Boolean)v28).booleanValue()),(((java.lang.Boolean)v29).booleanValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    ((com.google.javascript.rhino.Node)v26).detachChildren();
    Object v27 = null;
    Object v28 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.util.logging.Logger.getAnonymousLogger();
    Object v1 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = ((com.google.javascript.jscomp.AbstractCompiler)v2).getErrorManager();
    Object v4 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v24 = ".";
    Object v25 = "o";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{"a","START","unexpected."};
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.CheckLevel)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    Object v29 = -17.653601483195626D;
    Object v30 = 20;
    Object v31 = -11;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = -17.653601483195626D;
    Object v34 = 20;
    Object v35 = -11;
    Object v36 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v36));
    Object v37 = null;
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).enterScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).exitScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "";
    ((com.google.javascript.rhino.Node)v22).addSuppression(((java.lang.String)v23));
    Object v24 = null;
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).toStringTree();
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).isOptionalArg();
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.google.javascript.rhino.Node)v23).isFromExterns();
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ".";
    Object v24 = "o";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"/","r"};
    ((com.google.javascript.jscomp.NodeTraversal)v18).report(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v27 = null;
    Object v28 = -17.653601483195626D;
    Object v29 = 20;
    Object v30 = -11;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = -17.653601483195626D;
    Object v33 = 20;
    Object v34 = -11;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = true;
    ((com.google.javascript.rhino.Node)v23).setIsSyntheticBlock((((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ".";
    Object v24 = "o";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"","w","R"};
    ((com.google.javascript.jscomp.NodeTraversal)v18).report(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v27 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).enterScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getScope();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).enterScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.util.logging.Logger.getAnonymousLogger();
    Object v1 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v0));
    Object v2 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v1));
    Object v3 = "optmizeCalls_and_removeUnusedVars";
    Object v4 = -70;
    Object v5 = ((com.google.javascript.jscomp.SourceExcerptProvider)v2).getSourceLine(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(((com.google.javascript.jscomp.AbstractCompiler)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getEnclosingFunction();
    Object v21 = -17.653601483195626D;
    Object v22 = 20;
    Object v23 = -11;
    Object v24 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v24),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = new com.google.javascript.rhino.Node[]{};
    ((com.google.javascript.jscomp.NodeTraversal)v19).traverseRoots(((com.google.javascript.rhino.Node[])v20));
    Object v21 = null;
    Object v22 = -17.653601483195626D;
    Object v23 = 20;
    Object v24 = -11;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v25),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).getQualifiedName();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v20 = null;
    Object v21 = java.util.logging.Logger.getAnonymousLogger();
    Object v22 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v21));
    Object v23 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v22));
    Object v24 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v25 = "T";
    Object v26 = true;
    Object v27 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v27));
    Object v29 = java.util.logging.Logger.getAnonymousLogger();
    Object v30 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v29));
    Object v31 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v30));
    Object v32 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v31));
    Object v33 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v23),((com.google.javascript.jscomp.NodeTraversal.Callback)v28),((com.google.javascript.jscomp.ScopeCreator)v32));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = ((com.google.javascript.jscomp.NodeTraversal)v19).getEnclosingFunction();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).hasScope();
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).toString();
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).exitScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v19 = null;
    Object v20 = java.util.logging.Logger.getAnonymousLogger();
    Object v21 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v21));
    Object v23 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v24 = "T";
    Object v25 = true;
    Object v26 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v26));
    Object v28 = java.util.logging.Logger.getAnonymousLogger();
    Object v29 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v29));
    Object v31 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.NodeTraversal.Callback)v27),((com.google.javascript.jscomp.ScopeCreator)v31));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).enterScope(((com.google.javascript.jscomp.NodeTraversal)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = com.google.javascript.jscomp.CheckLevel.WARNING;
    Object v25 = ".";
    Object v26 = "o";
    Object v27 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = new java.lang.String[]{""};
    Object v29 = ((com.google.javascript.jscomp.NodeTraversal)v19).makeError(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.CheckLevel)v24),((com.google.javascript.jscomp.DiagnosticType)v27),((java.lang.String[])v28));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getEnclosingFunction();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).enterScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).children();
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    ((com.google.javascript.rhino.Node)v27).removeProp((((java.lang.Integer)v28).intValue()));
    Object v29 = null;
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v27));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ".";
    Object v24 = "o";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"#","[",""};
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v28 = -17.653601483195626D;
    Object v29 = 20;
    Object v30 = -11;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = -17.653601483195626D;
    Object v33 = 20;
    Object v34 = -11;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v24 = ".";
    Object v25 = "o";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{"-n","y"};
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.CheckLevel)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    Object v29 = -17.653601483195626D;
    Object v30 = 20;
    Object v31 = -11;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = -17.653601483195626D;
    Object v34 = 20;
    Object v35 = -11;
    Object v36 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.google.javascript.rhino.Node)v36).children();
    Object v38 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertEquals((Object)(true), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = ((com.google.javascript.jscomp.NodeTraversal)v18).getEnclosingFunction();
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = 28;
    ((com.google.javascript.rhino.Node)v22).setCharno((((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    Object v25 = -17.653601483195626D;
    Object v26 = 20;
    Object v27 = -11;
    Object v28 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v25).doubleValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = com.google.javascript.jscomp.CheckLevel.ERROR;
    Object v25 = ".";
    Object v26 = "o";
    Object v27 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = new java.lang.String[]{"-","","\\\\"};
    Object v29 = ((com.google.javascript.jscomp.NodeTraversal)v19).makeError(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.CheckLevel)v24),((com.google.javascript.jscomp.DiagnosticType)v27),((java.lang.String[])v28));
    Object v30 = -17.653601483195626D;
    Object v31 = 20;
    Object v32 = -11;
    Object v33 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v30).doubleValue()),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = -17.653601483195626D;
    Object v35 = 20;
    Object v36 = -11;
    Object v37 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v34).doubleValue()),(((java.lang.Integer)v35).intValue()),(((java.lang.Integer)v36).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v33),((com.google.javascript.rhino.Node)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).isFromExterns();
    Object v28 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).exitScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v19 = null;
    Object v20 = java.util.logging.Logger.getAnonymousLogger();
    Object v21 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v20));
    Object v22 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v21));
    Object v23 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v24 = "T";
    Object v25 = true;
    Object v26 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v26));
    Object v28 = java.util.logging.Logger.getAnonymousLogger();
    Object v29 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v28));
    Object v30 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v29));
    Object v31 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v30));
    Object v32 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v22),((com.google.javascript.jscomp.NodeTraversal.Callback)v27),((com.google.javascript.jscomp.ScopeCreator)v31));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).exitScope(((com.google.javascript.jscomp.NodeTraversal)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ".";
    Object v25 = "o";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{"p","e"};
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v19).makeError(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).exitScope(((com.google.javascript.jscomp.NodeTraversal)v19));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = "Y";
    ((com.google.javascript.rhino.Node)v23).setSourceFileForTesting(((java.lang.String)v24));
    Object v25 = null;
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v5 = java.util.logging.Logger.getAnonymousLogger();
    Object v6 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v5));
    Object v7 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v6));
    Object v8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v9 = "T";
    Object v10 = true;
    Object v11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v11));
    Object v13 = java.util.logging.Logger.getAnonymousLogger();
    Object v14 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v13));
    Object v15 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v14));
    Object v16 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v15));
    Object v17 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v7),((com.google.javascript.jscomp.NodeTraversal.Callback)v12),((com.google.javascript.jscomp.ScopeCreator)v16));
    Object v18 = -17.653601483195626D;
    Object v19 = 20;
    Object v20 = -11;
    Object v21 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v18).doubleValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = -17.653601483195626D;
    Object v23 = 20;
    Object v24 = -11;
    Object v25 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.google.javascript.rhino.Node)v25).useSourceInfoFromForTree(((com.google.javascript.rhino.Node)v29));
    Object v31 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v4).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v17),((com.google.javascript.rhino.Node)v21),((com.google.javascript.rhino.Node)v25));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 0;
    ((com.google.javascript.rhino.Node)v23).setSourceEncodedPositionForTree((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ".";
    Object v25 = "o";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{"arguments","-1"};
    ((com.google.javascript.jscomp.NodeTraversal)v19).report(((com.google.javascript.rhino.Node)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    Object v28 = null;
    Object v29 = -17.653601483195626D;
    Object v30 = 20;
    Object v31 = -11;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = -17.653601483195626D;
    Object v34 = 20;
    Object v35 = -11;
    Object v36 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v33).doubleValue()),(((java.lang.Integer)v34).intValue()),(((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v32),((com.google.javascript.rhino.Node)v36));
    org.junit.Assert.assertEquals((Object)(true), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ".";
    Object v24 = "o";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"i","Z"};
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v28 = -17.653601483195626D;
    Object v29 = 20;
    Object v30 = -11;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = -17.653601483195626D;
    Object v33 = 20;
    Object v34 = -11;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = 1.0D;
    ((com.google.javascript.rhino.Node)v27).setDouble((((java.lang.Double)v28).doubleValue()));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ".";
    Object v24 = "o";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"]","v",":<"};
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).enterScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.google.javascript.rhino.Node)v22).getSideEffectFlags();
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v26).isNoSideEffectsCall();
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ".";
    Object v24 = "o";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{"\"","JSC_NODE_TRAVERSAL_ER"};
    Object v27 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v28 = -17.653601483195626D;
    Object v29 = 20;
    Object v30 = -11;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = -17.653601483195626D;
    Object v33 = 20;
    Object v34 = -11;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.google.javascript.jscomp.CheckLevel.OFF;
    Object v24 = ".";
    Object v25 = "o";
    Object v26 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = new java.lang.String[]{"K"};
    Object v28 = ((com.google.javascript.jscomp.NodeTraversal)v18).makeError(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.CheckLevel)v23),((com.google.javascript.jscomp.DiagnosticType)v26),((java.lang.String[])v27));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).enterScope(((com.google.javascript.jscomp.NodeTraversal)v18));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 1;
    ((com.google.javascript.rhino.Node)v23).removeProp((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = "i";
    ((com.google.javascript.rhino.Node)v27).setSourceFileForTesting(((java.lang.String)v28));
    Object v29 = null;
    Object v30 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v27).getAncestors();
    Object v29 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v27));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = -17.653601483195626D;
    Object v28 = 20;
    Object v29 = -11;
    Object v30 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v27).doubleValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = ((com.google.javascript.rhino.Node)v26).clonePropsFrom(((com.google.javascript.rhino.Node)v30));
    Object v32 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v26));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = -17.653601483195626D;
    Object v24 = 20;
    Object v25 = -11;
    Object v26 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.google.javascript.rhino.Node)v22).checkTreeEquals(((com.google.javascript.rhino.Node)v26));
    Object v28 = -17.653601483195626D;
    Object v29 = 20;
    Object v30 = -11;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).shouldTraverse(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v22),((com.google.javascript.rhino.Node)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = 1;
    ((com.google.javascript.rhino.Node)v23).setLineno((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    Object v26 = -17.653601483195626D;
    Object v27 = 20;
    Object v28 = -11;
    Object v29 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v26).doubleValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).forChildScope();
    Object v5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v6 = java.util.logging.Logger.getAnonymousLogger();
    Object v7 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v6));
    Object v8 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v7));
    Object v9 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v10 = "T";
    Object v11 = true;
    Object v12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v12));
    Object v14 = java.util.logging.Logger.getAnonymousLogger();
    Object v15 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v14));
    Object v16 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v15));
    Object v17 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v16));
    Object v18 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v8),((com.google.javascript.jscomp.NodeTraversal.Callback)v13),((com.google.javascript.jscomp.ScopeCreator)v17));
    Object v19 = -17.653601483195626D;
    Object v20 = 20;
    Object v21 = -11;
    Object v22 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ".";
    Object v24 = "o";
    Object v25 = com.google.javascript.jscomp.DiagnosticType.error(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new java.lang.String[]{""};
    ((com.google.javascript.jscomp.NodeTraversal)v18).report(((com.google.javascript.rhino.Node)v22),((com.google.javascript.jscomp.DiagnosticType)v25),((java.lang.String[])v26));
    Object v27 = null;
    Object v28 = -17.653601483195626D;
    Object v29 = 20;
    Object v30 = -11;
    Object v31 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v28).doubleValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = -17.653601483195626D;
    Object v33 = 20;
    Object v34 = -11;
    Object v35 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v5).visit(((com.google.javascript.jscomp.NodeTraversal)v18),((com.google.javascript.rhino.Node)v31),((com.google.javascript.rhino.Node)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v1 = "T";
    Object v2 = true;
    Object v3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "9";
    Object v5 = ((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3).getReplacementName(((java.lang.String)v4));
    Object v6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v3));
    Object v7 = java.util.logging.Logger.getAnonymousLogger();
    Object v8 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v7));
    Object v9 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v8));
    Object v10 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
    Object v11 = "T";
    Object v12 = true;
    Object v13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(((com.google.common.base.Supplier)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)v13));
    Object v15 = java.util.logging.Logger.getAnonymousLogger();
    Object v16 = new com.google.javascript.jscomp.LoggerErrorManager(((java.util.logging.Logger)v15));
    Object v17 = new com.google.javascript.jscomp.Compiler(((com.google.javascript.jscomp.ErrorManager)v16));
    Object v18 = new com.google.javascript.jscomp.SyntacticScopeCreator(((com.google.javascript.jscomp.AbstractCompiler)v17));
    Object v19 = new com.google.javascript.jscomp.NodeTraversal(((com.google.javascript.jscomp.AbstractCompiler)v9),((com.google.javascript.jscomp.NodeTraversal.Callback)v14),((com.google.javascript.jscomp.ScopeCreator)v18));
    Object v20 = -17.653601483195626D;
    Object v21 = 20;
    Object v22 = -11;
    Object v23 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = -17.653601483195626D;
    Object v25 = 20;
    Object v26 = -11;
    Object v27 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.google.javascript.rhino.Node)v23).isEquivalentTo(((com.google.javascript.rhino.Node)v27));
    Object v29 = -17.653601483195626D;
    Object v30 = 20;
    Object v31 = -11;
    Object v32 = com.google.javascript.rhino.Node.newNumber((((java.lang.Double)v29).doubleValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    ((com.google.javascript.jscomp.MakeDeclaredNamesUnique)v6).visit(((com.google.javascript.jscomp.NodeTraversal)v19),((com.google.javascript.rhino.Node)v23),((com.google.javascript.rhino.Node)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }
}
