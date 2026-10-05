package com.fasterxml.jackson.databind.type;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isInterface();
    Object v16 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withStaticTyping();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).getContentTypeHandler();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).getTypeParameters();
    Object v3 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isAbstract();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).buildCanonicalName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object<java.lang.Object"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 1;
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeBase)v14).containedTypeName((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withValueHandler(((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.lang.StringBuilder();
    Object v16 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).getGenericSignature(((java.lang.StringBuilder)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isThrowable();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).hasGenericTypes();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v4).forcedNarrowBy(((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isFinal();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).getSuperClass();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.core.type.ResolvedType)v4).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).toString();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v14).isTypeOrSubTypeOf(((java.lang.Class)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).getInterfaces();
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).buildCanonicalName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).hasGenericTypes();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v4).forcedNarrowBy(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v8).hasRawClass(((java.lang.Class)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).toString();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((java.lang.Class)v8).newInstance();
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v6).withValueHandler(((java.lang.Object)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeBase)v14).getInterfaces();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).isAbstract();
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v5).withValueHandler(((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v8).forcedNarrowBy(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v14).isTypeOrSubTypeOf(((java.lang.Class)v16));
    Object v18 = 0.0F;
    Object v19 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v18).floatValue()));
    Object v20 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v19),((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22),((com.fasterxml.jackson.databind.DeserializationContext)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = 0.0F;
    Object v29 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v28).floatValue()));
    Object v30 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v35));
    ((com.fasterxml.jackson.databind.SerializerProvider)v27).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v36));
    Object v37 = null;
    ((com.fasterxml.jackson.databind.type.TypeBase)v14).serialize(((com.fasterxml.jackson.core.JsonGenerator)v26),((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).isConcrete();
    Object v8 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).getSuperClass();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v4).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = 0;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType[])v10),((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeBase)v17).getInterfaces();
    Object v19 = ((com.fasterxml.jackson.databind.type.SimpleType)v2).withTypeHandler(((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).findSuperType(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withValueHandler(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeBase)v17).findSuperType(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.SimpleType)v17)._narrow(((java.lang.Class)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).findTypeParameters(((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).buildCanonicalName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).getDeclaringClass();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = 0;
    Object v9 = new java.util.ArrayList((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.type.SimpleType)v7).withValueHandler(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v12 = 0;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).newInstance();
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v16).withStaticTyping();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).hasGenericTypes();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v17).forcedNarrowBy(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v21).hasRawClass(((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType[])v11),(((java.lang.Integer)v12).intValue()),((java.lang.Object)v24),((java.lang.Object)v25),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).withValueHandler(((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = new java.util.ArrayList((((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType[])v14),((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v17),((java.lang.Object)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).withContentTypeHandler(((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    org.junit.Assert.assertEquals((Object)("[simple type, class java.lang.Object]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).toString();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).findTypeParameters(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).findSuperType(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.SimpleType)v7)._narrow(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).withValueHandler(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isEnumType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v4).hasRawClass(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).findSuperType(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).getInterfaces();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.core.type.ResolvedType)v3).isReferenceType();
    Object v5 = ((com.fasterxml.jackson.core.type.ResolvedType)v3).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).getValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isFinal();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v4)._narrow(((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v4).isTypeOrSubTypeOf(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withValueHandler(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeBase)v17).findSuperType(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.SimpleType)v17)._narrow(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.SimpleType)v23).equals(((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).hasGenericTypes();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v4).forcedNarrowBy(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).getInterfaces();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).getKeyType();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isInterface();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withValueHandler(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeBase)v17).findSuperType(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.SimpleType)v17)._narrow(((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v23).isInterface();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeBase)v23).getTypeHandler();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = "";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isAbstract();
    Object v11 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).withValueHandler(((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isFinal();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v4)._narrow(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredConstructors();
    Object v13 = ((com.fasterxml.jackson.databind.type.SimpleType)v9)._narrow(((java.lang.Class)v11));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).hasRawClass(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).withContentValueHandler(((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isFinal();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v4)._narrow(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).withTypeHandler(((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).withStaticTyping();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = -7;
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v4).containedTypeOrUnknown((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).getContentTypeHandler();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).containedTypeOrUnknown((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = "";
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBindings)v5).withUnboundVariable(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isAbstract();
    Object v11 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).withValueHandler(((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).isConcrete();
    Object v15 = 0;
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).containedTypeOrUnknown((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = new java.lang.StringBuilder();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v2).getGenericSignature(((java.lang.StringBuilder)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).containedTypeOrUnknown((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isFinal();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v4)._narrow(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).withTypeHandler(((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v0)._narrow(((java.lang.Class)v2));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isFinal();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v4)._narrow(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).withTypeHandler(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v10).isTypeOrSubTypeOf(((java.lang.Class)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).containedTypeOrUnknown((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).isPrimitive();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).containedTypeCount();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v10).forcedNarrowBy(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withValueHandler(((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).withContentTypeHandler(((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).withValueHandler(((java.lang.Object)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).getGenericSignature();
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).toString();
    org.junit.Assert.assertEquals((Object)("[simple type, class java.lang.Object]"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = 0;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType[])v10),((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeBase)v17).getInterfaces();
    Object v19 = ((com.fasterxml.jackson.databind.type.SimpleType)v2).withTypeHandler(((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v19).hasGenericTypes();
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeBase)v19).getInterfaces();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(1063877011), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).newInstance();
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v8 = ((com.fasterxml.jackson.databind.type.SimpleType)v7).withStaticTyping();
    Object v9 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withContentType(((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).withValueHandler(((java.lang.Object)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).isInterface();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).findTypeParameters(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withValueHandler(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeBase)v17).findSuperType(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.SimpleType)v17)._narrow(((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeBase)v23).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object<java.lang.Object"), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).findSuperType(((java.lang.Class)v6));
    Object v8 = new java.lang.StringBuilder();
    Object v9 = ((com.fasterxml.jackson.databind.type.SimpleType)v7).getGenericSignature(((java.lang.StringBuilder)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).hasGenericTypes();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v4).forcedNarrowBy(((java.lang.Class)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.type.TypeBase)v8).serialize(((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).withStaticTyping();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v7).findSuperType(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v7).hasRawClass(((java.lang.Class)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).getErasedSignature();
    org.junit.Assert.assertEquals((Object)("Ljava/lang/Object;"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withValueHandler(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeBase)v17).findSuperType(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.SimpleType)v17)._narrow(((java.lang.Class)v22));
    Object v24 = new java.lang.StringBuilder();
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v23).withContentValueHandler(((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v23).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).containedTypeOrUnknown((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getContentValueHandler();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getAnnotatedSuperclass();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).isTypeOrSubTypeOf(((java.lang.Class)v4));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = new java.lang.StringBuilder();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).getGenericSignature(((java.lang.StringBuilder)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).withStaticTyping();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBase)v7).getInterfaces();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isMapLikeType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getDeclaredFields();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).forcedNarrowBy(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v4)._narrow(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = new java.util.ArrayList((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v10),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeBase)v14).getBindings();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isSynthetic();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).isTypeOrSubTypeOf(((java.lang.Class)v4));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }
}
