package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.databind.DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).without(((com.fasterxml.jackson.databind.DeserializationFeature)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).getArrayBuilders();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = -60L;
    Object v12 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._bindAsTreeOrNull(((com.fasterxml.jackson.core.JsonParser)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = "Throwable needs a default contructor, a single-String-arg constructor; or explicit @JsonCreator";
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readValues(((java.lang.String)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._detectBindAndCloseAsTree(((java.io.InputStream)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = -60L;
    Object v12 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    ((com.fasterxml.jackson.core.JsonParser)v24).setCurrentValue(((java.lang.Object)v26));
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readValue(((com.fasterxml.jackson.core.JsonParser)v24));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((byte[])v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = -60L;
    Object v12 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._bind(((com.fasterxml.jackson.core.JsonParser)v24),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = java.io.OutputStream.nullOutputStream();
    Object v13 = ((java.io.InputStream)v11).transferTo(((java.io.OutputStream)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((java.io.InputStream)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = -60L;
    Object v15 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v14).longValue()));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v26));
    ((com.fasterxml.jackson.databind.ObjectReader)v10)._initForMultiRead(((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.core.JsonParser)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v15).withoutRootName();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v15).forType(((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = "'";
    Object v17 = new java.io.StringReader(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValue(((java.io.Reader)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = java.io.InputStream.nullInputStream();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readValues(((java.io.InputStream)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = new byte[]{Byte.valueOf((byte)21),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v17 = 0;
    Object v18 = 49;
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readTree(((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = -60L;
    Object v12 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = false;
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._considerFilter(((com.fasterxml.jackson.core.JsonParser)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = "]";
    Object v20 = "D";
    Object v21 = new java.io.File(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v18).readValues(((java.io.File)v21));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new byte[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readValue(((byte[])v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)0),Byte.valueOf((byte)25)};
    Object v12 = 2;
    Object v13 = 0;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v18).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_INTEGER_FOR_INTS;
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v15).without(((com.fasterxml.jackson.databind.DeserializationFeature)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v15).version();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)1)};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((byte[])v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).endOfInputException(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._findTreeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = -60L;
    Object v20 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v19).longValue()));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v29 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v30 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v24),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v25),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v27),((com.fasterxml.jackson.databind.util.RootNameLookup)v28),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v23),((com.fasterxml.jackson.databind.DeserializationConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ObjectReader)v18).readValues(((com.fasterxml.jackson.core.JsonParser)v32),((java.lang.Class)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = java.io.InputStream.nullInputStream();
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readTree(((java.io.InputStream)v14));
    Object v16 = "]";
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readTree(((java.lang.String)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = -60L;
    Object v12 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v11).longValue()));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutRootName();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = "]";
    Object v20 = "D";
    Object v21 = new java.io.File(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v18).readValue(((java.io.File)v21));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withView(((java.lang.Class)v12));
    Object v14 = -60L;
    Object v15 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v14).longValue()));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readValue(((com.fasterxml.jackson.databind.JsonNode)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.InjectableValues)v14));
    Object v16 = java.io.InputStream.nullInputStream();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readTree(((java.io.InputStream)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = new byte[]{};
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValue(((byte[])v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v18).with(((java.util.Locale)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = -60L;
    Object v15 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v14).longValue()));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValue(((com.fasterxml.jackson.databind.JsonNode)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = "MISING";
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValues(((java.lang.String)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutRootName();
    Object v12 = "'";
    Object v13 = new java.io.StringReader(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v11).readValues(((java.io.Reader)v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v21),((com.fasterxml.jackson.databind.DeserializationConfig)v28));
    Object v30 = -60L;
    Object v31 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v30).longValue()));
    Object v32 = ((com.fasterxml.jackson.databind.ObjectReader)v29).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v31));
    ((com.fasterxml.jackson.core.JsonParser)v32).close();
    Object v33 = null;
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.JavaType)v37).isEnumType();
    ((com.fasterxml.jackson.databind.ObjectReader)v18)._verifyNoTrailingTokens(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v36),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = null;
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = "'";
    Object v20 = new java.io.StringReader(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v18).readValue(((java.io.Reader)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    Object v22 = -60L;
    Object v23 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v22).longValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v21).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v23));
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v24).getCurrentValue();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._bindAsTreeOrNull(((com.fasterxml.jackson.core.JsonParser)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v16 = "'";
    Object v17 = new java.io.StringReader(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readTree(((java.io.Reader)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v23));
    Object v25 = -60L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v24).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValues(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.core.type.ResolvedType)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)-21)};
    Object v15 = 21;
    Object v16 = -33;
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._detectBindAndClose(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = ":\\";
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).withRootName(((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v26).withoutAttribute(((java.lang.Object)v27));
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._new(((com.fasterxml.jackson.databind.ObjectReader)v26),((com.fasterxml.jackson.core.JsonFactory)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = "'";
    Object v12 = new java.io.StringReader(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((java.io.Reader)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = java.io.InputStream.nullInputStream();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readTree(((java.io.InputStream)v16));
    Object v18 = java.io.InputStream.nullInputStream();
    Object v19 = ((java.io.InputStream)v18).read();
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValues(((java.io.InputStream)v18));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v15).forType(((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v21).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v25));
    Object v27 = "Unwrapped ";
    Object v28 = ((com.fasterxml.jackson.core.JsonFactory)v26).createParser(((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._new(((com.fasterxml.jackson.databind.ObjectReader)v21),((com.fasterxml.jackson.core.JsonFactory)v26));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v12 = 44;
    Object v13 = 0;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._detectBindAndClose(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v19),((com.fasterxml.jackson.databind.DeserializationConfig)v26));
    Object v28 = -60L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v27).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v29));
    Object v31 = "log";
    ((com.fasterxml.jackson.core.JsonParser)v30).setRequestPayloadOnError(((java.lang.String)v31));
    Object v32 = null;
    ((com.fasterxml.jackson.databind.ObjectReader)v13)._initForMultiRead(((com.fasterxml.jackson.databind.DeserializationContext)v16),((com.fasterxml.jackson.core.JsonParser)v30));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)5)};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((byte[])v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new byte[]{};
    Object v15 = -20;
    Object v16 = 34;
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValues(((byte[])v14),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutRootName();
    Object v12 = -60L;
    Object v13 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v12).longValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v11).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.core.type.ResolvedType)v15).isReferenceType();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v11)._prefetchRootDeserializer(((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = "K";
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((java.lang.String)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).without(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).version();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getInjectableValues();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = "number";
    Object v16 = java.net.URI.create(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14).withoutSharedAttribute(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = "number";
    Object v16 = java.net.URI.create(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14).withoutSharedAttribute(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v18).createObjectNode();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).forType(((java.lang.Class)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = new byte[]{};
    Object v17 = -38;
    Object v18 = -53;
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValues(((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = -60L;
    Object v17 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v16).longValue()));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v20),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17),((com.fasterxml.jackson.core.ObjectCodec)v28));
    Object v30 = ((com.fasterxml.jackson.core.JsonParser)v29).isExpectedStartObjectToken();
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v35));
    ((com.fasterxml.jackson.databind.ObjectReader)v15)._verifyNoTrailingTokens(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v33),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v37 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v23));
    Object v25 = -60L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v24).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v26));
    Object v28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v29 = ((com.fasterxml.jackson.core.JsonParser)v27).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValues(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.core.type.ResolvedType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = "number";
    Object v16 = java.net.URI.create(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14).withoutSharedAttribute(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v18).withView(((java.lang.Class)v20));
    Object v22 = new byte[]{Byte.valueOf((byte)-1)};
    Object v23 = 0;
    Object v24 = 8;
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v18).readValue(((byte[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).without(((com.fasterxml.jackson.databind.DeserializationFeature)v14));
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).withValueToUpdate(((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ")";
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readValues(((java.lang.String)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = -60L;
    Object v12 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readValues(((com.fasterxml.jackson.core.JsonParser)v24),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v23));
    Object v25 = -60L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v24).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v26));
    Object v28 = false;
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._considerFilter(((com.fasterxml.jackson.core.JsonParser)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).getAttributes();
    Object v12 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.InjectableValues)v12));
    Object v14 = "UNKNOWN";
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValue(((java.lang.String)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new byte[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((byte[])v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = -60L;
    Object v25 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v24).longValue()));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v23).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._bindAsTreeOrNull(((com.fasterxml.jackson.core.JsonParser)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = ":\\";
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).withRootName(((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v26).withoutAttribute(((java.lang.Object)v27));
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._new(((com.fasterxml.jackson.databind.ObjectReader)v26),((com.fasterxml.jackson.core.JsonFactory)v30));
    Object v32 = new byte[]{Byte.valueOf((byte)-8),Byte.valueOf((byte)0)};
    Object v33 = 0;
    Object v34 = 0;
    Object v35 = ((com.fasterxml.jackson.databind.ObjectReader)v31)._detectBindAndClose(((byte[])v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutRootName();
    Object v12 = ")";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v11).withoutAttribute(((java.lang.Object)v13));
    Object v15 = "]";
    Object v16 = "D";
    Object v17 = new java.io.File(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((java.io.File)v17).getParentFile();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v11).readValues(((java.io.File)v17));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = "number";
    Object v16 = java.net.URI.create(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14).withoutSharedAttribute(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v19 = com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v18).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = ":\\";
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).withRootName(((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v26).withoutAttribute(((java.lang.Object)v27));
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._new(((com.fasterxml.jackson.databind.ObjectReader)v26),((com.fasterxml.jackson.core.JsonFactory)v30));
    Object v32 = "'";
    Object v33 = new java.io.StringReader(((java.lang.String)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ObjectReader)v31).readTree(((java.io.Reader)v33));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v18).withType(((java.lang.reflect.Type)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)9)};
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v12).readValue(((byte[])v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = ":\\";
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).withRootName(((java.lang.String)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v26).withoutAttribute(((java.lang.Object)v27));
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._new(((com.fasterxml.jackson.databind.ObjectReader)v26),((com.fasterxml.jackson.core.JsonFactory)v30));
    Object v32 = new byte[]{Byte.valueOf((byte)4)};
    Object v33 = 5;
    Object v34 = 1;
    Object v35 = ((com.fasterxml.jackson.databind.ObjectReader)v31).readValue(((byte[])v32),(((java.lang.Integer)v33).intValue()),(((java.lang.Integer)v34).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v21).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v25));
    Object v27 = "Unwrapped ";
    Object v28 = ((com.fasterxml.jackson.core.JsonFactory)v26).createParser(((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._new(((com.fasterxml.jackson.databind.ObjectReader)v21),((com.fasterxml.jackson.core.JsonFactory)v26));
    Object v30 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v29).without(((com.fasterxml.jackson.databind.DeserializationFeature)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v15)._findTreeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutAttribute(((java.lang.Object)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)42),Byte.valueOf((byte)1)};
    Object v14 = 25;
    Object v15 = 1;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readTree(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withValueToUpdate(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._findTreeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withoutRootName();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v11)._prefetchRootDeserializer(((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = "number";
    Object v16 = java.net.URI.create(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14).withoutSharedAttribute(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v19 = new byte[]{};
    Object v20 = 1;
    Object v21 = 48;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v18)._detectBindAndClose(((byte[])v19),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v13).without(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectReader[]{null,null,null};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withFormatDetection(((com.fasterxml.jackson.databind.ObjectReader[])v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = -60L;
    Object v25 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v24).longValue()));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v23).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._bindAndClose(((com.fasterxml.jackson.core.JsonParser)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v21).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v25));
    Object v27 = "Unwrapped ";
    Object v28 = ((com.fasterxml.jackson.core.JsonFactory)v26).createParser(((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._new(((com.fasterxml.jackson.databind.ObjectReader)v21),((com.fasterxml.jackson.core.JsonFactory)v26));
    Object v30 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v29).without(((com.fasterxml.jackson.databind.DeserializationFeature)v30));
    Object v32 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v31).withoutFeatures(((com.fasterxml.jackson.core.FormatFeature[])v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v21).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v25));
    Object v27 = "Unwrapped ";
    Object v28 = ((com.fasterxml.jackson.core.JsonFactory)v26).createParser(((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._new(((com.fasterxml.jackson.databind.ObjectReader)v21),((com.fasterxml.jackson.core.JsonFactory)v26));
    Object v30 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v29).without(((com.fasterxml.jackson.databind.DeserializationFeature)v30));
    Object v32 = java.util.Comparator.reverseOrder();
    Object v33 = new java.util.TreeSet(((java.util.Comparator)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DataFormatReaders(((java.util.Collection)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ObjectReader)v31).withFormatDetection(((com.fasterxml.jackson.databind.deser.DataFormatReaders)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).withView(((java.lang.Class)v12));
    Object v14 = "]";
    Object v15 = "D";
    Object v16 = new java.io.File(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v10).readValue(((java.io.File)v16));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v12).with(((com.fasterxml.jackson.databind.InjectableValues)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.databind.DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.databind.DeserializationFeature)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = "number";
    Object v16 = java.net.URI.create(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14).withoutSharedAttribute(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v18).withAttribute(((java.lang.Object)v19),((java.lang.Object)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = "number";
    Object v16 = java.net.URI.create(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14).withoutSharedAttribute(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v25),((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v18).withAttributes(((java.util.Map)v27));
    Object v29 = com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;
    Object v30 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null};
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v18).without(((com.fasterxml.jackson.databind.DeserializationFeature)v29),((com.fasterxml.jackson.databind.DeserializationFeature[])v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v12).with(((com.fasterxml.jackson.databind.InjectableValues)v13));
    Object v15 = -60L;
    Object v16 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v15).longValue()));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v19),((com.fasterxml.jackson.databind.DeserializationConfig)v26));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16),((com.fasterxml.jackson.core.ObjectCodec)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v14)._bindAndReadValues(((com.fasterxml.jackson.core.JsonParser)v28));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v13).without(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = new com.fasterxml.jackson.databind.ObjectReader[]{null,null};
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v16).withFormatDetection(((com.fasterxml.jackson.databind.ObjectReader[])v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v21).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v25));
    Object v27 = "Unwrapped ";
    Object v28 = ((com.fasterxml.jackson.core.JsonFactory)v26).createParser(((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v10)._new(((com.fasterxml.jackson.databind.ObjectReader)v21),((com.fasterxml.jackson.core.JsonFactory)v26));
    Object v30 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v29).without(((com.fasterxml.jackson.databind.DeserializationFeature)v30));
    Object v32 = new com.fasterxml.jackson.core.FormatFeature[]{};
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v31).withoutFeatures(((com.fasterxml.jackson.core.FormatFeature[])v32));
    Object v34 = ")";
    Object v35 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ObjectReader)v33).withRootName(((com.fasterxml.jackson.databind.PropertyName)v35));
    Object v37 = java.io.InputStream.nullInputStream();
    Object v38 = ((java.io.InputStream)v37).read();
    Object v39 = ((com.fasterxml.jackson.databind.ObjectReader)v33).readValue(((java.io.InputStream)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v13).without(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = -60L;
    Object v21 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v20).longValue()));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v27));
    Object v29 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v30 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v31 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v25),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v26),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v28),((com.fasterxml.jackson.databind.util.RootNameLookup)v29),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v24),((com.fasterxml.jackson.databind.DeserializationConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v32));
    ((com.fasterxml.jackson.databind.ObjectReader)v16)._initForMultiRead(((com.fasterxml.jackson.databind.DeserializationContext)v19),((com.fasterxml.jackson.core.JsonParser)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v9));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v10).with(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = new com.fasterxml.jackson.databind.InjectableValues.Std();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v12).with(((com.fasterxml.jackson.databind.InjectableValues)v13));
    Object v15 = java.io.InputStream.nullInputStream();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withValueToUpdate(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
