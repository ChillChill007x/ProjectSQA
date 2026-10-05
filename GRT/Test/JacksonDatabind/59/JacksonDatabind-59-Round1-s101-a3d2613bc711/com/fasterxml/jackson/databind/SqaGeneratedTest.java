package com.fasterxml.jackson.databind;
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).isTypeOrSubTypeOf(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.core.type.ResolvedType)v9).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object<java.lang.Object>"), v10);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = 1;
    Object v11 = new java.lang.StringBuilder((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).getGenericSignature(((java.lang.StringBuilder)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).containedType((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isContainerType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType[])v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v0).refine(((java.lang.Class)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeBindings)v24).toString();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v28 = ((com.fasterxml.jackson.databind.JavaType)v0).refine(((java.lang.Class)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v24),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    org.junit.Assert.assertNull(v28);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isAbstract();
    org.junit.Assert.assertEquals((Object)(false), v10);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withContentTypeHandler(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).containedTypeName((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNull(v11);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).getBindings();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v9).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType[])v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType[])v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v9).hasRawClass(((java.lang.Class)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).containedTypeCount();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).asKey(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType[])v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isAbstract();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v0).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).forcedNarrowBy(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v15).isThrowable();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((java.lang.Class)v17).getNestMembers();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v15).isTypeOrSubTypeOf(((java.lang.Class)v17));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isAbstract();
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).toString();
    org.junit.Assert.assertEquals((Object)("[collection-like type; class java.lang.Object, contains [simple type, class java.lang.Object]]"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.core.type.ResolvedType)v31).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v32);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v11));
    Object v13 = 1;
    Object v14 = new java.lang.StringBuilder((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v12).getGenericSignature(((java.lang.StringBuilder)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v12).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v9).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.Object[]{null,null};
    Object v2 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withContentValueHandler(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isEnumType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = 1;
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v31).containedType((((java.lang.Integer)v32).intValue()));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).getParameterSource();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = new java.lang.StringBuilder((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v17).getErasedSignature(((java.lang.StringBuilder)v19));
    org.junit.Assert.assertNotNull(v20);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = 1;
    Object v33 = new java.lang.StringBuilder((((java.lang.Integer)v32).intValue()));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v31).getErasedSignature(((java.lang.StringBuilder)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new java.util.Map.Entry[]{};
    Object v11 = java.util.Map.ofEntries(((java.util.Map.Entry[])v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withContentTypeHandler(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isContainerType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).getSuperClass();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).asKey(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).isContainerType();
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v9).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((java.lang.Class)v22).isAnnotationPresent(((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v20).hasRawClass(((java.lang.Class)v22));
    org.junit.Assert.assertEquals((Object)(true), v26);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).containedTypeName((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).asKey(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).getReferencedType();
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).withStaticTyping();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).getBindings();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = 1;
    Object v17 = new java.lang.StringBuilder((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).withTypeHandler(((java.lang.Object)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getBindings();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).toString();
    org.junit.Assert.assertEquals((Object)("[simple type, class java.lang.Object]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).hasHandlers();
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v11));
    Object v13 = 1;
    Object v14 = new java.lang.StringBuilder((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v12).getErasedSignature(((java.lang.StringBuilder)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getSuperClass();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new java.util.Map.Entry[]{};
    Object v11 = java.util.Map.ofEntries(((java.util.Map.Entry[])v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withContentTypeHandler(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new java.util.Map.Entry[]{};
    Object v11 = java.util.Map.ofEntries(((java.util.Map.Entry[])v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withContentTypeHandler(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v9).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).withStaticTyping();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getSuperClass();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).getKeyType();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new java.util.Map.Entry[]{};
    Object v11 = java.util.Map.ofEntries(((java.util.Map.Entry[])v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withContentTypeHandler(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v13);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).isEnumType();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v16).containedTypeCount();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v15).withTypeHandler(((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    Object v13 = 1;
    Object v14 = new java.lang.StringBuilder((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v12).getErasedSignature(((java.lang.StringBuilder)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((java.lang.Class)v17).getCanonicalName();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v12).forcedNarrowBy(((java.lang.Class)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isContainerType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).getSuperClass();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).isEnumType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v17).findTypeParameters(((java.lang.Class)v20));
    org.junit.Assert.assertNotNull(v21);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isContainerType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).getSuperClass();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).isContainerType();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).isThrowable();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v17).getInterfaces();
    org.junit.Assert.assertNotNull(v19);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = 1;
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v31).containedTypeName((((java.lang.Integer)v32).intValue()));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).asKey(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = 34;
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v31).containedTypeName((((java.lang.Integer)v32).intValue()));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = 1;
    Object v33 = new java.lang.StringBuilder((((java.lang.Integer)v32).intValue()));
    Object v34 = 1;
    Object v35 = new java.lang.StringBuilder((((java.lang.Integer)v34).intValue()));
    Object v36 = ((java.lang.StringBuilder)v33).append(((java.lang.CharSequence)v35));
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v31).getGenericSignature(((java.lang.StringBuilder)v33));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v9).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).withStaticTyping();
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v21).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v22);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    org.junit.Assert.assertNotNull(v18);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isContainerType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).getSuperClass();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType[])v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v27).withValueHandler(((java.lang.Object)v29));
    Object v31 = 1;
    Object v32 = new java.lang.StringBuilder((((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v30).getErasedSignature(((java.lang.StringBuilder)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v17).getGenericSignature(((java.lang.StringBuilder)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v17).hasContentType();
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new java.util.Map.Entry[]{};
    Object v11 = java.util.Map.ofEntries(((java.util.Map.Entry[])v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withContentTypeHandler(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getValueHandler();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getSuperClass();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v14);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = 1;
    Object v17 = new java.lang.StringBuilder((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).withTypeHandler(((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType[])v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = ((java.lang.Class)v30).getAnnotation(((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v28).findSuperType(((java.lang.Class)v30));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v34).forcedNarrowBy(((java.lang.Class)v36));
    Object v38 = ((com.fasterxml.jackson.databind.JavaType)v34).isThrowable();
    Object v39 = ((com.fasterxml.jackson.databind.JavaType)v18).equals(((java.lang.Object)v38));
    org.junit.Assert.assertEquals((Object)(false), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = 1;
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v17).containedTypeOrUnknown((((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v11));
    Object v13 = 1;
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v12).containedTypeOrUnknown((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).getInterfaces();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).isEnumType();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v16).containedTypeCount();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v15).withTypeHandler(((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.core.type.ResolvedType)v19).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object<java.lang.Object>"), v20);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v17).findSuperType(((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).withStaticTyping();
    org.junit.Assert.assertNotNull(v19);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).asKey(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v31)._narrow(((java.lang.Class)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).isInterface();
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v31).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v33);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v18).isTypeOrSubTypeOf(((java.lang.Class)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getSuperClass();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).getContentTypeHandler();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).asKey(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v31).containedTypeCount();
    org.junit.Assert.assertEquals((Object)(0), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v28),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v22).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v33).withStaticTyping();
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v12).withTypeHandler(((java.lang.Object)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v9).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).withStaticTyping();
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v21).hasGenericTypes();
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v21).getInterfaces();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isContainerType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).getSuperClass();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).containedTypeCount();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new java.util.Map.Entry[]{};
    Object v11 = java.util.Map.ofEntries(((java.util.Map.Entry[])v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withContentTypeHandler(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.core.type.ResolvedType)v12).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object<java.lang.Object>"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getDeclaredAnnotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v26).withValueHandler(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v31).findTypeParameters(((java.lang.Class)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).asKey(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.core.type.ResolvedType)v31).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object<java.lang.Object>"), v32);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isContainerType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).getSuperClass();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).useStaticType();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isContainerType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).getSuperClass();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).getInterfaces();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).isArray();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v9).hasRawClass(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v9).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v20).findTypeParameters(((java.lang.Class)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v28),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v22).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = ((com.fasterxml.jackson.databind.JavaType)v33).findTypeParameters(((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v12).withContentTypeHandler(((java.lang.Object)v36));
    org.junit.Assert.assertNotNull(v37);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = 1;
    Object v17 = new java.lang.StringBuilder((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).withTypeHandler(((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.core.type.ResolvedType)v18).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).isInterface();
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v18).withStaticTyping();
    org.junit.Assert.assertNotNull(v20);
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
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).withStaticTyping();
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v19).isPrimitive();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v21).getInterfaces();
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v19).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).withStaticTyping();
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v19).isMapLikeType();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).withStaticTyping();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v19).forcedNarrowBy(((java.lang.Class)v21));
    org.junit.Assert.assertNotNull(v22);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v11).getAnnotation(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v9).findSuperType(((java.lang.Class)v11));
    Object v16 = -59;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).withStaticTyping();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).isInterface();
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v18).withStaticTyping();
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).hasHandlers();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v11));
    Object v13 = 1;
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v12).containedTypeOrUnknown((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((java.lang.Class)v26).getAnnotation(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v24).findSuperType(((java.lang.Class)v26));
    Object v31 = -59;
    Object v32 = ((com.fasterxml.jackson.databind.JavaType)v30).containedTypeOrUnknown((((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v32).withStaticTyping();
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v33).withStaticTyping();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v34).forcedNarrowBy(((java.lang.Class)v36));
    Object v38 = ((com.fasterxml.jackson.databind.JavaType)v14).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getInterfaces();
    org.junit.Assert.assertNotNull(v13);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9)._narrow(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getSuperClass();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v14);
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
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).isFinal();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBindings)v16).asKey(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType[])v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.JavaType)v9).refine(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v31)._narrow(((java.lang.Class)v33));
    Object v35 = ((com.fasterxml.jackson.core.type.ResolvedType)v34).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v9).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).withStaticTyping();
    Object v22 = -20;
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v21).containedTypeName((((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v21).isTypeOrSubTypeOf(((java.lang.Class)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }
}
