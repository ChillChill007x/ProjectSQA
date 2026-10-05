package com.google.javascript.jscomp;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9).contains((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).siblings();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19).contains((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9).contains((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isSyntheticBlock();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((java.lang.Enum)v22).hashCode();
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).intersection(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31));
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v34 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v35 = false;
    Object v36 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v34),(((java.lang.Boolean)v35).booleanValue()));
    Object v37 = true;
    Object v38 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v36),(((java.lang.Boolean)v37).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9).contains((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v14 = false;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15).contains((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v20 = false;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33).contains((((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v36).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v29 = false;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = true;
    Object v34 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),(((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getParentScope();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    ((com.google.javascript.rhino.Node)v2).addChildrenToFront(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getInputId();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getLength();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v2).setIsSyntheticBlock((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "j";
    ((com.google.javascript.rhino.Node)v2).setSourceFileForTesting(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v2).setWasEmptyNode((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.StaticScope)v10).getTypeOfThis();
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).removeChildren();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.TypeInference)v0).createEntryLattice();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).removeChildren();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.jscomp.type.FlowScope)v8).optimize();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v2).srcrefTree(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).hashCode();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v27 = false;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = false;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = true;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = false;
    Object v34 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),(((java.lang.Boolean)v33).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25).contains((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25).contains((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.google.javascript.jscomp.TypeInference)v0).createInitialEstimateLattice();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.jscomp.type.FlowScope)v8).createChildFlowScope();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = 30;
    ((com.google.javascript.rhino.Node)v2).putIntProp((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = -19;
    ((com.google.javascript.rhino.Node)v2).setLineno((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21).contains((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).getJsDocBuilderForNode();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).removeFirstChild();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = true;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getParentScope();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getTypeOfThis();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = ((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25).contains((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isOnlyModifiesThisCall();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.jscomp.type.FlowScope)v8).optimize();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = 1;
    ((com.google.javascript.rhino.Node)v2).setCharno((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isVarArgs();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.rhino.jstype.StaticScope)v9).getTypeOfThis();
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v2).setIsSyntheticBlock((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    ((com.google.javascript.rhino.Node)v2).setQuotedString();
    Object v3 = null;
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getRootNode();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getTypeOfThis();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    Object v22 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v24 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v25 = false;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v29 = false;
    Object v30 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = false;
    Object v32 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((java.lang.Enum)v32).hashCode();
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),(((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "prototypz";
    Object v4 = new com.google.javascript.rhino.InputId(((java.lang.String)v3));
    ((com.google.javascript.rhino.Node)v2).setInputId(((com.google.javascript.rhino.InputId)v4));
    Object v5 = null;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v2).isEquivalentTo(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v2).setWasEmptyNode((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "{";
    ((com.google.javascript.rhino.Node)v2).addSuppression(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getRootNode();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getSlot(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v2).clonePropsFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v13 = false;
    Object v14 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v17 = false;
    Object v18 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = false;
    Object v20 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v23 = false;
    Object v24 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = true;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "_, ";
    Object v4 = "f, ";
    Object v5 = "+";
    Object v6 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v2).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v6));
    Object v7 = null;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v12));
    Object v14 = "";
    Object v15 = com.google.javascript.rhino.IR.name(((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v15),((com.google.javascript.rhino.jstype.ObjectType)v16));
    ((com.google.javascript.jscomp.type.FlowScope)v13).completeScope(((com.google.javascript.rhino.jstype.StaticScope)v17));
    Object v18 = null;
    Object v19 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((java.lang.Enum)v25).hashCode();
    Object v27 = false;
    Object v28 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = false;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v35 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v34),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = false;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v16),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v22 = false;
    Object v23 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v20),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v28),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v34 = false;
    Object v35 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v32),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = false;
    Object v37 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = true;
    Object v39 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v37),(((java.lang.Boolean)v38).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "_, ";
    Object v4 = "f, ";
    Object v5 = "+";
    Object v6 = com.google.javascript.jscomp.SourceFile.fromCode(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    ((com.google.javascript.rhino.Node)v2).setStaticSourceFile(((com.google.javascript.rhino.jstype.StaticSourceFile)v6));
    Object v7 = null;
    Object v8 = "";
    Object v9 = com.google.javascript.rhino.IR.name(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v9),((com.google.javascript.rhino.jstype.ObjectType)v10));
    Object v12 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v11));
    Object v13 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v12));
    Object v14 = ((com.google.javascript.rhino.jstype.StaticScope)v13).getTypeOfThis();
    Object v15 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v2).copyInformationFromForTree(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).isLocalResultCall();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v2 = false;
    Object v3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v0),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v6 = false;
    Object v7 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v4),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = false;
    Object v9 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v3),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v12 = false;
    Object v13 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v10),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v16 = false;
    Object v17 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v14),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v13),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v9),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v24 = false;
    Object v25 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v22),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    Object v27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
    Object v28 = false;
    Object v29 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v26),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = false;
    Object v31 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v25),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v32 = false;
    Object v33 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(((com.google.javascript.rhino.jstype.BooleanLiteralSet)v21),((com.google.javascript.rhino.jstype.BooleanLiteralSet)v31),(((java.lang.Boolean)v32).booleanValue()));
    org.junit.Assert.assertEquals((Object)(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "  ";
    ((com.google.javascript.rhino.Node)v2).setSourceFileForTesting(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = ((com.google.javascript.jscomp.type.FlowScope)v8).createChildFlowScope();
    Object v10 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = true;
    ((com.google.javascript.rhino.Node)v2).setOptionalArg((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v7));
    Object v9 = "";
    Object v10 = com.google.javascript.rhino.IR.name(((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v10),((com.google.javascript.rhino.jstype.ObjectType)v11));
    ((com.google.javascript.jscomp.type.FlowScope)v8).completeScope(((com.google.javascript.rhino.jstype.StaticScope)v12));
    Object v13 = null;
    Object v14 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = ((com.google.javascript.rhino.Node)v2).toStringTree();
    Object v4 = "";
    Object v5 = com.google.javascript.rhino.IR.name(((java.lang.String)v4));
    Object v6 = null;
    Object v7 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v5),((com.google.javascript.rhino.jstype.ObjectType)v6));
    Object v8 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v7));
    Object v9 = "";
    Object v10 = ((com.google.javascript.rhino.jstype.StaticScope)v8).getSlot(((java.lang.String)v9));
    Object v11 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v4),((com.google.javascript.rhino.jstype.ObjectType)v5));
    Object v7 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v6));
    Object v8 = ((com.google.javascript.rhino.jstype.StaticScope)v7).getTypeOfThis();
    Object v9 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v2).srcref(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ".";
    Object v13 = ((com.google.javascript.rhino.jstype.StaticScope)v11).getSlot(((java.lang.String)v12));
    Object v14 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = new com.google.javascript.rhino.JSDocInfo();
    ((com.google.javascript.rhino.Node)v2).setJSDocInfo(((com.google.javascript.rhino.JSDocInfo)v3));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.jscomp.type.FlowScope)v10).optimize();
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    ((com.google.javascript.rhino.Node)v2).addChildToFront(((com.google.javascript.rhino.Node)v4));
    Object v5 = null;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = -4;
    Object v4 = 1;
    ((com.google.javascript.rhino.Node)v2).putIntProp((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.type.FlowScope)v11).createChildFlowScope();
    Object v13 = ((com.google.javascript.jscomp.TypeInference)v0).branchedFlowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = -14;
    ((com.google.javascript.rhino.Node)v2).setLineno((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.jscomp.type.FlowScope)v10).optimize();
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = ((com.google.javascript.rhino.Node)v2).getIntProp((((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = com.google.javascript.rhino.IR.name(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v6),((com.google.javascript.rhino.jstype.ObjectType)v7));
    Object v9 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v8));
    Object v10 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v9));
    Object v11 = ((com.google.javascript.rhino.jstype.StaticScope)v10).getRootNode();
    Object v12 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.google.javascript.rhino.IR.name(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = com.google.javascript.rhino.IR.name(((java.lang.String)v3));
    Object v5 = ((com.google.javascript.rhino.Node)v2).copyInformationFrom(((com.google.javascript.rhino.Node)v4));
    Object v6 = "";
    Object v7 = com.google.javascript.rhino.IR.name(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.google.javascript.jscomp.Scope(((com.google.javascript.rhino.Node)v7),((com.google.javascript.rhino.jstype.ObjectType)v8));
    Object v10 = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(((com.google.javascript.jscomp.Scope)v9));
    Object v11 = new com.google.javascript.jscomp.LinkedFlowScope(((com.google.javascript.jscomp.LinkedFlowScope)v10));
    Object v12 = ((com.google.javascript.jscomp.type.FlowScope)v11).createChildFlowScope();
    Object v13 = ((com.google.javascript.jscomp.TypeInference)v0).flowThrough(((com.google.javascript.rhino.Node)v2),((com.google.javascript.jscomp.type.FlowScope)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
