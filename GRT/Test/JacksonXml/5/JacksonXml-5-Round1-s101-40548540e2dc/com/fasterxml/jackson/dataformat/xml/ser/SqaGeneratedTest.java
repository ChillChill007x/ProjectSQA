package com.fasterxml.jackson.dataformat.xml.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2)._rootNameFromConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).flushCachedSerializers();
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2)._rootNameFromConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v3),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = "2";
    Object v5 = "}";
    Object v6 = new javax.xml.namespace.QName(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((javax.xml.namespace.QName)v6).hashCode();
    ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2)._initWithRootName(((com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator)v3),((javax.xml.namespace.QName)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).flushCachedSerializers();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "";
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getConfig();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = java.lang.ClassLoader.getSystemClassLoader();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v3),((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_GETTERS;
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "Internal error: shound never get called";
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).canOverrideAccessModifiers();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getLocale();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = "l";
    Object v5 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v6));
    Object v8 = "Internal error: shound never get called";
    Object v9 = new java.lang.Object[]{null,null};
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).mappingException(((java.lang.String)v8),((java.lang.Object[])v9));
    Object v11 = ((java.lang.Throwable)v10).getStackTrace();
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).reportBadDefinition(((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Throwable)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS;
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).isEnabled(((com.fasterxml.jackson.databind.SerializationFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = java.util.Set.of();
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = java.lang.ClassLoader.getSystemClassLoader();
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).setAttribute(((java.lang.Object)v3),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).isEnabled(((com.fasterxml.jackson.databind.SerializationFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getSerializationView();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = "WRITE_XML_DECLARATION";
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = "wrie number";
    Object v8 = new java.lang.Throwable(((java.lang.String)v7));
    Object v9 = "wrie number";
    Object v10 = new java.lang.Throwable(((java.lang.String)v9));
    ((java.lang.Throwable)v8).addSuppressed(((java.lang.Throwable)v10));
    Object v11 = null;
    Object v12 = "`";
    Object v13 = new java.lang.Object[]{null,null,null};
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).reportMappingProblem(((java.lang.Throwable)v8),((java.lang.String)v12),((java.lang.Object[])v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getDefaultNullKeySerializer();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = true;
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).findTypedValueSerializer(((java.lang.Class)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2).copy();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = "";
    Object v5 = "No XMLOutputFactory class name read during JDK deserialization";
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getConfig();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getActiveView();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).includeFilterSuppressNulls(((java.lang.Object)v5));
    Object v7 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v8 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v7));
    Object v9 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).getDefaultNullKeySerializer();
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2).copy();
    Object v4 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2)._rootNameFromConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v3)._asXmlGenerator(((com.fasterxml.jackson.core.JsonGenerator)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v10 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v9));
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v10));
    Object v12 = "Internal error: shound never get called";
    Object v13 = new java.lang.Object[]{null,null};
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v11).mappingException(((java.lang.String)v12),((java.lang.Object[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v3).includeFilterSuppressNulls(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getAttribute(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).getGenerator();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "wrie number";
    Object v4 = new java.lang.Throwable(((java.lang.String)v3));
    Object v5 = "..";
    Object v6 = new java.lang.Object[]{};
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).reportMappingProblem(((java.lang.Throwable)v4),((java.lang.String)v5),((java.lang.Object[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getConfig();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getFilterProvider();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).hasSerializationFeatures((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2).copy();
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getLocale();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getAttribute(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v10));
    Object v12 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v11));
    Object v13 = "Internal error: shound never get called";
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = ((com.fasterxml.jackson.databind.SerializerProvider)v12).mappingException(((java.lang.String)v13),((java.lang.Object[])v14));
    ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v3).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v9),((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "";
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getAnnotationIntrospector();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getAnnotationIntrospector();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "";
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "";
    Object v4 = new java.lang.Object[]{null};
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).reportMappingProblem(((java.lang.String)v3),((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = "Internal error: shound never get called";
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).mappingException(((java.lang.String)v6),((java.lang.Object[])v7));
    Object v9 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v10 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v9));
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v10));
    Object v12 = "";
    Object v13 = new java.lang.Object[]{};
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v11).mappingException(((java.lang.String)v12),((java.lang.Object[])v13));
    ((java.lang.Throwable)v8).addSuppressed(((java.lang.Throwable)v14));
    Object v15 = null;
    Object v16 = "";
    Object v17 = new java.lang.Object[]{null,null,null};
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).reportMappingProblem(((java.lang.Throwable)v8),((java.lang.String)v16),((java.lang.Object[])v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = "XML";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v5 = java.lang.ClassLoader.getSystemClassLoader();
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v4),((java.lang.Object)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v3),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = -28;
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).hasSerializationFeatures((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = "l";
    Object v5 = new java.lang.Object[]{null,null};
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).reportMappingProblem(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = java.lang.ClassLoader.getSystemClassLoader();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v3),((java.lang.Object)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getDefaultNullValueSerializer();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "javax.xml.strea";
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v7));
    Object v9 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v3)._rootNameFromConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getDefaultNullValueSerializer();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2).copy();
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getActiveView();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getActiveView();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getSerializationView();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getDefaultNullKeySerializer();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2).copy();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "a";
    Object v4 = "";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getFilterProvider();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullValueSerializer();
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "2";
    Object v4 = "}";
    Object v5 = new javax.xml.namespace.QName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "a";
    Object v4 = new java.lang.Object[]{null};
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getFilterProvider();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = "3";
    Object v4 = new java.util.Date();
    Object v5 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).defaultSerializeField(((java.lang.String)v3),((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).getDefaultNullKeySerializer();
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v11));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).cachedSerializersCount();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = java.util.Set.of();
    Object v4 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = "Internal error: shound never get called";
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).mappingException(((java.lang.String)v6),((java.lang.Object[])v7));
    Object v9 = "a";
    Object v10 = new java.lang.Object[]{};
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).reportMappingProblem(((java.lang.Throwable)v8),((java.lang.String)v9),((java.lang.Object[])v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullValueSerializer();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).getDefaultNullKeySerializer();
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.BeanProperty)v12));
    Object v14 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v15 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v14));
    Object v16 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v15));
    Object v17 = ((com.fasterxml.jackson.databind.SerializerProvider)v16).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).cachedSerializersCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = "";
    Object v10 = new java.lang.Object[]{null};
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).mappingException(((java.lang.String)v9),((java.lang.Object[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v5));
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v6));
    Object v8 = "";
    Object v9 = new java.lang.Object[]{};
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).mappingException(((java.lang.String)v8),((java.lang.Object[])v9));
    Object v11 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v12 = java.lang.ClassLoader.getSystemClassLoader();
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v11),((java.lang.Object)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7).includeFilterSuppressNulls(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DatabindContext)v3).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v4),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v6),((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).includeFilterSuppressNulls(((java.lang.Object)v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullValueSerializer();
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).hasSerializationFeatures((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullKeySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v3),((java.lang.Object)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getSerializationView();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = null;
    Object v4 = "";
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).reportBadTypeDefinition(((com.fasterxml.jackson.databind.BeanDescription)v3),((java.lang.String)v4),((java.lang.Object[])v5));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = java.util.Set.of();
    Object v10 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v10));
    Object v12 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v11));
    Object v13 = ((com.fasterxml.jackson.databind.SerializerProvider)v12).getDefaultNullValueSerializer();
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).setAttribute(((java.lang.Object)v9),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v9 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v8));
    Object v10 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v9));
    Object v11 = java.util.Set.of();
    Object v12 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v10).includeFilterSuppressNulls(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getAttribute(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v5).cachedSerializersCount();
    Object v7 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).includeFilterSuppressNulls(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v8 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v7));
    Object v9 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).getDefaultNullValueSerializer();
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v10),((com.fasterxml.jackson.databind.BeanProperty)v11));
    Object v13 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2).getGenerator();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2).copy();
    Object v4 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v3)._rootNameFromConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v3));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1));
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v3).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v3));
    Object v10 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v10));
    Object v12 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v11));
    Object v13 = java.util.Set.of();
    Object v14 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v12).includeFilterSuppressNulls(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9).includeFilterSuppressNulls(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }
}
