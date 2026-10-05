package com.fasterxml.jackson.dataformat.xml.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getActiveView();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).flushCachedSerializers();
    Object v2 = null;
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).findObjectId(((java.lang.Object)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "";
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "OCTYPE";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v6 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeValue(((java.lang.Object)v5),((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "";
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = "write null va<ue";
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "write2 String value";
    Object v9 = "G";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).setAttribute(((java.lang.Object)v7),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "m";
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = "[anySe";
    Object v6 = new java.lang.Object[]{};
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v5),((java.lang.Object[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getSerializationView();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getFilterProvider();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1)._rootNameFromConfig();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "";
    Object v3 = new java.lang.Throwable(((java.lang.String)v2));
    Object v4 = "[no message for.";
    Object v5 = new java.lang.Object[]{};
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).reportMappingProblem(((java.lang.Throwable)v3),((java.lang.String)v4),((java.lang.Object[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_FIELDS;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = 35;
    Object v3 = -20;
    Object v4 = 21;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateKey(((java.util.Date)v5),((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "s";
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "";
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "xmlInfo";
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = "4";
    Object v6 = new java.lang.Object[]{};
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v5),((java.lang.Object[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = "0";
    Object v6 = 35;
    Object v7 = -20;
    Object v8 = 21;
    Object v9 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeField(((java.lang.String)v5),((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v4 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getDefaultNullValueSerializer();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getLocale();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "+";
    Object v3 = new java.lang.Object[]{null,null,null};
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).reportMappingProblem(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "V";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).hasSerializationFeatures((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getAnnotationIntrospector();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "write null va<ue";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getAttribute(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getDefaultNullKeySerializer();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "g";
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).hasSerializationFeatures((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).copy();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v4),((com.fasterxml.jackson.databind.BeanProperty)v5));
    Object v7 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v8 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).flushCachedSerializers();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).getGenerator();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "write null va<ue";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeValue(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).cachedSerializersCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getDefaultNullValueSerializer();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).flushCachedSerializers();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = "write null va<ue";
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v10 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getDefaultNullValueSerializer();
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).setAttribute(((java.lang.Object)v8),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).generateJsonSchema(((java.lang.Class)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findTypeSerializer(((com.fasterxml.jackson.databind.JavaType)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getDefaultPropertyInclusion(((java.lang.Class)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "WRITE_XML_DECLAgRATION";
    Object v3 = new java.lang.Object[]{null,null};
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).reportMappingProblem(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).hasSerializationFeatures((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getConfig();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = "xmlInfo";
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = "4";
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v7),((java.lang.Object[])v8));
    Object v10 = "G";
    Object v11 = new java.lang.Object[]{};
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).reportMappingProblem(((java.lang.Throwable)v9),((java.lang.String)v10),((java.lang.Object[])v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "O";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = "write null va<ue";
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getAttribute(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = 35;
    Object v3 = -20;
    Object v4 = 21;
    Object v5 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue(((java.util.Date)v5),((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = "";
    Object v5 = new java.lang.Object[]{null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).generateJsonSchema(((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = "";
    Object v5 = new java.lang.Object[]{null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "ban not ";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getConfig();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "write null va<ue";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullValueSerializer();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).setAttribute(((java.lang.Object)v4),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "&";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getLocale();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = "\"";
    Object v7 = new java.lang.Object[]{null};
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v6),((java.lang.Object[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1)._asXmlGenerator(((com.fasterxml.jackson.core.JsonGenerator)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "\n";
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "`";
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullKeySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = -34L;
    Object v3 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v2).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v4),((com.fasterxml.jackson.databind.BeanProperty)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = null;
    Object v3 = "write null va<ue";
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3),((java.lang.String)v4));
    ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v2),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v4 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v3));
    Object v5 = "V";
    Object v6 = new java.lang.Object[]{null};
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).mappingException(((java.lang.String)v5),((java.lang.Object[])v6));
    ((com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider)v1).serializeValue(((com.fasterxml.jackson.core.JsonGenerator)v2),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v10));
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v11).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "write null va<ue";
    Object v3 = "";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v5));
    Object v7 = "\n";
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).mappingException(((java.lang.String)v7),((java.lang.Object[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).setAttribute(((java.lang.Object)v4),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isEnabled(((com.fasterxml.jackson.databind.SerializationFeature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = "&";
    Object v5 = new java.lang.Object[]{null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = "";
    Object v8 = new java.lang.Object[]{null,null,null};
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).reportMappingProblem(((java.lang.Throwable)v6),((java.lang.String)v7),((java.lang.Object[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = com.fasterxml.jackson.databind.MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isEnabled(((com.fasterxml.jackson.databind.SerializationFeature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "&";
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).canOverrideAccessModifiers();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v1).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v2),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v10));
    Object v12 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v13 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).getDefaultNullKeySerializer();
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v11).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "g";
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isEnabled(((com.fasterxml.jackson.databind.SerializationFeature)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "Can not write a field name, expecting a value";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v6 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getDefaultNullValueSerializer();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = "";
    Object v5 = new java.lang.Object[]{null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v10));
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v11).getDefaultNullValueSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "";
    Object v3 = new java.lang.Object[]{null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v7 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v9 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).getDefaultNullKeySerializer();
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v10),((com.fasterxml.jackson.databind.BeanProperty)v11));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).flushCachedSerializers();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).cachedSerializersCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getDefaultNullKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v4));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "";
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).copy();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v11 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v10));
    Object v12 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v13 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).getDefaultNullKeySerializer();
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v11).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.BeanProperty)v15));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = "+";
    Object v3 = new java.lang.Object[]{null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = "Missing name, in state: ";
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v5),((java.lang.Object[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v3 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v2));
    Object v4 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v5 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getDefaultNullKeySerializer();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).flushCachedSerializers();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1).copy();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup();
    Object v1 = new com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider(((com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).canOverrideAccessModifiers();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
