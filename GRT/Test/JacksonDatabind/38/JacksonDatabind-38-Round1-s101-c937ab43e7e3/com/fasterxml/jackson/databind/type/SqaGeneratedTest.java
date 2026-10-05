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
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).hasGenericTypes();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v6).forcedNarrowBy(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
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
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isFinal();
    org.junit.Assert.assertEquals((Object)(false), v5);
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
    Object v17 = ((java.lang.Class)v16).getDeclaredConstructors();
    Object v18 = ((com.fasterxml.jackson.databind.type.SimpleType)v14)._narrow(((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v18);
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
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
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
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v4).hasRawClass(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
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
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = new java.lang.StringBuilder();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).withValueHandler(((java.lang.Object)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v9);
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
    Object v11 = ((com.fasterxml.jackson.databind.type.SimpleType)v10).withStaticTyping();
    Object v12 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).equals(((java.lang.Object)v11));
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
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.core.type.ResolvedType)v4).isConcrete();
    Object v6 = ((com.fasterxml.jackson.core.type.ResolvedType)v4).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).hasGenericTypes();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v6).forcedNarrowBy(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).getSuperClass();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v10).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).withTypeHandler(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).hasGenericTypes();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v6).forcedNarrowBy(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v10).findSuperType(((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).withTypeHandler(((java.lang.Object)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBase)v7).getInterfaces();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).isAbstract();
    Object v13 = ((com.fasterxml.jackson.databind.type.SimpleType)v10).withValueHandler(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).forcedNarrowBy(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).hasGenericTypes();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v16).forcedNarrowBy(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeBase)v20).findSuperType(((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v23));
    Object v25 = 0;
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v9).containedTypeOrUnknown((((java.lang.Integer)v25).intValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).getContentType();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).hasGenericTypes();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v6).forcedNarrowBy(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = -7;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).isTypeOrSubTypeOf(((java.lang.Class)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = 0;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType[])v12),((com.fasterxml.jackson.databind.JavaType)v13),((java.lang.Object)v15),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v4),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v3).equals(((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((java.lang.Class)v25).isLocalClass();
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v3).hasRawClass(((java.lang.Class)v25));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isPrimitive();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v8));
    Object v10 = new java.lang.StringBuilder();
    Object v11 = ((com.fasterxml.jackson.databind.type.SimpleType)v9).getGenericSignature(((java.lang.StringBuilder)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = 90;
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).containedTypeName((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
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
    Object v15 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withStaticTyping();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
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
    Object v17 = ((java.lang.Class)v16).getDeclaredConstructors();
    Object v18 = ((com.fasterxml.jackson.databind.type.SimpleType)v14)._narrow(((java.lang.Class)v16));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBase)v18).getBindings();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = -7;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v7));
    Object v9 = "u";
    Object v10 = "[";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).withTypeHandler(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
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
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((java.lang.Class)v16).isAssignableFrom(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v14).forcedNarrowBy(((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).containedTypeName((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
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
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v16).getDeclaredConstructors();
    Object v18 = ((com.fasterxml.jackson.databind.type.SimpleType)v14)._narrow(((java.lang.Class)v16));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).getInterfaces();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = -7;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).containedTypeCount();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v9).forcedNarrowBy(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.SimpleType)v8).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).getBindings();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).getReferencedType();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
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
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v14).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = -7;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).isInterface();
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).getInterfaces();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).isAbstract();
    Object v13 = ((com.fasterxml.jackson.databind.type.SimpleType)v10).withValueHandler(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).forcedNarrowBy(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).hasGenericTypes();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v16).forcedNarrowBy(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeBase)v20).findSuperType(((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v23));
    Object v25 = 0;
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v9).containedTypeOrUnknown((((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v26).useStaticType();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
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
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.core.type.ResolvedType)v4).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v2).buildCanonicalName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).withStaticTyping();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
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
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).getRawClass();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findSuperType(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).isAbstract();
    Object v13 = ((com.fasterxml.jackson.databind.type.SimpleType)v10).withValueHandler(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).forcedNarrowBy(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).hasGenericTypes();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v16).forcedNarrowBy(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeBase)v20).findSuperType(((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v23));
    Object v25 = 0;
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v9).containedTypeOrUnknown((((java.lang.Integer)v25).intValue()));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = ((com.fasterxml.jackson.databind.type.SimpleType)v26).equals(((java.lang.Object)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
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
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isThrowable();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v14).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
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
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((java.lang.Class)v16).isAssignableFrom(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v14).forcedNarrowBy(((java.lang.Class)v16));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).getGenericSignature();
    org.junit.Assert.assertEquals((Object)("Ljava/lang/Object<Ljava/lang/Object;;"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).withStaticTyping();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = 0;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = 0;
    Object v20 = new java.util.ArrayList((((java.lang.Integer)v19).intValue()));
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType[])v15),((com.fasterxml.jackson.databind.JavaType)v16),((java.lang.Object)v18),((java.lang.Object)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v22).getRawClass();
    Object v24 = ((java.lang.Class)v23).isInterface();
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v7).hasRawClass(((java.lang.Class)v23));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.reflect.Type)v1).getTypeName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).isContainerType();
    Object v7 = -57;
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v5).containedTypeOrUnknown((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getErasedSignature();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v5).findSuperType(((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getReferencedType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v13).newInstance();
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v16 = ((com.fasterxml.jackson.core.type.ResolvedType)v15).toCanonical();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v18 = ((com.fasterxml.jackson.databind.type.SimpleType)v5).refine(((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType[])v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.type.SimpleType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isInterface();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeBase)v4).getTypeHandler();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = 0;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType[])v11),((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.Object)v14),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).getRawClass();
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeBase)v3).findTypeParameters(((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getKeyType();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isAbstract();
    Object v5 = ((com.fasterxml.jackson.databind.type.SimpleType)v2).withValueHandler(((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v5).forcedNarrowBy(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).getBindings();
    Object v10 = "Class ";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeBindings)v9).findBoundType(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v9),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType[])v13),((java.lang.Object)v15),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).withStaticTyping();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeBase)v7).findTypeParameters(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getErasedSignature();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v5).findSuperType(((java.lang.Class)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = 0;
    Object v21 = new java.util.ArrayList((((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = new java.util.ArrayList((((java.lang.Integer)v22).intValue()));
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.Object)v21),((java.lang.Object)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 0;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.databind.type.SimpleType)v9).withTypeHandler(((java.lang.Object)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = ((com.fasterxml.jackson.databind.type.SimpleType)v4).withTypeHandler(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).isAbstract();
    Object v13 = ((com.fasterxml.jackson.databind.type.SimpleType)v10).withValueHandler(((java.lang.Object)v12));
    Object v14 = 0;
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v13).containedTypeOrUnknown((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).hasValueHandler();
    Object v17 = ((java.lang.Class)v9).isInstance(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.SimpleType)v7)._narrow(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = -7;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findTypeParameters(((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).isAbstract();
    Object v9 = ((com.fasterxml.jackson.databind.type.SimpleType)v6).withValueHandler(((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).containedTypeOrUnknown((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).getErasedSignature();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeBase)v11).findSuperType(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v17 = 1;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).toString();
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v20).isConcrete();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v25).hasGenericTypes();
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType[])v16),(((java.lang.Integer)v17).intValue()),((java.lang.Object)v22),((java.lang.Object)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getKeyType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).newInstance();
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.SimpleType)v3)._narrow(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
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
    Object v15 = ((com.fasterxml.jackson.databind.type.SimpleType)v14).withStaticTyping();
    Object v16 = ((com.fasterxml.jackson.core.type.ResolvedType)v15).isReferenceType();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = 0;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType[])v11),((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.Object)v14),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).getRawClass();
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v3).isTypeOrSubTypeOf(((java.lang.Class)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).getInterfaces();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
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
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).getErasedSignature();
    org.junit.Assert.assertEquals((Object)("Ljava/lang/Object;"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    org.junit.Assert.assertEquals((Object)("[simple type, class java.lang.Object]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.type.SimpleType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getErasedSignature();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v5).findSuperType(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = 0;
    Object v20 = new java.util.ArrayList((((java.lang.Integer)v19).intValue()));
    Object v21 = 0;
    Object v22 = new java.util.ArrayList((((java.lang.Integer)v21).intValue()));
    Object v23 = true;
    Object v24 = new com.fasterxml.jackson.databind.type.ReferenceType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v18),((java.lang.Object)v20),((java.lang.Object)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v24).getRawClass();
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeBase)v9).findSuperType(((java.lang.Class)v25));
    org.junit.Assert.assertNotNull(v26);
  }
}
