package com.fasterxml.jackson.databind.introspect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=known type ids are not statically known, scope=java.lang.Object, generatorType=java.lang.Object, alwaysAsId=true"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=false"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).toString();
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getResolverType();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getResolverType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = ((java.lang.Class)v7).getPackageName();
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getResolverType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v7),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v11).getResolverType();
    Object v13 = ((java.lang.Class)v12).isLocalClass();
    Object v14 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getPackageName();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = false;
    Object v12 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getResolverType();
    Object v14 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=false"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).toString();
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).withAlwaysAsId((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).withAlwaysAsId((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((java.lang.Class)v12).isInstance(((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v4),((java.lang.Class)v8),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).toString();
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getGeneratorType();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.PropertyName)v1).internSimpleName();
    Object v3 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).getResolverType();
    Object v5 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v5).getResolverType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v4),((java.lang.Class)v6),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).toString();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=true"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = ((java.lang.Class)v7).getPackageName();
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getResolverType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v7),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getScope();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getGeneratorType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = ")6";
    Object v3 = ((com.fasterxml.jackson.databind.PropertyName)v1).withNamespace(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).getResolverType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v7),((java.lang.Class)v9),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = ((java.lang.Class)v5).toString();
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getClassLoader();
    Object v13 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v5),(((java.lang.Boolean)v7).booleanValue()),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=false"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).toString();
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((java.lang.Class)v8).getFields();
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v4),((java.lang.Class)v8),(((java.lang.Boolean)v10).booleanValue()),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v5).toString();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v5).getResolverType();
    Object v8 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v0),((java.lang.Class)v4),((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v5),((java.lang.Class)v7),((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=true"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = "known type ids are not statically known";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getResolverType();
    Object v12 = ((java.lang.Class)v11).getPackageName();
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).getResolverType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v5),((java.lang.Class)v9),((java.lang.Class)v11),(((java.lang.Boolean)v13).booleanValue()),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v16).getScope();
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).getClasses();
    Object v24 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v22));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).isEnum();
    Object v7 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v7).getResolverType();
    Object v9 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).getResolverType();
    Object v11 = ((java.lang.Class)v8).getDeclaredAnnotation(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v8),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v5),((java.lang.Class)v7),((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).getPropertyName();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).isEnum();
    Object v7 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v7).getResolverType();
    Object v9 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).getResolverType();
    Object v11 = ((java.lang.Class)v8).getDeclaredAnnotation(((java.lang.Class)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v8),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=com.fasterxml.jackson.annotation.SimpleObjectIdResolver, alwaysAsId=true"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getConstructors();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((java.lang.Class)v10).getDeclaringClass();
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).toString();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v16 = ((java.lang.Class)v15).getGenericInterfaces();
    Object v17 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v10),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getScope();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = 0;
    Object v3 = new java.util.ArrayList((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.PropertyName)v1).equals(((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((java.lang.Class)v12).getEnclosingConstructor();
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v8),((java.lang.Class)v12),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = "]";
    Object v3 = ((com.fasterxml.jackson.databind.PropertyName)v1).hasSimpleName(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = ((java.lang.Class)v7).getConstructors();
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getScope();
    Object v14 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v7),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = 0;
    Object v3 = new java.util.ArrayList((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.PropertyName)v1).equals(((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((java.lang.Class)v12).getEnclosingConstructor();
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v8),((java.lang.Class)v12),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).toString();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).getAlwaysAsId();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "abstract types either need to be mapped to concrete types, have custom deserializer, or be instantiated with additional type information";
    Object v1 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v1).getResolverType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v0),((java.lang.Class)v2),((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).getResolverType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=true"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = ((java.lang.Class)v5).toString();
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getClassLoader();
    Object v13 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v5),(((java.lang.Boolean)v7).booleanValue()),((java.lang.Class)v11));
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).withAlwaysAsId((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).toString();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v5),((java.lang.Class)v7),((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getScope();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).getResolverType();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).toString();
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=false"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ": ";
    Object v7 = ((java.lang.Class)v5).getResource(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).withAlwaysAsId((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).withAlwaysAsId((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v16).getResolverType();
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getScope();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v11).withAlwaysAsId((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v11).withAlwaysAsId((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).withAlwaysAsId((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v17).withAlwaysAsId((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v19).getResolverType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.Class)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).isSynthetic();
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).toString();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getResolverType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v7),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v5));
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = ((java.lang.Class)v5).toString();
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getClassLoader();
    Object v13 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v5),(((java.lang.Boolean)v7).booleanValue()),((java.lang.Class)v11));
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).withAlwaysAsId((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).getAlwaysAsId();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=true"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.PropertyName)v1).toString();
    Object v3 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).getResolverType();
    Object v5 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v5).withAlwaysAsId((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v7).getScope();
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v13).getAnnotations();
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v4),((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).toString();
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v5 = ((java.lang.Class)v4).getAnnotatedInterfaces();
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v4),((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getNestHost();
    Object v7 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v7).getResolverType();
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).toString();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getResolverType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).toString();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).withAlwaysAsId((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).withAlwaysAsId((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v16).getResolverType();
    Object v18 = ((java.lang.Class)v17).isMemberClass();
    Object v19 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()),((java.lang.Class)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = "javax.xml.";
    Object v3 = ((com.fasterxml.jackson.databind.PropertyName)v1).withNamespace(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v7),((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v2 = false;
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v1).withAlwaysAsId((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v1).withAlwaysAsId((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v5).withAlwaysAsId((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v7).withAlwaysAsId((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).getResolverType();
    Object v11 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v11).withAlwaysAsId((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getScope();
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v0),((java.lang.Class)v10),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).toString();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).getResolverType();
    Object v12 = ((java.lang.Class)v11).getDeclaredMethods();
    Object v13 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=true"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).toString();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getScope();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=true"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getScope();
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).getResolverType();
    Object v17 = ((java.lang.Class)v16).isAnnotation();
    Object v18 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v5),((java.lang.Class)v9),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()),((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.PropertyName)v1).toString();
    Object v3 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).getResolverType();
    Object v5 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v5).withAlwaysAsId((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v7).getScope();
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v13).getAnnotations();
    Object v15 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v4),((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v13));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).withAlwaysAsId((((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=true"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getPackageName();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = false;
    Object v12 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getResolverType();
    Object v14 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()),((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=known type ids are not statically known, scope=java.lang.Object, generatorType=java.lang.Object, alwaysAsId=false"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getCanonicalName();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getScope();
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).getResolverType();
    Object v17 = ((java.lang.Class)v16).isAnnotation();
    Object v18 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v5),((java.lang.Class)v9),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()),((java.lang.Class)v16));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v18).toString();
    Object v20 = true;
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v18).withAlwaysAsId((((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).toString();
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=false"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).withAlwaysAsId((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).getScope();
    Object v16 = ((java.lang.Class)v15).isAnnotation();
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v19 = false;
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v18).withAlwaysAsId((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20).getScope();
    Object v22 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v15),(((java.lang.Boolean)v17).booleanValue()),((java.lang.Class)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getResolverType();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = "known type ids are not statically known";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getPackageName();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).getResolverType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v3),((java.lang.Class)v7),((java.lang.Class)v12),(((java.lang.Boolean)v13).booleanValue()),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.PropertyName)v1).equals(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v19 = false;
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v18).withAlwaysAsId((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v18).withAlwaysAsId((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v22).withAlwaysAsId((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24).withAlwaysAsId((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v26).getResolverType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = ((java.lang.Class)v31).toString();
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v35 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v34).getResolverType();
    Object v36 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v27),((java.lang.Class)v31),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Class)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).withAlwaysAsId((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).withAlwaysAsId((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).withAlwaysAsId((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).withAlwaysAsId((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v17).withAlwaysAsId((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v19).getScope();
    Object v21 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.Class)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getScope();
    Object v14 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).withAlwaysAsId((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).withAlwaysAsId((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v18).withAlwaysAsId((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20).withAlwaysAsId((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v22).withAlwaysAsId((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24).getResolverType();
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v28 = false;
    Object v29 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v27).withAlwaysAsId((((java.lang.Boolean)v28).booleanValue()));
    Object v30 = true;
    Object v31 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v27).withAlwaysAsId((((java.lang.Boolean)v30).booleanValue()));
    Object v32 = true;
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v31).withAlwaysAsId((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = true;
    Object v35 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v33).withAlwaysAsId((((java.lang.Boolean)v34).booleanValue()));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v35).getResolverType();
    Object v37 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v13),((java.lang.Class)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.PropertyName)v1).internSimpleName();
    Object v3 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).withAlwaysAsId((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).withAlwaysAsId((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v7).withAlwaysAsId((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).withAlwaysAsId((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v11).withAlwaysAsId((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v15 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).withAlwaysAsId((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).withAlwaysAsId((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v19).withAlwaysAsId((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v21).withAlwaysAsId((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v23).withAlwaysAsId((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v25).getScope();
    Object v27 = ((java.lang.Class)v26).getGenericInterfaces();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v14),((java.lang.Class)v26),((java.lang.Class)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).toString();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v5),((java.lang.Class)v7),((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v15));
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v16).withAlwaysAsId((((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getResolverType();
    Object v12 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getResolverType();
    Object v14 = ((java.lang.Class)v13).getModifiers();
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v11),((java.lang.Class)v13),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getResolverType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v13),((java.lang.Class)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getScope();
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).toString();
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getPropertyName();
    Object v6 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).getResolverType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).toString();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v5),((java.lang.Class)v7),((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v16).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=com.fasterxml.jackson.annotation.SimpleObjectIdResolver, generatorType=java.lang.Object, alwaysAsId=false"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.PropertyName)v1).internSimpleName();
    Object v3 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).withAlwaysAsId((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).withAlwaysAsId((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v7).withAlwaysAsId((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v9).withAlwaysAsId((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v11).withAlwaysAsId((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).getResolverType();
    Object v15 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).withAlwaysAsId((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15).withAlwaysAsId((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v19).withAlwaysAsId((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v21).withAlwaysAsId((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v23).withAlwaysAsId((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v25).getScope();
    Object v27 = ((java.lang.Class)v26).getGenericInterfaces();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v14),((java.lang.Class)v26),((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v32).toString();
    Object v34 = true;
    Object v35 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v32).withAlwaysAsId((((java.lang.Boolean)v34).booleanValue()));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v5));
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).getResolverType();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).getPropertyName();
    Object v2 = ((com.fasterxml.jackson.databind.PropertyName)v1).toString();
    Object v3 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).toString();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v3).getResolverType();
    Object v6 = "known type ids are not statically known";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).getResolverType();
    Object v10 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).getResolverType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v7),((java.lang.Class)v9),((java.lang.Class)v11));
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).withAlwaysAsId((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).getResolverType();
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v5),((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()),((java.lang.Class)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).withAlwaysAsId((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v10).withAlwaysAsId((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v12).getResolverType();
    Object v14 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).withAlwaysAsId((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).withAlwaysAsId((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v18).withAlwaysAsId((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v20).withAlwaysAsId((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v22).getResolverType();
    Object v24 = false;
    Object v25 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v13),((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).withAlwaysAsId((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).withAlwaysAsId((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=false"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getPropertyName();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "known type ids are not statically known";
    Object v1 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getResolverType();
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4).getResolverType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v1),((java.lang.Class)v3),((java.lang.Class)v5));
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v6).withAlwaysAsId((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v8).toString();
    org.junit.Assert.assertEquals((Object)("ObjectIdInfo: propName=known type ids are not statically known, scope=com.fasterxml.jackson.annotation.SimpleObjectIdResolver, generatorType=com.fasterxml.jackson.annotation.SimpleObjectIdResolver, alwaysAsId=false"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v1 = false;
    Object v2 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v0).withAlwaysAsId((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v2).getPropertyName();
    Object v4 = ((com.fasterxml.jackson.databind.PropertyName)v3).toString();
    Object v5 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v5).getResolverType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v3),((java.lang.Class)v6),((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }
}
