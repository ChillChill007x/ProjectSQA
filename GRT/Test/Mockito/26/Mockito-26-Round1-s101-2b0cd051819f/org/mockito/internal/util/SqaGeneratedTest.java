package org.mockito.internal.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.mockito.internal.util.Primitives();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = null;
    Object v1 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getModifiers();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getGenericInterfaces();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getSimpleName();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getInterfaces();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getMethods();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getClasses();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getConstructors();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).isAssignableFrom(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).toString();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).getAnnotation(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getConstructors();
    Object v5 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingConstructor();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isMemberClass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getSigners();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredConstructors();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isArray();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getGenericSuperclass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getProtectionDomain();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getMethods();
    Object v9 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v7));
    Object v10 = ((java.lang.Class)v3).isInstance(((java.lang.Object)v9));
    Object v11 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).getAnnotation(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getClassLoader();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotatedSuperclass();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isLocalClass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getConstructors();
    Object v5 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isEnum();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).desiredAssertionStatus();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getNestHost();
    Object v5 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isAnonymousClass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).asSubclass(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredMethods();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredFields();
    Object v5 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotatedSuperclass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isMemberClass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "";
    Object v5 = ((java.lang.Class)v3).getResourceAsStream(((java.lang.String)v4));
    Object v6 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).isInstance(((java.lang.Object)v7));
    Object v9 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotations();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).desiredAssertionStatus();
    Object v5 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getCanonicalName();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getNestMembers();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnumConstants();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "Argument(s) passed is not a mock!";
    Object v5 = ((java.lang.Class)v3).getResource(((java.lang.String)v4));
    Object v6 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isAnnotation();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "i";
    Object v5 = ((java.lang.Class)v3).getResourceAsStream(((java.lang.String)v4));
    Object v6 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).asSubclass(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getMethods();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isPrimitive();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isArray();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getTypeParameters();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getTypeParameters();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).isNestmateOf(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).getDeclaredAnnotation(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getFields();
    Object v5 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getSuperclass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredMethods();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isInterface();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isPrimitive();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredAnnotations();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).getDeclaredAnnotation(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getNestHost();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getProtectionDomain();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).isAssignableFrom(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredConstructors();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getTypeName();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isLocalClass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getComponentType();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).getAnnotation(((java.lang.Class)v7));
    Object v9 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isSynthetic();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotatedInterfaces();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getSuperclass();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = " -/ ";
    Object v5 = ((java.lang.Class)v3).getResourceAsStream(((java.lang.String)v4));
    Object v6 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isSynthetic();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "\n";
    Object v5 = ((java.lang.Class)v3).getResource(((java.lang.String)v4));
    Object v6 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getPackage();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredClasses();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).toGenericString();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getComponentType();
    Object v5 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "";
    Object v5 = ((java.lang.Class)v3).getResource(((java.lang.String)v4));
    Object v6 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getName();
    Object v5 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getDeclaredMethods();
    Object v9 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v7));
    Object v10 = ((java.lang.Class)v3).isInstance(((java.lang.Object)v9));
    Object v11 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "?";
    Object v5 = ((java.lang.Class)v3).getResourceAsStream(((java.lang.String)v4));
    Object v6 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getFields();
    Object v5 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getTypeName();
    Object v5 = org.mockito.internal.util.Primitives.primitiveWrapperOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getClasses();
    Object v5 = org.mockito.internal.util.Primitives.primitiveValueOrNullFor(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getGenericInterfaces();
    Object v5 = org.mockito.internal.util.Primitives.isPrimitiveWrapper(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "org.mockito.exceptions.verification.junit.ArgumentsAreDifferent";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "createInfo";
    Object v5 = ((java.lang.Class)v3).getResource(((java.lang.String)v4));
    Object v6 = org.mockito.internal.util.Primitives.primitiveTypeOf(((java.lang.Class)v3));
    org.junit.Assert.assertNull(v6);
  }
}
