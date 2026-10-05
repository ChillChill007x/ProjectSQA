package com.fasterxml.jackson.databind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isProxyType(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findRawSuperTypes(((java.lang.Class)v3),((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findClassAnnotations(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.classNameOf(((java.lang.Object)v0));
    org.junit.Assert.assertEquals((Object)("`com.fasterxml.jackson.databind.type.SimpleType`"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.getEnclosingClass(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getConstructors();
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findRawSuperTypes(((java.lang.Class)v3),((java.lang.Class)v7),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "not a valid double value (as String to convert)";
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.backticked(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("`not a valid double value (as String to convert)`"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((com.fasterxml.jackson.databind.JavaType)v2),((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(((java.lang.reflect.Member)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "e~lementType";
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.nonNullString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("e~lementType"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "not a valid double value (as String to convert)";
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.backticked(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)("`not a valid double value (as String to convert)`"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.ClassUtil();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "stri6g";
    Object v6 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.getRootCause(((java.lang.Throwable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.getEnclosingClass(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "!";
    Object v1 = "]";
    Object v2 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 1;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23),((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.util.Named)v25).getName();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.nameOf(((com.fasterxml.jackson.databind.util.Named)v25));
    org.junit.Assert.assertEquals((Object)("`!`"), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.classNameOf(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)("`com.fasterxml.jackson.databind.type.CollectionLikeType`"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v3),((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.hasClass(((java.lang.Object)v0),((java.lang.Class)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.canBeABeanType(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "stri6g";
    Object v6 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE(((java.lang.Throwable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "stri6g";
    Object v6 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfIOE(((java.lang.Throwable)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).isInterface();
    Object v5 = false;
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.createInstance(((java.lang.Class)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.getOuterClass(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(((java.lang.reflect.Member)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isCollectionMapOrArray(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingClass();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.primitiveType(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.defaultValue(((java.lang.Class)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "stri6g";
    Object v6 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfError(((java.lang.Throwable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = "Failed to parse JSON String as XML: ";
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.quotedOr(((java.lang.Object)v6),((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)("\"class java.lang.reflect.Constructor\""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = true;
    Object v3 = "!";
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.Named)v6).getName();
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.nameOf(((com.fasterxml.jackson.databind.util.Named)v6));
    org.junit.Assert.assertEquals((Object)("`!`"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.nonNullString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("string"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v3),((java.lang.Class)v6),((java.util.List)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "stri6g";
    Object v6 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfError(((java.lang.Throwable)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfIOE(((java.lang.Throwable)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.getPackageName(((java.lang.Class)v2));
    org.junit.Assert.assertEquals((Object)("com.fasterxml.jackson.databind.jsonFormatVisitors"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "stri6g";
    Object v6 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.exceptionMessage(((java.lang.Throwable)v6));
    org.junit.Assert.assertEquals((Object)("stri6g"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.hasEnclosingMethod(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.wrapperType(((java.lang.Class)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(((java.lang.Object)v5),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.range(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isObjectOrPrimitive(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.getClassMethods(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.getClassDescription(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("`java.lang.reflect.Constructor`"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isCollectionMapOrArray(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getFields();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.getDeclaringClass(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(((java.lang.Class)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findFirstAnnotatedEnumValue(((java.lang.Class)v3),((java.lang.Class)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.nonNullString(((java.lang.String)v3));
    Object v5 = "AnnotationIntrospector returned Class%";
    com.fasterxml.jackson.databind.util.ClassUtil.verifyMustOverride(((java.lang.Class)v2),((java.lang.Object)v4),((java.lang.String)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.isLocalType(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.canBeABeanType(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.getGenericInterfaces(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isLocalType(((java.lang.Class)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "a";
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.backticked(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("`a`"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v2),((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v3),((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = "stri6g";
    Object v9 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE(((java.lang.Throwable)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.throwAsMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v2),((java.io.IOException)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.getPackageName(((java.lang.Class)v2));
    org.junit.Assert.assertEquals((Object)("java.lang"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "stri6g";
    Object v6 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE(((java.lang.Throwable)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE(((java.lang.Throwable)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = false;
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "stri6g";
    Object v6 = com.fasterxml.jackson.databind.exc.MismatchedInputException.from(((com.fasterxml.jackson.core.JsonParser)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.throwIfError(((java.lang.Throwable)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.exceptionMessage(((java.lang.Throwable)v7));
    org.junit.Assert.assertEquals((Object)("stri6g"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.nonNull(((java.lang.Object)v5),((java.lang.Object)v6));
    com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(((java.lang.reflect.Member)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.nameOf(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)("`java.lang.reflect.Constructor`"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredClasses();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).containedTypeCount();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findFirstAnnotatedEnumValue(((java.lang.Class)v3),((java.lang.Class)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = false;
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v10));
    Object v12 = ((java.lang.Class)v7).getDeclaredAnnotation(((java.lang.Class)v11));
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Class)v7),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(((java.lang.Class)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v8 = "";
    com.fasterxml.jackson.databind.util.ClassUtil.verifyMustOverride(((java.lang.Class)v6),((java.lang.Object)v7),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findClassAnnotations(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredMethods(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.lang.reflect.Member)v5).getName();
    Object v7 = false;
    com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(((java.lang.reflect.Member)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isBogusClass(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isCollectionMapOrArray(((java.lang.Class)v3));
    Object v5 = "arrap";
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.quotedOr(((java.lang.Object)v4),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("\"false\""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeCount();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findFirstAnnotatedEnumValue(((java.lang.Class)v2),((java.lang.Class)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v3 = ((java.lang.Class)v2).getGenericSuperclass();
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.isLocalType(((java.lang.Class)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = ((java.lang.Class)v2).getGenericInterfaces();
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.isLocalType(((java.lang.Class)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((com.fasterxml.jackson.databind.JavaType)v2),((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.getOuterClass(((java.lang.Class)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.ClassUtil.emptyIterator();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.getConstructors(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.isLocalType(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.nullOrToString(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)("STRING"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v2));
    Object v4 = new java.util.EnumMap(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumMap)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getName();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findFirstAnnotatedEnumValue(((java.lang.Class)v3),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.defaultValue(((java.lang.Class)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = " [trunrcated]";
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.backticked(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("` [trunrcated]`"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = "number";
    com.fasterxml.jackson.databind.util.ClassUtil.verifyMustOverride(((java.lang.Class)v2),((java.lang.Object)v5),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.getClassMethods(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.isBogusClass(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.range(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.hasEnclosingMethod(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.primitiveType(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = ((java.lang.Class)v2).getName();
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Class)v2));
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.isLocalType(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }
}
