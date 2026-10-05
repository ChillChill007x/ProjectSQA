package com.google.gson;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(((java.lang.reflect.Type)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.gson.GenericArrayTypeImpl(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(((java.lang.reflect.Type)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = null;
    Object v2 = new com.google.gson.GenericArrayTypeImpl(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.TypeInfoFactory.getTypeInfoForField(((java.lang.reflect.Field)v0),((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.google.gson.GenericArrayTypeImpl(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.reflect.Type)v1).getTypeName();
    Object v3 = com.google.gson.TypeInfoFactory.getTypeInfoForArray(((java.lang.reflect.Type)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = null;
    Object v2 = new com.google.gson.GenericArrayTypeImpl(((java.lang.reflect.Type)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = com.google.gson.TypeInfoFactory.getTypeInfoForField(((java.lang.reflect.Field)v0),((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
