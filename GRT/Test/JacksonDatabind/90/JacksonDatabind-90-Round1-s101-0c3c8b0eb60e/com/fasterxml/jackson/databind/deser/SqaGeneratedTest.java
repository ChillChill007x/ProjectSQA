package com.fasterxml.jackson.databind.deser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getArrayDelegateCreator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "[PropeYrty '";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canInstantiate();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromObjectWith();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new java.lang.Object[]{null,null};
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object[])v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromString();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getWithArgsCreator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 4.806886909261179D;
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).mappingException(((java.lang.Class)v9),((com.fasterxml.jackson.core.JsonToken)v10));
    Object v12 = "]";
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getIncompleteParameter();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canInstantiate();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).leaseObjectBuffer();
    Object v10 = "Failed to setValue() for field ";
    Object v11 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "Unresolved forward reference but no identity info.";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "Called operation not supported for TokenBuff";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).weirdStringException(((java.lang.String)v11),((java.lang.Class)v13),((java.lang.String)v14));
    Object v16 = "";
    Object v17 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getDefaultCreator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getFromObjectArguments(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromBoolean();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getDelegateCreator();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = -23L;
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v11),(((java.lang.Long)v12).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromString();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "STRING";
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "u";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).instantiationException(((java.lang.Class)v13),((java.lang.String)v14));
    Object v16 = new java.lang.Object[]{};
    Object v17 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object[])v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "fale";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueClass();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateUsingDelegate();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = 0L;
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v10),(((java.lang.Long)v11).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v11),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new java.lang.Object[]{null,null,null};
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "no delegate creator specified";
    Object v12 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromLong();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 30.66815971054682D;
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromLong();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateUsingArrayDelegate();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "(";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getArrayDelegateCreator();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "string";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = ")";
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v14),((java.lang.String)v15),((java.lang.Throwable)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).instantiationException(((java.lang.Class)v12),((java.lang.Throwable)v17));
    Object v19 = "].";
    Object v20 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = -10;
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "]";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 9L;
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v10),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "";
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "r";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromDouble();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "Invalid )bject Id definition for ";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new java.lang.Object[]{};
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object[])v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "Can not use FormMtSchema of type ";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "PH)ONE";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = 0;
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "Conflicting/ambiguoRs property name definitions (implicit name '";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v10),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = "";
    Object v13 = "int";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).unknownTypeIdException(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "Can not handle managed/back reference '";
    Object v16 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromDouble();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromInt();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromObjectWith();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v10),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v14 = "string";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonToken)v13),((java.lang.String)v14));
    Object v16 = "moduleVersion";
    Object v17 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.DatabindContext)v10).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Class)v16));
    Object v18 = "s";
    Object v19 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = "5";
    Object v13 = "string";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).unknownTypeIdException(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS";
    Object v16 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "e]";
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getArrayDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).endOfInputException(((java.lang.Class)v12));
    Object v14 = "null";
    Object v15 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v14 = "-";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonToken)v13),((java.lang.String)v14));
    Object v16 = "array";
    Object v17 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).getArrayBuilders();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getArrayDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = 7.047957369615792D;
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v10),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v8),(((java.lang.Boolean)v9).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "; expected type Converter or Class<Converter> insteBd";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ": ";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "not a valid float v";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getFromObjectArguments(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s";
    Object v10 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v15).getValueTypeDesc();
    Object v17 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v15).getValueClass();
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).endOfInputException(((java.lang.Class)v17));
    Object v19 = "ARRA4Y";
    Object v20 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS;
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).with(((com.fasterxml.jackson.databind.DeserializationFeature)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getArrayDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "it";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getIncompleteParameter();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "' found (for property '";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ",";
    Object v12 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).canCreateFromInt();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = " of ";
    Object v9 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "[]";
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4).getValueTypeDesc();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ")";
    Object v13 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4)._createFromStringFallbacks(((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
